package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOpenPickerActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var fileOpenPickerUI: FileOpenPickerUI
}
object IFileOpenPickerActivatedEventArgs {
  
  inline def apply(
    fileOpenPickerUI: FileOpenPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IFileOpenPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(fileOpenPickerUI = fileOpenPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerActivatedEventArgs]
  }
  
  extension [Self <: IFileOpenPickerActivatedEventArgs](x: Self) {
    
    inline def setFileOpenPickerUI(value: FileOpenPickerUI): Self = StObject.set(x, "fileOpenPickerUI", value.asInstanceOf[js.Any])
  }
}
