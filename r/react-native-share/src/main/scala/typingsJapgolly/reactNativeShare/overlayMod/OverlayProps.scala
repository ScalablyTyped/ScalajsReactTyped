package typingsJapgolly.reactNativeShare.overlayMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  var children: Node
  var visible: Boolean
  def onCancel(): Unit
}

object OverlayProps {
  @scala.inline
  def apply(onCancel: Callback, visible: Boolean, children: VdomNode = null): OverlayProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

