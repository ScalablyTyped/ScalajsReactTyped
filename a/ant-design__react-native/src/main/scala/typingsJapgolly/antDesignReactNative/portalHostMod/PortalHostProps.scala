package typingsJapgolly.antDesignReactNative.portalHostMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalHostProps extends js.Object {
  var children: Node
}

object PortalHostProps {
  @scala.inline
  def apply(children: VdomNode = null): PortalHostProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalHostProps]
  }
}

