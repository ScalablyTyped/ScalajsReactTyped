package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import typingsJapgolly.antd.anon.Children
import typingsJapgolly.antd.anon.ShowLeafIcon
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
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.antd.antdStrings.tree
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libTreeSelectMod.TreeSelectProps
import typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.libTreeTreeMod.SwitcherIcon
import typingsJapgolly.antd.libUtilMotionMod.SelectCommonPlacement
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectRef
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libSelectMod.ArrayElementType
import typingsJapgolly.rcSelect.libSelectMod.LabelInValueType
import typingsJapgolly.rcSelect.libSelectMod.RawValueType
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esTreeMod.ExpandAction
import typingsJapgolly.rcTreeSelect.esInterfaceMod.Key
import typingsJapgolly.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.BaseOptionType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.ChangeEventExtra
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.FieldNames
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.LegacyDataNode
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.SimpleModeConfig
import typingsJapgolly.rcTreeSelect.esUtilsStrategyUtilMod.CheckedStrategy
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeSelect {
  
  inline def apply[ValueType, OptionType /* <: BaseOptionType | DefaultOptionType */](): Builder[ValueType, OptionType] = {
    val __props = js.Dynamic.literal()
    new Builder[ValueType, OptionType](js.Array(this.component, __props.asInstanceOf[Children & (TreeSelectProps[ValueType, OptionType])]))
  }
  
  object TreeNode {
    
    inline def apply(value: Key): SharedBuilder_TreeNodeProps_408501178 = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new SharedBuilder_TreeNodeProps_408501178(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
    }
    
    @JSImport("antd", "TreeSelect.TreeNode")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_408501178 = new SharedBuilder_TreeNodeProps_408501178(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "TreeSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ValueType, OptionType /* <: BaseOptionType | DefaultOptionType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[BaseSelectRef] {
    
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
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: ValueType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
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
    
    inline def filterTreeNode(
      value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
    ): this.type = set("filterTreeNode", value.asInstanceOf[js.Any])
    
    inline def filterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction2(value))
    
    inline def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def getRawInputElement(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("getRawInputElement", value.toJsFn)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    inline def labelInValue(value: Boolean): this.type = set("labelInValue", value.asInstanceOf[js.Any])
    
    inline def listHeight(value: Double): this.type = set("listHeight", value.asInstanceOf[js.Any])
    
    inline def listItemHeight(value: Double): this.type = set("listItemHeight", value.asInstanceOf[js.Any])
    
    inline def loadData(value: /* dataNode */ LegacyDataNode => js.Promise[Any]): this.type = set("loadData", js.Any.fromFunction1(value))
    
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
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def notFoundContent(value: VdomNode): this.type = set("notFoundContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def notFoundContentNull: this.type = set("notFoundContent", null)
    
    inline def notFoundContentVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("notFoundContent", js.Array(value*))
    
    inline def notFoundContentVdomElement(value: VdomElement): this.type = set("notFoundContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: (ValueType, /* labelList */ js.Array[japgolly.scalajs.react.facade.React.Node], /* extra */ ChangeEventExtra) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: ValueType, t1: /* labelList */ js.Array[japgolly.scalajs.react.facade.React.Node], t2: /* extra */ ChangeEventExtra) => (value(t0, t1, t2)).runNow()))
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDeselect(value: (LabelInValueType | RawValueType | ArrayElementType[ValueType], OptionType) => Callback): this.type = set("onDeselect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
    
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
    
    inline def onSelect(value: (LabelInValueType | RawValueType | ArrayElementType[ValueType], OptionType) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
    
    inline def onTreeExpand(value: /* expandedKeys */ js.Array[typingsJapgolly.react.mod.Key] => Callback): this.type = set("onTreeExpand", js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[typingsJapgolly.react.mod.Key]) => value(t0).runNow()))
    
    inline def onTreeLoad(value: /* loadedKeys */ js.Array[typingsJapgolly.react.mod.Key] => Callback): this.type = set("onTreeLoad", js.Any.fromFunction1((t0: /* loadedKeys */ js.Array[typingsJapgolly.react.mod.Key]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
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
    
    inline def showCheckedStrategy(value: CheckedStrategy): this.type = set("showCheckedStrategy", value.asInstanceOf[js.Any])
    
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
    
    inline def switcherIcon(value: SwitcherIcon | IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    inline def switcherIconFunction1(
      value: (/* props */ AntTreeNodeProps) | (/* props */ typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps[DataNode]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    inline def switcherIconNull: this.type = set("switcherIcon", null)
    
    inline def switcherIconVarargs(
      value: (japgolly.scalajs.react.facade.React.Element | japgolly.scalajs.react.facade.Empty | JsNumber | String)*
    ): this.type = set("switcherIcon", js.Array(value*))
    
    inline def switcherIconVdomElement(value: VdomElement): this.type = set("switcherIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tagRender(value: /* props */ CustomTagProps => japgolly.scalajs.react.facade.React.Element): this.type = set("tagRender", js.Any.fromFunction1(value))
    
    inline def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
    
    inline def tokenSeparatorsVarargs(value: String*): this.type = set("tokenSeparators", js.Array(value*))
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def treeCheckStrictly(value: Boolean): this.type = set("treeCheckStrictly", value.asInstanceOf[js.Any])
    
    inline def treeCheckable(value: Boolean | japgolly.scalajs.react.facade.React.Node): this.type = set("treeCheckable", value.asInstanceOf[js.Any])
    
    inline def treeCheckableNull: this.type = set("treeCheckable", null)
    
    inline def treeCheckableVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("treeCheckable", js.Array(value*))
    
    inline def treeCheckableVdomElement(value: VdomElement): this.type = set("treeCheckable", value.rawElement.asInstanceOf[js.Any])
    
    inline def treeData(value: js.Array[OptionType]): this.type = set("treeData", value.asInstanceOf[js.Any])
    
    inline def treeDataSimpleMode(value: Boolean | SimpleModeConfig): this.type = set("treeDataSimpleMode", value.asInstanceOf[js.Any])
    
    inline def treeDataVarargs(value: OptionType*): this.type = set("treeData", js.Array(value*))
    
    inline def treeDefaultExpandAll(value: Boolean): this.type = set("treeDefaultExpandAll", value.asInstanceOf[js.Any])
    
    inline def treeDefaultExpandedKeys(value: js.Array[typingsJapgolly.react.mod.Key]): this.type = set("treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
    
    inline def treeDefaultExpandedKeysVarargs(value: typingsJapgolly.react.mod.Key*): this.type = set("treeDefaultExpandedKeys", js.Array(value*))
    
    inline def treeExpandAction(value: ExpandAction): this.type = set("treeExpandAction", value.asInstanceOf[js.Any])
    
    inline def treeExpandedKeys(value: js.Array[typingsJapgolly.react.mod.Key]): this.type = set("treeExpandedKeys", value.asInstanceOf[js.Any])
    
    inline def treeExpandedKeysVarargs(value: typingsJapgolly.react.mod.Key*): this.type = set("treeExpandedKeys", js.Array(value*))
    
    inline def treeIcon(value: IconType): this.type = set("treeIcon", value.asInstanceOf[js.Any])
    
    inline def treeIconFunction1(
      value: /* props */ typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps[DataNode] => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("treeIcon", js.Any.fromFunction1(value))
    
    inline def treeIconNull: this.type = set("treeIcon", null)
    
    inline def treeIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("treeIcon", js.Array(value*))
    
    inline def treeIconVdomElement(value: VdomElement): this.type = set("treeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def treeLine(value: Boolean | ShowLeafIcon): this.type = set("treeLine", value.asInstanceOf[js.Any])
    
    inline def treeLoadedKeys(value: js.Array[typingsJapgolly.react.mod.Key]): this.type = set("treeLoadedKeys", value.asInstanceOf[js.Any])
    
    inline def treeLoadedKeysVarargs(value: typingsJapgolly.react.mod.Key*): this.type = set("treeLoadedKeys", js.Array(value*))
    
    inline def treeNodeFilterProp(value: String): this.type = set("treeNodeFilterProp", value.asInstanceOf[js.Any])
    
    inline def treeNodeLabelProp(value: String): this.type = set("treeNodeLabelProp", value.asInstanceOf[js.Any])
    
    inline def value(value: ValueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  implicit def make[ValueType, OptionType /* <: BaseOptionType | DefaultOptionType */](companion: TreeSelect.type): Builder[ValueType, OptionType] = new Builder[ValueType, OptionType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[ValueType, OptionType /* <: BaseOptionType | DefaultOptionType */](p: Children & (TreeSelectProps[ValueType, OptionType])): Builder[ValueType, OptionType] = new Builder[ValueType, OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
