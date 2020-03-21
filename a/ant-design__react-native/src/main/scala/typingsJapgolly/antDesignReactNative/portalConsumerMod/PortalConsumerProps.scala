package typingsJapgolly.antDesignReactNative.portalConsumerMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.portalHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalConsumerProps extends js.Object {
  var children: Node
  var manager: PortalMethods
}

object PortalConsumerProps {
  @scala.inline
  def apply(manager: PortalMethods, children: VdomNode = null): PortalConsumerProps = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalConsumerProps]
  }
}

