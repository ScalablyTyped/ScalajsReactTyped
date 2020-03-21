package typingsJapgolly.antDesignReactNative.portalPortalMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  /**
    * Content of the `Portal`.
    */
  var children: js.UndefOr[Node] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(children: VdomNode = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

