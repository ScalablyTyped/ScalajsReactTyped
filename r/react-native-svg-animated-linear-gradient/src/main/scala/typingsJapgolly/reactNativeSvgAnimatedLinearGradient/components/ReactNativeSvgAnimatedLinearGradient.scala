package typingsJapgolly.reactNativeSvgAnimatedLinearGradient.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvgAnimatedLinearGradient.mod.GradientProps
import typingsJapgolly.reactNativeSvgAnimatedLinearGradient.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvgAnimatedLinearGradient {
  
  @JSImport("react-native-svg-animated-linear-gradient", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
    
    inline def secondaryColor(value: String): this.type = set("secondaryColor", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x1(value: String): this.type = set("x1", value.asInstanceOf[js.Any])
    
    inline def x2(value: String): this.type = set("x2", value.asInstanceOf[js.Any])
    
    inline def y1(value: String): this.type = set("y1", value.asInstanceOf[js.Any])
    
    inline def y2(value: String): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSvgAnimatedLinearGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
