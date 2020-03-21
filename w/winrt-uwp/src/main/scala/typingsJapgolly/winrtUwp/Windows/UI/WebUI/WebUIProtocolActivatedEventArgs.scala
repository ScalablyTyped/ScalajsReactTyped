package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a URI scheme name. */
@JSGlobal("Windows.UI.WebUI.WebUIProtocolActivatedEventArgs")
@js.native
abstract class WebUIProtocolActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the data used for activation. */
  var data: ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: Uri = js.native
}

