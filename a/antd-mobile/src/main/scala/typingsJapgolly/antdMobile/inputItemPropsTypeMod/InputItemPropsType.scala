package typingsJapgolly.antdMobile.inputItemPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.bankCard
import typingsJapgolly.antdMobile.antdMobileStrings.center
import typingsJapgolly.antdMobile.antdMobileStrings.digit
import typingsJapgolly.antdMobile.antdMobileStrings.left
import typingsJapgolly.antdMobile.antdMobileStrings.money
import typingsJapgolly.antdMobile.antdMobileStrings.number
import typingsJapgolly.antdMobile.antdMobileStrings.password
import typingsJapgolly.antdMobile.antdMobileStrings.phone
import typingsJapgolly.antdMobile.antdMobileStrings.text
import typingsJapgolly.antdMobile.antdMobileStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputItemPropsType extends js.Object {
  var clear: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var labelNumber: js.UndefOr[Double] = js.undefined
  var labelPosition: js.UndefOr[left | top] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var moneyKeyboardAlign: js.UndefOr[String] = js.undefined
  var moneyKeyboardHeader: js.UndefOr[Node] = js.undefined
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[left | center] = js.undefined
  var `type`: js.UndefOr[text | bankCard | phone | password | number | digit | money] = js.undefined
  var updatePlaceholder: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputItemPropsType {
  @scala.inline
  def apply(
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledKeys: js.Array[InputKey] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    locale: js.Object = null,
    maxLength: Int | Double = null,
    moneyKeyboardAlign: String = null,
    moneyKeyboardHeader: VdomNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    name: String = null,
    onBlur: /* value */ js.UndefOr[String] => Callback = null,
    onChange: /* value */ String => Callback = null,
    onFocus: /* value */ js.UndefOr[String] => Callback = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Callback = null,
    placeholder: String = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit | money = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): InputItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledKeys != null) __obj.updateDynamic("disabledKeys")(disabledKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.rawNode.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onFocus(t0).runNow()))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onVirtualKeyboardConfirm(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputItemPropsType]
  }
}

