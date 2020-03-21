package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHandshake extends AbstractHandshake {
  var authData: CredentialsAuthData
  var login: String
  var password: String
}

object CredentialsHandshake {
  @scala.inline
  def apply(
    authData: CredentialsAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => CallbackTo[HandshakeFields],
    login: String,
    password: String,
    sandboxId: String
  ): CredentialsHandshake = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.updateDynamic("getHandshakeFields")(js.Any.fromFunction1((t0: typingsJapgolly.zetapushJs.mod.Client) => getHandshakeFields(t0).runNow()))
    __obj.asInstanceOf[CredentialsHandshake]
  }
}

