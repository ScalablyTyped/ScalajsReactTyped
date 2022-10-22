package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app that was launched as the result of a wallet action. */
trait WalletActionActivatedEventArgs extends StObject {
  
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  var actionId: String
  
  /** Gets the action that was performed on the WalletItem . */
  var actionKind: WalletActionKind
  
  /** Gets the ID of the WalletItem on which the user performed the action. */
  var itemId: String
  
  /** Gets the type of action that was performed on the WalletItem . */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object WalletActionActivatedEventArgs {
  
  inline def apply(
    actionId: String,
    actionKind: WalletActionKind,
    itemId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WalletActionActivatedEventArgs = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], actionKind = actionKind.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletActionActivatedEventArgs]
  }
  
  extension [Self <: WalletActionActivatedEventArgs](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionKind(value: WalletActionKind): Self = StObject.set(x, "actionKind", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
