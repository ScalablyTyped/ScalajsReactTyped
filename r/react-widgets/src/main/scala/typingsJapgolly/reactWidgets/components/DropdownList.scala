package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactWidgets.dropdownListMod.DropdownListMessages
import typingsJapgolly.reactWidgets.dropdownListMod.DropdownListProps
import typingsJapgolly.reactWidgets.mod.DropdownList.^
import typingsJapgolly.reactWidgets.reactWidgetsBooleans.`false`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.contains
import typingsJapgolly.reactWidgets.reactWidgetsStrings.endsWith
import typingsJapgolly.reactWidgets.reactWidgetsStrings.onFilter
import typingsJapgolly.reactWidgets.reactWidgetsStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownList {
  def apply(
    allowCreate: Boolean | onFilter = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    busy: js.UndefOr[Boolean] = js.undefined,
    busySpinner: VdomNode = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    data: js.Array[_] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: `false` | startsWith | endsWith | contains | (js.Function2[/* dataItem */ js.Any, /* str */ String, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactType[_] = null,
    id: String = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactType[_] | String = null,
    listComponent: ReactType[_] | String = null,
    listProps: js.Object = null,
    messages: DropdownListMessages = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* value */ js.Any => Callback = null,
    onCreate: /* value */ js.Any => Callback = null,
    onKeyDown: /* event */ KeyboardEvent => Callback = null,
    onKeyPress: /* event */ KeyboardEvent => Callback = null,
    onSearch: /* searchTerm */ String => Callback = null,
    onSelect: /* value */ js.Any => Callback = null,
    onToggle: /* isOpen */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    readOnly: Boolean | js.Array[_] = null,
    searchTerm: String = null,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Any = null,
    valueComponent: ReactType[_] = null,
    valueField: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DropdownListProps, ^, Unit, DropdownListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (allowCreate != null) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (busySpinner != null) __obj.updateDynamic("busySpinner")(busySpinner.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1((t0: /* value */ js.Any) => onCreate(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPress(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* searchTerm */ java.lang.String) => onSearch(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* value */ js.Any) => onSelect(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onToggle(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueComponent != null) __obj.updateDynamic("valueComponent")(valueComponent.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWidgets.dropdownListMod.DropdownListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWidgets.mod.DropdownList.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWidgets.dropdownListMod.DropdownListProps])(children: _*)
  }
  @JSImport("react-widgets", "DropdownList")
  @js.native
  object componentImport extends js.Object
  
}

