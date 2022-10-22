package typingsJapgolly.reactPlotlyJs.anon

import typingsJapgolly.plotlyJs.mod.Slider
import typingsJapgolly.plotlyJs.mod.SliderStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderEndEvent> */
trait ReadonlySliderEndEvent extends StObject {
  
  val slider: Slider
  
  val step: SliderStep
}
object ReadonlySliderEndEvent {
  
  inline def apply(slider: Slider, step: SliderStep): ReadonlySliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderEndEvent]
  }
  
  extension [Self <: ReadonlySliderEndEvent](x: Self) {
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
