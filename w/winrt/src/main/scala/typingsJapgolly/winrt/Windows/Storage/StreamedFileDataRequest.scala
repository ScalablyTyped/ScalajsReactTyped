package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StreamedFileDataRequest")
@js.native
class StreamedFileDataRequest ()
  extends IOutputStream
     with IStreamedFileDataRequest {
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def failAndClose(failureMode: StreamedFileFailureMode): Unit = js.native
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

