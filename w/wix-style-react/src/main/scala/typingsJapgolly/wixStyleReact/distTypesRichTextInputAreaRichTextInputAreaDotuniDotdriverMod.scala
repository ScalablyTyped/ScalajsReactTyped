package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaRichTextInputAreaDotuniDotdriverMod {
  
  trait RichTextInputAreaUniDriver
    extends StObject
       with BaseUniDriver {
    
    def enterText(value: String): js.Promise[Unit]
    
    def getContent(): js.Promise[String]
    
    def getPlaceholder(): js.Promise[String | Null]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object RichTextInputAreaUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getContent: CallbackTo[js.Promise[String]],
      getPlaceholder: CallbackTo[js.Promise[String | Null]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): RichTextInputAreaUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getContent = getContent.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getStatusMessage = getStatusMessage.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[RichTextInputAreaUniDriver]
    }
    
    extension [Self <: RichTextInputAreaUniDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetPlaceholder(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
