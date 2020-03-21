package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================设备信息================================*/
/*=============================地理位置================================*/
trait IopenLocation extends BaseParams {
   // 位置名
  var address: String
   // 地图缩放级别,整形值,范围从1~28。默认为最大
  var infoUrl: String
  var latitude: Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double
   // 经度，浮点数，范围为180 ~ -180。
  var name: String
   // 地址详情说明
  var scale: Double
}

object IopenLocation {
  @scala.inline
  def apply(
    address: String,
    infoUrl: String,
    latitude: Double,
    longitude: Double,
    name: String,
    scale: Double,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IopenLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], infoUrl = infoUrl.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IopenLocation]
  }
}

