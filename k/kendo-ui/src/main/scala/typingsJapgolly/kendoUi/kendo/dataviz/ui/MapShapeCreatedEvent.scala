package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.map.layer.Shape
import typingsJapgolly.kendoUi.kendo.drawing.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapShapeCreatedEvent
  extends StObject
     with MapEvent {
  
  var layer: js.UndefOr[Shape] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var shape: js.UndefOr[Element] = js.undefined
}
object MapShapeCreatedEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Map): MapShapeCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShapeCreatedEvent]
  }
  
  extension [Self <: MapShapeCreatedEvent](x: Self) {
    
    inline def setLayer(value: Shape): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setShape(value: Element): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
