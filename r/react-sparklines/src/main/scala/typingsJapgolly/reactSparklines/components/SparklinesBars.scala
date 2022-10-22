package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.reactSparklines.mod.Point
import typingsJapgolly.reactSparklines.mod.SparklinesBarsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SparklinesBars {
  
  @JSImport("react-sparklines", "SparklinesBars")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSparklines.mod.SparklinesBars] {
    
    inline def barWidth(value: Double): this.type = set("barWidth", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: (/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement & Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* p */ Point, t1: /* event */ ReactMouseEventFrom[ReactSVGElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def points(value: js.Array[Point]): this.type = set("points", value.asInstanceOf[js.Any])
    
    inline def pointsVarargs(value: Point*): this.type = set("points", js.Array(value*))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SparklinesBars.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SparklinesBarsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
