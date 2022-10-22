package typingsJapgolly.highcharts.mod

import org.scalajs.dom.PointerEvent
import typingsJapgolly.highcharts.highchartsStrings.legendItemClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLegendItemClickEventObject extends StObject {
  
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent
  
  /**
    * Prevent the default action of toggle the visibility of the series.
    */
  var preventDefault: js.Function
  
  /**
    * Related series.
    */
  var target: Series
  
  /**
    * Event type.
    */
  var `type`: legendItemClick
}
object SeriesLegendItemClickEventObject {
  
  inline def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Series): SeriesLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("legendItemClick")
    __obj.asInstanceOf[SeriesLegendItemClickEventObject]
  }
  
  extension [Self <: SeriesLegendItemClickEventObject](x: Self) {
    
    inline def setBrowserEvent(value: PointerEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Series): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: legendItemClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
