package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be read. */
trait IInputStream extends IClosable {
  /**
    * Reads data from the stream asynchronously.
    * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
}

object IInputStream {
  @scala.inline
  def apply(
    close: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]]
  ): IInputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("readAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer, t1: scala.Double, t2: typingsJapgolly.winrtUwp.Windows.Storage.Streams.InputStreamOptions) => readAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IInputStream]
  }
}

