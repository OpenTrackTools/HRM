package org.opentracktools.web.forms;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Arpan Mukhopadhyay
 */
@Getter
@Setter
public class SignupForm {
  
  private String username;
  private String password;
  private String email;
  
  /**
   *
   * @param username
   * @param password
   * @param email
   */
  public SignupForm(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }
}
