package typingsJapgolly.rcSlider.components

import typingsJapgolly.rcSlider.libSliderMod.SliderProps
import typingsJapgolly.rcSlider.libSliderMod.SliderRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderPropsRefAttributes_2091559504[SliderRef] = new SharedBuilder_SliderPropsRefAttributes_2091559504[SliderRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]): SharedBuilder_SliderPropsRefAttributes_2091559504[SliderRef] = new SharedBuilder_SliderPropsRefAttributes_2091559504[SliderRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
