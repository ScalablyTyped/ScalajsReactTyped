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

trait FormProps extends js.Object {
  var asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.undefined
  var component: js.UndefOr[ReactType[AnonFormApi]] = js.undefined
  var defaultValues: js.UndefOr[FormValues] = js.undefined
  var dontPreventDefault: js.UndefOr[Boolean] = js.undefined
  var dontValidateOnMount: js.UndefOr[Boolean] = js.undefined
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.undefined
  var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ ReactEventFrom[Element], 
      /* formApi */ FormApi, 
      Unit
    ]
  ] = js.undefined
  var onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, Unit]] = js.undefined
  var preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.undefined
  var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.undefined
  var render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.undefined
  var validateError: js.UndefOr[ValidateValuesFunction] = js.undefined
  var validateOnSubmit: js.UndefOr[Boolean] = js.undefined
  var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.undefined
  var validateWarning: js.UndefOr[ValidateValuesFunction] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    asyncValidators: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: ReactType[AnonFormApi] = null,
    defaultValues: FormValues = null,
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
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[FormProps]
  }
}

