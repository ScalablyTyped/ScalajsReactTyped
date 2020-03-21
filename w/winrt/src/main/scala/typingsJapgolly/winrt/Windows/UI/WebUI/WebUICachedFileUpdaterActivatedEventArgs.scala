package typingsJapgolly.winrt.Windows.UI.WebUI

import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ICachedFileUpdaterActivatedEventArgs
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUICachedFileUpdaterActivatedEventArgs")
@js.native
class WebUICachedFileUpdaterActivatedEventArgs ()
  extends ICachedFileUpdaterActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

