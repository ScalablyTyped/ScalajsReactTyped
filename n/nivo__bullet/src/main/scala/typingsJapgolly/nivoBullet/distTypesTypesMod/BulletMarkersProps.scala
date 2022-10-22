package typingsJapgolly.nivoBullet.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps, 'layout' | 'reverse'> & std.Pick<@nivo/core.@nivo/core.Dimensions, 'height'> & {  scale :@nivo/scales.@nivo/scales.ScaleLinear<number>,   markerSize :number,   markers :std.Array<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedMarkersDatum>,   component :@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps['markerComponent'],   onMouseEnter :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedMarkersDatum, std.SVGLineElement>,   onMouseLeave :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedMarkersDatum, std.SVGLineElement>,   onClick :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedMarkersDatum, std.SVGLineElement>} */
trait BulletMarkersProps extends StObject {
  
  var component: ComponentType[BulletMarkersItemProps]
  
  var height: Double
  
  var layout: horizontal | vertical
  
  var markerSize: Double
  
  var markers: js.Array[ComputedMarkersDatum]
  
  var onClick: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var onMouseEnter: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var onMouseLeave: MouseEventWithDatum[ComputedMarkersDatum, SVGLineElement]
  
  var reverse: Boolean
  
  var scale: ScaleLinear[Double]
}
object BulletMarkersProps {
  
  inline def apply(
    component: ComponentType[BulletMarkersItemProps],
    height: Double,
    layout: horizontal | vertical,
    markerSize: Double,
    markers: js.Array[ComputedMarkersDatum],
    onClick: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    onMouseEnter: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    onMouseLeave: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    reverse: Boolean,
    scale: ScaleLinear[Double]
  ): BulletMarkersProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseLeave(t0, t1)).runNow()), reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletMarkersProps]
  }
  
  extension [Self <: BulletMarkersProps](x: Self) {
    
    inline def setComponent(value: ComponentType[BulletMarkersItemProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: js.Array[ComputedMarkersDatum]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: ComputedMarkersDatum*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setOnClick(
      value: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnter(
      value: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeave(
      value: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
