package typingsJapgolly.reactVis.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactVis.mod.VoronoiPoint
import typingsJapgolly.reactVis.mod.VoronoiProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Voronoi {
  
  inline def apply(extent: js.Array[js.Array[Double]], nodes: js.Array[VoronoiPoint]): Builder = {
    val __props = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VoronoiProps]))
  }
  
  @JSImport("react-vis", "Voronoi")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onHover(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def x(value: /* d */ Any => Double): this.type = set("x", js.Any.fromFunction1(value))
    
    inline def y(value: /* d */ Any => Double): this.type = set("y", js.Any.fromFunction1(value))
  }
  
  def withProps(p: VoronoiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
