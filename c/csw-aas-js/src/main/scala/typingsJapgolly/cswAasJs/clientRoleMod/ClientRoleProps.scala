package typingsJapgolly.cswAasJs.clientRoleMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRoleProps extends js.Object {
  var children: Node
  var client: js.UndefOr[String] = js.undefined
  var clientRole: String
  var error: Node
}

object ClientRoleProps {
  @scala.inline
  def apply(clientRole: String, children: VdomNode = null, client: String = null, error: VdomNode = null): ClientRoleProps = {
    val __obj = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRoleProps]
  }
}

