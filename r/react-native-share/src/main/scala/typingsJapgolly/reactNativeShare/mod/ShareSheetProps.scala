package typingsJapgolly.reactNativeShare.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareSheetProps extends js.Object {
  var children: Node
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var visible: Boolean
  def onCancel(): Unit
}

object ShareSheetProps {
  @scala.inline
  def apply(
    onCancel: Callback,
    visible: Boolean,
    children: VdomNode = null,
    overlayStyle: StyleProp[ViewProps] = null,
    style: StyleProp[ViewProps] = null
  ): ShareSheetProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
}

