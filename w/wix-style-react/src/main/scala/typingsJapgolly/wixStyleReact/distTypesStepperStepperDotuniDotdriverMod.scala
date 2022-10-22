package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperFit
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperStepType
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperType
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStepperStepperDotuniDotdriverMod {
  
  trait StepperUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickStep(index: Double): js.Promise[Unit]
    
    def getFit(): js.Promise[StepperFit]
    
    def getNumberOfSteps(): js.Promise[Double]
    
    def getStepText(index: Double): js.Promise[String]
    
    def getStepType(index: Double): js.Promise[StepperStepType]
    
    def getType(): js.Promise[StepperType]
    
    def hoverStep(index: Double): js.Promise[Unit]
    
    def isStepActive(index: Double): js.Promise[Boolean]
  }
  object StepperUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickStep: Double => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getFit: CallbackTo[js.Promise[StepperFit]],
      getNumberOfSteps: CallbackTo[js.Promise[Double]],
      getStepText: Double => js.Promise[String],
      getStepType: Double => js.Promise[StepperStepType],
      getType: CallbackTo[js.Promise[StepperType]],
      hoverStep: Double => js.Promise[Unit],
      isStepActive: Double => js.Promise[Boolean]
    ): StepperUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickStep = js.Any.fromFunction1(clickStep), element = element.toJsFn, exists = exists.toJsFn, getFit = getFit.toJsFn, getNumberOfSteps = getNumberOfSteps.toJsFn, getStepText = js.Any.fromFunction1(getStepText), getStepType = js.Any.fromFunction1(getStepType), getType = getType.toJsFn, hoverStep = js.Any.fromFunction1(hoverStep), isStepActive = js.Any.fromFunction1(isStepActive))
      __obj.asInstanceOf[StepperUniDriver]
    }
    
    extension [Self <: StepperUniDriver](x: Self) {
      
      inline def setClickStep(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickStep", js.Any.fromFunction1(value))
      
      inline def setGetFit(value: CallbackTo[js.Promise[StepperFit]]): Self = StObject.set(x, "getFit", value.toJsFn)
      
      inline def setGetNumberOfSteps(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumberOfSteps", value.toJsFn)
      
      inline def setGetStepText(value: Double => js.Promise[String]): Self = StObject.set(x, "getStepText", js.Any.fromFunction1(value))
      
      inline def setGetStepType(value: Double => js.Promise[StepperStepType]): Self = StObject.set(x, "getStepType", js.Any.fromFunction1(value))
      
      inline def setGetType(value: CallbackTo[js.Promise[StepperType]]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setHoverStep(value: Double => js.Promise[Unit]): Self = StObject.set(x, "hoverStep", js.Any.fromFunction1(value))
      
      inline def setIsStepActive(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isStepActive", js.Any.fromFunction1(value))
    }
  }
}
