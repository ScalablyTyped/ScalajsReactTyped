package typingsJapgolly.reactNativeIndicators.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeIndicators.mod.WaveIndicatorProps
import typingsJapgolly.reactNativeIndicators.reactNativeIndicatorsStrings.fill
import typingsJapgolly.reactNativeIndicators.reactNativeIndicatorsStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WaveIndicator {
  
  @JSImport("react-native-indicators", "WaveIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeIndicators.mod.WaveIndicator] {
    
    inline def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def animationEasing(value: /* value */ Double => Double): this.type = set("animationEasing", js.Any.fromFunction1(value))
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def hidesWhenStopped(value: Boolean): this.type = set("hidesWhenStopped", value.asInstanceOf[js.Any])
    
    inline def interaction(value: Boolean): this.type = set("interaction", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def waveFactor(value: Double): this.type = set("waveFactor", value.asInstanceOf[js.Any])
    
    inline def waveMode(value: fill | outline): this.type = set("waveMode", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WaveIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WaveIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
