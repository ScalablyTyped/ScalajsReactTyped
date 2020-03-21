package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.System.ProtocolForResultsOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the activation arguments when an app is launched via LaunchUriForResultsAsync . */
@JSGlobal("Windows.UI.WebUI.WebUIProtocolForResultsActivatedEventArgs")
@js.native
abstract class WebUIProtocolForResultsActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the data associated with the activation. */
  var data: ValueSet = js.native
  /** Gets the kind of activation. */
  var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets info about the protocol for results operation that triggered the activation. */
  var protocolForResultsOperation: ProtocolForResultsOperation = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: Uri = js.native
}

