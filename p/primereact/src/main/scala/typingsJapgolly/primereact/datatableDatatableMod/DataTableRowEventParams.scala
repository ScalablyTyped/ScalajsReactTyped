package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEventParams extends StObject {
  
  var data: Any
  
  var originalEvent: ReactEventFrom[Element]
}
object DataTableRowEventParams {
  
  inline def apply(data: Any, originalEvent: ReactEventFrom[Element]): DataTableRowEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEventParams]
  }
  
  extension [Self <: DataTableRowEventParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
