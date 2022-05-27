package org.opentracktools.domain.application.service.api;

import org.opentracktools.web.forms.SignupForm;
import org.opentracktools.web.responses.auth.AuthServiceResponse;

/**
 * @author Arpan Mukhopadhyay
 */
public interface UserAuthenticationService {
  
  /**
   *
   * @param form
   * @return
   */
  AuthServiceResponse registerNewUser(final SignupForm form);
}
