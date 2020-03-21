package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
@JSGlobal("Windows.UI.WebUI.WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs")
@js.native
abstract class WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the duration of the time frame to be shown. */
  var duration: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the starting date and time of the time frame to be shown. */
  var timeToShow: js.Date = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

