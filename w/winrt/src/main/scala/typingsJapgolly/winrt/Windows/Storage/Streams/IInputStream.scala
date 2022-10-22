package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputStream
  extends StObject
     with IClosable {
  
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double]
}
object IInputStream {
  
  inline def apply(
    close: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  
  extension [Self <: IInputStream](x: Self) {
    
    inline def setReadAsync(value: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
  }
}
