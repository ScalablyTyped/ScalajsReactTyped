package typingsJapgolly.reactRangeslider.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRangeslider.mod.SliderProps
import typingsJapgolly.reactRangeslider.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRangeslider {
  
  inline def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps]))
  }
  
  @JSImport("react-rangeslider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format(value: /* value */ Double => js.UndefOr[String | Double]): this.type = set("format", js.Any.fromFunction1(value))
    
    inline def handleLabel(value: String): this.type = set("handleLabel", value.asInstanceOf[js.Any])
    
    inline def labels(value: NumberDictionary[String]): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onChangeComplete(value: /* value */ Double => Callback): this.type = set("onChangeComplete", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onChangeStart(value: /* value */ Double => Callback): this.type = set("onChangeStart", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
