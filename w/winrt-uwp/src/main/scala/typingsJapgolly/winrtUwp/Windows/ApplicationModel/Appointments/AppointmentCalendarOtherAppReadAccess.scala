package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentCalendarOtherAppReadAccess extends StObject
/** Specifies the level of read access provided to an app calendar. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarOtherAppReadAccess")
@js.native
object AppointmentCalendarOtherAppReadAccess extends StObject {
  
  /** Other apps on the device can read all properties of appointments in the calendar. */
  @js.native
  sealed trait full
    extends StObject
       with AppointmentCalendarOtherAppReadAccess
  
  /** Other apps on the device can read the Subject , StartTime , Duration , AllDay , LocalId properties of appointments in the calendar and the LocalId property of the calendar */
  @js.native
  sealed trait limited
    extends StObject
       with AppointmentCalendarOtherAppReadAccess
  
  /** Only the operating system can read data from the app calendar. */
  @js.native
  sealed trait systemOnly
    extends StObject
       with AppointmentCalendarOtherAppReadAccess
}
