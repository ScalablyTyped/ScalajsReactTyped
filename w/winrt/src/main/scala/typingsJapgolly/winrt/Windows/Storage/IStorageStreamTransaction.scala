package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageStreamTransaction
  extends StObject
     with IClosable {
  
  def commitAsync(): IAsyncAction
  
  var stream: IRandomAccessStream
}
object IStorageStreamTransaction {
  
  inline def apply(close: Callback, commitAsync: CallbackTo[IAsyncAction], stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, commitAsync = commitAsync.toJsFn, stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
  
  extension [Self <: IStorageStreamTransaction](x: Self) {
    
    inline def setCommitAsync(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "commitAsync", value.toJsFn)
    
    inline def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
