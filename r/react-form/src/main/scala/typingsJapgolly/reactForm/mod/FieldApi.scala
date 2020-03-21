package typingsJapgolly.reactForm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldApi extends js.Object {
  def getError(): FormError
  def getFieldName(): String
  def getSuccess(): FormError
  def getTouched(): Boolean
  def getValue(): FormValue
  def getWarning(): FormError
  def setError(error: FormError): Unit
  def setSuccess(success: FormError): Unit
  def setTouched(touched: Boolean): Unit
  def setValue(value: FormValue): Unit
  def setWarning(warning: FormError): Unit
}

object FieldApi {
  @scala.inline
  def apply(
    getError: CallbackTo[FormError],
    getFieldName: CallbackTo[String],
    getSuccess: CallbackTo[FormError],
    getTouched: CallbackTo[Boolean],
    getValue: CallbackTo[FormValue],
    getWarning: CallbackTo[FormError],
    setError: FormError => Callback,
    setSuccess: FormError => Callback,
    setTouched: Boolean => Callback,
    setValue: FormValue => Callback,
    setWarning: FormError => Callback
  ): FieldApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getError")(getError.toJsFn)
    __obj.updateDynamic("getFieldName")(getFieldName.toJsFn)
    __obj.updateDynamic("getSuccess")(getSuccess.toJsFn)
    __obj.updateDynamic("getTouched")(getTouched.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("getWarning")(getWarning.toJsFn)
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormError) => setError(t0).runNow()))
    __obj.updateDynamic("setSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormError) => setSuccess(t0).runNow()))
    __obj.updateDynamic("setTouched")(js.Any.fromFunction1((t0: scala.Boolean) => setTouched(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormValue) => setValue(t0).runNow()))
    __obj.updateDynamic("setWarning")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormError) => setWarning(t0).runNow()))
    __obj.asInstanceOf[FieldApi]
  }
}

