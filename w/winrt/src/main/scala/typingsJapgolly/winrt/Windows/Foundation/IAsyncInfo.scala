package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncInfo extends js.Object {
  var errorCode: Double
  var id: Double
  var status: AsyncStatus
  def cancel(): Unit
  def close(): Unit
}

object IAsyncInfo {
  @scala.inline
  def apply(cancel: Callback, close: Callback, errorCode: Double, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IAsyncInfo]
  }
}

