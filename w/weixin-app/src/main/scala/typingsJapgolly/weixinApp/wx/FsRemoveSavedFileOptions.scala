package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsRemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
}

object FsRemoveSavedFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): FsRemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[FsRemoveSavedFileOptions]
  }
}

