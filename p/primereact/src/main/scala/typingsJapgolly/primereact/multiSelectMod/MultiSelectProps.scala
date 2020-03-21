package typingsJapgolly.primereact.multiSelectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectProps extends js.Object {
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var fixedPlaceholder: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var maxSelectedLabels: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var optionLabel: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var selectedItemTemplate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[Element]]] = js.undefined
  var selectedItemsLabel: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MultiSelectProps {
  @scala.inline
  def apply(
    appendTo: HTMLElement = null,
    ariaLabelledBy: String = null,
    className: String = null,
    dataKey: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    fixedPlaceholder: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    maxSelectedLabels: Int | Double = null,
    onBlur: /* event */ Event_ => Callback = null,
    onChange: /* e */ AnonValue => Callback = null,
    onFocus: /* event */ Event_ => Callback = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    placeholder: String = null,
    scrollHeight: String = null,
    selectedItemTemplate: /* value */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    selectedItemsLabel: String = null,
    style: js.Object = null,
    tabIndex: js.UndefOr[Boolean] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null
  ): MultiSelectProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedPlaceholder)) __obj.updateDynamic("fixedPlaceholder")(fixedPlaceholder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (maxSelectedLabels != null) __obj.updateDynamic("maxSelectedLabels")(maxSelectedLabels.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1((t0: /* value */ js.Any) => selectedItemTemplate(t0).runNow()))
    if (selectedItemsLabel != null) __obj.updateDynamic("selectedItemsLabel")(selectedItemsLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectProps]
  }
}

