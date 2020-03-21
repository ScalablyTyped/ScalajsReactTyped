package typingsJapgolly.blueprintjsCore.radioGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsCore.propsMod.IOptionProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioGroupProps extends IProps {
  /**
    * Whether the group and _all_ its radios are disabled.
    * Individual radios can be disabled using their `disabled` prop.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the radio buttons are to be displayed inline horizontally.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /** Optional label text to display above the radio buttons. */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Name of the group, used to link radio buttons together in HTML.
    * If omitted, a unique name will be generated internally.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Array of options to render in the group. This prop is mutually exclusive
    * with `children`: either provide an array of `IOptionProps` objects or
    * provide `<Radio>` children elements.
    */
  var options: js.UndefOr[js.Array[IOptionProps]] = js.undefined
  /** Value of the selected radio. The child with this value will be `:checked`. */
  var selectedValue: js.UndefOr[String | Double] = js.undefined
  /**
    * Callback invoked when the currently selected radio changes.
    * Use `event.currentTarget.value` to read the currently selected value.
    * This prop is required because this component only supports controlled usage.
    */
  def onChange(event: ReactEventFrom[HTMLInputElement]): Unit
}

object IRadioGroupProps {
  @scala.inline
  def apply(
    onChange: ReactEventFrom[HTMLInputElement] => Callback,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    options: js.Array[IOptionProps] = null,
    selectedValue: String | Double = null
  ): IRadioGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadioGroupProps]
  }
}

