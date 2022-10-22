package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  trait ChangeEventExtra extends StObject {
    
    /** @deprecated This prop not work as react node anymore. */
    var allCheckedNodes: js.Array[LegacyCheckedNode]
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please save prev value by control logic instead */
    var preValue: js.Array[LabelValueType]
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated This prop not work as react node anymore. */
    var triggerNode: Element
    
    var triggerValue: RawValueType
  }
  object ChangeEventExtra {
    
    inline def apply(
      allCheckedNodes: js.Array[LegacyCheckedNode],
      preValue: js.Array[LabelValueType],
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
      
      inline def setPreValue(value: js.Array[LabelValueType]): Self = StObject.set(x, "preValue", value.asInstanceOf[js.Any])
      
      inline def setPreValueVarargs(value: LabelValueType*): Self = StObject.set(x, "preValue", js.Array(value*))
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTriggerNode(value: VdomElement): Self = StObject.set(x, "triggerNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTriggerValue(value: RawValueType): Self = StObject.set(x, "triggerValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataNode
    extends StObject
       with /** Customize data info */
  /* prop */ StringDictionary[Any] {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[DataNode]] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object DataNode {
    
    inline def apply(): DataNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataNode]
    }
    
    extension [Self <: DataNode](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChildren(value: js.Array[DataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
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
  
  type DefaultValueType = RawValueType | (js.Array[LabelValueType | RawValueType]) | LabelValueType
  
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
  
  trait FlattenDataNode extends StObject {
    
    var data: InternalDataEntity
    
    var key: Key
    
    var level: Double
    
    var parent: js.UndefOr[FlattenDataNode] = js.undefined
    
    var value: RawValueType
  }
  object FlattenDataNode {
    
    inline def apply(data: InternalDataEntity, key: Key, level: Double, value: RawValueType): FlattenDataNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenDataNode]
    }
    
    extension [Self <: FlattenDataNode](x: Self) {
      
      inline def setData(value: InternalDataEntity): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setParent(value: FlattenDataNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalDataEntity extends StObject {
    
    var children: js.UndefOr[js.Array[InternalDataEntity]] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: Key
    
    /** Origin DataNode */
    var node: DataNode
    
    var title: js.UndefOr[Node] = js.undefined
    
    var value: RawValueType
  }
  object InternalDataEntity {
    
    inline def apply(key: Key, node: DataNode, value: RawValueType): InternalDataEntity = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDataEntity]
    }
    
    extension [Self <: InternalDataEntity](x: Self) {
      
      inline def setChildren(value: js.Array[InternalDataEntity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: InternalDataEntity*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Key = String | Double
  
  trait LabelValueType extends StObject {
    
    /** Only works on `treeCheckStrictly` */
    var halfChecked: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object LabelValueType {
    
    inline def apply(): LabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelValueType]
    }
    
    extension [Self <: LabelValueType](x: Self) {
      
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
       with DataNode {
    
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
  
  trait TreeDataNode
    extends StObject
       with DataNode {
    
    @JSName("children")
    var children_TreeDataNode: js.UndefOr[js.Array[TreeDataNode]] = js.undefined
    
    @JSName("key")
    var key_TreeDataNode: Key
  }
  object TreeDataNode {
    
    inline def apply(key: Key): TreeDataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDataNode]
    }
    
    extension [Self <: TreeDataNode](x: Self) {
      
      inline def setChildren(value: js.Array[TreeDataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TreeDataNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
