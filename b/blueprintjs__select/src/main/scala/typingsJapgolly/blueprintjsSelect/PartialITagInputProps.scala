package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.tagInputMod.TagInputAddMethod
import typingsJapgolly.blueprintjsCore.tagMod.ITagProps
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectBooleans.`false`
import typingsJapgolly.react.mod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.ITagInputProps> */
trait PartialITagInputProps extends js.Object {
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  var addOnPaste: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[HTMLInputProps] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement | Null, Unit]] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  var onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Node], Boolean | Unit]] = js.undefined
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ ReactKeyboardEventFrom[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    js.Function2[
      /* event */ ReactKeyboardEventFrom[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  var onRemove: js.UndefOr[js.Function2[/* value */ String, /* index */ Double, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rightElement: js.UndefOr[Element] = js.undefined
  var separator: js.UndefOr[String | js.RegExp | `false`] = js.undefined
  var tagProps: js.UndefOr[ITagProps | (js.Function2[/* value */ Node, /* index */ Double, ITagProps])] = js.undefined
  var values: js.UndefOr[js.Array[Node]] = js.undefined
}

object PartialITagInputProps {
  @scala.inline
  def apply(
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputProps: HTMLInputProps = null,
    inputRef: /* input */ HTMLInputElement | Null => Callback = null,
    inputValue: String = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    onAdd: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => CallbackTo[Boolean | Unit] = null,
    onChange: /* values */ js.Array[Node] => CallbackTo[Boolean | Unit] = null,
    onInputChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onKeyDown: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback = null,
    onKeyUp: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback = null,
    onRemove: (/* value */ String, /* index */ Double) => Callback = null,
    placeholder: String = null,
    rightElement: VdomElement = null,
    separator: String | js.RegExp | `false` = null,
    tagProps: ITagProps | (js.Function2[/* value */ Node, /* index */ Double, ITagProps]) = null,
    values: js.Array[Node] = null
  ): PartialITagInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* input */ org.scalajs.dom.raw.HTMLInputElement | scala.Null) => inputRef(t0).runNow()))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2((t0: /* values */ js.Array[java.lang.String], t1: /* method */ typingsJapgolly.blueprintjsCore.tagInputMod.TagInputAddMethod) => onAdd(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* values */ js.Array[japgolly.scalajs.react.raw.React.Node]) => onChange(t0).runNow()))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onInputChange(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* index */ js.UndefOr[scala.Double]) => onKeyDown(t0, t1).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* index */ js.UndefOr[scala.Double]) => onKeyUp(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* index */ scala.Double) => onRemove(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.rawElement.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITagInputProps]
  }
}

