package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCircularProgressBarCircularProgressBarDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/circular-progress-bar/CircularProgressBar.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularProgressBarUniDriverFactory(base: UniDriver[Any]): CircularProgressBarUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarUniDriver]
  
  trait CircularProgressBarUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Get the text content displayed */
    def getLabelTextContent(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String]
    
    /** Returns true if has error */
    def hasError(): js.Promise[Boolean]
    
    /** Returns true if has progress completed (value is 100) */
    def isCompleted(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the label text exists */
    def isLabelDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): js.Promise[Boolean]
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): js.Promise[Boolean]
  }
  object CircularProgressBarUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabelTextContent: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      isCompleted: CallbackTo[js.Promise[Boolean]],
      isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isLabelDisplayed: CallbackTo[js.Promise[Boolean]],
      isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]]
    ): CircularProgressBarUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabelTextContent = getLabelTextContent.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
      __obj.asInstanceOf[CircularProgressBarUniDriver]
    }
    
    extension [Self <: CircularProgressBarUniDriver](x: Self) {
      
      inline def setGetLabelTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelTextContent", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsCompleted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCompleted", value.toJsFn)
      
      inline def setIsErrorIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
      
      inline def setIsLabelDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLabelDisplayed", value.toJsFn)
      
      inline def setIsPercentagesProgressDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
      
      inline def setIsSuccessIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
    }
  }
}
