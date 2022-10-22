package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the arguments involved in activated a web account provider. */
trait WebUIWebAccountProviderActivatedEventArgs extends StObject {
  
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets the kind of activation. */
  var kind: ActivationKind
  
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation
  
  /** Gets the previous execution state of the app. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen. */
  var splashScreen: SplashScreen
}
object WebUIWebAccountProviderActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    operation: IWebAccountProviderOperation,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIWebAccountProviderActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIWebAccountProviderActivatedEventArgs]
  }
  
  extension [Self <: WebUIWebAccountProviderActivatedEventArgs](x: Self) {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: IWebAccountProviderOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
