package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileSavePickerActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var fileSavePickerUI: FileSavePickerUI
}
object IFileSavePickerActivatedEventArgs {
  
  inline def apply(
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileSavePickerUI = fileSavePickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileSavePickerActivatedEventArgs]
  }
  
  extension [Self <: IFileSavePickerActivatedEventArgs](x: Self) {
    
    inline def setFileSavePickerUI(value: FileSavePickerUI): Self = StObject.set(x, "fileSavePickerUI", value.asInstanceOf[js.Any])
  }
}
