package typingsJapgolly.rcTree.anon

import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.FieldNames
import typingsJapgolly.rcTree.esInterfaceMod.FlattenNode
import typingsJapgolly.rcTree.esTreeMod.TreeProps
import typingsJapgolly.rcTree.rcTreeInts.`-1`
import typingsJapgolly.rcTree.rcTreeInts.`0`
import typingsJapgolly.rcTree.rcTreeInts.`1`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState<rc-tree.rc-tree/es/interface.DataNode>> */
trait PartialTreeStateDataNode extends StObject {
  
  var activeKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key] = js.undefined
  
  var checkedKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var dragChildrenKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var dragOverNodeKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key | Null] = js.undefined
  
  var draggingNodeKey: js.UndefOr[typingsJapgolly.react.mod.Key] = js.undefined
  
  var dropAllowed: js.UndefOr[Boolean] = js.undefined
  
  var dropContainerKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key | Null] = js.undefined
  
  var dropLevelOffset: js.UndefOr[Double | Null] = js.undefined
  
  var dropPosition: js.UndefOr[`-1` | `0` | `1` | Null] = js.undefined
  
  var dropTargetKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key | Null] = js.undefined
  
  var dropTargetPos: js.UndefOr[String | Null] = js.undefined
  
  var expandedKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var fieldNames: js.UndefOr[FieldNames] = js.undefined
  
  var flattenNodes: js.UndefOr[js.Array[FlattenNode[DataNode]]] = js.undefined
  
  var focused: js.UndefOr[Boolean] = js.undefined
  
  var halfCheckedKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var indent: js.UndefOr[Double | Null] = js.undefined
  
  var keyEntities: js.UndefOr[Record[typingsJapgolly.rcTree.esInterfaceMod.Key, DataEntity[DataNode]]] = js.undefined
  
  var listChanging: js.UndefOr[Boolean] = js.undefined
  
  var loadedKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var loadingKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var prevProps: js.UndefOr[TreeProps[DataNode]] = js.undefined
  
  var selectedKeys: js.UndefOr[js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]] = js.undefined
  
  var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
}
object PartialTreeStateDataNode {
  
  inline def apply(): PartialTreeStateDataNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeStateDataNode]
  }
  
  extension [Self <: PartialTreeStateDataNode](x: Self) {
    
    inline def setActiveKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setCheckedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
    
    inline def setCheckedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
    
    inline def setDragChildrenKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "dragChildrenKeys", value.asInstanceOf[js.Any])
    
    inline def setDragChildrenKeysUndefined: Self = StObject.set(x, "dragChildrenKeys", js.undefined)
    
    inline def setDragChildrenKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "dragChildrenKeys", js.Array(value*))
    
    inline def setDragOverNodeKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
    
    inline def setDragOverNodeKeyUndefined: Self = StObject.set(x, "dragOverNodeKey", js.undefined)
    
    inline def setDraggingNodeKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDraggingNodeKeyUndefined: Self = StObject.set(x, "draggingNodeKey", js.undefined)
    
    inline def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropAllowedUndefined: Self = StObject.set(x, "dropAllowed", js.undefined)
    
    inline def setDropContainerKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
    
    inline def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
    
    inline def setDropContainerKeyUndefined: Self = StObject.set(x, "dropContainerKey", js.undefined)
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropLevelOffsetNull: Self = StObject.set(x, "dropLevelOffset", null)
    
    inline def setDropLevelOffsetUndefined: Self = StObject.set(x, "dropLevelOffset", js.undefined)
    
    inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
    
    inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    inline def setDropTargetKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
    
    inline def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
    
    inline def setDropTargetKeyUndefined: Self = StObject.set(x, "dropTargetKey", js.undefined)
    
    inline def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
    
    inline def setDropTargetPosNull: Self = StObject.set(x, "dropTargetPos", null)
    
    inline def setDropTargetPosUndefined: Self = StObject.set(x, "dropTargetPos", js.undefined)
    
    inline def setExpandedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    inline def setExpandedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFlattenNodes(value: js.Array[FlattenNode[DataNode]]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
    
    inline def setFlattenNodesUndefined: Self = StObject.set(x, "flattenNodes", js.undefined)
    
    inline def setFlattenNodesVarargs(value: FlattenNode[DataNode]*): Self = StObject.set(x, "flattenNodes", js.Array(value*))
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setHalfCheckedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
    
    inline def setHalfCheckedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentNull: Self = StObject.set(x, "indent", null)
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setKeyEntities(value: Record[typingsJapgolly.rcTree.esInterfaceMod.Key, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    inline def setKeyEntitiesUndefined: Self = StObject.set(x, "keyEntities", js.undefined)
    
    inline def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
    
    inline def setListChangingUndefined: Self = StObject.set(x, "listChanging", js.undefined)
    
    inline def setLoadedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
    
    inline def setLoadedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
    
    inline def setLoadingKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadingKeysUndefined: Self = StObject.set(x, "loadingKeys", js.undefined)
    
    inline def setLoadingKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
    
    inline def setPrevProps(value: TreeProps[DataNode]): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    inline def setSelectedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    inline def setSelectedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    
    inline def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
    
    inline def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value*))
  }
}
