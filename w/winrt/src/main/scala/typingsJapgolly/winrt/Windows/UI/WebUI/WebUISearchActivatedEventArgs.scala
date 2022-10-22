package typingsJapgolly.winrt.Windows.UI.WebUI

import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ISearchActivatedEventArgs
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUISearchActivatedEventArgs
  extends StObject
     with ISearchActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUISearchActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    language: String,
    previousExecutionState: ApplicationExecutionState,
    queryText: String,
    splashScreen: SplashScreen
  ): WebUISearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUISearchActivatedEventArgs]
  }
}
