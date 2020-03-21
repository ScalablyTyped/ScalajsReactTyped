package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindFormOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onSubmitDisable: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Boolean]] = js.undefined
  var validation: js.UndefOr[ValidationOptional] = js.undefined
}

object BindFormOptions {
  @scala.inline
  def apply(
    complete: /* repeated */ js.Any => Callback = null,
    error: /* repeated */ js.Any => Callback = null,
    onSubmitDisable: String = null,
    validate: /* form */ HTMLFormElement => CallbackTo[Boolean] = null,
    validation: ValidationOptional = null
  ): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    if (onSubmitDisable != null) __obj.updateDynamic("onSubmitDisable")(onSubmitDisable.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* form */ org.scalajs.dom.raw.HTMLFormElement) => validate(t0).runNow()))
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindFormOptions]
  }
}

