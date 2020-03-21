package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  keyList  :std.Array<string>} & wegame-api.wx.types.CallbacksWithType2<{  encryptedData  :string,   cloudID  :string}, {  errMsg  :string,   errCode  :number}> */
trait keyListArraystringCallbac extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrCode, Unit]] = js.undefined
  /**
    * 要获取的 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function1[/* res */ AnonCloudID, Unit]] = js.undefined
}

object keyListArraystringCallbac {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrCode => Callback = null,
    success: /* res */ AnonCloudID => Callback = null
  ): keyListArraystringCallbac = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrCode) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonCloudID) => success(t0).runNow()))
    __obj.asInstanceOf[keyListArraystringCallbac]
  }
}

