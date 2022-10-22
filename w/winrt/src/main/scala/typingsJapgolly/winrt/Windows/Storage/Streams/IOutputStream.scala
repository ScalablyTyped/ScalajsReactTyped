package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOutputStream
  extends StObject
     with IClosable {
  
  def flushAsync(): IAsyncOperation[Boolean]
  
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double]
}
object IOutputStream {
  
  inline def apply(
    close: Callback,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IOutputStream]
  }
  
  extension [Self <: IOutputStream](x: Self) {
    
    inline def setFlushAsync(value: CallbackTo[IAsyncOperation[Boolean]]): Self = StObject.set(x, "flushAsync", value.toJsFn)
    
    inline def setWriteAsync(value: IBuffer => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
