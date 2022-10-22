package typingsJapgolly.nivoBullet.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedMarker
import typingsJapgolly.nivoBullet.anon.WithDatumIdComputedRangeD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletHandlers extends StObject {
  
  var onMarkerClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedMarker, SVGLineElement]] = js.undefined
  
  var onMeasureClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
  
  var onRangeClick: js.UndefOr[MouseEventHandler[WithDatumIdComputedRangeD, SVGRectElement]] = js.undefined
}
object BulletHandlers {
  
  inline def apply(): BulletHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletHandlers]
  }
  
  extension [Self <: BulletHandlers](x: Self) {
    
    inline def setOnMarkerClick(
      value: (WithDatumIdComputedMarker, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): Self = StObject.set(x, "onMarkerClick", js.Any.fromFunction2((t0: WithDatumIdComputedMarker, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMarkerClickUndefined: Self = StObject.set(x, "onMarkerClick", js.undefined)
    
    inline def setOnMeasureClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): Self = StObject.set(x, "onMeasureClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMeasureClickUndefined: Self = StObject.set(x, "onMeasureClick", js.undefined)
    
    inline def setOnRangeClick(
      value: (WithDatumIdComputedRangeD, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback
    ): Self = StObject.set(x, "onRangeClick", js.Any.fromFunction2((t0: WithDatumIdComputedRangeD, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnRangeClickUndefined: Self = StObject.set(x, "onRangeClick", js.undefined)
  }
}
