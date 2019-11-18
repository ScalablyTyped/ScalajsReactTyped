package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactDashNative.reactDashNativeStrings.cancel
import typingsJapgolly.reactDashNative.reactDashNativeStrings.default
import typingsJapgolly.reactDashNative.reactDashNativeStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertButton extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AlertButton {
  @scala.inline
  def apply(
    onPress: /* value */ js.UndefOr[String] => Callback = null,
    style: default | cancel | destructive = null,
    text: String = null
  ): AlertButton = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onPress(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertButton]
  }
}

