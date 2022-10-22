package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<primereact.primereact/datatable/datatable.DataTableRowEventParams, 'originalEvent'> */
trait DataTableRowClickEventParams extends StObject {
  
  var data: Any
  
  var index: Double
  
  var originalEvent: ReactMouseEventFrom[HTMLElement]
}
object DataTableRowClickEventParams {
  
  inline def apply(data: Any, index: Double, originalEvent: ReactMouseEventFrom[HTMLElement]): DataTableRowClickEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowClickEventParams]
  }
  
  extension [Self <: DataTableRowClickEventParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactMouseEventFrom[HTMLElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
