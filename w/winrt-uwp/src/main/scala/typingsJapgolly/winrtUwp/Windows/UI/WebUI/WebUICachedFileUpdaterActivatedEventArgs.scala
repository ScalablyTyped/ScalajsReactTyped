package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user saves or opens a file that needs updates from the app. */
@JSGlobal("Windows.UI.WebUI.WebUICachedFileUpdaterActivatedEventArgs")
@js.native
abstract class WebUICachedFileUpdaterActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the letterbox UI of the file picker that is displayed when a file needs updates from the app. */
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

