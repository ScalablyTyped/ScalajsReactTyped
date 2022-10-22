package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInputStream
  extends StObject
     with IInputStream {
  
  def dispose(): Unit
}
object FileInputStream {
  
  inline def apply(
    close: Callback,
    dispose: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): FileInputStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, dispose = dispose.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[FileInputStream]
  }
  
  extension [Self <: FileInputStream](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
