package typingsJapgolly.winrt.Windows.Devices.Sms

import typingsJapgolly.winrt.AnonCompletedGetResults
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
@js.native
class DeleteSmsMessagesOperation () extends IAsyncAction {
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  var operation: AnonCompletedGetResults = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ js.Any, _], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: js.Function1[/* value */ js.Any, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def `then`[U](success: js.Function1[/* value */ js.Any, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}

