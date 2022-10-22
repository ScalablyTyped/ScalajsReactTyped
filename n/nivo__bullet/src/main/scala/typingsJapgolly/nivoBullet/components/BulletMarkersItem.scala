package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGLineElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoBullet.anon.Color
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletMarkersItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedMarkersDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletMarkersItem {
  
  inline def apply(
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<PositionWithColor> */ Any,
    color: String,
    data: Color,
    onClick: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    onMouseEnter: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    onMouseLeave: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    onMouseMove: (ComputedMarkersDatum, /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => Callback,
    rotation: Double,
    size: Double,
    x: Double,
    y: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseLeave(t0, t1)).runNow()), onMouseMove = js.Any.fromFunction2((t0: ComputedMarkersDatum, t1: /* event */ ReactMouseEventFrom[SVGLineElement & Element]) => (onMouseMove(t0, t1)).runNow()), rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BulletMarkersItemProps]))
  }
  
  @JSImport("@nivo/bullet/dist/types/BulletMarkersItem", "BulletMarkersItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BulletMarkersItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
