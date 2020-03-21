package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputStream extends IClosable {
  def flushAsync(): IAsyncOperation[Boolean]
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: Callback,
    flushAsync: CallbackTo[IAsyncOperation[Boolean]],
    writeAsync: IBuffer => CallbackTo[IAsyncOperationWithProgress[Double, Double]]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flushAsync")(flushAsync.toJsFn)
    __obj.updateDynamic("writeAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => writeAsync(t0).runNow()))
    __obj.asInstanceOf[IOutputStream]
  }
}

