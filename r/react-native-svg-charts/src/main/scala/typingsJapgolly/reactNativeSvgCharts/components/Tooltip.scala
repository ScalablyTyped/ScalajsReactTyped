package typingsJapgolly.reactNativeSvgCharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvgCharts.mod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-native-svg-charts", "Decorators.Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvgCharts.mod.Decorators.Tooltip] {
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def pointStroke(value: String): this.type = set("pointStroke", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
