package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamedFileDataRequest
  extends StObject
     with IOutputStream
     with IStreamedFileDataRequest {
  
  def dispose(): Unit
}
object StreamedFileDataRequest {
  
  inline def apply(
    close: Callback,
    dispose: Callback,
    failAndClose: StreamedFileFailureMode => Callback,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): StreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, dispose = dispose.toJsFn, failAndClose = js.Any.fromFunction1((t0: StreamedFileFailureMode) => failAndClose(t0).runNow()), flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[StreamedFileDataRequest]
  }
  
  extension [Self <: StreamedFileDataRequest](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
