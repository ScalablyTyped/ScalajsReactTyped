package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartZoomEndEvent
  extends StObject
     with StockChartEvent {
  
  var axisRanges: js.UndefOr[Any] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
}
object StockChartZoomEndEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: StockChart): StockChartZoomEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartZoomEndEvent]
  }
  
  extension [Self <: StockChartZoomEndEvent](x: Self) {
    
    inline def setAxisRanges(value: Any): Self = StObject.set(x, "axisRanges", value.asInstanceOf[js.Any])
    
    inline def setAxisRangesUndefined: Self = StObject.set(x, "axisRanges", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
