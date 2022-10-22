package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.RadialGradientProps
import typingsJapgolly.tuyaPanelKit.themeMod.StopsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialGradient {
  
  @JSImport("tuya-panel-kit", "RadialGradient")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.RadialGradient] {
    
    inline def cx(value: String): this.type = set("cx", value.asInstanceOf[js.Any])
    
    inline def cy(value: String): this.type = set("cy", value.asInstanceOf[js.Any])
    
    inline def fx(value: String): this.type = set("fx", value.asInstanceOf[js.Any])
    
    inline def fy(value: String): this.type = set("fy", value.asInstanceOf[js.Any])
    
    inline def gradientId(value: String): this.type = set("gradientId", value.asInstanceOf[js.Any])
    
    inline def rx(value: String): this.type = set("rx", value.asInstanceOf[js.Any])
    
    inline def ry(value: String): this.type = set("ry", value.asInstanceOf[js.Any])
    
    inline def stops(value: js.Array[StopsProps]): this.type = set("stops", value.asInstanceOf[js.Any])
    
    inline def stopsVarargs(value: StopsProps*): this.type = set("stops", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: RadialGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadialGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
