package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
trait WebUIFileOpenPickerActivatedEventArgs extends StObject {
  
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: String
  
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  var fileOpenPickerUI: FileOpenPickerUI
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object WebUIFileOpenPickerActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    callerPackageFamilyName: String,
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], fileOpenPickerUI = fileOpenPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIFileOpenPickerActivatedEventArgs]
  }
  
  extension [Self <: WebUIFileOpenPickerActivatedEventArgs](x: Self) {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    inline def setCallerPackageFamilyName(value: String): Self = StObject.set(x, "callerPackageFamilyName", value.asInstanceOf[js.Any])
    
    inline def setFileOpenPickerUI(value: FileOpenPickerUI): Self = StObject.set(x, "fileOpenPickerUI", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
