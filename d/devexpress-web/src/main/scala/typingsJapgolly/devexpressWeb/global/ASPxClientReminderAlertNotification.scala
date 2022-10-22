package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information related to the reminder alert.
  */
@JSGlobal("ASPxClientReminderAlertNotification")
@js.native
open class ASPxClientReminderAlertNotification ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientReminderAlertNotification {
  
  /**
    * Gets the appointment associated with the reminder.
    */
  /* CompleteClass */
  override def GetAppointment(): typingsJapgolly.devexpressWeb.ASPxClientAppointment = js.native
  
  /**
    * Gets the triggered reminder.
    */
  /* CompleteClass */
  override def GetReminder(): typingsJapgolly.devexpressWeb.ASPxClientReminder = js.native
  
  /**
    * Gets the triggered reminder's ID.
    */
  /* CompleteClass */
  override def GetReminderId(): String = js.native
  
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  /* CompleteClass */
  var appointment: typingsJapgolly.devexpressWeb.ASPxClientAppointment = js.native
  
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  /* CompleteClass */
  var ignore: Boolean = js.native
  
  /**
    * Returns the triggered reminder.
    */
  /* CompleteClass */
  var reminder: typingsJapgolly.devexpressWeb.ASPxClientReminder = js.native
}
