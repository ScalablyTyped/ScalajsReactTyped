package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxCaptcha control.
  */
trait ASPxClientCaptcha
  extends StObject
     with ASPxClientControl {
  
  /**
    * Sets input focus to the control's text box.
    */
  def Focus(): Unit
  
  /**
    * Refreshes the code displayed within the editor's challenge image.
    */
  def Refresh(): Unit
}
object ASPxClientCaptcha {
  
  inline def apply(
    AdjustControl: Callback,
    Focus: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    Refresh: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientCaptcha = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Focus = Focus.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCaptcha]
  }
  
  extension [Self <: ASPxClientCaptcha](x: Self) {
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "Focus", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
  }
}
