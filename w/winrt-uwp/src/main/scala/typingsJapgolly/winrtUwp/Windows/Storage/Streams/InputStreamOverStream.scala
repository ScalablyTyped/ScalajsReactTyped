package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Windows Runtime input stream for an IStream base implementation. */
@JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
@js.native
abstract class InputStreamOverStream () extends js.Object {
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}

