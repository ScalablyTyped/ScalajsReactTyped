package typingsJapgolly.calidation.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<calidation.calidation.FormContext, 'register' | 'unregister'> */
trait ValidationContext extends js.Object {
  var dirty: Dirty
  var errors: Errors
  var fields: Fields
  var isValid: Boolean
  var resetAll: js.Function0[Unit]
  var setError: js.Function1[/* delta */ Errors, Unit]
  var setField: js.Function1[/* delta */ Fields, Unit]
  var submit: js.Function0[Unit]
  var submitted: Boolean
}

object ValidationContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    resetAll: Callback,
    setError: /* delta */ Errors => Callback,
    setField: /* delta */ Fields => Callback,
    submit: Callback,
    submitted: Boolean
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any])
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: /* delta */ typingsJapgolly.calidation.mod.Errors) => setError(t0).runNow()))
    __obj.updateDynamic("setField")(js.Any.fromFunction1((t0: /* delta */ typingsJapgolly.calidation.mod.Fields) => setField(t0).runNow()))
    __obj.updateDynamic("submit")(submit.toJsFn)
    __obj.asInstanceOf[ValidationContext]
  }
}

