package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: String
  @JSName("success")
  def success_MCloseBLEConnectionOptions(res: ErrMsgResponse): Unit
}

object CloseBLEConnectionOptions {
  @scala.inline
  def apply(
    deviceId: String,
    success: ErrMsgResponse => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): CloseBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.ErrMsgResponse) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[CloseBLEConnectionOptions]
  }
}

