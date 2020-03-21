package typingsJapgolly.reactForm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApi extends js.Object {
  var asyncValidations: Double
  var errors: FormErrors
  var submits: Double
  var submitted: Boolean
  var successes: FormErrors
  var touched: Touched
  var validating: StringDictionary[Boolean]
  var validationFailed: StringDictionary[Boolean]
  var validationFailures: Double
  // State
  var values: FormValues
  var warnings: FormErrors
  def addValue(name: String, value: js.Any): Unit
  def getFormState(): FormState
  def removeValue(name: String, index: Double): Unit
  def resetAll(): Unit
  def setAllTouched(touches: StringDictionary[Boolean]): Unit
  def setAllValues(values: FormValues): Unit
  def setError(field: String, error: String): Unit
  def setFormState(state: FormState): Unit
  def setSuccess(field: String, success: String): Unit
  def setTouched(field: String, touched: Boolean): Unit
  def setValue(fieldName: String, value: js.Any): Unit
  def setWarning(field: String, warning: String): Unit
  // Methods
  def submitForm(event: ReactEventFrom[Element]): Unit
  def swapValues(name: String, index1: Double, index2: Double): Unit
}

object FormApi {
  @scala.inline
  def apply(
    addValue: (String, js.Any) => Callback,
    asyncValidations: Double,
    errors: FormErrors,
    getFormState: CallbackTo[FormState],
    removeValue: (String, Double) => Callback,
    resetAll: Callback,
    setAllTouched: StringDictionary[Boolean] => Callback,
    setAllValues: FormValues => Callback,
    setError: (String, String) => Callback,
    setFormState: FormState => Callback,
    setSuccess: (String, String) => Callback,
    setTouched: (String, Boolean) => Callback,
    setValue: (String, js.Any) => Callback,
    setWarning: (String, String) => Callback,
    submitForm: ReactEventFrom[Element] => Callback,
    submits: Double,
    submitted: Boolean,
    successes: FormErrors,
    swapValues: (String, Double, Double) => Callback,
    touched: Touched,
    validating: StringDictionary[Boolean],
    validationFailed: StringDictionary[Boolean],
    validationFailures: Double,
    values: FormValues,
    warnings: FormErrors
  ): FormApi = {
    val __obj = js.Dynamic.literal(asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.updateDynamic("addValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => addValue(t0, t1).runNow()))
    __obj.updateDynamic("getFormState")(getFormState.toJsFn)
    __obj.updateDynamic("removeValue")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => removeValue(t0, t1).runNow()))
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("setAllTouched")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[scala.Boolean]) => setAllTouched(t0).runNow()))
    __obj.updateDynamic("setAllValues")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormValues) => setAllValues(t0).runNow()))
    __obj.updateDynamic("setError")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setError(t0, t1).runNow()))
    __obj.updateDynamic("setFormState")(js.Any.fromFunction1((t0: typingsJapgolly.reactForm.mod.FormState) => setFormState(t0).runNow()))
    __obj.updateDynamic("setSuccess")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setSuccess(t0, t1).runNow()))
    __obj.updateDynamic("setTouched")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => setTouched(t0, t1).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setValue(t0, t1).runNow()))
    __obj.updateDynamic("setWarning")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setWarning(t0, t1).runNow()))
    __obj.updateDynamic("submitForm")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => submitForm(t0).runNow()))
    __obj.updateDynamic("swapValues")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => swapValues(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FormApi]
  }
}

