package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowEditSaveParams
  extends StObject
     with DataTableRowEditParams {
  
  var valid: Boolean
}
object DataTableRowEditSaveParams {
  
  inline def apply(data: Any, index: Double, originalEvent: ReactEventFrom[Element], valid: Boolean): DataTableRowEditSaveParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditSaveParams]
  }
  
  extension [Self <: DataTableRowEditSaveParams](x: Self) {
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
