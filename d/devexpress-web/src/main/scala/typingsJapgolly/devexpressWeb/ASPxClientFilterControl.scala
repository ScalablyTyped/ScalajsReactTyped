package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client ASPxFilterControl.
  */
trait ASPxClientFilterControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]
  
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]
  
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): String
  
  /**
    * Returns the editor used to edit the specified values. The editor.
    * @param index The index of the filter condition.
    * @param valueIndex The index of the value in the specified filter condition.
    */
  def GetEditor(index: Double, valueIndex: Double): ASPxClientEditBase
  
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): String
  
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): Boolean
  
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): Unit
}
object ASPxClientFilterControl {
  
  inline def apply(
    AdjustControl: Callback,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    GetAppliedFilterExpression: CallbackTo[String],
    GetClientVisible: CallbackTo[Boolean],
    GetEditor: (Double, Double) => ASPxClientEditBase,
    GetFilterExpression: CallbackTo[String],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsFilterExpressionValid: CallbackTo[Boolean],
    Reset: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Applied = Applied.asInstanceOf[js.Any], Apply = Apply.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetAppliedFilterExpression = GetAppliedFilterExpression.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEditor = js.Any.fromFunction2(GetEditor), GetFilterExpression = GetFilterExpression.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = IsFilterExpressionValid.toJsFn, Reset = Reset.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterControl]
  }
  
  extension [Self <: ASPxClientFilterControl](x: Self) {
    
    inline def setApplied(value: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "Applied", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetAppliedFilterExpression(value: CallbackTo[String]): Self = StObject.set(x, "GetAppliedFilterExpression", value.toJsFn)
    
    inline def setGetEditor(value: (Double, Double) => ASPxClientEditBase): Self = StObject.set(x, "GetEditor", js.Any.fromFunction2(value))
    
    inline def setGetFilterExpression(value: CallbackTo[String]): Self = StObject.set(x, "GetFilterExpression", value.toJsFn)
    
    inline def setIsFilterExpressionValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsFilterExpressionValid", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
  }
}
