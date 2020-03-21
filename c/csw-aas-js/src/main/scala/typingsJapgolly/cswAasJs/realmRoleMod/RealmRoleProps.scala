package typingsJapgolly.cswAasJs.realmRoleMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmRoleProps extends js.Object {
  var children: Node
  var error: Node
  var realmRole: String
}

object RealmRoleProps {
  @scala.inline
  def apply(realmRole: String, children: VdomNode = null, error: VdomNode = null): RealmRoleProps = {
    val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmRoleProps]
  }
}

