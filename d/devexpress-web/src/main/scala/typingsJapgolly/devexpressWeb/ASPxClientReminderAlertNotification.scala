package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information related to the reminder alert.
  */
trait ASPxClientReminderAlertNotification extends StObject {
  
  /**
    * Gets the appointment associated with the reminder.
    */
  def GetAppointment(): ASPxClientAppointment
  
  /**
    * Gets the triggered reminder.
    */
  def GetReminder(): ASPxClientReminder
  
  /**
    * Gets the triggered reminder's ID.
    */
  def GetReminderId(): String
  
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  var appointment: ASPxClientAppointment
  
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  var handled: Boolean
  
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  var ignore: Boolean
  
  /**
    * Returns the triggered reminder.
    */
  var reminder: ASPxClientReminder
}
object ASPxClientReminderAlertNotification {
  
  inline def apply(
    GetAppointment: CallbackTo[ASPxClientAppointment],
    GetReminder: CallbackTo[ASPxClientReminder],
    GetReminderId: CallbackTo[String],
    appointment: ASPxClientAppointment,
    handled: Boolean,
    ignore: Boolean,
    reminder: ASPxClientReminder
  ): ASPxClientReminderAlertNotification = {
    val __obj = js.Dynamic.literal(GetAppointment = GetAppointment.toJsFn, GetReminder = GetReminder.toJsFn, GetReminderId = GetReminderId.toJsFn, appointment = appointment.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReminderAlertNotification]
  }
  
  extension [Self <: ASPxClientReminderAlertNotification](x: Self) {
    
    inline def setAppointment(value: ASPxClientAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setGetAppointment(value: CallbackTo[ASPxClientAppointment]): Self = StObject.set(x, "GetAppointment", value.toJsFn)
    
    inline def setGetReminder(value: CallbackTo[ASPxClientReminder]): Self = StObject.set(x, "GetReminder", value.toJsFn)
    
    inline def setGetReminderId(value: CallbackTo[String]): Self = StObject.set(x, "GetReminderId", value.toJsFn)
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setReminder(value: ASPxClientReminder): Self = StObject.set(x, "reminder", value.asInstanceOf[js.Any])
  }
}
