package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCircularProgressBarCircularProgressBarDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/circular-progress-bar/CircularProgressBar.driver", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  trait CircularProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Get the text content displayed */
    def getLabelTextContent(): String
    
    /** Get the progress percentages value */
    def getValue(): String
    
    /** Returms true if has error */
    def hasError(): Boolean
    
    /** Returms true if has progress completed (value is 100) */
    def isCompleted(): Boolean
    
    /** Returns boolean that indicates if the error icon exists */
    def isErrorIconDisplayed(): Boolean
    
    /** Returns boolean that indicates if the label text exists */
    def isLabelDisplayed(): Boolean
    
    /** Returns boolean that indicates if the progress percentages text exists */
    def isPercentagesProgressDisplayed(): Boolean
    
    /** Returns boolean that indicates if the success icon exists */
    def isSuccessIconDisplayed(): Boolean
  }
  object CircularProgressBarDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getLabelTextContent: CallbackTo[String],
      getValue: CallbackTo[String],
      hasError: CallbackTo[Boolean],
      isCompleted: CallbackTo[Boolean],
      isErrorIconDisplayed: CallbackTo[Boolean],
      isLabelDisplayed: CallbackTo[Boolean],
      isPercentagesProgressDisplayed: CallbackTo[Boolean],
      isSuccessIconDisplayed: CallbackTo[Boolean]
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getLabelTextContent = getLabelTextContent.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    extension [Self <: CircularProgressBarDriver](x: Self) {
      
      inline def setGetLabelTextContent(value: CallbackTo[String]): Self = StObject.set(x, "getLabelTextContent", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsCompleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCompleted", value.toJsFn)
      
      inline def setIsErrorIconDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
      
      inline def setIsLabelDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLabelDisplayed", value.toJsFn)
      
      inline def setIsPercentagesProgressDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
      
      inline def setIsSuccessIconDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
    }
  }
}
