package typingsJapgolly.forms

import japgolly.scalajs.react.Callback
import typingsJapgolly.forms.mod.Form
import typingsJapgolly.forms.mod.FormHandleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmpty extends js.Object {
  var empty: js.UndefOr[FormHandleCallback] = js.undefined
  var error: js.UndefOr[FormHandleCallback] = js.undefined
  var other: js.UndefOr[FormHandleCallback] = js.undefined
  var success: js.UndefOr[FormHandleCallback] = js.undefined
}

object AnonEmpty {
  @scala.inline
  def apply(
    empty: /* form */ Form => Callback = null,
    error: /* form */ Form => Callback = null,
    other: /* form */ Form => Callback = null,
    success: /* form */ Form => Callback = null
  ): AnonEmpty = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction1((t0: /* form */ typingsJapgolly.forms.mod.Form) => empty(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* form */ typingsJapgolly.forms.mod.Form) => error(t0).runNow()))
    if (other != null) __obj.updateDynamic("other")(js.Any.fromFunction1((t0: /* form */ typingsJapgolly.forms.mod.Form) => other(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* form */ typingsJapgolly.forms.mod.Form) => success(t0).runNow()))
    __obj.asInstanceOf[AnonEmpty]
  }
}

