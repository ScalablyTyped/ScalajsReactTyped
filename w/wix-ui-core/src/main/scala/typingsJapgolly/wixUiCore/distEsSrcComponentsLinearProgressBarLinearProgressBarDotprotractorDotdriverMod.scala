package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLinearProgressBarLinearProgressBarDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/linear-progress-bar/LinearProgressBar.protractor.driver", "linearProgressBarDriverFactory")
  @js.native
  val linearProgressBarDriverFactory: DriverFactory[LinearProgressBarDriver] = js.native
  
  trait LinearProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** Get the background bar width */
    def getBackgroundBarWidth(): js.Promise[Double]
    
    /** Get the foreground bar width */
    def getForegroundBarWidth(): js.Promise[Double]
    
    /** Returns true if the progress indication element is displayed */
    def isProgressIndicationDisplayed(): js.Promise[Boolean]
    
    /** Get the progress indication element value */
    def progressIndicationValue(): js.Promise[String]
  }
  object LinearProgressBarDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      exists: CallbackTo[js.Promise[Boolean]],
      getBackgroundBarWidth: CallbackTo[js.Promise[Double]],
      getForegroundBarWidth: CallbackTo[js.Promise[Double]],
      isProgressIndicationDisplayed: CallbackTo[js.Promise[Boolean]],
      progressIndicationValue: CallbackTo[js.Promise[String]]
    ): LinearProgressBarDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getBackgroundBarWidth = getBackgroundBarWidth.toJsFn, getForegroundBarWidth = getForegroundBarWidth.toJsFn, isProgressIndicationDisplayed = isProgressIndicationDisplayed.toJsFn, progressIndicationValue = progressIndicationValue.toJsFn)
      __obj.asInstanceOf[LinearProgressBarDriver]
    }
    
    extension [Self <: LinearProgressBarDriver](x: Self) {
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setGetBackgroundBarWidth(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getBackgroundBarWidth", value.toJsFn)
      
      inline def setGetForegroundBarWidth(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getForegroundBarWidth", value.toJsFn)
      
      inline def setIsProgressIndicationDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isProgressIndicationDisplayed", value.toJsFn)
      
      inline def setProgressIndicationValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "progressIndicationValue", value.toJsFn)
    }
  }
}
