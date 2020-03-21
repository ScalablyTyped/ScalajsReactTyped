package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.exception
import typingsJapgolly.aliApp.aliAppStrings.fail
import typingsJapgolly.aliApp.aliAppStrings.none
import typingsJapgolly.aliApp.aliAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ToastOptions> */
trait PartialToastOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.undefined
}

object PartialToastOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    content: String = null,
    duration: Int | Double = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null,
    `type`: none | success | fail | exception | String = null
  ): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToastOptions]
  }
}

