package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectWiFiOptions
  extends BaseOptions[js.Any, js.Any] {
  /** Wi-Fi 设备bssid */
  var BSSID: String
  /** Wi-Fi 设备ssid */
  var SSID: String
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.undefined
}

object ConnectWiFiOptions {
  @scala.inline
  def apply(
    BSSID: String,
    SSID: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    password: String = null,
    success: js.Any => Callback = null
  ): ConnectWiFiOptions = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ConnectWiFiOptions]
  }
}

