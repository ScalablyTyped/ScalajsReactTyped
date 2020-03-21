package typingsJapgolly.reactNativeCanvas.mod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasProps extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var originWhitelist: js.UndefOr[js.Array[String]] = js.undefined
  var ref: (js.Function1[/* canvas */ Canvas, _]) | RefHandle[Canvas]
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CanvasProps {
  @scala.inline
  def apply(
    ref: (js.Function1[/* canvas */ Canvas, _]) | RefHandle[Canvas],
    baseUrl: String = null,
    originWhitelist: js.Array[String] = null,
    style: StyleProp[ViewStyle] = null
  ): CanvasProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (originWhitelist != null) __obj.updateDynamic("originWhitelist")(originWhitelist.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasProps]
  }
}

