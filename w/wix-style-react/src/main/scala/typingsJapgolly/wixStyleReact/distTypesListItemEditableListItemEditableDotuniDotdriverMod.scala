package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemEditableListItemEditableDotuniDotdriverMod {
  
  trait ListItemEditableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def enterText(text: String): js.Promise[Unit]
    
    def getApproveButtonTooltipText(): js.Promise[String]
    
    def getCancelButtonTooltipText(): js.Promise[String]
    
    def getPlaceholder(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isApproveButtonDisabled(): js.Promise[Boolean]
  }
  object ListItemEditableUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickApprove: CallbackTo[js.Promise[Unit]],
      clickCancel: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getApproveButtonTooltipText: CallbackTo[js.Promise[String]],
      getCancelButtonTooltipText: CallbackTo[js.Promise[String]],
      getPlaceholder: CallbackTo[js.Promise[String]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isApproveButtonDisabled: CallbackTo[js.Promise[Boolean]]
    ): ListItemEditableUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickApprove = clickApprove.toJsFn, clickCancel = clickCancel.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getApproveButtonTooltipText = getApproveButtonTooltipText.toJsFn, getCancelButtonTooltipText = getCancelButtonTooltipText.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getStatusMessage = getStatusMessage.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), isApproveButtonDisabled = isApproveButtonDisabled.toJsFn)
      __obj.asInstanceOf[ListItemEditableUniDriver]
    }
    
    extension [Self <: ListItemEditableUniDriver](x: Self) {
      
      inline def setClickApprove(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickApprove", value.toJsFn)
      
      inline def setClickCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCancel", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetApproveButtonTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getApproveButtonTooltipText", value.toJsFn)
      
      inline def setGetCancelButtonTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCancelButtonTooltipText", value.toJsFn)
      
      inline def setGetPlaceholder(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsApproveButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isApproveButtonDisabled", value.toJsFn)
    }
  }
}
