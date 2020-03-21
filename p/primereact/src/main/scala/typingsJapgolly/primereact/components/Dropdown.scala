package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.dropdownMod.DropdownProps
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  def apply(
    appendTo: js.Any = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dataKey: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterBy: String = null,
    filterInputAutoFocus: js.UndefOr[Boolean] = js.undefined,
    filterPlaceholder: String = null,
    id: String = null,
    inputId: String = null,
    itemTemplate: /* option */ js.Any => CallbackTo[Node] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    name: String = null,
    onChange: /* e */ AnonValue => Callback = null,
    onContextMenu: /* event */ Event_ => Callback = null,
    onMouseDown: /* event */ Event_ => Callback = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    panelClassName: String = null,
    panelStyle: js.Object = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DropdownProps, 
    typingsJapgolly.primereact.primereactDropdownMod.Dropdown, 
    Unit, 
    DropdownProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(filterInputAutoFocus)) __obj.updateDynamic("filterInputAutoFocus")(filterInputAutoFocus.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* option */ js.Any) => itemTemplate(t0).runNow()))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onChange(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onContextMenu(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onMouseDown(t0).runNow()))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.dropdownMod.DropdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactDropdownMod.Dropdown](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.dropdownMod.DropdownProps])(children: _*)
  }
  @JSImport("primereact/dropdown", "Dropdown")
  @js.native
  object componentImport extends js.Object
  
}

