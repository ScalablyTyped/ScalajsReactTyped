package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPlotAreaClickEvent
  extends StObject
     with ChartEvent {
  
  var category: js.UndefOr[Any] = js.undefined
  
  var element: js.UndefOr[Any] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
  
  var x: js.UndefOr[Any] = js.undefined
  
  var y: js.UndefOr[Any] = js.undefined
}
object ChartPlotAreaClickEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Chart): ChartPlotAreaClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaClickEvent]
  }
  
  extension [Self <: ChartPlotAreaClickEvent](x: Self) {
    
    inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
