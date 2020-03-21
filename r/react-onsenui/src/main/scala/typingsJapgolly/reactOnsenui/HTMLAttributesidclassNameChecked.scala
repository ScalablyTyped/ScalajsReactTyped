package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & react-onsenui.react-onsenui.InputHTMLAttributes<'min' | 'max' | 'step'> & {  modifier ? :string,   disabled ? :boolean,   readOnly ? :boolean, onChange ? (e : react.react.ChangeEvent<any>): void, onBlur ? (e : react.react.FocusEvent<any>): void, onFocus ? (e : react.react.FocusEvent<any>): void,   value ? :string,   defaultValue ? :string,   checked ? :boolean,   placeholder ? :string,   type ? :string,   inputId ? :string,   float ? :boolean,   name ? :string} */
trait HTMLAttributesidclassNameChecked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object HTMLAttributesidclassNameChecked {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    float: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputId: String = null,
    max: Double | String = null,
    min: Double | String = null,
    modifier: String = null,
    name: String = null,
    onBlur: /* e */ ReactFocusEventFrom[Element] => Callback = null,
    onChange: /* e */ ReactEventFrom[Element] => Callback = null,
    onFocus: /* e */ ReactFocusEventFrom[Element] => Callback = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: Double | String = null,
    style: CSSProperties = null,
    `type`: String = null,
    value: String = null
  ): HTMLAttributesidclassNameChecked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameChecked]
  }
}

