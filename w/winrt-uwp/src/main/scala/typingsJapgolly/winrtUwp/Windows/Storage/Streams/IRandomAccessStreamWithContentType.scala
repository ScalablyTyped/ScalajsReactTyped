package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports random access of data in input and output streams for a specified data format. */
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
    flushAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
    getInputStreamAt: Double => CallbackTo[IInputStream],
    getOutputStreamAt: Double => CallbackTo[IOutputStream],
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]],
    seek: Double => Callback,
    size: Double,
    writeAsync: IBuffer => CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
  ): IRandomAccessStreamWithContentType = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("cloneStream")(cloneStream.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flushAsync")(flushAsync.toJsFn)
    __obj.updateDynamic("getInputStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getInputStreamAt(t0).runNow()))
    __obj.updateDynamic("getOutputStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getOutputStreamAt(t0).runNow()))
    __obj.updateDynamic("readAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer, t1: scala.Double, t2: typingsJapgolly.winrtUwp.Windows.Storage.Streams.InputStreamOptions) => readAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("writeAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer) => writeAsync(t0).runNow()))
    __obj.asInstanceOf[IRandomAccessStreamWithContentType]
  }
}

