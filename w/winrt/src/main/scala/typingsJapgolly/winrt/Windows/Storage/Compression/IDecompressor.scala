package typingsJapgolly.winrt.Windows.Storage.Compression

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressor extends IInputStream {
  def detachStream(): IInputStream
}

object IDecompressor {
  @scala.inline
  def apply(
    close: Callback,
    detachStream: CallbackTo[IInputStream],
    readAsync: (IBuffer, Double, InputStreamOptions) => CallbackTo[IAsyncOperationWithProgress[IBuffer, Double]]
  ): IDecompressor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("detachStream")(detachStream.toJsFn)
    __obj.updateDynamic("readAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: scala.Double, t2: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions) => readAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDecompressor]
  }
}

