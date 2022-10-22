package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
trait ASPxClientHiddenField
  extends StObject
     with ASPxClientControl {
  
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  def Add(propertyName: String, propertyValue: Any): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]
  
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  def Clear(): Unit
  
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection. true if this value is contained within the collection; otherwise, false.
    * @param propertyName A string value that specifies the property name.
    */
  def Contains(propertyName: String): Boolean
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]
  
  /**
    * Returns the value with the specified property name. An object that represents the value of the specified property.
    * @param propertyName A string value that specifies the property name.
    */
  def Get(propertyName: String): Any
  
  /**
    * Sends a callback to the server and generates the server-side ASPxHiddenField.CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxHiddenField.CustomCallback event.
    */
  def PerformCallback(parameter: String): Unit
  
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  def Remove(propertyName: String): Unit
  
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  def Set(propertyName: String, propertyValue: Any): Unit
}
object ASPxClientHiddenField {
  
  inline def apply(
    Add: (String, Any) => Callback,
    AdjustControl: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]],
    Clear: Callback,
    Contains: String => Boolean,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]],
    Get: String => Any,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PerformCallback: String => Callback,
    Remove: String => Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    Set: (String, Any) => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientHiddenField = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: String, t1: Any) => (Add(t0, t1)).runNow()), AdjustControl = AdjustControl.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], Clear = Clear.toJsFn, Contains = js.Any.fromFunction1(Contains), EndCallback = EndCallback.asInstanceOf[js.Any], Get = js.Any.fromFunction1(Get), GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], PerformCallback = js.Any.fromFunction1((t0: String) => PerformCallback(t0).runNow()), Remove = js.Any.fromFunction1((t0: String) => Remove(t0).runNow()), SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), Set = js.Any.fromFunction2((t0: String, t1: Any) => (Set(t0, t1)).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHiddenField]
  }
  
  extension [Self <: ASPxClientHiddenField](x: Self) {
    
    inline def setAdd(value: (String, Any) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setContains(value: String => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    inline def setPerformCallback(value: String => Callback): Self = StObject.set(x, "PerformCallback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
