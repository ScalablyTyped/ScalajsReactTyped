package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxRatingControl control.
  */
trait ASPxClientRatingControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns a value indicating whether the control's status is read-only.
    */
  def GetReadOnly(): Boolean
  
  /**
    * Gets the item tooltip title specified by the item index. A string that is the specified item tooltip title.
    * @param index An integer value specifying the item index.
    */
  def GetTitle(index: Double): String
  
  /**
    * Returns the value of the ASPxRatingControl.
    */
  def GetValue(): Double
  
  /**
    * Fires on the server after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]]
  
  /**
    * Occurs on the client side when the mouse cursor moves outside a rating control item.
    */
  var ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]
  
  /**
    * Occurs on the client side when the mouse cursor is moved into a rating control item.
    */
  var ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]
  
  /**
    * Specifies whether the control's status is read-only.
    * @param value true to make the control read-only; otherwise, false.
    */
  def SetReadOnly(value: Boolean): Unit
  
  /**
    * Modifies the value of the ASPxRatingControl on the client side.
    * @param value A decimal value representing the value of the control.
    */
  def SetValue(value: Double): Unit
}
object ASPxClientRatingControl {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetReadOnly: CallbackTo[Boolean],
    GetTitle: Double => String,
    GetValue: CallbackTo[Double],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]],
    ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetReadOnly: Boolean => Callback,
    SetValue: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientRatingControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetReadOnly = GetReadOnly.toJsFn, GetTitle = js.Any.fromFunction1(GetTitle), GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetReadOnly = js.Any.fromFunction1((t0: Boolean) => SetReadOnly(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Double) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControl]
  }
  
  extension [Self <: ASPxClientRatingControl](x: Self) {
    
    inline def setGetReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetReadOnly", value.toJsFn)
    
    inline def setGetTitle(value: Double => String): Self = StObject.set(x, "GetTitle", js.Any.fromFunction1(value))
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "GetValue", value.toJsFn)
    
    inline def setItemClick(value: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemClick", value.asInstanceOf[js.Any])
    
    inline def setItemMouseOut(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemMouseOut", value.asInstanceOf[js.Any])
    
    inline def setItemMouseOver(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemMouseOver", value.asInstanceOf[js.Any])
    
    inline def setSetReadOnly(value: Boolean => Callback): Self = StObject.set(x, "SetReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
