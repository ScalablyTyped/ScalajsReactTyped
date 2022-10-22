package typingsJapgolly.bootbox

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Text
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for alert modals */
trait BootboxAlertOptions
  extends StObject
     with BootboxDialogOptions[Unit] {
  
  @JSName("buttons")
  var buttons_BootboxAlertOptions: js.UndefOr[BootboxAlertButtonMap] = js.undefined
  
  @JSName("callback")
  var callback_BootboxAlertOptions: js.UndefOr[js.Function0[Any]] = js.undefined
}
object BootboxAlertOptions {
  
  inline def apply(
    message: JQuery[HTMLElement] | js.Array[Any] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxAlertOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertOptions]
  }
  
  extension [Self <: BootboxAlertOptions](x: Self) {
    
    inline def setButtons(value: BootboxAlertButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCallback(value: CallbackTo[Any]): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
