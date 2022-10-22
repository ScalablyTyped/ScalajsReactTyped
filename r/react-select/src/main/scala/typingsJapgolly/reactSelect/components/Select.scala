package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSelect.anon.Count
import typingsJapgolly.reactSelect.anon.InputValue
import typingsJapgolly.reactSelect.distDeclarationsSrcAccessibilityMod.AriaLiveMessages
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMod.SelectComponentsConfig
import typingsJapgolly.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.FormatOptionLabelMeta
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.Props
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default
import typingsJapgolly.reactSelect.distDeclarationsSrcStylesMod.StylesConfig
import typingsJapgolly.reactSelect.distDeclarationsSrcThemeMod.ThemeConfig
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.ActionMeta
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.InputActionMeta
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Theme
import typingsJapgolly.reactSelect.reactSelectStrings.assertive
import typingsJapgolly.reactSelect.reactSelectStrings.grammar
import typingsJapgolly.reactSelect.reactSelectStrings.off
import typingsJapgolly.reactSelect.reactSelectStrings.polite
import typingsJapgolly.reactSelect.reactSelectStrings.spelling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    backspaceRemovesValue: Boolean,
    blurInputOnSelect: Boolean,
    captureMenuScroll: Boolean,
    closeMenuOnScroll: Boolean | (js.Function1[/* event */ Event, Boolean]),
    closeMenuOnSelect: Boolean,
    components: SelectComponentsConfig[Option, IsMulti, Group],
    controlShouldRenderValue: Boolean,
    escapeClearsValue: Boolean,
    formatGroupLabel: Group => Node,
    getOptionLabel: Option => String,
    getOptionValue: Option => String,
    inputValue: String,
    isDisabled: Boolean,
    isLoading: Boolean,
    isMulti: IsMulti,
    isOptionDisabled: (Option, Options[Option]) => Boolean,
    isRtl: Boolean,
    isSearchable: Boolean,
    loadingMessage: InputValue => Node,
    maxMenuHeight: Double,
    menuIsOpen: Boolean,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    menuShouldBlockScroll: Boolean,
    menuShouldScrollIntoView: Boolean,
    minMenuHeight: Double,
    noOptionsMessage: InputValue => Node,
    onChange: (OnChangeValue[Option, IsMulti], ActionMeta[Option]) => Callback,
    onInputChange: (String, InputActionMeta) => Callback,
    onMenuClose: Callback,
    onMenuOpen: Callback,
    openMenuOnClick: Boolean,
    openMenuOnFocus: Boolean,
    options: OptionsOrGroups[Option, Group],
    pageSize: Double,
    screenReaderStatus: Count => String,
    styles: StylesConfig[Option, IsMulti, Group],
    tabIndex: Double,
    tabSelectsValue: Boolean
  ): Builder[Option, IsMulti, Group] = {
    val __props = js.Dynamic.literal(backspaceRemovesValue = backspaceRemovesValue.asInstanceOf[js.Any], blurInputOnSelect = blurInputOnSelect.asInstanceOf[js.Any], captureMenuScroll = captureMenuScroll.asInstanceOf[js.Any], closeMenuOnScroll = closeMenuOnScroll.asInstanceOf[js.Any], closeMenuOnSelect = closeMenuOnSelect.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], controlShouldRenderValue = controlShouldRenderValue.asInstanceOf[js.Any], escapeClearsValue = escapeClearsValue.asInstanceOf[js.Any], formatGroupLabel = js.Any.fromFunction1(formatGroupLabel), getOptionLabel = js.Any.fromFunction1(getOptionLabel), getOptionValue = js.Any.fromFunction1(getOptionValue), inputValue = inputValue.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isOptionDisabled = js.Any.fromFunction2(isOptionDisabled), isRtl = isRtl.asInstanceOf[js.Any], isSearchable = isSearchable.asInstanceOf[js.Any], loadingMessage = js.Any.fromFunction1(loadingMessage), maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldBlockScroll = menuShouldBlockScroll.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any], noOptionsMessage = js.Any.fromFunction1(noOptionsMessage), onChange = js.Any.fromFunction2((t0: OnChangeValue[Option, IsMulti], t1: ActionMeta[Option]) => (onChange(t0, t1)).runNow()), onInputChange = js.Any.fromFunction2((t0: String, t1: InputActionMeta) => (onInputChange(t0, t1)).runNow()), onMenuClose = onMenuClose.toJsFn, onMenuOpen = onMenuOpen.toJsFn, openMenuOnClick = openMenuOnClick.asInstanceOf[js.Any], openMenuOnFocus = openMenuOnFocus.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], screenReaderStatus = js.Any.fromFunction1(screenReaderStatus), styles = styles.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tabSelectsValue = tabSelectsValue.asInstanceOf[js.Any])
    new Builder[Option, IsMulti, Group](js.Array(this.component, __props.asInstanceOf[Props[Option, IsMulti, Group]]))
  }
  
  @JSImport("react-select/dist/declarations/src/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[Option, IsMulti, Group]] {
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def ariaLiveMessages(value: AriaLiveMessages[Option, IsMulti, Group]): this.type = set("ariaLiveMessages", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    inline def classNamePrefixNull: this.type = set("classNamePrefix", null)
    
    inline def delimiter(value: String): this.type = set("delimiter", value.asInstanceOf[js.Any])
    
    inline def filterOption(value: (/* option */ FilterOptionOption[Option], /* inputValue */ String) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
    
    inline def filterOptionNull: this.type = set("filterOption", null)
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formatOptionLabel(value: (Option, /* formatOptionLabelMeta */ FormatOptionLabelMeta[Option]) => Node): this.type = set("formatOptionLabel", js.Any.fromFunction2(value))
    
    inline def hideSelectedOptions(value: Boolean): this.type = set("hideSelectedOptions", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    inline def instanceId(value: Double | String): this.type = set("instanceId", value.asInstanceOf[js.Any])
    
    inline def isClearable(value: Boolean): this.type = set("isClearable", value.asInstanceOf[js.Any])
    
    inline def isOptionSelected(value: (Option, /* selectValue */ Options[Option]) => Boolean): this.type = set("isOptionSelected", js.Any.fromFunction2(value))
    
    inline def menuPortalTarget(value: HTMLElement): this.type = set("menuPortalTarget", value.asInstanceOf[js.Any])
    
    inline def menuPortalTargetNull: this.type = set("menuPortalTarget", null)
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMenuScrollToBottom(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onMenuScrollToBottom", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onMenuScrollToTop(value: /* event */ WheelEvent | TouchEvent => Callback): this.type = set("onMenuScrollToTop", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: ThemeConfig): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def themeFunction1(value: /* theme */ Theme => Theme): this.type = set("theme", js.Any.fromFunction1(value))
    
    inline def value(value: PropsValue[Option]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: Option*): this.type = set("value", js.Array(value*))
  }
  
  def withProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](p: Props[Option, IsMulti, Group]): Builder[Option, IsMulti, Group] = new Builder[Option, IsMulti, Group](js.Array(this.component, p.asInstanceOf[js.Any]))
}
