package typingsJapgolly.d3SimpleSlider

import typingsJapgolly.d3SimpleSlider.mod.Slider
import typingsJapgolly.d3SimpleSlider.mod.SliderDomain
import typingsJapgolly.d3SimpleSlider.mod.SliderScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object d3 {
    
    @JSGlobal("d3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sliderBottom[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderBottom")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderLeft[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderLeft")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderRight[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderRight")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
    
    inline def sliderTop[Domain /* <: SliderDomain */](scale: SliderScale[Domain]): Slider[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderTop")(scale.asInstanceOf[js.Any]).asInstanceOf[Slider[Domain]]
  }
}
