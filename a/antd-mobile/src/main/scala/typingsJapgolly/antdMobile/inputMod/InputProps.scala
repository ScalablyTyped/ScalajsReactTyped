package typingsJapgolly.antdMobile.inputMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.inputItemPropsTypeMod.InputEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends HTMLInputProps {
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    HTMLInputProps: HTMLInputProps = null,
    onBlur: /* value */ js.UndefOr[String] => Callback = null,
    onFocus: /* value */ js.UndefOr[String] => Callback = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (HTMLInputProps != null) js.Dynamic.global.Object.assign(__obj, HTMLInputProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onFocus(t0).runNow()))
    __obj.asInstanceOf[InputProps]
  }
}

