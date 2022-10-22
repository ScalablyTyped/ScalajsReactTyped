package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFileRequestedEventArgs
  extends StObject
     with ITargetFileRequestedEventArgs
object TargetFileRequestedEventArgs {
  
  inline def apply(request: TargetFileRequest): TargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequestedEventArgs]
  }
}
