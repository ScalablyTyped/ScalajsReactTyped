package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenHandshake extends AbstractHandshake {
  var authData: TokenAuthData
  var token: String
}

object TokenHandshake {
  @scala.inline
  def apply(
    authData: TokenAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => CallbackTo[HandshakeFields],
    sandboxId: String,
    token: String
  ): TokenHandshake = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("getHandshakeFields")(js.Any.fromFunction1((t0: typingsJapgolly.zetapushJs.mod.Client) => getHandshakeFields(t0).runNow()))
    __obj.asInstanceOf[TokenHandshake]
  }
}

