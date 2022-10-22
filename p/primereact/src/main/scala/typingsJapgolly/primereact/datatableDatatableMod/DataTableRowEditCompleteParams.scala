package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditCompleteParams
  extends StObject
     with DataTableRowEventParams {
  
  var field: String
  
  var index: Double
  
  var newData: Any
}
object DataTableRowEditCompleteParams {
  
  inline def apply(data: Any, field: String, index: Double, newData: Any, originalEvent: ReactEventFrom[Element]): DataTableRowEditCompleteParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditCompleteParams]
  }
  
  extension [Self <: DataTableRowEditCompleteParams](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNewData(value: Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
  }
}
