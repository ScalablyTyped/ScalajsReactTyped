package typingsJapgolly.tablestore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablestore.mod.CellValue
import typingsJapgolly.tablestore.mod.PrimaryKeyInput
import typingsJapgolly.tablestore.mod.VirtualData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryKey extends StObject {
  
  var condition: typingsJapgolly.tablestore.mod.Condition
  
  var primaryKey: PrimaryKeyInput
  
  var `type`: typingsJapgolly.tablestore.tablestoreStrings.DELETE
}
object PrimaryKey {
  
  inline def apply(condition: typingsJapgolly.tablestore.mod.Condition, primaryKey: PrimaryKeyInput): PrimaryKey = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DELETE")
    __obj.asInstanceOf[PrimaryKey]
  }
  
  extension [Self <: PrimaryKey](x: Self) {
    
    inline def setCondition(value: typingsJapgolly.tablestore.mod.Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.tablestore.tablestoreStrings.DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
