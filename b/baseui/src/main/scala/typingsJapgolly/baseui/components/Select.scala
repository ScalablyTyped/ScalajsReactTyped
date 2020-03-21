package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.AnonLabelKey
import typingsJapgolly.baseui.AnonOption
import typingsJapgolly.baseui.AnonOptionOption
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.search
import typingsJapgolly.baseui.baseuiStrings.select
import typingsJapgolly.baseui.selectMod.OnChangeParams
import typingsJapgolly.baseui.selectMod.OptionsT
import typingsJapgolly.baseui.selectMod.SelectOverrides
import typingsJapgolly.baseui.selectMod.SelectProps
import typingsJapgolly.baseui.selectMod.Value
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  def apply(
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backspaceRemoves: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    creatable: js.UndefOr[Boolean] = js.undefined,
    deleteRemoves: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOptions: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[AnonLabelKey]) => CallbackTo[Value] = null,
    filterOutSelected: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ AnonOption => CallbackTo[Node] = null,
    getValueLabel: /* args */ AnonOptionOption => CallbackTo[Node] = null,
    id: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    mountNode: HTMLElement = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: VdomNode = null,
    onBlur: /* e */ Event_ => CallbackTo[js.Any] = null,
    onBlurResetsInput: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => CallbackTo[js.Any] = null,
    onClose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onCloseResetsInput: js.UndefOr[Boolean] = js.undefined,
    onFocus: ReactFocusEventFrom[HTMLElement] => Callback = null,
    onInputChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onOpen: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSelectResetsInput: js.UndefOr[Boolean] = js.undefined,
    openOnClick: js.UndefOr[Boolean] = js.undefined,
    options: OptionsT = null,
    overrides: SelectOverrides = null,
    placeholder: VdomNode = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectProps, typingsJapgolly.baseui.selectMod.Select, Unit, SelectProps] = {
    val __obj = js.Dynamic.literal()
  
      if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(backspaceRemoves)) __obj.updateDynamic("backspaceRemoves")(backspaceRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRemoves)) __obj.updateDynamic("deleteRemoves")(deleteRemoves.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(js.Any.fromFunction4((t0: /* options */ typingsJapgolly.baseui.selectMod.Value, t1: /* filterValue */ java.lang.String, t2: /* excludeOptions */ js.UndefOr[typingsJapgolly.baseui.selectMod.Value], t3: /* newProps */ js.UndefOr[typingsJapgolly.baseui.AnonLabelKey]) => filterOptions(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(filterOutSelected)) __obj.updateDynamic("filterOutSelected")(filterOutSelected.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonOption) => getOptionLabel(t0).runNow()))
    if (getValueLabel != null) __obj.updateDynamic("getValueLabel")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonOptionOption) => getValueLabel(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (!js.isUndefined(onBlurResetsInput)) __obj.updateDynamic("onBlurResetsInput")(onBlurResetsInput.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onChange(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (!js.isUndefined(onCloseResetsInput)) __obj.updateDynamic("onCloseResetsInput")(onCloseResetsInput.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onInputChange(t0).runNow()))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (!js.isUndefined(onSelectResetsInput)) __obj.updateDynamic("onSelectResetsInput")(onSelectResetsInput.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnClick)) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.selectMod.SelectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.selectMod.Select](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.selectMod.SelectProps])(children: _*)
  }
  @JSImport("baseui/select", "Select")
  @js.native
  object componentImport extends js.Object
  
}

