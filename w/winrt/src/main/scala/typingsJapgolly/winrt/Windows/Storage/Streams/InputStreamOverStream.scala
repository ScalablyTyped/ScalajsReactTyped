package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputStreamOverStream
  extends StObject
     with IInputStream {
  
  def dispose(): Unit
}
object InputStreamOverStream {
  
  inline def apply(
    close: Callback,
    dispose: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): InputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, dispose = dispose.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[InputStreamOverStream]
  }
  
  extension [Self <: InputStreamOverStream](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
