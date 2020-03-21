package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyList extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function1[/* res */ AnonKVDataList, Unit]] = js.undefined
}

object AnonKeyList {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonKVDataList => Callback = null
  ): AnonKeyList = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonKVDataList) => success(t0).runNow()))
    __obj.asInstanceOf[AnonKeyList]
  }
}

