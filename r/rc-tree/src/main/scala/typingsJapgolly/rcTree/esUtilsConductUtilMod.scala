package typingsJapgolly.rcTree

import typingsJapgolly.rcTree.anon.HalfCheckedKeys
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.GetCheckDisabled
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.rcTreeBooleans.`true`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsConductUtilMod {
  
  @JSImport("rc-tree/es/utils/conductUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conductCheck[TreeDataType /* <: BasicDataNode */](
    keyList: js.Array[Key],
    checked: HalfCheckedKeys,
    keyEntities: Record[Key, DataEntity[TreeDataType]]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  inline def conductCheck[TreeDataType /* <: BasicDataNode */](
    keyList: js.Array[Key],
    checked: HalfCheckedKeys,
    keyEntities: Record[Key, DataEntity[TreeDataType]],
    getCheckDisabled: GetCheckDisabled[TreeDataType]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  inline def conductCheck_true[TreeDataType /* <: BasicDataNode */](keyList: js.Array[Key], checked: `true`, keyEntities: Record[Key, DataEntity[TreeDataType]]): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  inline def conductCheck_true[TreeDataType /* <: BasicDataNode */](
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: Record[Key, DataEntity[TreeDataType]],
    getCheckDisabled: GetCheckDisabled[TreeDataType]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  inline def isCheckDisabled[TreeDataType](node: TreeDataType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ConductReturnType extends StObject {
    
    var checkedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
  }
  object ConductReturnType {
    
    inline def apply(checkedKeys: js.Array[Key], halfCheckedKeys: js.Array[Key]): ConductReturnType = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConductReturnType]
    }
    
    extension [Self <: ConductReturnType](x: Self) {
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
    }
  }
}
