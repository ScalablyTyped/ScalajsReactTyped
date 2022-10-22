package typingsJapgolly.rcTreeSelect

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
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.Placement
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderDOMFunc
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libSelectMod.ArrayElementType
import typingsJapgolly.rcSelect.libSelectMod.LabelInValueType
import typingsJapgolly.rcSelect.libSelectMod.SelectHandler
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esTreeMod.ExpandAction
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTreeSelect.anon.Children
import typingsJapgolly.rcTreeSelect.anon.SHOWALL
import typingsJapgolly.rcTreeSelect.anon.Selected
import typingsJapgolly.rcTreeSelect.esUtilsStrategyUtilMod.CheckedStrategy
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`additions removals`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`additions text`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`inline`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`removals additions`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`removals text`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`text additions`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.`text removals`
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.additions
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.all
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.ascending
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.assertive
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.both
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.click
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.copy
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.date
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.descending
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.dialog
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.execute
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.focus
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.grammar
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.grid
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.horizontal
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.link
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.list
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.listbox
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.location
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.ltr
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.menu
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.mixed
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.move
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.none
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.off
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.other
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.page
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.polite
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.popup
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.removals
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.responsive
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.rtl
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.spelling
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.step
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.text
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.time
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.tree
import typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.vertical
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeSelectMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/TreeSelect", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL = js.native
  
  trait BaseOptionType
    extends StObject
       with /** Customize data info */
  /* prop */ StringDictionary[Any] {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[BaseOptionType]] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptionType {
    
    inline def apply(): BaseOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptionType]
    }
    
    extension [Self <: BaseOptionType](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChildren(value: js.Array[BaseOptionType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: BaseOptionType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait ChangeEventExtra extends StObject {
    
    /** @deprecated This prop not work as react node anymore. */
    var allCheckedNodes: js.Array[LegacyCheckedNode]
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please save prev value by control logic instead */
    var preValue: js.Array[LabeledValueType]
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated This prop not work as react node anymore. */
    var triggerNode: Element
    
    var triggerValue: RawValueType
  }
  object ChangeEventExtra {
    
    inline def apply(
      allCheckedNodes: js.Array[LegacyCheckedNode],
      preValue: js.Array[LabeledValueType],
      triggerNode: VdomElement,
      triggerValue: RawValueType
    ): ChangeEventExtra = {
      val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerNode = triggerNode.rawElement.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEventExtra]
    }
    
    extension [Self <: ChangeEventExtra](x: Self) {
      
      inline def setAllCheckedNodes(value: js.Array[LegacyCheckedNode]): Self = StObject.set(x, "allCheckedNodes", value.asInstanceOf[js.Any])
      
      inline def setAllCheckedNodesVarargs(value: LegacyCheckedNode*): Self = StObject.set(x, "allCheckedNodes", js.Array(value*))
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setPreValue(value: js.Array[LabeledValueType]): Self = StObject.set(x, "preValue", value.asInstanceOf[js.Any])
      
      inline def setPreValueVarargs(value: LabeledValueType*): Self = StObject.set(x, "preValue", js.Array(value*))
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTriggerNode(value: VdomElement): Self = StObject.set(x, "triggerNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTriggerValue(value: RawValueType): Self = StObject.set(x, "triggerValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultOptionType
    extends StObject
       with BaseOptionType {
    
    @JSName("children")
    var children_DefaultOptionType: js.UndefOr[js.Array[DefaultOptionType]] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object DefaultOptionType {
    
    inline def apply(): DefaultOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptionType]
    }
    
    extension [Self <: DefaultOptionType](x: Self) {
      
      inline def setChildren(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DefaultOptionType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DraftValueType = RawValueType | LabeledValueType | (js.Array[RawValueType | LabeledValueType])
  
  trait FieldNames extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object FieldNames {
    
    inline def apply(): FieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNames]
    }
    
    extension [Self <: FieldNames](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-tree-select.rc-tree-select/es/TreeSelect.FieldNames, 'label'> */
  trait InternalFieldName extends StObject {
    
    var _title: js.Array[String]
    
    var children: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object InternalFieldName {
    
    inline def apply(_title: js.Array[String]): InternalFieldName = {
      val __obj = js.Dynamic.literal(_title = _title.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalFieldName]
    }
    
    extension [Self <: InternalFieldName](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
      
      inline def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value*))
    }
  }
  
  trait LabeledValueType extends StObject {
    
    /** Only works on `treeCheckStrictly` */
    var halfChecked: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object LabeledValueType {
    
    inline def apply(): LabeledValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabeledValueType]
    }
    
    extension [Self <: LabeledValueType](x: Self) {
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait LegacyCheckedNode extends StObject {
    
    var children: js.UndefOr[js.Array[LegacyCheckedNode]] = js.undefined
    
    var node: Element
    
    var pos: String
  }
  object LegacyCheckedNode {
    
    inline def apply(node: VdomElement, pos: String): LegacyCheckedNode = {
      val __obj = js.Dynamic.literal(node = node.rawElement.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyCheckedNode]
    }
    
    extension [Self <: LegacyCheckedNode](x: Self) {
      
      inline def setChildren(value: js.Array[LegacyCheckedNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LegacyCheckedNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setNode(value: VdomElement): Self = StObject.set(x, "node", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacyDataNode
    extends StObject
       with DefaultOptionType {
    
    var props: Any
  }
  object LegacyDataNode {
    
    inline def apply(props: Any): LegacyDataNode = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyDataNode]
    }
    
    extension [Self <: LegacyDataNode](x: Self) {
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type OnInternalSelect = js.Function2[/* value */ RawValueType, /* info */ Selected, Unit]
  
  type RawValueType = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.option
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.selection
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.input
    - typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.clear
  */
  trait SelectSource extends StObject
  object SelectSource {
    
    inline def clear: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.clear = "clear".asInstanceOf[typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.clear]
    
    inline def input: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.input = "input".asInstanceOf[typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.input]
    
    inline def option: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.option = "option".asInstanceOf[typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.option]
    
    inline def selection: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.selection = "selection".asInstanceOf[typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.selection]
  }
  
  trait SimpleModeConfig extends StObject {
    
    var id: js.UndefOr[Key] = js.undefined
    
    var pId: js.UndefOr[Key] = js.undefined
    
    var rootPId: js.UndefOr[Key] = js.undefined
  }
  object SimpleModeConfig {
    
    inline def apply(): SimpleModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleModeConfig]
    }
    
    extension [Self <: SimpleModeConfig](x: Self) {
      
      inline def setId(value: Key): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPId(value: Key): Self = StObject.set(x, "pId", value.asInstanceOf[js.Any])
      
      inline def setPIdUndefined: Self = StObject.set(x, "pId", js.undefined)
      
      inline def setRootPId(value: Key): Self = StObject.set(x, "rootPId", value.asInstanceOf[js.Any])
      
      inline def setRootPIdUndefined: Self = StObject.set(x, "rootPId", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-select.rc-select.BaseSelectPropsWithoutPrivate, 'mode'> */
  trait TreeSelectProps[ValueType, OptionType /* <: BaseOptionType */] extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var choiceTransitionName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[RenderNode] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ Element, Element]] = js.undefined
    
    var dropdownStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    var filterTreeNode: js.UndefOr[
        Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ] = js.undefined
    
    var getInputElement: js.UndefOr[js.Function0[typingsJapgolly.react.mod.global.JSX.Element]] = js.undefined
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.undefined
    
    var getRawInputElement: js.UndefOr[js.Function0[typingsJapgolly.react.mod.global.JSX.Element]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputIcon: js.UndefOr[RenderNode] = js.undefined
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.undefined
    
    var labelInValue: js.UndefOr[Boolean] = js.undefined
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[Any]]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.undefined
    
    var maxTagPlaceholder: js.UndefOr[Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])] = js.undefined
    
    var maxTagTextLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var notFoundContent: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ ValueType, 
          /* labelList */ js.Array[Node], 
          /* extra */ ChangeEventExtra, 
          Unit
        ]
      ] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDeselect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.undefined
    
    var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.undefined
    
    var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[Node] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var removeIcon: js.UndefOr[RenderNode] = js.undefined
    
    var searchValue: js.UndefOr[String] = js.undefined
    
    var showAction: js.UndefOr[js.Array[focus | click]] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showTreeIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, Element]] = js.undefined
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
    
    var treeCheckable: js.UndefOr[Boolean | Node] = js.undefined
    
    var treeData: js.UndefOr[js.Array[OptionType]] = js.undefined
    
    var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.undefined
    
    var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var treeDefaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeExpandAction: js.UndefOr[ExpandAction] = js.undefined
    
    var treeExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeIcon: js.UndefOr[IconType] = js.undefined
    
    var treeLine: js.UndefOr[Boolean] = js.undefined
    
    var treeLoadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeMotion: js.UndefOr[Any] = js.undefined
    
    var treeNodeFilterProp: js.UndefOr[String] = js.undefined
    
    var treeNodeLabelProp: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeSelectProps {
    
    inline def apply[ValueType, OptionType /* <: BaseOptionType */](): TreeSelectProps[ValueType, OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSelectProps[ValueType, OptionType]]
    }
    
    extension [Self <: TreeSelectProps[?, ?], ValueType, OptionType /* <: BaseOptionType */](x: Self & (TreeSelectProps[ValueType, OptionType])) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      inline def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      inline def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      inline def setDropdownRender(value: /* menu */ Element => Element): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      inline def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      inline def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFilterTreeNode(
        value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      inline def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setGetInputElement(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "getInputElement", value.toJsFn)
      
      inline def setGetInputElementUndefined: Self = StObject.set(x, "getInputElement", js.undefined)
      
      inline def setGetPopupContainer(value: /* props */ Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setGetRawInputElement(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): Self = StObject.set(x, "getRawInputElement", value.toJsFn)
      
      inline def setGetRawInputElementUndefined: Self = StObject.set(x, "getRawInputElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputIcon(value: RenderNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      inline def setInputIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "inputIcon", js.Any.fromFunction1(value))
      
      inline def setInputIconNull: Self = StObject.set(x, "inputIcon", null)
      
      inline def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      inline def setInputIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "inputIcon", js.Array(value*))
      
      inline def setInputIconVdomElement(value: VdomElement): Self = StObject.set(x, "inputIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      inline def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      inline def setLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxTagCount(value: Double | responsive): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      inline def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      inline def setMaxTagPlaceholder(value: Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => Node): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      inline def setMaxTagPlaceholderNull: Self = StObject.set(x, "maxTagPlaceholder", null)
      
      inline def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      inline def setMaxTagPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "maxTagPlaceholder", js.Array(value*))
      
      inline def setMaxTagPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "maxTagPlaceholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      inline def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNotFoundContent(value: VdomNode): Self = StObject.set(x, "notFoundContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNotFoundContentNull: Self = StObject.set(x, "notFoundContent", null)
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setNotFoundContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "notFoundContent", js.Array(value*))
      
      inline def setNotFoundContentVdomElement(value: VdomElement): Self = StObject.set(x, "notFoundContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (/* value */ ValueType, /* labelList */ js.Array[Node], /* extra */ ChangeEventExtra) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* value */ ValueType, t1: /* labelList */ js.Array[Node], t2: /* extra */ ChangeEventExtra) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDeselect(
        value: (LabelInValueType | typingsJapgolly.rcSelect.libSelectMod.RawValueType | ArrayElementType[ValueType], OptionType) => Callback
      ): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2((t0: LabelInValueType | typingsJapgolly.rcSelect.libSelectMod.RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnDropdownVisibleChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "onDropdownVisibleChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputKeyDown(
        value: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnPopupScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPopupScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
      
      inline def setOnSearch(value: /* value */ String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(
        value: (LabelInValueType | typingsJapgolly.rcSelect.libSelectMod.RawValueType | ArrayElementType[ValueType], OptionType) => Callback
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: LabelInValueType | typingsJapgolly.rcSelect.libSelectMod.RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnTreeExpand(value: /* expandedKeys */ js.Array[Key] => Callback): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[Key]) => value(t0).runNow()))
      
      inline def setOnTreeExpandUndefined: Self = StObject.set(x, "onTreeExpand", js.undefined)
      
      inline def setOnTreeLoad(value: /* loadedKeys */ js.Array[Key] => Callback): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1((t0: /* loadedKeys */ js.Array[Key]) => value(t0).runNow()))
      
      inline def setOnTreeLoadUndefined: Self = StObject.set(x, "onTreeLoad", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: VdomNode): Self = StObject.set(x, "placeholder", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setRemoveIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "removeIcon", js.Array(value*))
      
      inline def setRemoveIconVdomElement(value: VdomElement): Self = StObject.set(x, "removeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      inline def setShowAction(value: js.Array[focus | click]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      inline def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      inline def setShowActionVarargs(value: (focus | click)*): Self = StObject.set(x, "showAction", js.Array(value*))
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setShowCheckedStrategy(value: CheckedStrategy): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      inline def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      inline def setShowTreeIconUndefined: Self = StObject.set(x, "showTreeIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setSwitcherIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
      
      inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTagRender(value: /* props */ CustomTagProps => Element): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      inline def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      inline def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      inline def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      inline def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value*))
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTreeCheckStrictly(value: Boolean): Self = StObject.set(x, "treeCheckStrictly", value.asInstanceOf[js.Any])
      
      inline def setTreeCheckStrictlyUndefined: Self = StObject.set(x, "treeCheckStrictly", js.undefined)
      
      inline def setTreeCheckable(value: Boolean | Node): Self = StObject.set(x, "treeCheckable", value.asInstanceOf[js.Any])
      
      inline def setTreeCheckableNull: Self = StObject.set(x, "treeCheckable", null)
      
      inline def setTreeCheckableUndefined: Self = StObject.set(x, "treeCheckable", js.undefined)
      
      inline def setTreeCheckableVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "treeCheckable", js.Array(value*))
      
      inline def setTreeCheckableVdomElement(value: VdomElement): Self = StObject.set(x, "treeCheckable", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTreeData(value: js.Array[OptionType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "treeDataSimpleMode", value.asInstanceOf[js.Any])
      
      inline def setTreeDataSimpleModeUndefined: Self = StObject.set(x, "treeDataSimpleMode", js.undefined)
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setTreeDataVarargs(value: OptionType*): Self = StObject.set(x, "treeData", js.Array(value*))
      
      inline def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandAllUndefined: Self = StObject.set(x, "treeDefaultExpandAll", js.undefined)
      
      inline def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeysUndefined: Self = StObject.set(x, "treeDefaultExpandedKeys", js.undefined)
      
      inline def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value*))
      
      inline def setTreeExpandAction(value: ExpandAction): Self = StObject.set(x, "treeExpandAction", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandActionUndefined: Self = StObject.set(x, "treeExpandAction", js.undefined)
      
      inline def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandedKeysUndefined: Self = StObject.set(x, "treeExpandedKeys", js.undefined)
      
      inline def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value*))
      
      inline def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      inline def setTreeIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      inline def setTreeIconNull: Self = StObject.set(x, "treeIcon", null)
      
      inline def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      inline def setTreeIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "treeIcon", js.Array(value*))
      
      inline def setTreeIconVdomElement(value: VdomElement): Self = StObject.set(x, "treeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      inline def setTreeLineUndefined: Self = StObject.set(x, "treeLine", js.undefined)
      
      inline def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeysUndefined: Self = StObject.set(x, "treeLoadedKeys", js.undefined)
      
      inline def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value*))
      
      inline def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      inline def setTreeMotionUndefined: Self = StObject.set(x, "treeMotion", js.undefined)
      
      inline def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeFilterPropUndefined: Self = StObject.set(x, "treeNodeFilterProp", js.undefined)
      
      inline def setTreeNodeLabelProp(value: String): Self = StObject.set(x, "treeNodeLabelProp", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeLabelPropUndefined: Self = StObject.set(x, "treeNodeLabelProp", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL
  
  /* This means you don't have to write `default`, but can instead just say `esTreeSelectMod.foo` */
  override def _to: (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL = default
}
