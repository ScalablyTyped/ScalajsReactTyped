package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the way in which an appointment conflicts with another appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictType")
@js.native
object AppointmentConflictType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType & Double
  ] = js.native
  
  /* 1 */ val adjacent: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType.adjacent & Double = js.native
  
  /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType.none & Double = js.native
  
  /* 2 */ val overlap: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType.overlap & Double = js.native
}
