package typingsJapgolly.reactNativeNavbar.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarButton extends js.Object {
  var disable: js.UndefOr[Boolean] = js.undefined
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var title: String
}

object NavigationBarButton {
  @scala.inline
  def apply(
    title: String,
    disable: js.UndefOr[Boolean] = js.undefined,
    handler: js.UndefOr[Callback] = js.undefined,
    style: ViewStyle = null
  ): NavigationBarButton = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    handler.foreach(p => __obj.updateDynamic("handler")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarButton]
  }
}

