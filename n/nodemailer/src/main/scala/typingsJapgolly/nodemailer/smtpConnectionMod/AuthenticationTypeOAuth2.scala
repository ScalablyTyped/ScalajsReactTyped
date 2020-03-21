package typingsJapgolly.nodemailer.smtpConnectionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.AnonKey
import typingsJapgolly.nodemailer.nodemailerStrings.OAUTH2
import typingsJapgolly.nodemailer.nodemailerStrings.OAuth2_
import typingsJapgolly.nodemailer.nodemailerStrings.oauth2__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeOAuth2
  extends typingsJapgolly.nodemailer.xoauth2Mod.Options
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[oauth2__ | OAuth2_ | OAUTH2] = js.undefined
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(
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
  ): AuthenticationTypeOAuth2 = {
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
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
}

