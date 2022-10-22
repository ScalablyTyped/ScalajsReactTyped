package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@JSGlobal("ASPxClientAppointmentToolTipShowingEventArgs")
@js.native
open class ASPxClientAppointmentToolTipShowingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientAppointmentToolTipShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentToolTipShowingEventArgs class.
    * @param appointment An ASPxClientAppointment object representing the appointment.
    */
  def this(appointment: typingsJapgolly.devexpressWeb.ASPxClientAppointment) = this()
  
  /**
    * Gets the appointment.
    */
  /* CompleteClass */
  var appointment: typingsJapgolly.devexpressWeb.ASPxClientAppointment = js.native
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
}
