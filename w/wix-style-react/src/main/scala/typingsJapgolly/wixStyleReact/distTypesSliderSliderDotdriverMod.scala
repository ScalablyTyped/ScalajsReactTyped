package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSliderSliderDotdriverMod {
  
  trait SliderDriver
    extends StObject
       with BaseDriver {
    
    def getDirection(): vertical | horizontal
    
    def getToolTipValue(index: Double): String
    
    def isDisabled(): Boolean
    
    def isDotSelected(value: Double): Boolean
    
    def numOfSliderDots(): Double
    
    def numOfSliderHandles(): Double
    
    def numOfSliderMarksLabels(): Double
  }
  object SliderDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getDirection: CallbackTo[vertical | horizontal],
      getToolTipValue: Double => String,
      isDisabled: CallbackTo[Boolean],
      isDotSelected: Double => Boolean,
      numOfSliderDots: CallbackTo[Double],
      numOfSliderHandles: CallbackTo[Double],
      numOfSliderMarksLabels: CallbackTo[Double]
    ): SliderDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getDirection = getDirection.toJsFn, getToolTipValue = js.Any.fromFunction1(getToolTipValue), isDisabled = isDisabled.toJsFn, isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = numOfSliderDots.toJsFn, numOfSliderHandles = numOfSliderHandles.toJsFn, numOfSliderMarksLabels = numOfSliderMarksLabels.toJsFn)
      __obj.asInstanceOf[SliderDriver]
    }
    
    extension [Self <: SliderDriver](x: Self) {
      
      inline def setGetDirection(value: CallbackTo[vertical | horizontal]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setGetToolTipValue(value: Double => String): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsDotSelected(value: Double => Boolean): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      inline def setNumOfSliderDots(value: CallbackTo[Double]): Self = StObject.set(x, "numOfSliderDots", value.toJsFn)
      
      inline def setNumOfSliderHandles(value: CallbackTo[Double]): Self = StObject.set(x, "numOfSliderHandles", value.toJsFn)
      
      inline def setNumOfSliderMarksLabels(value: CallbackTo[Double]): Self = StObject.set(x, "numOfSliderMarksLabels", value.toJsFn)
    }
  }
}
