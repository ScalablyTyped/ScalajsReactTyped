package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[String]
  /**
    * 群分享对应的 shareTicket
    */
  var shareTicket: String
  var success: js.UndefOr[js.Function1[/* res */ Anon2, Unit]] = js.undefined
}

object AnonShareTicket {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    shareTicket: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ Anon2 => Callback = null
  ): AnonShareTicket = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.Anon2) => success(t0).runNow()))
    __obj.asInstanceOf[AnonShareTicket]
  }
}

