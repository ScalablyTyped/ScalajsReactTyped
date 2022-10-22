package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageStreamTransaction
  extends StObject
     with IStorageStreamTransaction {
  
  def dispose(): Unit
}
object StorageStreamTransaction {
  
  inline def apply(
    close: Callback,
    commitAsync: CallbackTo[IAsyncAction],
    dispose: Callback,
    stream: IRandomAccessStream
  ): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, commitAsync = commitAsync.toJsFn, dispose = dispose.toJsFn, stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  
  extension [Self <: StorageStreamTransaction](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
