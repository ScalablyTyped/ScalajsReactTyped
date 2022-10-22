package typingsJapgolly.nivoVoronoi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoVoronoi.distTypesComputeMeshMod.XYAccessor
import typingsJapgolly.nivoVoronoi.distTypesMeshMod.MeshProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mesh {
  
  inline def apply[Datum](height: Double, nodes: js.Array[Datum], width: Double): Builder[Datum] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[MeshProps[Datum]]))
  }
  
  @JSImport("@nivo/voronoi", "Mesh")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (Datum, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (Datum, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (Datum, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (Datum, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def x(value: XYAccessor[Datum]): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def xFunction1(value: Datum => Double): this.type = set("x", js.Any.fromFunction1(value))
    
    inline def y(value: XYAccessor[Datum]): this.type = set("y", value.asInstanceOf[js.Any])
    
    inline def yFunction1(value: Datum => Double): this.type = set("y", js.Any.fromFunction1(value))
  }
  
  def withProps[Datum](p: MeshProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
