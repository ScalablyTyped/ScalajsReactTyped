package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangedDeferral")
@js.native
abstract class AppointmentStoreChangedDeferral () extends js.Object {
  /** Informs the system that an asynchronous operation associated with an AppointmentStore has finished. */
  def complete(): Unit = js.native
}

