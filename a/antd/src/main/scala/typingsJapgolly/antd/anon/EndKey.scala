package typingsJapgolly.antd.anon

import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndKey extends StObject {
  
  var endKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key] = js.undefined
  
  var expandedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]
  
  var startKey: js.UndefOr[typingsJapgolly.rcTree.esInterfaceMod.Key] = js.undefined
  
  var treeData: js.Array[DataNode]
}
object EndKey {
  
  inline def apply(expandedKeys: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key], treeData: js.Array[DataNode]): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
  
  extension [Self <: EndKey](x: Self) {
    
    inline def setEndKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
    
    inline def setExpandedKeys(value: js.Array[typingsJapgolly.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typingsJapgolly.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    
    inline def setStartKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
    
    inline def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value*))
  }
}
