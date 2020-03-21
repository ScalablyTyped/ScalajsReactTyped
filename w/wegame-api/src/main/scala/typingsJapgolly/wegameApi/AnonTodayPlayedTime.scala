package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTodayPlayedTime extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonResult, Unit]] = js.undefined
  /**
    * 今天已经玩游戏的时间，单位：秒
    */
  var todayPlayedTime: Double
}

object AnonTodayPlayedTime {
  @scala.inline
  def apply(
    todayPlayedTime: Double,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonResult => Callback = null
  ): AnonTodayPlayedTime = {
    val __obj = js.Dynamic.literal(todayPlayedTime = todayPlayedTime.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonResult) => success(t0).runNow()))
    __obj.asInstanceOf[AnonTodayPlayedTime]
  }
}

