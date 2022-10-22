package typingsJapgolly.winrtUwp.global.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information to an app that was launched as the result of a wallet action. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIWalletActionActivatedEventArgs")
@js.native
open class WebUIWalletActionActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUIWalletActionActivatedEventArgs {
  
  /** Gets the ID of the action, such as the id of the verb, transaction and so on. */
  /* CompleteClass */
  var actionId: String = js.native
  
  /** Gets the action that was performed on the WalletItem. */
  /* CompleteClass */
  var actionKind: WalletActionKind = js.native
  
  /** Gets the app activation operation. */
  /* CompleteClass */
  var activatedOperation: typingsJapgolly.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the ID of the WalletItem on which the user performed the action. */
  /* CompleteClass */
  var itemId: String = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
}
