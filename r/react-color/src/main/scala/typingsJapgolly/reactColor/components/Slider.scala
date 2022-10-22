package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsSliderSliderMod.SliderPickerProps
import typingsJapgolly.reactColor.libComponentsSliderSliderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("react-color/lib/components/slider/Slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderPickerProps_1430347861[default] = new SharedBuilder_SliderPickerProps_1430347861[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderPickerProps): SharedBuilder_SliderPickerProps_1430347861[default] = new SharedBuilder_SliderPickerProps_1430347861[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
