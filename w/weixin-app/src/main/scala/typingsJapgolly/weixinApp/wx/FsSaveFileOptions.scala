package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsSaveFileOptions extends SaveFileOptions {
  var filePath: String
}

object FsSaveFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    tempFilePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ SavedFileData => Callback = null
  ): FsSaveFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.SavedFileData) => success(t0).runNow()))
    __obj.asInstanceOf[FsSaveFileOptions]
  }
}

