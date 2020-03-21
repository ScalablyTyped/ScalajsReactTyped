package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.servicesArrayuuidstringis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayuuidstringis): Unit
}

object GetBLEDeviceServicesOptions {
  @scala.inline
  def apply(
    deviceId: String,
    success: servicesArrayuuidstringis => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.servicesArrayuuidstringis) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
}

