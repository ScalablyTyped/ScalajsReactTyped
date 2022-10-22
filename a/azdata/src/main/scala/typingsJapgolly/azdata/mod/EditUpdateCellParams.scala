package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditUpdateCellParams
  extends StObject
     with IEditRowOperationParams {
  
  var columnId: Double
  
  var newValue: String
}
object EditUpdateCellParams {
  
  inline def apply(columnId: Double, newValue: String, ownerUri: String, rowId: Double): EditUpdateCellParams = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditUpdateCellParams]
  }
  
  extension [Self <: EditUpdateCellParams](x: Self) {
    
    inline def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
