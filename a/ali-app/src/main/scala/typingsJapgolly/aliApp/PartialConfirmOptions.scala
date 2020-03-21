package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ConfirmOptions> */
trait PartialConfirmOptions extends js.Object {
  var cancelButtonText: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var confirmButtonText: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ AnonConfirm, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: String = null,
    complete: /* res */ js.Any => Callback = null,
    confirmButtonText: String = null,
    content: String = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* result */ AnonConfirm => Callback = null,
    title: String = null
  ): PartialConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (confirmButtonText != null) __obj.updateDynamic("confirmButtonText")(confirmButtonText.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.aliApp.AnonConfirm) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfirmOptions]
  }
}

