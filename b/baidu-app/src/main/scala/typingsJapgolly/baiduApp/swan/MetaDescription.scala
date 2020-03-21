package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDescription
  extends BaseOptions[js.Any, js.Any] {
  var content: js.UndefOr[String] = js.undefined
}

object MetaDescription {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    content: String = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): MetaDescription = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[MetaDescription]
  }
}

