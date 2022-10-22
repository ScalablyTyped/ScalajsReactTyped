package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerDialogModel extends StObject {
  
  def getUrl(): String
  
  def onShow(tab: ASPxDesignerNavigateTab): Unit
  
  var popupButtons: js.Array[Any]
  
  def setUrl(url: String): Unit
}
object ASPxDesignerDialogModel {
  
  inline def apply(
    getUrl: CallbackTo[String],
    onShow: ASPxDesignerNavigateTab => Callback,
    popupButtons: js.Array[Any],
    setUrl: String => Callback
  ): ASPxDesignerDialogModel = {
    val __obj = js.Dynamic.literal(getUrl = getUrl.toJsFn, onShow = js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => onShow(t0).runNow()), popupButtons = popupButtons.asInstanceOf[js.Any], setUrl = js.Any.fromFunction1((t0: String) => setUrl(t0).runNow()))
    __obj.asInstanceOf[ASPxDesignerDialogModel]
  }
  
  extension [Self <: ASPxDesignerDialogModel](x: Self) {
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setOnShow(value: ASPxDesignerNavigateTab => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => value(t0).runNow()))
    
    inline def setPopupButtons(value: js.Array[Any]): Self = StObject.set(x, "popupButtons", value.asInstanceOf[js.Any])
    
    inline def setPopupButtonsVarargs(value: Any*): Self = StObject.set(x, "popupButtons", js.Array(value*))
    
    inline def setSetUrl(value: String => Callback): Self = StObject.set(x, "setUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
