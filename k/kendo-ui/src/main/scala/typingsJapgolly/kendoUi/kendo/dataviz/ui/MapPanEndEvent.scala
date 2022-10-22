package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.map.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPanEndEvent
  extends StObject
     with MapEvent {
  
  var center: js.UndefOr[Location] = js.undefined
  
  var origin: js.UndefOr[Location] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
}
object MapPanEndEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Map): MapPanEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanEndEvent]
  }
  
  extension [Self <: MapPanEndEvent](x: Self) {
    
    inline def setCenter(value: Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setOrigin(value: Location): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
