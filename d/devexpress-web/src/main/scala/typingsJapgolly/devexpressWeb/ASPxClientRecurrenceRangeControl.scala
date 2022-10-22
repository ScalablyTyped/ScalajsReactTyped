package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the RecurrenceRangeControl.
  */
trait ASPxClientRecurrenceRangeControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Gets the recurrence end date.
    */
  def GetEndDate(): js.Date
  
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double
  
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange
  
  /**
    * Sets the recurrence end date.
    * @param date A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEndDate(date: js.Date): Unit
  
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit
  
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit
}
object ASPxClientRecurrenceRangeControl {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetEndDate: CallbackTo[js.Date],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetOccurrenceCount: CallbackTo[Double],
    GetParentControl: CallbackTo[Any],
    GetRange: CallbackTo[ASPxClientRecurrenceRange],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetEndDate: js.Date => Callback,
    SetHeight: Double => Callback,
    SetOccurrenceCount: Double => Callback,
    SetRange: ASPxClientRecurrenceRange => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientRecurrenceRangeControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetEndDate = GetEndDate.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetOccurrenceCount = GetOccurrenceCount.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRange = GetRange.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetEndDate = js.Any.fromFunction1((t0: js.Date) => SetEndDate(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOccurrenceCount = js.Any.fromFunction1((t0: Double) => SetOccurrenceCount(t0).runNow()), SetRange = js.Any.fromFunction1((t0: ASPxClientRecurrenceRange) => SetRange(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceRangeControl]
  }
  
  extension [Self <: ASPxClientRecurrenceRangeControl](x: Self) {
    
    inline def setGetEndDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetEndDate", value.toJsFn)
    
    inline def setGetOccurrenceCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetOccurrenceCount", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[ASPxClientRecurrenceRange]): Self = StObject.set(x, "GetRange", value.toJsFn)
    
    inline def setSetEndDate(value: js.Date => Callback): Self = StObject.set(x, "SetEndDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetOccurrenceCount(value: Double => Callback): Self = StObject.set(x, "SetOccurrenceCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRange(value: ASPxClientRecurrenceRange => Callback): Self = StObject.set(x, "SetRange", js.Any.fromFunction1((t0: ASPxClientRecurrenceRange) => value(t0).runNow()))
  }
}
