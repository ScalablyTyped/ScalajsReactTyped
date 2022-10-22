package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Reminder class.
  */
trait ASPxClientReminder extends StObject {
  
  /**
    * Switches the reminder off for the associated appointment.
    */
  def Dismiss(): Unit
  
  /**
    * Returns the date and time when the reminder is alerted.
    */
  def GetAlertTime(): js.Date
  
  /**
    * Gets the custom field bound to the reminder. An object representing the custom field.
    * @param key A string object representing the custom field's ID.
    */
  def GetCustomField(key: String): Any
  
  /**
    * Gets the reminder's ID.
    */
  def GetId(): String
  
  /**
    * Gets the time interval before the appointment's start time.
    */
  def GetTimeBeforeStart(): js.Date
  
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  def Snooze(remindAfter: Double): Unit
}
object ASPxClientReminder {
  
  inline def apply(
    Dismiss: Callback,
    GetAlertTime: CallbackTo[js.Date],
    GetCustomField: String => Any,
    GetId: CallbackTo[String],
    GetTimeBeforeStart: CallbackTo[js.Date],
    Snooze: Double => Callback
  ): ASPxClientReminder = {
    val __obj = js.Dynamic.literal(Dismiss = Dismiss.toJsFn, GetAlertTime = GetAlertTime.toJsFn, GetCustomField = js.Any.fromFunction1(GetCustomField), GetId = GetId.toJsFn, GetTimeBeforeStart = GetTimeBeforeStart.toJsFn, Snooze = js.Any.fromFunction1((t0: Double) => Snooze(t0).runNow()))
    __obj.asInstanceOf[ASPxClientReminder]
  }
  
  extension [Self <: ASPxClientReminder](x: Self) {
    
    inline def setDismiss(value: Callback): Self = StObject.set(x, "Dismiss", value.toJsFn)
    
    inline def setGetAlertTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetAlertTime", value.toJsFn)
    
    inline def setGetCustomField(value: String => Any): Self = StObject.set(x, "GetCustomField", js.Any.fromFunction1(value))
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "GetId", value.toJsFn)
    
    inline def setGetTimeBeforeStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetTimeBeforeStart", value.toJsFn)
    
    inline def setSnooze(value: Double => Callback): Self = StObject.set(x, "Snooze", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
