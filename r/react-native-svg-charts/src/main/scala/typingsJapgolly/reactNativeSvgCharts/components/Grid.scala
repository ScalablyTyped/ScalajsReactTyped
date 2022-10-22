package typingsJapgolly.reactNativeSvgCharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvgCharts.anon.PartialLineProps
import typingsJapgolly.reactNativeSvgCharts.mod.GridDirection
import typingsJapgolly.reactNativeSvgCharts.mod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GridProps[T]]))
  }
  
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvgCharts.mod.Grid[T]] {
    
    inline def belowChart(value: Boolean): this.type = set("belowChart", value.asInstanceOf[js.Any])
    
    inline def direction(value: GridDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def svg(value: PartialLineProps): this.type = set("svg", value.asInstanceOf[js.Any])
    
    inline def ticks(value: js.Array[T]): this.type = set("ticks", value.asInstanceOf[js.Any])
    
    inline def ticksVarargs(value: T*): this.type = set("ticks", js.Array(value*))
    
    inline def x(value: T => Double): this.type = set("x", js.Any.fromFunction1(value))
    
    inline def y(value: T => Double): this.type = set("y", js.Any.fromFunction1(value))
  }
  
  implicit def make[T](companion: Grid.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: GridProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
