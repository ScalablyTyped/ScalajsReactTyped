package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the FilterControl extension.
  */
trait MVCxClientFilterControl
  extends StObject
     with ASPxClientFilterControl {
  
  /**
    * Returns the filter control's state.
    * @param obj An object that receives a filter control's callback parameters.
    */
  def FillStateObject(obj: Any): Unit
}
object MVCxClientFilterControl {
  
  inline def apply(
    AdjustControl: Callback,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    FillStateObject: Any => Callback,
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
  ): MVCxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Applied = Applied.asInstanceOf[js.Any], Apply = Apply.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], FillStateObject = js.Any.fromFunction1((t0: Any) => FillStateObject(t0).runNow()), GetAppliedFilterExpression = GetAppliedFilterExpression.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEditor = js.Any.fromFunction2(GetEditor), GetFilterExpression = GetFilterExpression.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = IsFilterExpressionValid.toJsFn, Reset = Reset.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientFilterControl]
  }
  
  extension [Self <: MVCxClientFilterControl](x: Self) {
    
    inline def setFillStateObject(value: Any => Callback): Self = StObject.set(x, "FillStateObject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
