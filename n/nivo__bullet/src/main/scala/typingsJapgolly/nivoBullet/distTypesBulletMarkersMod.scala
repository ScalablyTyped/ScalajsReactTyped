package typingsJapgolly.nivoBullet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGLineElement
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedMarkersDatum
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBulletMarkersMod {
  
  @JSImport("@nivo/bullet/dist/types/BulletMarkers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BulletMarkers(
    hasScaleLayoutReverseMarkersHeightMarkerSizeComponentOnMouseEnterOnMouseLeaveOnClick: BulletMarkersProps & EventHandlers
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BulletMarkers")(hasScaleLayoutReverseMarkersHeightMarkerSizeComponentOnMouseEnterOnMouseLeaveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Record<'onMouseEnter' | 'onMouseLeave' | 'onClick', @nivo/bullet.@nivo/bullet/dist/types/BulletMarkers.MouseEventWithDatum> */
  trait EventHandlers extends StObject {
    
    var onClick: MouseEventWithDatum
    
    var onMouseEnter: MouseEventWithDatum
    
    var onMouseLeave: MouseEventWithDatum
  }
  object EventHandlers {
    
    inline def apply(
      onClick: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback,
      onMouseEnter: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback,
      onMouseLeave: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (onMouseLeave(t0, t1)).runNow()))
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setOnClick(
        value: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnter(
        value: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback
      ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeave(
        value: (/* datum */ ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement]) => Callback
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement]) => (value(t0, t1)).runNow()))
    }
  }
  
  type MouseEventWithDatum = js.Function2[
    /* datum */ ComputedMarkersDatum, 
    /* event */ ReactMouseEventFrom[SVGLineElement], 
    Unit
  ]
}
