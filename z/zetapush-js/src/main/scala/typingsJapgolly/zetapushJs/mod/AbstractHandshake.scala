package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractHandshake extends js.Object {
  var authType: String
  var authVersion: String
  var deploymentId: String
  var sandboxId: String
  def getHandshakeFields(client: Client): HandshakeFields
}

object AbstractHandshake {
  @scala.inline
  def apply(
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => CallbackTo[HandshakeFields],
    sandboxId: String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.updateDynamic("getHandshakeFields")(js.Any.fromFunction1((t0: typingsJapgolly.zetapushJs.mod.Client) => getHandshakeFields(t0).runNow()))
    __obj.asInstanceOf[AbstractHandshake]
  }
}

