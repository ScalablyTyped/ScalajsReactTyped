package typingsJapgolly.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalcFromSegmentTimeline extends StObject {
  
  var calcFromSegmentTimeline: js.UndefOr[Boolean] = js.undefined
  
  var fallbackToSegmentTimeline: js.UndefOr[Boolean] = js.undefined
}
object CalcFromSegmentTimeline {
  
  inline def apply(): CalcFromSegmentTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalcFromSegmentTimeline]
  }
  
  extension [Self <: CalcFromSegmentTimeline](x: Self) {
    
    inline def setCalcFromSegmentTimeline(value: Boolean): Self = StObject.set(x, "calcFromSegmentTimeline", value.asInstanceOf[js.Any])
    
    inline def setCalcFromSegmentTimelineUndefined: Self = StObject.set(x, "calcFromSegmentTimeline", js.undefined)
    
    inline def setFallbackToSegmentTimeline(value: Boolean): Self = StObject.set(x, "fallbackToSegmentTimeline", value.asInstanceOf[js.Any])
    
    inline def setFallbackToSegmentTimelineUndefined: Self = StObject.set(x, "fallbackToSegmentTimeline", js.undefined)
  }
}
