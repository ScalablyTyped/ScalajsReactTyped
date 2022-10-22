package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarCircularProgressBarCoreCircularProgressBarCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/CircularProgressBar/CircularProgressBarCore/CircularProgressBarCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularProgressBarCoreUniDriverFactory(base: UniDriver[Any]): CircularProgressBarCoreUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("circularProgressBarCoreUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CircularProgressBarCoreUniDriver]
  
  trait CircularProgressBarCoreUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAttribute(name: String): js.Promise[String | Null]
    
    /** Get the text content displayed */
    def getLabelTextContent(): js.Promise[String]
    
    /** Get the progress percentages value */
    def getValue(): js.Promise[String | Null]
    
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
  object CircularProgressBarCoreUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAttribute: String => js.Promise[String | Null],
      getLabelTextContent: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String | Null]],
      hasError: CallbackTo[js.Promise[Boolean]],
      isCompleted: CallbackTo[js.Promise[Boolean]],
      isErrorIconDisplayed: CallbackTo[js.Promise[Boolean]],
      isLabelDisplayed: CallbackTo[js.Promise[Boolean]],
      isPercentagesProgressDisplayed: CallbackTo[js.Promise[Boolean]],
      isSuccessIconDisplayed: CallbackTo[js.Promise[Boolean]]
    ): CircularProgressBarCoreUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getLabelTextContent = getLabelTextContent.toJsFn, getValue = getValue.toJsFn, hasError = hasError.toJsFn, isCompleted = isCompleted.toJsFn, isErrorIconDisplayed = isErrorIconDisplayed.toJsFn, isLabelDisplayed = isLabelDisplayed.toJsFn, isPercentagesProgressDisplayed = isPercentagesProgressDisplayed.toJsFn, isSuccessIconDisplayed = isSuccessIconDisplayed.toJsFn)
      __obj.asInstanceOf[CircularProgressBarCoreUniDriver]
    }
    
    extension [Self <: CircularProgressBarCoreUniDriver](x: Self) {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetLabelTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelTextContent", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setIsCompleted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCompleted", value.toJsFn)
      
      inline def setIsErrorIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isErrorIconDisplayed", value.toJsFn)
      
      inline def setIsLabelDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLabelDisplayed", value.toJsFn)
      
      inline def setIsPercentagesProgressDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPercentagesProgressDisplayed", value.toJsFn)
      
      inline def setIsSuccessIconDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuccessIconDisplayed", value.toJsFn)
    }
  }
}
