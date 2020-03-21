package typingsJapgolly.reduxForm.formMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxForm.mod.FormErrors
import typingsJapgolly.reduxForm.reduxFormMod.FormSubmitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.undefined
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](
    onSubmit: (FormData, /* dispatch */ Dispatch[js.Any], P) => CallbackTo[Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]] = null
  ): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3((t0: FormData, t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t2: P) => onSubmit(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
}

