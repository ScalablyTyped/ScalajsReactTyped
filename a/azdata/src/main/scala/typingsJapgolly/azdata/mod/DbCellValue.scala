package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCellValue extends StObject {
  
  var displayValue: String
  
  var invariantCultureDisplayValue: String
  
  var isNull: Boolean
}
object DbCellValue {
  
  inline def apply(displayValue: String, invariantCultureDisplayValue: String, isNull: Boolean): DbCellValue = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], invariantCultureDisplayValue = invariantCultureDisplayValue.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCellValue]
  }
  
  extension [Self <: DbCellValue](x: Self) {
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setInvariantCultureDisplayValue(value: String): Self = StObject.set(x, "invariantCultureDisplayValue", value.asInstanceOf[js.Any])
    
    inline def setIsNull(value: Boolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
  }
}
