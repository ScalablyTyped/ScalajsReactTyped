package typingsJapgolly.primereact.autocompleteAutoCompleteMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonOriginalEvent
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var completeMethod: js.UndefOr[js.Function1[/* e */ AnonOriginalEvent, Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdown: js.UndefOr[Boolean] = js.undefined
  var dropdownMode: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onDropdownClick: js.UndefOr[js.Function1[/* e */ AnonOriginalEvent, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var selectedItemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var suggestions: js.UndefOr[js.Array[_]] = js.undefined
  var tabindex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    ariaLabelledBy: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    completeMethod: /* e */ AnonOriginalEvent => Callback = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    dropdownMode: String = null,
    field: String = null,
    id: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    itemTemplate: /* data */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    maxlength: Int | Double = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: /* event */ Event_ => Callback = null,
    onChange: /* e */ AnonValue => Callback = null,
    onClear: /* event */ Event_ => Callback = null,
    onClick: /* event */ Event_ => Callback = null,
    onContextMenu: /* event */ Event_ => Callback = null,
    onDblClick: /* event */ Event_ => Callback = null,
    onDropdownClick: /* e */ AnonOriginalEvent => Callback = null,
    onFocus: /* event */ Event_ => Callback = null,
    onKeyPress: /* event */ Event_ => Callback = null,
    onKeyUp: /* event */ Event_ => Callback = null,
    onMouseDown: /* event */ Event_ => Callback = null,
    onSelect: /* e */ AnonValue => Callback = null,
    onUnselect: /* e */ AnonValue => Callback = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    selectedItemTemplate: /* data */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    size: Int | Double = null,
    style: js.Object = null,
    suggestions: js.Array[_] = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    `type`: String = null,
    value: js.Any = null
  ): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (completeMethod != null) __obj.updateDynamic("completeMethod")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEvent) => completeMethod(t0).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (dropdownMode != null) __obj.updateDynamic("dropdownMode")(dropdownMode.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* data */ js.Any) => itemTemplate(t0).runNow()))
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onChange(t0).runNow()))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClear(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onContextMenu(t0).runNow()))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onDblClick(t0).runNow()))
    if (onDropdownClick != null) __obj.updateDynamic("onDropdownClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEvent) => onDropdownClick(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onKeyUp(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onMouseDown(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onSelect(t0).runNow()))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onUnselect(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1((t0: /* data */ js.Any) => selectedItemTemplate(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps]
  }
}

