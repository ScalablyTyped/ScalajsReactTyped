package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVariableInputVariableInputDotuniDotdriverMod {
  
  trait VariableInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Simulate blur event */
    def blur(): js.Promise[Unit]
    
    /** Enter text as value to the component*/
    def enterText(value: String): js.Promise[Unit]
    
    /** Simulate focus event */
    def focus(): js.Promise[Unit]
    
    /** Get the text content of the component*/
    def getContent(): js.Promise[String]
    
    /** Get the error message content */
    def getErrorMessage(): js.Promise[String]
    
    /** Get the text content of the component placeholder*/
    def getPlaceholder(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    /** Get the warning message content */
    def getWarningMessage(): js.Promise[String]
    
    /** Returns true if error indication exists */
    def hasError(): js.Promise[Boolean]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    /** Returns true if warning indication exists */
    def hasWarning(): js.Promise[Boolean]
    
    /** Returns true if component is disabled */
    def isDisabled(): js.Promise[Boolean]
  }
  object VariableInputUniDriver {
    
    inline def apply(
      blur: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      focus: CallbackTo[js.Promise[Unit]],
      getContent: CallbackTo[js.Promise[String]],
      getErrorMessage: CallbackTo[js.Promise[String]],
      getPlaceholder: CallbackTo[js.Promise[String]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      getWarningMessage: CallbackTo[js.Promise[String]],
      hasError: CallbackTo[js.Promise[Boolean]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hasWarning: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): VariableInputUniDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, focus = focus.toJsFn, getContent = getContent.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getWarningMessage = getWarningMessage.toJsFn, hasError = hasError.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), hasWarning = hasWarning.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[VariableInputUniDriver]
    }
    
    extension [Self <: VariableInputUniDriver](x: Self) {
      
      inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetErrorMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
      
      inline def setGetPlaceholder(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetWarningMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWarningMessage", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHasWarning(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasWarning", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
