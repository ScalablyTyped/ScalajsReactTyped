package typingsJapgolly.rcTree.anon

import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.rcTreeInts.`-1`
import typingsJapgolly.rcTree.rcTreeInts.`0`
import typingsJapgolly.rcTree.rcTreeInts.`1`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedKeys[TreeDataType /* <: DataNode | BasicDataNode */] extends StObject {
  
  var checkedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var dragOverNodeKey: typingsJapgolly.rcTree.esInterfaceMod.Key
  
  var dropPosition: `0` | `1` | `-1`
  
  var expandedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var halfCheckedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var keyEntities: Record[typingsJapgolly.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]]
  
  var loadedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var loadingKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var selectedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
}
object CheckedKeys {
  
  inline def apply[TreeDataType /* <: DataNode | BasicDataNode */](
    checkedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    dragOverNodeKey: typingsJapgolly.rcTree.esInterfaceMod.Key,
    dropPosition: `0` | `1` | `-1`,
    expandedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    halfCheckedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    keyEntities: Record[typingsJapgolly.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]],
    loadedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    loadingKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key],
    selectedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  ): CheckedKeys[TreeDataType] = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys[TreeDataType]]
  }
  
  extension [Self <: CheckedKeys[?], TreeDataType /* <: DataNode | BasicDataNode */](x: Self & CheckedKeys[TreeDataType]) {
    
    inline def setCheckedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
    
    inline def setDragOverNodeKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `0` | `1` | `-1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setHalfCheckedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
    
    inline def setKeyEntities(value: Record[typingsJapgolly.rcTree.esInterfaceMod.Key, DataEntity[TreeDataType]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
    
    inline def setLoadingKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    inline def setLoadingKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
    
    inline def setSelectedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
  }
}
