package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamedFileDataRequest extends StObject {
  
  def failAndClose(failureMode: StreamedFileFailureMode): Unit
}
object IStreamedFileDataRequest {
  
  inline def apply(failAndClose: StreamedFileFailureMode => Callback): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = js.Any.fromFunction1((t0: StreamedFileFailureMode) => failAndClose(t0).runNow()))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
  
  extension [Self <: IStreamedFileDataRequest](x: Self) {
    
    inline def setFailAndClose(value: StreamedFileFailureMode => Callback): Self = StObject.set(x, "failAndClose", js.Any.fromFunction1((t0: StreamedFileFailureMode) => value(t0).runNow()))
  }
}
