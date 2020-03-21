package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.syncstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to sync functionality for an AppointmentCalendar object. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarSyncManager")
@js.native
abstract class AppointmentCalendarSyncManager () extends js.Object {
  /** Gets the last date and time that a sync with the AppointmentCalendar server was attempted. */
  var lastAttemptedSyncTime: js.Date = js.native
  /** Gets the last date and time that a sync with the AppointmentCalendar server was successful. */
  var lastSuccessfulSyncTime: js.Date = js.native
  /** Occurs when the status of an AppointmentCalendar sync operation changes. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: TypedEventHandler[AppointmentCalendarSyncManager, _] = js.native
  /** Gets the current status of the AppointmentCalendarSyncManager . */
  var status: AppointmentCalendarSyncStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[AppointmentCalendarSyncManager, _]): Unit = js.native
  /** Occurs when the status of an AppointmentCalendar sync operation changes. */
  def onsyncstatuschanged(ev: js.Any with WinRTEvent[AppointmentCalendarSyncManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[AppointmentCalendarSyncManager, _]): Unit = js.native
  /**
    * Initiates a sync operation on the AppointmentCalendar .
    * @return A Boolean value indicating if the sync was successfully initiated.
    */
  def syncAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

