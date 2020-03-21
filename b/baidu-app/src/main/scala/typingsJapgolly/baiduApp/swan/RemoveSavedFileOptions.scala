package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_RemoveSavedFileOptions: js.UndefOr[js.Function1[/* res */ AnonFilePath, Unit]] = js.undefined
}

object RemoveSavedFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonFilePath => Callback = null
  ): RemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonFilePath) => success(t0).runNow()))
    __obj.asInstanceOf[RemoveSavedFileOptions]
  }
}

