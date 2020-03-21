package typingsJapgolly.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationOAuth2 extends js.Object {
  /**  if set then forces smtp-connection to use XOAuth2 for authentication */
  var oauth2: OAuth2
}

object AuthenticationOAuth2 {
  @scala.inline
  def apply(oauth2: OAuth2): AuthenticationOAuth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticationOAuth2]
  }
}

