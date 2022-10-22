package typingsJapgolly.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderEndEvent extends StObject {
  
  var slider: Slider
  
  var step: SliderStep
}
object SliderEndEvent {
  
  inline def apply(slider: Slider, step: SliderStep): SliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderEndEvent]
  }
  
  extension [Self <: SliderEndEvent](x: Self) {
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
