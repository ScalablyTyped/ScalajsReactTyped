package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOutputStream
  extends StObject
     with IOutputStream {
  
  def dispose(): Unit
}
object FileOutputStream {
  
  inline def apply(
    close: Callback,
    dispose: Callback,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): FileOutputStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, dispose = dispose.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[FileOutputStream]
  }
  
  extension [Self <: FileOutputStream](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
