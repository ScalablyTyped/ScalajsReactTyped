package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklinePlotAreaHoverEvent
  extends StObject
     with SparklineEvent {
  
  var category: js.UndefOr[Any] = js.undefined
  
  var element: js.UndefOr[Any] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object SparklinePlotAreaHoverEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Sparkline): SparklinePlotAreaHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinePlotAreaHoverEvent]
  }
  
  extension [Self <: SparklinePlotAreaHoverEvent](x: Self) {
    
    inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
