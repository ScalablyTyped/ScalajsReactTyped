package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  var success: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.undefined
  /** 需要保存的文件的临时路径 */
  var tempFilePath: String
}

object SaveFileOptions {
  @scala.inline
  def apply(
    tempFilePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ SavedFileData => Callback = null
  ): SaveFileOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weappApi.mod.wx.SavedFileData) => success(t0).runNow()))
    __obj.asInstanceOf[SaveFileOptions]
  }
}

