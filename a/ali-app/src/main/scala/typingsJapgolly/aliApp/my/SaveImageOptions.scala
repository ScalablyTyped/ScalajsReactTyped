package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveImageOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_SaveImageOptions: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  /**
  		 * 要保存的图片链接
  		 */
  var url: String
}

object SaveImageOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonErrMsg => Callback = null
  ): SaveImageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonErrMsg) => success(t0).runNow()))
    __obj.asInstanceOf[SaveImageOptions]
  }
}

