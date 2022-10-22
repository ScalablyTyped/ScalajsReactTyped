package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`oj-table-cell`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnIndexKey extends StObject {
  
  var columnIndex: Double
  
  var key: String
  
  var rowIndex: Double
  
  var subId: `oj-table-cell`
}
object ColumnIndexKey {
  
  inline def apply(columnIndex: Double, key: String, rowIndex: Double): ColumnIndexKey = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = "oj-table-cell")
    __obj.asInstanceOf[ColumnIndexKey]
  }
  
  extension [Self <: ColumnIndexKey](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSubId(value: `oj-table-cell`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
