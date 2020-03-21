package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.AlertOptions> */
trait PartialAlertOptions extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialAlertOptions {
  @scala.inline
  def apply(
    buttonText: String = null,
    complete: /* res */ js.Any => Callback = null,
    content: String = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null,
    title: String = null
  ): PartialAlertOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAlertOptions]
  }
}

