package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditParams
  extends StObject
     with DataTableRowEventParams {
  
  var index: Double
}
object DataTableRowEditParams {
  
  inline def apply(data: Any, index: Double, originalEvent: ReactEventFrom[Element]): DataTableRowEditParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditParams]
  }
  
  extension [Self <: DataTableRowEditParams](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
