package typingsJapgolly.primereact.inputTextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var keyfilter: js.UndefOr[js.Any] = js.undefined
  @JSName("onInput")
  var onInput_InputTextProps: js.UndefOr[
    js.Function1[/* event */ ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement], Unit]
  ] = js.undefined
  @JSName("onKeyPress")
  var onKeyPress_InputTextProps: js.UndefOr[
    js.Function1[/* event */ ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement], Unit]
  ] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}

object InputTextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    keyfilter: js.Any = null,
    onInput: /* event */ ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement] => Callback = null,
    onKeyPress: /* event */ ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement] => Callback = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
  ): InputTextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyfilter != null) __obj.updateDynamic("keyfilter")(keyfilter.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onInput(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyPress(t0).runNow()))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextProps]
  }
}

