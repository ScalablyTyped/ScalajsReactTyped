package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppNumbers.`0`
import typingsJapgolly.aliApp.aliAppNumbers.`1`
import typingsJapgolly.aliApp.aliAppNumbers.`2`
import typingsJapgolly.aliApp.aliAppNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 支付宝客户端经纬度定位缓存过期时间，单位秒。默认 30s。使用缓存会加快定位速度，缓存过期会重新定位
  		 */
  var cacheTimeout: Double
  /**
  		 * 0：默认，获取经纬度
  		 * 1：获取经纬度和详细到区县级别的逆地理编码数据
  		 * 2：获取经纬度和详细到街道级别的逆地理编码数据，不推荐使用
  		 * 3：获取经纬度和详细到POI级别的逆地理编码数据，不推荐使用
  		 */
  var `type`: `0` | `1` | `2` | `3`
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit
}

object GetLocationOptions {
  @scala.inline
  def apply(
    cacheTimeout: Double,
    success: LocationData => Callback,
    `type`: `0` | `1` | `2` | `3`,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetLocationOptions = {
    val __obj = js.Dynamic.literal(cacheTimeout = cacheTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.my.LocationData) => success(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetLocationOptions]
  }
}

