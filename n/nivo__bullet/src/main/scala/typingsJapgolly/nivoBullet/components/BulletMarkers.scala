package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoBullet.distTypesBulletMarkersMod.EventHandlers
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedMarkersDatum
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletMarkers {
  
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
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseLeave(t0, t1)).runNow()), reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BulletMarkersProps & EventHandlers]))
  }
  
  @JSImport("@nivo/bullet/dist/types/BulletMarkers", "BulletMarkers")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BulletMarkersProps & EventHandlers): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
