package typingsJapgolly.winrt.Windows.UI.WebUI

import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.IProtocolActivatedEventArgs
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUIProtocolActivatedEventArgs
  extends StObject
     with IProtocolActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIProtocolActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    uri: Uri
  ): WebUIProtocolActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIProtocolActivatedEventArgs]
  }
}
