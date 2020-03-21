package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 位置-----查看位置
trait OpenLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 地址的详细说明 */
  var address: js.UndefOr[String] = js.undefined
  /** 纬度，范围为-90~90，负数表示南纬 */
  var latitude: Double
  /** 经度，范围为-180~180，负数表示西经 */
  var longitude: Double
  /** 位置名 */
  var name: js.UndefOr[String] = js.undefined
  /** 缩放比例，范围1~28，默认为28 */
  var scale: js.UndefOr[Double] = js.undefined
}

object OpenLocationOptions {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    address: String = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    name: String = null,
    scale: Int | Double = null,
    success: js.Any => Callback = null
  ): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[OpenLocationOptions]
  }
}

