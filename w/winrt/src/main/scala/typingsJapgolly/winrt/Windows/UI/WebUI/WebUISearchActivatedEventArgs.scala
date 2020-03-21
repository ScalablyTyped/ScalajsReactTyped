package typingsJapgolly.winrt.Windows.UI.WebUI

import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ISearchActivatedEventArgs
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUISearchActivatedEventArgs")
@js.native
class WebUISearchActivatedEventArgs ()
  extends ISearchActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var queryText: String = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

