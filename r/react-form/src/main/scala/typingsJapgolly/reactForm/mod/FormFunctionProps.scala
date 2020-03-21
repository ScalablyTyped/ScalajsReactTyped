package typingsJapgolly.reactForm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactForm.AnonFormApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactForm.mod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ trait FormFunctionProps
  extends FormProps
     with FormState {
  var asyncValidations: Double
  var submits: Double
  var submitted: Boolean
  var successes: FormErrors
  var validating: StringDictionary[Boolean]
  var validationFailed: StringDictionary[Boolean]
  var validationFailures: Double
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

object FormFunctionProps {
  @scala.inline
  def apply(
    addValue: (String, js.Any) => Callback,
    asyncValidations: Double,
    errors: FormErrors,
    getFormState: CallbackTo[FormState],
    nestedErrors: NestedErrors,
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
    warnings: FormErrors,
    asyncValidators: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: ReactType[AnonFormApi] = null,
    defaultValues: FormValues = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    dontPreventDefault: js.UndefOr[Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => Callback = null,
    getApi: /* formApi */ FormApi => Callback = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ ReactEventFrom[Element], /* formApi */ FormApi) => Callback = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => Callback = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => CallbackTo[FormValues] = null,
    preValidate: /* values */ FormValues => CallbackTo[FormValues] = null,
    render: /* formApi */ FormApi => CallbackTo[RenderReturn] = null,
    validateError: /* values */ FormValues => CallbackTo[FormErrors] = null,
    validateOnSubmit: js.UndefOr[Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => CallbackTo[FormErrors] = null,
    validateWarning: /* values */ FormValues => CallbackTo[FormErrors] = null
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal(asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
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
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount.asInstanceOf[js.Any])
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(js.Any.fromFunction1((t0: /* formState */ typingsJapgolly.reactForm.mod.FormState) => formDidUpdate(t0).runNow()))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction1((t0: /* formApi */ typingsJapgolly.reactForm.mod.FormApi) => getApi(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues, t1: /* submissionEvent */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t2: /* formApi */ typingsJapgolly.reactForm.mod.FormApi) => onSubmit(t0, t1, t2).runNow()))
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(js.Any.fromFunction2((t0: /* errors */ typingsJapgolly.reactForm.mod.FormErrors, t1: /* formApi */ typingsJapgolly.reactForm.mod.FormApi) => onSubmitFailure(t0, t1).runNow()))
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(js.Any.fromFunction2((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues, t1: /* formApi */ typingsJapgolly.reactForm.mod.FormApi) => preSubmit(t0, t1).runNow()))
    if (preValidate != null) __obj.updateDynamic("preValidate")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues) => preValidate(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* formApi */ typingsJapgolly.reactForm.mod.FormApi) => render(t0).runNow()))
    if (validateError != null) __obj.updateDynamic("validateError")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues) => validateError(t0).runNow()))
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit.asInstanceOf[js.Any])
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(js.Any.fromFunction2((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues, t1: /* errors */ typingsJapgolly.reactForm.mod.FormErrors) => validateSuccess(t0, t1).runNow()))
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactForm.mod.FormValues) => validateWarning(t0).runNow()))
    __obj.asInstanceOf[FormFunctionProps]
  }
}

