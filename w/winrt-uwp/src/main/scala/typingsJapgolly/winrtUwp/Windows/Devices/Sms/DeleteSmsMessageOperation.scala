package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables start, track, and end an asynchronous message delete operation for a single message. */
@JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
@js.native
abstract class DeleteSmsMessageOperation () extends js.Object {
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous SMS message delete operation. */
  var errorCode: WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message delete operation. */
  var id: Double = js.native
  /** Specifies the status of the asynchronous SMS message delete operation. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous SMS message delete operation. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous SMS message delete operation. */
  def close(): Unit = js.native
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Retrieves the result of the asynchronous SMS message delete operation. */
  def getResults(): Unit = js.native
}

