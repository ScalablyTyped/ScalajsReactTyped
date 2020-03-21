package typingsJapgolly.reactNativeDialog.mod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var textInputRef: js.UndefOr[Ref] = js.undefined
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object InputProps {
  @scala.inline
  def apply[T](label: String = null, textInputRef: Ref = null, wrapperStyle: StyleProp[ViewStyle] = null): InputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (textInputRef != null) __obj.updateDynamic("textInputRef")(textInputRef.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[T]]
  }
}

