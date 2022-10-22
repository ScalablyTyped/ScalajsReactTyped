package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRequestStartEvent
  extends StObject
     with DataSourceEvent {
  
  def preventDefault(): Unit
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceRequestStartEvent {
  
  inline def apply(preventDefault: Callback): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
  
  extension [Self <: DataSourceRequestStartEvent](x: Self) {
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
