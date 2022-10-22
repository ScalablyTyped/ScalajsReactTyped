package typingsJapgolly.winrt.Windows.Storage.FileProperties

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageItemThumbnail
  extends StObject
     with IRandomAccessStreamWithContentType
     with IThumbnailProperties {
  
  def dispose(): Unit
}
object StorageItemThumbnail {
  
  inline def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: CallbackTo[IRandomAccessStream],
    close: Callback,
    contentType: String,
    dispose: Callback,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    originalHeight: Double,
    originalWidth: Double,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    returnedSmallerCachedSize: Boolean,
    seek: Double => Callback,
    size: Double,
    `type`: ThumbnailType,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): StorageItemThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = cloneStream.toJsFn, close = close.toJsFn, contentType = contentType.asInstanceOf[js.Any], dispose = dispose.toJsFn, flushAsync = flushAsync.toJsFn, getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any], seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItemThumbnail]
  }
  
  extension [Self <: StorageItemThumbnail](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
