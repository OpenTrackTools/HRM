package org.opentracktools.domain.application.service.impl;

import org.opentracktools.domain.application.service.api.UserAuthenticationService;
import org.opentracktools.domain.models.user.UserEntity;
import org.opentracktools.infra.repository.UserRepository;
import org.opentracktools.web.forms.SignupForm;
import org.opentracktools.web.responses.auth.AuthServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arpan Mukhopadhyay
 */
@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
  
  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private PasswordEncoder passwordEncoder;
  
  @Override
  public AuthServiceResponse registerNewUser(final SignupForm form) {
    AuthServiceResponse authServiceResponse = new AuthServiceResponse();
    UserEntity user = new UserEntity(form.getUsername(), form.getEmail());
    final String encryptedPassword = passwordEncoder.encode(form.getPassword());
    user.setPassword(encryptedPassword);
    try {
      userRepository.save(user);
      authServiceResponse.success();
    } catch (Exception e) {
      authServiceResponse.setErrorMessage("Could not register new user.");
    }
    return authServiceResponse;
  }
}
