package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamWithContentType
  extends IRandomAccessStream
     with IContentTypeProvider

object IRandomAccessStreamWithContentType {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: CallbackTo[IRandomAccessStream],
    close: Callback,
    contentType: String,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    getInputStreamAt: Double => CallbackTo[IInputStream],
    getOutputStreamAt: Double => CallbackTo[IOutputStream],
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => CallbackTo[IAsyncOperationWithProgress[IBuffer, Double]],
    seek: Double => Callback,
    size: Double,
    writeAsync: IBuffer => CallbackTo[IAsyncOperationWithProgress[Double, Double]]
  ): IRandomAccessStreamWithContentType = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("cloneStream")(cloneStream.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flushAsync")(flushAsync.toJsFn)
    __obj.updateDynamic("getInputStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getInputStreamAt(t0).runNow()))
    __obj.updateDynamic("getOutputStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getOutputStreamAt(t0).runNow()))
    __obj.updateDynamic("readAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: scala.Double, t2: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions) => readAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("writeAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => writeAsync(t0).runNow()))
    __obj.asInstanceOf[IRandomAccessStreamWithContentType]
  }
}

