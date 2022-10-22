package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.afterAnimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesAfterAnimateEventObject extends StObject {
  
  /**
    * Animated series.
    */
  var target: Series
  
  /**
    * Event type.
    */
  var `type`: afterAnimate
}
object SeriesAfterAnimateEventObject {
  
  inline def apply(target: Series): SeriesAfterAnimateEventObject = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("afterAnimate")
    __obj.asInstanceOf[SeriesAfterAnimateEventObject]
  }
  
  extension [Self <: SeriesAfterAnimateEventObject](x: Self) {
    
    inline def setTarget(value: Series): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: afterAnimate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
