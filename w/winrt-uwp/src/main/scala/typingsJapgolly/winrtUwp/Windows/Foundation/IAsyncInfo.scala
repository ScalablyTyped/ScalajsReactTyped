package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports asynchronous actions and operations. IAsyncInfo is a base interface for IAsyncAction , IAsyncActionWithProgress<TProgress> , IAsyncOperation<TResult> and IAsyncOperationWithProgress<TResult,TProgress> , each of which support combinations of return type and progress for an asynchronous method. */
trait IAsyncInfo extends js.Object {
  /** Gets a string that describes an error condition of the asynchronous operation. */
  var errorCode: WinRTError
  /** Gets the handle of the asynchronous operation. */
  var id: Double
  /** Gets a value that indicates the status of the asynchronous operation. */
  var status: AsyncStatus
  /** Cancels the asynchronous operation. */
  def cancel(): Unit
  /** Closes the asynchronous operation. */
  def close(): Unit
}

object IAsyncInfo {
  @scala.inline
  def apply(cancel: Callback, close: Callback, errorCode: WinRTError, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IAsyncInfo]
  }
}

