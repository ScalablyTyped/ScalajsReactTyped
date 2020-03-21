package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictResult")
@js.native
abstract class AppointmentConflictResult () extends js.Object {
  /** Gets the date of the appointment conflict. */
  var date: js.Date = js.native
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType = js.native
}

