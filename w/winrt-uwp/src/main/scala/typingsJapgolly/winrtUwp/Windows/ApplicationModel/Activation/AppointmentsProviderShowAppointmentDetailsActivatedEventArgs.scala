package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show the details of an appointment. */
@JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderShowAppointmentDetailsActivatedEventArgs")
@js.native
abstract class AppointmentsProviderShowAppointmentDetailsActivatedEventArgs () extends js.Object {
  /** Gets the start date of the appointment instance for which the app should display details. */
  var instanceStartDate: js.Date = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the local identifier of the appointment for which the app should display details. */
  var localId: String = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  var roamingId: String = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

