package org.opentracktools.web.forms;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Arpan Mukhopadhyay
 */
@Getter
@Setter
public class SigninForm {
  
  private String login;
  private String password;
  
  /**
   *
   * @param login
   * @param password
   */
  public SigninForm(String login, String password) {
    this.login = login;
    this.password = password;
  }
}
