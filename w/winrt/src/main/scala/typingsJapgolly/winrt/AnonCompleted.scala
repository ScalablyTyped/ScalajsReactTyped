package typingsJapgolly.winrt

import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompleted[TResult, TProgress] extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress] = js.native
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): TResult = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit = js.native
}

