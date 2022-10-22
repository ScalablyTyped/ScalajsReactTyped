package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxFormLayout object.
  */
trait ASPxClientFormLayout
  extends StObject
     with ASPxClientControl {
  
  /**
    * Allows you not to render the control to perform required operations on the client side until you call the EndUpdate method.
    */
  def BeginUpdate(): Unit
  
  /**
    * Allows the control to be re-rendered after you call the BeginUpdate method and perform the required operations on the client side. This method also forces an immediate control's re-rendering.
    */
  def EndUpdate(): Unit
  
  /**
    * Returns an item specified by its name. An ASPxClientLayoutItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem
}
object ASPxClientFormLayout {
  
  inline def apply(
    AdjustControl: Callback,
    BeginUpdate: Callback,
    EndUpdate: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetItemByName: String => ASPxClientLayoutItem,
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientFormLayout = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BeginUpdate = BeginUpdate.toJsFn, EndUpdate = EndUpdate.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFormLayout]
  }
  
  extension [Self <: ASPxClientFormLayout](x: Self) {
    
    inline def setBeginUpdate(value: Callback): Self = StObject.set(x, "BeginUpdate", value.toJsFn)
    
    inline def setEndUpdate(value: Callback): Self = StObject.set(x, "EndUpdate", value.toJsFn)
    
    inline def setGetItemByName(value: String => ASPxClientLayoutItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
  }
}
