package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.anon.Source
import typingsJapgolly.rcSelect.anon.Type
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectProps
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectRef
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.Mode
import typingsJapgolly.rcSelect.libBaseSelectMod.Placement
import typingsJapgolly.rcSelect.libBaseSelectMod.RefOptionListProps
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.rcSelectStrings.click
import typingsJapgolly.rcSelect.rcSelectStrings.focus
import typingsJapgolly.rcSelect.rcSelectStrings.ltr
import typingsJapgolly.rcSelect.rcSelectStrings.responsive
import typingsJapgolly.rcSelect.rcSelectStrings.rtl
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.reactStrings.`additions removals`
import typingsJapgolly.react.reactStrings.`additions text`
import typingsJapgolly.react.reactStrings.`inline`
import typingsJapgolly.react.reactStrings.`removals additions`
import typingsJapgolly.react.reactStrings.`removals text`
import typingsJapgolly.react.reactStrings.`text additions`
import typingsJapgolly.react.reactStrings.`text removals`
import typingsJapgolly.react.reactStrings.additions
import typingsJapgolly.react.reactStrings.all
import typingsJapgolly.react.reactStrings.ascending
import typingsJapgolly.react.reactStrings.assertive
import typingsJapgolly.react.reactStrings.both
import typingsJapgolly.react.reactStrings.copy
import typingsJapgolly.react.reactStrings.date
import typingsJapgolly.react.reactStrings.descending
import typingsJapgolly.react.reactStrings.dialog
import typingsJapgolly.react.reactStrings.execute
import typingsJapgolly.react.reactStrings.grammar
import typingsJapgolly.react.reactStrings.grid
import typingsJapgolly.react.reactStrings.horizontal
import typingsJapgolly.react.reactStrings.link
import typingsJapgolly.react.reactStrings.list
import typingsJapgolly.react.reactStrings.listbox
import typingsJapgolly.react.reactStrings.location
import typingsJapgolly.react.reactStrings.menu
import typingsJapgolly.react.reactStrings.mixed
import typingsJapgolly.react.reactStrings.move
import typingsJapgolly.react.reactStrings.none
import typingsJapgolly.react.reactStrings.off
import typingsJapgolly.react.reactStrings.other
import typingsJapgolly.react.reactStrings.page
import typingsJapgolly.react.reactStrings.polite
import typingsJapgolly.react.reactStrings.popup
import typingsJapgolly.react.reactStrings.removals
import typingsJapgolly.react.reactStrings.spelling
import typingsJapgolly.react.reactStrings.step
import typingsJapgolly.react.reactStrings.text
import typingsJapgolly.react.reactStrings.time
import typingsJapgolly.react.reactStrings.tree
import typingsJapgolly.react.reactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseSelect {
  
  inline def apply(
    OptionList: ForwardRefExoticComponent[PropsWithoutRef[Any] & RefAttributes[RefOptionListProps]],
    displayValues: js.Array[DisplayValueType],
    emptyOptions: Boolean,
    id: String,
    onDisplayValuesChange: (js.Array[DisplayValueType], Type) => Callback,
    onSearch: (String, Source) => Callback,
    prefixCls: String,
    searchValue: String
  ): Builder = {
    val __props = js.Dynamic.literal(OptionList = OptionList.asInstanceOf[js.Any], displayValues = displayValues.asInstanceOf[js.Any], emptyOptions = emptyOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onDisplayValuesChange = js.Any.fromFunction2((t0: js.Array[DisplayValueType], t1: Type) => (onDisplayValuesChange(t0, t1)).runNow()), onSearch = js.Any.fromFunction2((t0: String, t1: Source) => (onSearch(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseSelectProps & RefAttributes[BaseSelectRef]]))
  }
  
  @JSImport("rc-select", "BaseSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[BaseSelectRef] {
    
    inline def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    inline def activeValue(value: String): this.type = set("activeValue", value.asInstanceOf[js.Any])
    
    inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    inline def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearIcon(value: RenderNode): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    inline def clearIconFunction1(value: /* props */ Any => Node): this.type = set("clearIcon", js.Any.fromFunction1(value))
    
    inline def clearIconNull: this.type = set("clearIcon", null)
    
    inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
    
    inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
    
    inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    inline def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    inline def dropdownRender(value: /* menu */ Element => Element): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    inline def dropdownStyle(value: CSSProperties): this.type = set("dropdownStyle", value.asInstanceOf[js.Any])
    
    inline def getInputElement(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("getInputElement", value.toJsFn)
    
    inline def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def getRawInputElement(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("getRawInputElement", value.toJsFn)
    
    inline def inputIcon(value: RenderNode): this.type = set("inputIcon", value.asInstanceOf[js.Any])
    
    inline def inputIconFunction1(value: /* props */ Any => Node): this.type = set("inputIcon", js.Any.fromFunction1(value))
    
    inline def inputIconNull: this.type = set("inputIcon", null)
    
    inline def inputIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("inputIcon", js.Array(value*))
    
    inline def inputIconVdomElement(value: VdomElement): this.type = set("inputIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def maxTagCount(value: Double | responsive): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
    
    inline def maxTagPlaceholder(value: Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    inline def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => Node): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
    
    inline def maxTagPlaceholderNull: this.type = set("maxTagPlaceholder", null)
    
    inline def maxTagPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("maxTagPlaceholder", js.Array(value*))
    
    inline def maxTagPlaceholderVdomElement(value: VdomElement): this.type = set("maxTagPlaceholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
    
    inline def mode(value: Mode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def notFoundContent(value: VdomNode): this.type = set("notFoundContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def notFoundContentNull: this.type = set("notFoundContent", null)
    
    inline def notFoundContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("notFoundContent", js.Array(value*))
    
    inline def notFoundContentVdomElement(value: VdomElement): this.type = set("notFoundContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def omitDomProps(value: js.Array[String]): this.type = set("omitDomProps", value.asInstanceOf[js.Any])
    
    inline def omitDomPropsVarargs(value: String*): this.type = set("omitDomProps", js.Array(value*))
    
    inline def onActiveValueChange(value: /* value */ String | Null => Callback): this.type = set("onActiveValueChange", js.Any.fromFunction1((t0: /* value */ String | Null) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDropdownVisibleChange(value: /* open */ Boolean => Callback): this.type = set("onDropdownVisibleChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInputKeyDown(
      value: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onInputKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPopupScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPopupScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSearchSplit(value: /* words */ js.Array[String] => Callback): this.type = set("onSearchSplit", js.Any.fromFunction1((t0: /* words */ js.Array[String]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    inline def removeIconFunction1(value: /* props */ Any => Node): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    inline def removeIconNull: this.type = set("removeIcon", null)
    
    inline def removeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("removeIcon", js.Array(value*))
    
    inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def showAction(value: js.Array[focus | click]): this.type = set("showAction", value.asInstanceOf[js.Any])
    
    inline def showActionVarargs(value: (focus | click)*): this.type = set("showAction", js.Array(value*))
    
    inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tagRender(value: /* props */ CustomTagProps => Element): this.type = set("tagRender", js.Any.fromFunction1(value))
    
    inline def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
    
    inline def tokenSeparatorsVarargs(value: String*): this.type = set("tokenSeparators", js.Array(value*))
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseSelectProps & RefAttributes[BaseSelectRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
