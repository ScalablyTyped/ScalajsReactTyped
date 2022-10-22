package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.SliderProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderProgress {
  
  @JSImport("tuya-panel-kit", "SliderProgress")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.SliderProgress] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def activeBase(value: Double): this.type = set("activeBase", value.asInstanceOf[js.Any])
    
    inline def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def ifAllowClick(value: Boolean): this.type = set("ifAllowClick", value.asInstanceOf[js.Any])
    
    inline def inactiveColor(value: String): this.type = set("inactiveColor", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onComplete(value: /* repeated */ Any => Any): this.type = set("onComplete", js.Any.fromFunction1(value))
    
    inline def onValueChange(value: /* repeated */ Any => Any): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def thumbWidth(value: Double): this.type = set("thumbWidth", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Double*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: SliderProgress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
