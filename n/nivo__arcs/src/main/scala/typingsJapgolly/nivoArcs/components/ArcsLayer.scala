package typingsJapgolly.nivoArcs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGPathElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoArcs.distTypesArcsLayerMod.ArcsLayerProps
import typingsJapgolly.nivoArcs.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcsLayer {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    arcGenerator: ArcGenerator,
    borderColor: InheritedColorConfig[Datum],
    borderWidth: Double,
    center: js.Tuple2[Double, Double],
    data: js.Array[Datum],
    transitionMode: ArcTransitionMode
  ): Builder[Datum] = {
    val __props = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[ArcsLayerProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcsLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: DatumWithArcAndColor */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def component(value: /* props */ ArcShapeProps[Datum] => Element): this.type = set("component", js.Any.fromFunction1(value))
    
    inline def onClick(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcsLayerProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
