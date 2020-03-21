package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be written. */
trait IOutputStream extends IClosable {
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer A buffer that contains the data to be written.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: Callback,
    flushAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
    writeAsync: IBuffer => CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("flushAsync")(flushAsync.toJsFn)
    __obj.updateDynamic("writeAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer) => writeAsync(t0).runNow()))
    __obj.asInstanceOf[IOutputStream]
  }
}

