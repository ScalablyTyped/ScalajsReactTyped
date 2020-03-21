package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@JSGlobal("Windows.UI.WebUI.WebUILaunchActivatedEventArgs")
@js.native
abstract class WebUILaunchActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** (Applies to Windows only) Gets an indication about whether a pre-launch has been activated. */
  var prelaunchActivated: Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the ID of the source that was invoked to launch the application. */
  var tileId: String = js.native
}

