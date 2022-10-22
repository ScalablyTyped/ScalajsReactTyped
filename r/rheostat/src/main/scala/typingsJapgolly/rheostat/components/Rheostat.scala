package typingsJapgolly.rheostat.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rheostat.mod.Algorithm
import typingsJapgolly.rheostat.mod.Orientation
import typingsJapgolly.rheostat.mod.Props
import typingsJapgolly.rheostat.mod.PublicState
import typingsJapgolly.rheostat.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rheostat {
  
  @JSImport("rheostat", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def algorithm(value: Algorithm): this.type = set("algorithm", value.asInstanceOf[js.Any])
    
    inline def autoAdjustVerticalPosition(value: Boolean): this.type = set("autoAdjustVerticalPosition", value.asInstanceOf[js.Any])
    
    inline def background(value: ElementType): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def getNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): this.type = set("getNextHandlePosition", js.Any.fromFunction2(value))
    
    inline def handle(value: ElementType): this.type = set("handle", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* publicState */ PublicState => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onClick(value: CallbackTo[Any]): this.type = set("onClick", value.toJsFn)
    
    inline def onKeyPress(value: CallbackTo[Any]): this.type = set("onKeyPress", value.toJsFn)
    
    inline def onSliderDragEnd(value: CallbackTo[Any]): this.type = set("onSliderDragEnd", value.toJsFn)
    
    inline def onSliderDragMove(value: CallbackTo[Any]): this.type = set("onSliderDragMove", value.toJsFn)
    
    inline def onSliderDragStart(value: CallbackTo[Any]): this.type = set("onSliderDragStart", value.toJsFn)
    
    inline def onValuesUpdated(value: /* publicState */ PublicState => Any): this.type = set("onValuesUpdated", js.Any.fromFunction1(value))
    
    inline def orientation(value: Orientation): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def pitComponent(value: ElementType): this.type = set("pitComponent", value.asInstanceOf[js.Any])
    
    inline def pitPoints(value: js.Array[Double]): this.type = set("pitPoints", value.asInstanceOf[js.Any])
    
    inline def pitPointsVarargs(value: Double*): this.type = set("pitPoints", js.Array(value*))
    
    inline def progressBar(value: ElementType): this.type = set("progressBar", value.asInstanceOf[js.Any])
    
    inline def snap(value: Boolean): this.type = set("snap", value.asInstanceOf[js.Any])
    
    inline def snapPoints(value: js.Array[Double]): this.type = set("snapPoints", value.asInstanceOf[js.Any])
    
    inline def snapPointsVarargs(value: Double*): this.type = set("snapPoints", js.Array(value*))
    
    inline def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def valuesVarargs(value: Double*): this.type = set("values", js.Array(value*))
  }
  
  implicit def make(companion: Rheostat.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
