package typingsJapgolly.calidation.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext extends js.Object {
  var dirty: Dirty
  var errors: Errors
  var fields: Fields
  var isValid: Boolean
  var submitted: Boolean
  def register(config: FieldsConfig, transforms: Transforms, initialValues: Dictionary[_]): Unit
  def resetAll(): Unit
  def setError(delta: Errors): Unit
  def setField(delta: Fields): Unit
  def submit(): Unit
  def unregister(config: FieldsConfig): Unit
}

object FormContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    register: (FieldsConfig, Transforms, Dictionary[js.Any]) => Callback,
    resetAll: Callback,
    setError: Errors => Callback,
    setField: Fields => Callback,
    submit: Callback,
    submitted: Boolean,
    unregister: FieldsConfig => Callback
  ): FormContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction3((t0: typingsJapgolly.calidation.mod.FieldsConfig, t1: typingsJapgolly.calidation.mod.Transforms, t2: typingsJapgolly.calidation.mod.Dictionary[js.Any]) => register(t0, t1, t2).runNow()))
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: typingsJapgolly.calidation.mod.Errors) => setError(t0).runNow()))
    __obj.updateDynamic("setField")(js.Any.fromFunction1((t0: typingsJapgolly.calidation.mod.Fields) => setField(t0).runNow()))
    __obj.updateDynamic("submit")(submit.toJsFn)
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: typingsJapgolly.calidation.mod.FieldsConfig) => unregister(t0).runNow()))
    __obj.asInstanceOf[FormContext]
  }
}

