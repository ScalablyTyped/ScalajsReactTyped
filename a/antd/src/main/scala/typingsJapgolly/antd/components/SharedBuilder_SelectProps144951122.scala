package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.`additions removals`
import typingsJapgolly.antd.antdStrings.`additions text`
import typingsJapgolly.antd.antdStrings.`inline`
import typingsJapgolly.antd.antdStrings.`removals additions`
import typingsJapgolly.antd.antdStrings.`removals text`
import typingsJapgolly.antd.antdStrings.`text additions`
import typingsJapgolly.antd.antdStrings.`text removals`
import typingsJapgolly.antd.antdStrings.additions
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.ascending
import typingsJapgolly.antd.antdStrings.assertive
import typingsJapgolly.antd.antdStrings.both
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.copy
import typingsJapgolly.antd.antdStrings.date
import typingsJapgolly.antd.antdStrings.descending
import typingsJapgolly.antd.antdStrings.dialog
import typingsJapgolly.antd.antdStrings.execute
import typingsJapgolly.antd.antdStrings.focus
import typingsJapgolly.antd.antdStrings.grammar
import typingsJapgolly.antd.antdStrings.grid
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.link
import typingsJapgolly.antd.antdStrings.list
import typingsJapgolly.antd.antdStrings.listbox
import typingsJapgolly.antd.antdStrings.location
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.menu
import typingsJapgolly.antd.antdStrings.mixed
import typingsJapgolly.antd.antdStrings.move
import typingsJapgolly.antd.antdStrings.multiple
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.off
import typingsJapgolly.antd.antdStrings.other
import typingsJapgolly.antd.antdStrings.page
import typingsJapgolly.antd.antdStrings.polite
import typingsJapgolly.antd.antdStrings.popup
import typingsJapgolly.antd.antdStrings.removals
import typingsJapgolly.antd.antdStrings.responsive
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.antdStrings.spelling
import typingsJapgolly.antd.antdStrings.step
import typingsJapgolly.antd.antdStrings.tags
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.antd.antdStrings.tree
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libUtilMotionMod.SelectCommonPlacement
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libSelectMod.ArrayElementType
import typingsJapgolly.rcSelect.libSelectMod.DefaultOptionType
import typingsJapgolly.rcSelect.libSelectMod.FieldNames
import typingsJapgolly.rcSelect.libSelectMod.FilterFunc
import typingsJapgolly.rcSelect.libSelectMod.LabelInValueType
import typingsJapgolly.rcSelect.libSelectMod.RawValueType
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SelectProps144951122 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
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
    value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
  
  inline def autoClearSearchValue(value: Boolean): this.type = set("autoClearSearchValue", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
  
  inline def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clearIcon(value: RenderNode): this.type = set("clearIcon", value.asInstanceOf[js.Any])
  
  inline def clearIconFunction1(value: /* props */ Any => japgolly.scalajs.react.facade.React.Node): this.type = set("clearIcon", js.Any.fromFunction1(value))
  
  inline def clearIconNull: this.type = set("clearIcon", null)
  
  inline def clearIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("clearIcon", js.Array(value*))
  
  inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
  
  inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueNull: this.type = set("defaultValue", null)
  
  inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def dropdownAlign(value: AlignType): this.type = set("dropdownAlign", value.asInstanceOf[js.Any])
  
  inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
  
  inline def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
  
  inline def dropdownRender(
    value: /* menu */ japgolly.scalajs.react.facade.React.Element => japgolly.scalajs.react.facade.React.Element
  ): this.type = set("dropdownRender", js.Any.fromFunction1(value))
  
  inline def dropdownStyle(value: CSSProperties): this.type = set("dropdownStyle", value.asInstanceOf[js.Any])
  
  inline def fieldNames(value: FieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
  
  inline def filterOption(value: Boolean | FilterFunc[DefaultOptionType]): this.type = set("filterOption", value.asInstanceOf[js.Any])
  
  inline def filterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[DefaultOptionType]) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
  
  inline def filterSort(value: (DefaultOptionType, DefaultOptionType) => Double): this.type = set("filterSort", js.Any.fromFunction2(value))
  
  inline def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  
  inline def labelInValue(value: Boolean): this.type = set("labelInValue", value.asInstanceOf[js.Any])
  
  inline def listHeight(value: Double): this.type = set("listHeight", value.asInstanceOf[js.Any])
  
  inline def listItemHeight(value: Double): this.type = set("listItemHeight", value.asInstanceOf[js.Any])
  
  inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  
  inline def maxTagCount(value: Double | responsive): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
  
  inline def maxTagPlaceholder(
    value: japgolly.scalajs.react.facade.React.Node | (js.Function1[
      /* omittedValues */ js.Array[DisplayValueType], 
      japgolly.scalajs.react.facade.React.Node
    ])
  ): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
  
  inline def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => japgolly.scalajs.react.facade.React.Node): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
  
  inline def maxTagPlaceholderNull: this.type = set("maxTagPlaceholder", null)
  
  inline def maxTagPlaceholderVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("maxTagPlaceholder", js.Array(value*))
  
  inline def maxTagPlaceholderVdomElement(value: VdomElement): this.type = set("maxTagPlaceholder", value.rawElement.asInstanceOf[js.Any])
  
  inline def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
  
  inline def menuItemSelectedIcon(value: RenderNode): this.type = set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
  
  inline def menuItemSelectedIconFunction1(value: /* props */ Any => japgolly.scalajs.react.facade.React.Node): this.type = set("menuItemSelectedIcon", js.Any.fromFunction1(value))
  
  inline def menuItemSelectedIconNull: this.type = set("menuItemSelectedIcon", null)
  
  inline def menuItemSelectedIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("menuItemSelectedIcon", js.Array(value*))
  
  inline def menuItemSelectedIconVdomElement(value: VdomElement): this.type = set("menuItemSelectedIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def mode(value: multiple | tags): this.type = set("mode", value.asInstanceOf[js.Any])
  
  inline def notFoundContent(value: VdomNode): this.type = set("notFoundContent", value.rawNode.asInstanceOf[js.Any])
  
  inline def notFoundContentNull: this.type = set("notFoundContent", null)
  
  inline def notFoundContentVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("notFoundContent", js.Array(value*))
  
  inline def notFoundContentVdomElement(value: VdomElement): this.type = set("notFoundContent", value.rawElement.asInstanceOf[js.Any])
  
  inline def onBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onChange(value: (Any, /* option */ DefaultOptionType | js.Array[DefaultOptionType]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: Any, t1: /* option */ DefaultOptionType | js.Array[DefaultOptionType]) => (value(t0, t1)).runNow()))
  
  inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
  
  inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onDeselect(value: (LabelInValueType | RawValueType | ArrayElementType[Any], DefaultOptionType) => Callback): this.type = set("onDeselect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[Any], t1: DefaultOptionType) => (value(t0, t1)).runNow()))
  
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
  
  inline def onSearch(value: /* value */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def onSelect(value: (LabelInValueType | RawValueType | ArrayElementType[Any], DefaultOptionType) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[Any], t1: DefaultOptionType) => (value(t0, t1)).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def optionFilterProp(value: String): this.type = set("optionFilterProp", value.asInstanceOf[js.Any])
  
  inline def optionLabelProp(value: String): this.type = set("optionLabelProp", value.asInstanceOf[js.Any])
  
  inline def options(value: js.Array[DefaultOptionType]): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def optionsVarargs(value: DefaultOptionType*): this.type = set("options", js.Array(value*))
  
  inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
  
  inline def placeholderNull: this.type = set("placeholder", null)
  
  inline def placeholderVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("placeholder", js.Array(value*))
  
  inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
  
  inline def placement(value: SelectCommonPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
  
  inline def removeIconFunction1(value: /* props */ Any => japgolly.scalajs.react.facade.React.Node): this.type = set("removeIcon", js.Any.fromFunction1(value))
  
  inline def removeIconNull: this.type = set("removeIcon", null)
  
  inline def removeIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("removeIcon", js.Array(value*))
  
  inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def searchValue(value: String): this.type = set("searchValue", value.asInstanceOf[js.Any])
  
  inline def showAction(value: js.Array[focus | click]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  inline def showActionVarargs(value: (focus | click)*): this.type = set("showAction", js.Array(value*))
  
  inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  
  inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
  
  inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def suffixIcon(value: VdomNode): this.type = set("suffixIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def suffixIconNull: this.type = set("suffixIcon", null)
  
  inline def suffixIconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("suffixIcon", js.Array(value*))
  
  inline def suffixIconVdomElement(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def tagRender(value: /* props */ CustomTagProps => japgolly.scalajs.react.facade.React.Element): this.type = set("tagRender", js.Any.fromFunction1(value))
  
  inline def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
  
  inline def tokenSeparatorsVarargs(value: String*): this.type = set("tokenSeparators", js.Array(value*))
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueNull: this.type = set("value", null)
  
  inline def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
}
