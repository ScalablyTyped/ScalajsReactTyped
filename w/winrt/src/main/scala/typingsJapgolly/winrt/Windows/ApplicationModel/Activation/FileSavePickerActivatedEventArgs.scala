package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSavePickerActivatedEventArgs
  extends StObject
     with IFileSavePickerActivatedEventArgs
object FileSavePickerActivatedEventArgs {
  
  inline def apply(
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): FileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileSavePickerUI = fileSavePickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePickerActivatedEventArgs]
  }
}
