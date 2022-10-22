package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSliderSliderDotuniDotdriverMod {
  
  trait SliderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDirection(): js.Promise[vertical | horizontal]
    
    def getToolTipValue(index: Double): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isDotSelected(value: Double): js.Promise[Boolean]
    
    def numOfSliderDots(): js.Promise[Double]
    
    def numOfSliderHandles(): js.Promise[Double]
    
    def numOfSliderMarksLabels(): js.Promise[Double]
  }
  object SliderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getDirection: CallbackTo[js.Promise[vertical | horizontal]],
      getToolTipValue: Double => js.Promise[String],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isDotSelected: Double => js.Promise[Boolean],
      numOfSliderDots: CallbackTo[js.Promise[Double]],
      numOfSliderHandles: CallbackTo[js.Promise[Double]],
      numOfSliderMarksLabels: CallbackTo[js.Promise[Double]]
    ): SliderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getDirection = getDirection.toJsFn, getToolTipValue = js.Any.fromFunction1(getToolTipValue), isDisabled = isDisabled.toJsFn, isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = numOfSliderDots.toJsFn, numOfSliderHandles = numOfSliderHandles.toJsFn, numOfSliderMarksLabels = numOfSliderMarksLabels.toJsFn)
      __obj.asInstanceOf[SliderUniDriver]
    }
    
    extension [Self <: SliderUniDriver](x: Self) {
      
      inline def setGetDirection(value: CallbackTo[js.Promise[vertical | horizontal]]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setGetToolTipValue(value: Double => js.Promise[String]): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsDotSelected(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      inline def setNumOfSliderDots(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numOfSliderDots", value.toJsFn)
      
      inline def setNumOfSliderHandles(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numOfSliderHandles", value.toJsFn)
      
      inline def setNumOfSliderMarksLabels(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numOfSliderMarksLabels", value.toJsFn)
    }
  }
}
