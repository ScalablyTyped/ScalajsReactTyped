package typingsJapgolly.tablestore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablestore.mod.AttributesInput
import typingsJapgolly.tablestore.mod.CellValue
import typingsJapgolly.tablestore.mod.PrimaryKeyInput
import typingsJapgolly.tablestore.mod.ReturnContent
import typingsJapgolly.tablestore.mod.VirtualData
import typingsJapgolly.tablestore.tablestoreStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  var attributeColumns: js.UndefOr[AttributesInput] = js.undefined
  
  var condition: typingsJapgolly.tablestore.mod.Condition
  
  var primaryKey: PrimaryKeyInput
  
  var returnContent: js.UndefOr[ReturnContent] = js.undefined
  
  var `type`: PUT
}
object Condition {
  
  inline def apply(condition: typingsJapgolly.tablestore.mod.Condition, primaryKey: PrimaryKeyInput): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PUT")
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setAttributeColumns(value: AttributesInput): Self = StObject.set(x, "attributeColumns", value.asInstanceOf[js.Any])
    
    inline def setAttributeColumnsUndefined: Self = StObject.set(x, "attributeColumns", js.undefined)
    
    inline def setAttributeColumnsVarargs(value: Dictname*): Self = StObject.set(x, "attributeColumns", js.Array(value*))
    
    inline def setCondition(value: typingsJapgolly.tablestore.mod.Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setReturnContent(value: ReturnContent): Self = StObject.set(x, "returnContent", value.asInstanceOf[js.Any])
    
    inline def setReturnContentUndefined: Self = StObject.set(x, "returnContent", js.undefined)
    
    inline def setType(value: PUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
