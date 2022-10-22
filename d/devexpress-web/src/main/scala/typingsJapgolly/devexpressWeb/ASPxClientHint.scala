package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
trait ASPxClientHint
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when a hint is about to be hidden.
    */
  var Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler]
  
  /**
    * Occurs on the client side when a hint is about to be shown.
    */
  var Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler]
}
object ASPxClientHint {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler],
    name: String
  ): ASPxClientHint = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, Hiding = Hiding.asInstanceOf[js.Any], InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Showing = Showing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHint]
  }
  
  extension [Self <: ASPxClientHint](x: Self) {
    
    inline def setHiding(value: ASPxClientEvent[ASPxClientHintHidingEventHandler]): Self = StObject.set(x, "Hiding", value.asInstanceOf[js.Any])
    
    inline def setShowing(value: ASPxClientEvent[ASPxClientHintShowingEventHandler]): Self = StObject.set(x, "Showing", value.asInstanceOf[js.Any])
  }
}
