package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.gcj02
import typingsJapgolly.wegameApi.wegameApiStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度	>= 1.6.0
    */
  var altitude: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonAccuracy, Unit]] = js.undefined
  /**
    * wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标
    */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.undefined
}

object AnonAltitude {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonAccuracy => Callback = null,
    `type`: wgs84 | gcj02 = null
  ): AnonAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonAccuracy) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
}

