package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentStoreChangeType extends StObject
/** Specifies the type of change represented by an AppointmentStoreChange object. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangeType")
@js.native
object AppointmentStoreChangeType extends StObject {
  
  /** An appointment was created. */
  @js.native
  sealed trait appointmentCreated
    extends StObject
       with AppointmentStoreChangeType
  
  /** An appointment was deleted. */
  @js.native
  sealed trait appointmentDeleted
    extends StObject
       with AppointmentStoreChangeType
  
  /** An appointment was modified. */
  @js.native
  sealed trait appointmentModified
    extends StObject
       with AppointmentStoreChangeType
  
  /** A calendar was created. */
  @js.native
  sealed trait calendarCreated
    extends StObject
       with AppointmentStoreChangeType
  
  /** A calendar was deleted. */
  @js.native
  sealed trait calendarDeleted
    extends StObject
       with AppointmentStoreChangeType
  
  /** A calendar was modified. */
  @js.native
  sealed trait calendarModified
    extends StObject
       with AppointmentStoreChangeType
  
  /** The change tracking information associated with the appointment was lost. */
  @js.native
  sealed trait changeTrackingLost
    extends StObject
       with AppointmentStoreChangeType
}
