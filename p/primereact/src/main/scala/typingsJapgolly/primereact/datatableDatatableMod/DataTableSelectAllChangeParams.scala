package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableSelectAllChangeParams extends StObject {
  
  var checked: Boolean
  
  var originalEvent: ReactEventFrom[Element]
}
object DataTableSelectAllChangeParams {
  
  inline def apply(checked: Boolean, originalEvent: ReactEventFrom[Element]): DataTableSelectAllChangeParams = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableSelectAllChangeParams]
  }
  
  extension [Self <: DataTableSelectAllChangeParams](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
