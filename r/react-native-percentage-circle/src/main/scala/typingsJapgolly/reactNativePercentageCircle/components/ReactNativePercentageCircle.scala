package typingsJapgolly.reactNativePercentageCircle.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePercentageCircle.mod.PercentageCircleProps
import typingsJapgolly.reactNativePercentageCircle.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePercentageCircle {
  
  @JSImport("react-native-percentage-circle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def bgcolor(value: String): this.type = set("bgcolor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def innerColor(value: String): this.type = set("innerColor", value.asInstanceOf[js.Any])
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: js.Array[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleVarargs(value: TextStyle*): this.type = set("textStyle", js.Array(value*))
  }
  
  implicit def make(companion: ReactNativePercentageCircle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PercentageCircleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
