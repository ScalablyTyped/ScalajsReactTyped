package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactWidgets.comboboxMod.ComboboxMessages
import typingsJapgolly.reactWidgets.comboboxMod.ComboboxProps
import typingsJapgolly.reactWidgets.mod.Combobox.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Combobox {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    busy: js.UndefOr[Boolean] = js.undefined,
    busySpinner: VdomNode = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] = null,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    filter: Boolean | String | (js.Function2[/* dataItem */ js.Any, /* searchItem */ js.Any, Boolean]) = null,
    groupBy: String | (js.Function1[/* dataItem */ js.Any, _]) = null,
    groupComponent: ReactType[_] = null,
    id: String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    itemComponent: ReactType[_] = null,
    listComponent: ReactType[_] | String = null,
    listProps: js.Object = null,
    messages: ComboboxMessages = null,
    minLength: Int | Double = null,
    name: String = null,
    onChange: /* value */ js.Any => Callback = null,
    onSelect: /* value */ js.Any => Callback = null,
    onToggle: /* isOpen */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupTransition: ReactType[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    suggest: js.UndefOr[Boolean] = js.undefined,
    textField: String | (js.Function1[/* dataItem */ js.Any, String]) = null,
    value: js.Any = null,
    valueField: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ComboboxProps, ^, Unit, ComboboxProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (busySpinner != null) __obj.updateDynamic("busySpinner")(busySpinner.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (listComponent != null) __obj.updateDynamic("listComponent")(listComponent.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* value */ js.Any) => onSelect(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onToggle(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWidgets.comboboxMod.ComboboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWidgets.mod.Combobox.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWidgets.comboboxMod.ComboboxProps])(children: _*)
  }
  @JSImport("react-widgets", "Combobox")
  @js.native
  object componentImport extends js.Object
  
}

