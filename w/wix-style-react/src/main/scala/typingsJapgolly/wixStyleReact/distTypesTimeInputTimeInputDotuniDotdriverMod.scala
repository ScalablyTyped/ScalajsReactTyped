package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputTimeInputDotuniDotdriverMod {
  
  trait TimeInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def confirmValue(): js.Promise[Unit]
    
    def getLocale(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getTimeStyle(): js.Promise[String]
    
    def getValue(): js.Promise[js.Date]
    
    def hasStatus(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def setValue(value: String): js.Promise[Unit]
  }
  object TimeInputUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      confirmValue: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLocale: CallbackTo[js.Promise[String]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      getTimeStyle: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[js.Date]],
      hasStatus: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      setValue: String => js.Promise[Unit]
    ): TimeInputUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, confirmValue = confirmValue.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLocale = getLocale.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getTimeStyle = getTimeStyle.toJsFn, getValue = getValue.toJsFn, hasStatus = hasStatus.toJsFn, isDisabled = isDisabled.toJsFn, setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[TimeInputUniDriver]
    }
    
    extension [Self <: TimeInputUniDriver](x: Self) {
      
      inline def setConfirmValue(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "confirmValue", value.toJsFn)
      
      inline def setGetLocale(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLocale", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetTimeStyle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTimeStyle", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[js.Date]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasStatus(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasStatus", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setSetValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
}
