package typingsJapgolly.sixRuntime.Six_.plugins.sso

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoClientConf extends js.Object {
  var callbackUrl: String
  var clientId: String
  var env: String
  var protocol: String
  var secret: String
  var token: typingsJapgolly.sixRuntime.Six_.plugins.sso.token
  def errorHook(error: js.Error): Unit
}

object ssoClientConf {
  @scala.inline
  def apply(
    callbackUrl: String,
    clientId: String,
    env: String,
    errorHook: js.Error => Callback,
    protocol: String,
    secret: String,
    token: token
  ): ssoClientConf = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("errorHook")(js.Any.fromFunction1((t0: js.Error) => errorHook(t0).runNow()))
    __obj.asInstanceOf[ssoClientConf]
  }
}

