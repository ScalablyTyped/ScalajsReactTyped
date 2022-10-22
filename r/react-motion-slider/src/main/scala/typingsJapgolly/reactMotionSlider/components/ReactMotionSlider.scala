package typingsJapgolly.reactMotionSlider.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.OpaqueConfig
import typingsJapgolly.reactMotionSlider.mod.SliderProps
import typingsJapgolly.reactMotionSlider.mod.default
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.center
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.left
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.right
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMotionSlider {
  
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def afterSlide(value: /* currentIndex */ Double => Callback): this.type = set("afterSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    inline def beforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Callback): this.type = set("beforeSlide", js.Any.fromFunction2((t0: /* currentIndex */ Double, t1: /* nextIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def currentIndex(value: Double): this.type = set("currentIndex", value.asInstanceOf[js.Any])
    
    inline def currentKey(value: String | Double): this.type = set("currentKey", value.asInstanceOf[js.Any])
    
    inline def flickTimeout(value: Double): this.type = set("flickTimeout", value.asInstanceOf[js.Any])
    
    inline def slidesToMove(value: Double): this.type = set("slidesToMove", value.asInstanceOf[js.Any])
    
    inline def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
    
    inline def springConfig(value: OpaqueConfig): this.type = set("springConfig", value.asInstanceOf[js.Any])
    
    inline def swipe(value: Boolean | touch | mouse): this.type = set("swipe", value.asInstanceOf[js.Any])
    
    inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactMotionSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
