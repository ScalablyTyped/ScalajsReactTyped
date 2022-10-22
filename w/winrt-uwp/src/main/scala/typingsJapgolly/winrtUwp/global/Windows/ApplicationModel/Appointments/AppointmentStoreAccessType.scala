package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the level of access granted to an AppointmentStore . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreAccessType")
@js.native
object AppointmentStoreAccessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType & Double
  ] = js.native
  
  /* 1 */ val allCalendarsReadOnly: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadOnly & Double = js.native
  
  /* 2 */ val allCalendarsReadWrite: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadWrite & Double = js.native
  
  /* 0 */ val appCalendarsReadWrite: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.appCalendarsReadWrite & Double = js.native
}
