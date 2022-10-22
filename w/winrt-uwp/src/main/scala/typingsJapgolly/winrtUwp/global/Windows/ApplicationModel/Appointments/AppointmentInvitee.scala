package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a participant of an appointment in a calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentInvitee")
@js.native
/** Initializes a new instance of the AppointmentInvitee class. */
open class AppointmentInvitee ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentInvitee {
  
  /** Gets or sets a string that communicates the address of a participant of an appointment. The address is inherited from IAppointmentParticipant and is a Simple Mail Transfer Protocol (SMTP) e-mail address. It is also of type String and between 1 and 321 characters in length (non-empty). */
  /* CompleteClass */
  var address: String = js.native
  
  /** Gets or sets a string that communicates the display name of a participant of an appointment. The display name is inherited from IAppointmentParticipant , of type String , and a maximum of 256 characters in length. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /** Gets or sets a AppointmentParticipantResponse -typed value that indicates the response from a participant concerning an appointment invitation. */
  /* CompleteClass */
  var response: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantResponse = js.native
  
  /** Gets or sets a AppointmentParticipantRole -typed value that indicates the role of a participant concerning an appointment invitation. */
  /* CompleteClass */
  var role: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentParticipantRole = js.native
}
