package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.multiSelectMod.MultiSelectProps
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSelect {
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
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MultiSelectProps, 
    typingsJapgolly.primereact.primereactMultiselectMod.MultiSelect, 
    Unit, 
    MultiSelectProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.multiSelectMod.MultiSelectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactMultiselectMod.MultiSelect](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.multiSelectMod.MultiSelectProps])(children: _*)
  }
  @JSImport("primereact/multiselect", "MultiSelect")
  @js.native
  object componentImport extends js.Object
  
}

