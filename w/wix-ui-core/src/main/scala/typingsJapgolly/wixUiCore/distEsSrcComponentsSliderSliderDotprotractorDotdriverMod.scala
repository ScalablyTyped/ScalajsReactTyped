package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import typingsJapgolly.wixUiTestUtils.distSrcProtractorProtractorHelpersMod.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSliderSliderDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Slider.protractor.driver", "sliderDriverFactory")
  @js.native
  val sliderDriverFactory: DriverFactory[SliderDriver] = js.native
  
  trait SliderDriver
    extends StObject
       with BaseDriver {
    
    def clickTrack(position: ILocation): js.Promise[Unit]
    
    def dragAndDropThumb(position: ILocation): js.Promise[Unit]
    
    def dragThumb(position: ILocation): js.Promise[Unit]
    
    def getSliderValue(): js.Promise[String]
    
    def getTooltipValue(): js.Promise[String]
  }
  object SliderDriver {
    
    inline def apply(
      clickTrack: ILocation => js.Promise[Unit],
      dragAndDropThumb: ILocation => js.Promise[Unit],
      dragThumb: ILocation => js.Promise[Unit],
      element: CallbackTo[ElementFinder],
      getSliderValue: CallbackTo[js.Promise[String]],
      getTooltipValue: CallbackTo[js.Promise[String]]
    ): SliderDriver = {
      val __obj = js.Dynamic.literal(clickTrack = js.Any.fromFunction1(clickTrack), dragAndDropThumb = js.Any.fromFunction1(dragAndDropThumb), dragThumb = js.Any.fromFunction1(dragThumb), element = element.toJsFn, getSliderValue = getSliderValue.toJsFn, getTooltipValue = getTooltipValue.toJsFn)
      __obj.asInstanceOf[SliderDriver]
    }
    
    extension [Self <: SliderDriver](x: Self) {
      
      inline def setClickTrack(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "clickTrack", js.Any.fromFunction1(value))
      
      inline def setDragAndDropThumb(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "dragAndDropThumb", js.Any.fromFunction1(value))
      
      inline def setDragThumb(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "dragThumb", js.Any.fromFunction1(value))
      
      inline def setGetSliderValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSliderValue", value.toJsFn)
      
      inline def setGetTooltipValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTooltipValue", value.toJsFn)
    }
  }
}
