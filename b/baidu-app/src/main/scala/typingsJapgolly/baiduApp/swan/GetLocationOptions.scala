package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.baiduAppStrings.gcj02
import typingsJapgolly.baiduApp.baiduAppStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  var altitude: js.UndefOr[Boolean] = js.undefined
   // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  var success_GetLocationOptions: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于swan.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.undefined
}

object GetLocationOptions {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ LocationData => Callback = null,
    `type`: wgs84 | gcj02 = null
  ): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.LocationData) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
}

