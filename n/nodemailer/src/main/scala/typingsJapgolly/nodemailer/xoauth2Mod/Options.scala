package typingsJapgolly.nodemailer.xoauth2Mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** An existing valid accessToken */
  var accessToken: js.UndefOr[String] = js.undefined
  /** Endpoint for token generation, defaults to 'https://accounts.google.com/o/oauth2/token' */
  var accessUrl: js.UndefOr[String] = js.undefined
  /** Client ID value */
  var clientId: js.UndefOr[String] = js.undefined
  /** Client secret value */
  var clientSecret: js.UndefOr[String] = js.undefined
  /** Optional Access Token expire time in ms */
  var expires: js.UndefOr[ms] = js.undefined
  /** Private key for JSW */
  var privateKey: js.UndefOr[String | AnonKey] = js.undefined
  /** Function to run when a new access token is required */
  var provisionCallback: js.UndefOr[
    js.Function3[
      /* user */ String, 
      /* renew */ Boolean, 
      /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
      Unit
    ]
  ] = js.undefined
  /** Refresh token for an user */
  var refreshToken: js.UndefOr[String] = js.undefined
  var serviceClient: js.UndefOr[String] = js.undefined
  /** Optional TTL for Access Token in seconds */
  var timeout: js.UndefOr[s] = js.undefined
  /** User e-mail address */
  var user: js.UndefOr[String] = js.undefined
}

object Options {
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
    user: String = null
  ): Options = {
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
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

