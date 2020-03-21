package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactSelect.AnonCount
import typingsJapgolly.reactSelect.AnonInputValue
import typingsJapgolly.reactSelect.componentsMod.SelectComponentsConfig
import typingsJapgolly.reactSelect.selectMod.FormatOptionLabelMeta
import typingsJapgolly.reactSelect.selectMod.Props
import typingsJapgolly.reactSelect.stylesMod.StylesConfig
import typingsJapgolly.reactSelect.themeMod.ThemeConfig
import typingsJapgolly.reactSelect.typesMod.ActionMeta
import typingsJapgolly.reactSelect.typesMod.GroupType
import typingsJapgolly.reactSelect.typesMod.GroupedOptionsType
import typingsJapgolly.reactSelect.typesMod.InputActionMeta
import typingsJapgolly.reactSelect.typesMod.MenuPlacement
import typingsJapgolly.reactSelect.typesMod.MenuPosition
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props_784129350[ComponentRef] () {
  val componentImport: js.Any
  def apply[OptionType /* <: OptionTypeBase */](
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backspaceRemovesValue: js.UndefOr[Boolean] = js.undefined,
    blurInputOnSelect: js.UndefOr[Boolean] = js.undefined,
    captureMenuScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classNamePrefix: String = null,
    closeMenuOnScroll: Boolean | EventListener = null,
    closeMenuOnSelect: js.UndefOr[Boolean] = js.undefined,
    components: SelectComponentsConfig[OptionType] = null,
    controlShouldRenderValue: js.UndefOr[Boolean] = js.undefined,
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType[OptionType] = null,
    delimiter: String = null,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* option */ typingsJapgolly.reactSelect.filtersMod.Option, /* rawInput */ String) => CallbackTo[Boolean] = null,
    formatGroupLabel: /* group */ GroupType[OptionType] => CallbackTo[Node] = null,
    formatOptionLabel: (OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => CallbackTo[Node] = null,
    getOptionLabel: OptionType => CallbackTo[String] = null,
    getOptionValue: OptionType => CallbackTo[String] = null,
    hideSelectedOptions: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputId: String = null,
    inputValue: String = null,
    instanceId: Double | String = null,
    isClearable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isMulti: js.UndefOr[Boolean] = js.undefined,
    isOptionDisabled: (OptionType, /* options */ OptionsType[OptionType]) => CallbackTo[Boolean] = null,
    isOptionSelected: (OptionType, /* options */ OptionsType[OptionType]) => CallbackTo[Boolean] = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    isSearchable: js.UndefOr[Boolean] = js.undefined,
    loadingMessage: /* obj */ AnonInputValue => CallbackTo[String | Null] = null,
    maxMenuHeight: Int | Double = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    menuPlacement: MenuPlacement = null,
    menuPortalTarget: HTMLElement = null,
    menuPosition: MenuPosition = null,
    menuShouldBlockScroll: js.UndefOr[Boolean] = js.undefined,
    menuShouldScrollIntoView: js.UndefOr[Boolean] = js.undefined,
    minMenuHeight: Int | Double = null,
    name: String = null,
    noOptionsMessage: /* obj */ AnonInputValue => CallbackTo[String | Null] = null,
    onBlur: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onChange: (/* value */ ValueType[OptionType], /* action */ ActionMeta) => Callback = null,
    onFocus: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onInputChange: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Callback = null,
    onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onMenuClose: js.UndefOr[Callback] = js.undefined,
    onMenuOpen: js.UndefOr[Callback] = js.undefined,
    onMenuScrollToBottom: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onMenuScrollToTop: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    openMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    openMenuOnFocus: js.UndefOr[Boolean] = js.undefined,
    options: GroupedOptionsType[OptionType] | OptionsType[OptionType] = null,
    pageSize: Int | Double = null,
    placeholder: VdomNode = null,
    screenReaderStatus: /* obj */ AnonCount => CallbackTo[String] = null,
    styles: StylesConfig = null,
    tabIndex: String = null,
    tabSelectsValue: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeConfig = null,
    value: ValueType[OptionType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[OptionType], ComponentRef, Unit, Props[OptionType]] = {
    val __obj = js.Dynamic.literal()
  
      if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(backspaceRemovesValue)) __obj.updateDynamic("backspaceRemovesValue")(backspaceRemovesValue.asInstanceOf[js.Any])
    if (!js.isUndefined(blurInputOnSelect)) __obj.updateDynamic("blurInputOnSelect")(blurInputOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(captureMenuScroll)) __obj.updateDynamic("captureMenuScroll")(captureMenuScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (closeMenuOnScroll != null) __obj.updateDynamic("closeMenuOnScroll")(closeMenuOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closeMenuOnSelect)) __obj.updateDynamic("closeMenuOnSelect")(closeMenuOnSelect.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(controlShouldRenderValue)) __obj.updateDynamic("controlShouldRenderValue")(controlShouldRenderValue.asInstanceOf[js.Any])
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* option */ typingsJapgolly.reactSelect.filtersMod.Option, t1: /* rawInput */ java.lang.String) => filterOption(t0, t1).runNow()))
    if (formatGroupLabel != null) __obj.updateDynamic("formatGroupLabel")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.reactSelect.typesMod.GroupType[OptionType]) => formatGroupLabel(t0).runNow()))
    if (formatOptionLabel != null) __obj.updateDynamic("formatOptionLabel")(js.Any.fromFunction2((t0: OptionType, t1: /* labelMeta */ typingsJapgolly.reactSelect.selectMod.FormatOptionLabelMeta[OptionType]) => formatOptionLabel(t0, t1).runNow()))
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1((t0: OptionType) => getOptionLabel(t0).runNow()))
    if (getOptionValue != null) __obj.updateDynamic("getOptionValue")(js.Any.fromFunction1((t0: OptionType) => getOptionValue(t0).runNow()))
    if (!js.isUndefined(hideSelectedOptions)) __obj.updateDynamic("hideSelectedOptions")(hideSelectedOptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearable)) __obj.updateDynamic("isClearable")(isClearable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isMulti)) __obj.updateDynamic("isMulti")(isMulti.asInstanceOf[js.Any])
    if (isOptionDisabled != null) __obj.updateDynamic("isOptionDisabled")(js.Any.fromFunction2((t0: OptionType, t1: /* options */ typingsJapgolly.reactSelect.typesMod.OptionsType[OptionType]) => isOptionDisabled(t0, t1).runNow()))
    if (isOptionSelected != null) __obj.updateDynamic("isOptionSelected")(js.Any.fromFunction2((t0: OptionType, t1: /* options */ typingsJapgolly.reactSelect.typesMod.OptionsType[OptionType]) => isOptionSelected(t0, t1).runNow()))
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchable)) __obj.updateDynamic("isSearchable")(isSearchable.asInstanceOf[js.Any])
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.reactSelect.AnonInputValue) => loadingMessage(t0).runNow()))
    if (maxMenuHeight != null) __obj.updateDynamic("maxMenuHeight")(maxMenuHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen.asInstanceOf[js.Any])
    if (menuPlacement != null) __obj.updateDynamic("menuPlacement")(menuPlacement.asInstanceOf[js.Any])
    if (menuPortalTarget != null) __obj.updateDynamic("menuPortalTarget")(menuPortalTarget.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(menuShouldBlockScroll)) __obj.updateDynamic("menuShouldBlockScroll")(menuShouldBlockScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(menuShouldScrollIntoView)) __obj.updateDynamic("menuShouldScrollIntoView")(menuShouldScrollIntoView.asInstanceOf[js.Any])
    if (minMenuHeight != null) __obj.updateDynamic("minMenuHeight")(minMenuHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noOptionsMessage != null) __obj.updateDynamic("noOptionsMessage")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.reactSelect.AnonInputValue) => noOptionsMessage(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ typingsJapgolly.reactSelect.typesMod.ValueType[OptionType], t1: /* action */ typingsJapgolly.reactSelect.typesMod.ActionMeta) => onChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2((t0: /* newValue */ java.lang.String, t1: /* actionMeta */ typingsJapgolly.reactSelect.typesMod.InputActionMeta) => onInputChange(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    onMenuClose.foreach(p => __obj.updateDynamic("onMenuClose")(p.toJsFn))
    onMenuOpen.foreach(p => __obj.updateDynamic("onMenuOpen")(p.toJsFn))
    if (onMenuScrollToBottom != null) __obj.updateDynamic("onMenuScrollToBottom")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMenuScrollToBottom(t0).runNow()))
    if (onMenuScrollToTop != null) __obj.updateDynamic("onMenuScrollToTop")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMenuScrollToTop(t0).runNow()))
    if (!js.isUndefined(openMenuOnClick)) __obj.updateDynamic("openMenuOnClick")(openMenuOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openMenuOnFocus)) __obj.updateDynamic("openMenuOnFocus")(openMenuOnFocus.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (screenReaderStatus != null) __obj.updateDynamic("screenReaderStatus")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.reactSelect.AnonCount) => screenReaderStatus(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSelectsValue)) __obj.updateDynamic("tabSelectsValue")(tabSelectsValue.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.selectMod.Props[OptionType], 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.selectMod.Props[OptionType]])(children: _*)
  }
}

