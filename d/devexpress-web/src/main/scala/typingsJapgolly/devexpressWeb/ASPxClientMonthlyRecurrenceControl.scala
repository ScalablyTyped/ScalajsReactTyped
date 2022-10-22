package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the MonthlyRecurrenceControl.
  */
trait ASPxClientMonthlyRecurrenceControl
  extends StObject
     with ASPxClientRecurrenceControlBase
object ASPxClientMonthlyRecurrenceControl {
  
  inline def apply(
    AdjustControl: Callback,
    CreateValueAccessor: CallbackTo[DefaultRecurrenceRuleValuesAccessor],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
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
    Update: ASPxClientRecurrenceInfo => Callback,
    name: String
  ): ASPxClientMonthlyRecurrenceControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, CreateValueAccessor = CreateValueAccessor.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), Update = js.Any.fromFunction1((t0: ASPxClientRecurrenceInfo) => Update(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMonthlyRecurrenceControl]
  }
}
