package typingsJapgolly.nivoArcs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGPathElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.anon.BorderColor
import typingsJapgolly.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcShape {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, style: BorderColor): Builder[Datum] = {
    val __props = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[ArcShapeProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcShape")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: DatumWithArcAndColor */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcShapeProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
