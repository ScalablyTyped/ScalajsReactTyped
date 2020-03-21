package typingsJapgolly.nodemailer.smtpConnectionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.AnonKey
import typingsJapgolly.nodemailer.nodemailerStrings.CUSTOM
import typingsJapgolly.nodemailer.nodemailerStrings.Custom_
import typingsJapgolly.nodemailer.nodemailerStrings.LOGIN
import typingsJapgolly.nodemailer.nodemailerStrings.Login_
import typingsJapgolly.nodemailer.nodemailerStrings.OAUTH2
import typingsJapgolly.nodemailer.nodemailerStrings.OAuth2_
import typingsJapgolly.nodemailer.nodemailerStrings.custom__
import typingsJapgolly.nodemailer.nodemailerStrings.login__
import typingsJapgolly.nodemailer.nodemailerStrings.oauth2__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.smtpConnectionMod.AuthenticationTypeCustom
  - typingsJapgolly.nodemailer.smtpConnectionMod.AuthenticationTypeLogin
  - typingsJapgolly.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  def AuthenticationTypeCustom(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeLogin(pass: String, user: String, `type`: login__ | Login_ | LOGIN = null): AuthenticationType = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeOAuth2(
    accessToken: String = null,
    accessUrl: String = null,
    clientId: String = null,
    clientSecret: String = null,
    expires: Int | Double = null,
    privateKey: String | AnonKey = null,
    provisionCallback: (/* user */ String, /* renew */ Boolean, /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit]) => Callback = null,
    refreshToken: String = null,
    serviceClient: String = null,
    timeout: Int | Double = null,
    `type`: oauth2__ | OAuth2_ | OAUTH2 = null,
    user: String = null
  ): AuthenticationType = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (provisionCallback != null) __obj.updateDynamic("provisionCallback")(js.Any.fromFunction3((t0: /* user */ java.lang.String, t1: /* renew */ scala.Boolean, t2: /* callback */ js.Function3[
  /* err */ js.Error | scala.Null, 
  /* accessToken */ java.lang.String, 
  /* expires */ scala.Double, 
  scala.Unit]) => provisionCallback(t0, t1, t2).runNow()))
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (serviceClient != null) __obj.updateDynamic("serviceClient")(serviceClient.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
}

