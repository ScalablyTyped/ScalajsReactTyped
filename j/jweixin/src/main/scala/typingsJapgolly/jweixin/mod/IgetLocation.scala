package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonAccuracy
import typingsJapgolly.jweixin.jweixinStrings.gcj02
import typingsJapgolly.jweixin.jweixinStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocation extends BaseParams {
  var `type`: wgs84 | gcj02
   // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: AnonAccuracy): Unit
}

object IgetLocation {
  @scala.inline
  def apply(
    success: AnonAccuracy => Callback,
    `type`: wgs84 | gcj02,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IgetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonAccuracy) => success(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IgetLocation]
  }
}

