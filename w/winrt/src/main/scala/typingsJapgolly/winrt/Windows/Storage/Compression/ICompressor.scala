package typingsJapgolly.winrt.Windows.Storage.Compression

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressor extends IOutputStream {
  def detachStream(): IOutputStream
  def finishAsync(): IAsyncOperation[Boolean]
}

object ICompressor {
  @scala.inline
  def apply(
    close: Callback,
    detachStream: CallbackTo[IOutputStream],
    finishAsync: CallbackTo[IAsyncOperation[Boolean]],
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    writeAsync: IBuffer => CallbackTo[IAsyncOperationWithProgress[Double, Double]]
  ): ICompressor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("detachStream")(detachStream.toJsFn)
    __obj.updateDynamic("finishAsync")(finishAsync.toJsFn)
    __obj.updateDynamic("flushAsync")(flushAsync.toJsFn)
    __obj.updateDynamic("writeAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => writeAsync(t0).runNow()))
    __obj.asInstanceOf[ICompressor]
  }
}

