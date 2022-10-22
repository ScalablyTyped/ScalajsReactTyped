package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var files: IVectorView[IStorageItem]
  
  var verb: String
}
object IFileActivatedEventArgs {
  
  inline def apply(
    files: IVectorView[IStorageItem],
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): IFileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileActivatedEventArgs]
  }
  
  extension [Self <: IFileActivatedEventArgs](x: Self) {
    
    inline def setFiles(value: IVectorView[IStorageItem]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
