package typingsJapgolly.reduxForm.reduxFormMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxForm.mod.FormErrors
import typingsJapgolly.reduxForm.mod.FormWarnings
import typingsJapgolly.reduxForm.reducerMod.FormStateMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps[FormData, P, ErrorType] extends js.Object {
  var asyncBlurFields: js.UndefOr[js.Array[String]] = js.undefined
  var asyncChangeFields: js.UndefOr[js.Array[String]] = js.undefined
  var asyncValidate: js.UndefOr[
    js.Function4[
      /* values */ FormData, 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* blurredField */ String, 
      js.Promise[_]
    ]
  ] = js.undefined
  var destroyOnUnmount: js.UndefOr[Boolean] = js.undefined
  var enableReinitialize: js.UndefOr[Boolean] = js.undefined
  var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.undefined
  var form: String
  var getFormState: js.UndefOr[GetFormState] = js.undefined
  var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
  var initialValues: js.UndefOr[Partial[FormData]] = js.undefined
  var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* values */ Partial[FormData], 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* previousValues */ Partial[FormData], 
      Unit
    ]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType])
  ] = js.undefined
  var onSubmitFail: js.UndefOr[
    js.Function4[
      /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
      /* dispatch */ Dispatch[_], 
      /* submitError */ js.Any, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      Unit
    ]
  ] = js.undefined
  var onSubmitSuccess: js.UndefOr[
    js.Function3[
      /* result */ js.Any, 
      /* dispatch */ Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      Unit
    ]
  ] = js.undefined
  var persistentSubmitErrors: js.UndefOr[Boolean] = js.undefined
  var propNamespace: js.UndefOr[String] = js.undefined
  var pure: js.UndefOr[Boolean] = js.undefined
  var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.undefined
  var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var submitAsSideEffect: js.UndefOr[Boolean] = js.undefined
  var touchOnBlur: js.UndefOr[Boolean] = js.undefined
  var touchOnChange: js.UndefOr[Boolean] = js.undefined
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      FormErrors[FormData, ErrorType]
    ]
  ] = js.undefined
  var warn: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      FormWarnings[FormData, Unit]
    ]
  ] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    form: String,
    asyncBlurFields: js.Array[String] = null,
    asyncChangeFields: js.Array[String] = null,
    asyncValidate: (/* values */ FormData, /* dispatch */ Dispatch[js.Any], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* blurredField */ String) => CallbackTo[js.Promise[js.Any]] = null,
    destroyOnUnmount: js.UndefOr[Boolean] = js.undefined,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.undefined,
    getFormState: /* state */ js.Any => CallbackTo[FormStateMap] = null,
    immutableProps: js.Array[String] = null,
    initialValues: Partial[FormData] = null,
    keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* values */ Partial[FormData], /* dispatch */ Dispatch[js.Any], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* previousValues */ Partial[FormData]) => Callback = null,
    onSubmit: (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) = null,
    onSubmitFail: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[js.Any], /* submitError */ js.Any, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => Callback = null,
    onSubmitSuccess: (/* result */ js.Any, /* dispatch */ Dispatch[js.Any], /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => Callback = null,
    persistentSubmitErrors: js.UndefOr[Boolean] = js.undefined,
    propNamespace: String = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    shouldAsyncValidate: /* params */ AsyncValidateCallback[FormData, ErrorType] => CallbackTo[Boolean] = null,
    shouldError: /* params */ ValidateCallback[FormData, P, ErrorType] => CallbackTo[Boolean] = null,
    shouldValidate: /* params */ ValidateCallback[FormData, P, ErrorType] => CallbackTo[Boolean] = null,
    shouldWarn: /* params */ ValidateCallback[FormData, P, ErrorType] => CallbackTo[Boolean] = null,
    submitAsSideEffect: js.UndefOr[Boolean] = js.undefined,
    touchOnBlur: js.UndefOr[Boolean] = js.undefined,
    touchOnChange: js.UndefOr[Boolean] = js.undefined,
    updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined,
    validate: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => CallbackTo[FormErrors[FormData, ErrorType]] = null,
    warn: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => CallbackTo[FormWarnings[FormData, Unit]] = null
  ): ConfigProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (asyncBlurFields != null) __obj.updateDynamic("asyncBlurFields")(asyncBlurFields.asInstanceOf[js.Any])
    if (asyncChangeFields != null) __obj.updateDynamic("asyncChangeFields")(asyncChangeFields.asInstanceOf[js.Any])
    if (asyncValidate != null) __obj.updateDynamic("asyncValidate")(js.Any.fromFunction4((t0: /* values */ FormData, t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t2: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType]), t3: /* blurredField */ java.lang.String) => asyncValidate(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(destroyOnUnmount)) __obj.updateDynamic("destroyOnUnmount")(destroyOnUnmount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUnregisterOnUnmount)) __obj.updateDynamic("forceUnregisterOnUnmount")(forceUnregisterOnUnmount.asInstanceOf[js.Any])
    if (getFormState != null) __obj.updateDynamic("getFormState")(js.Any.fromFunction1((t0: /* state */ js.Any) => getFormState(t0).runNow()))
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirtyOnReinitialize)) __obj.updateDynamic("keepDirtyOnReinitialize")(keepDirtyOnReinitialize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* values */ typingsJapgolly.std.Partial[FormData], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t2: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType]), t3: /* previousValues */ typingsJapgolly.std.Partial[FormData]) => onChange(t0, t1, t2, t3).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSubmitFail != null) __obj.updateDynamic("onSubmitFail")(js.Any.fromFunction4((t0: /* errors */ js.UndefOr[typingsJapgolly.reduxForm.mod.FormErrors[FormData, ErrorType]], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t2: /* submitError */ js.Any, t3: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])) => onSubmitFail(t0, t1, t2, t3).runNow()))
    if (onSubmitSuccess != null) __obj.updateDynamic("onSubmitSuccess")(js.Any.fromFunction3((t0: /* result */ js.Any, t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any], t2: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])) => onSubmitSuccess(t0, t1, t2).runNow()))
    if (!js.isUndefined(persistentSubmitErrors)) __obj.updateDynamic("persistentSubmitErrors")(persistentSubmitErrors.asInstanceOf[js.Any])
    if (propNamespace != null) __obj.updateDynamic("propNamespace")(propNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (shouldAsyncValidate != null) __obj.updateDynamic("shouldAsyncValidate")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reduxForm.reduxFormMod.AsyncValidateCallback[FormData, ErrorType]) => shouldAsyncValidate(t0).runNow()))
    if (shouldError != null) __obj.updateDynamic("shouldError")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reduxForm.reduxFormMod.ValidateCallback[FormData, P, ErrorType]) => shouldError(t0).runNow()))
    if (shouldValidate != null) __obj.updateDynamic("shouldValidate")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reduxForm.reduxFormMod.ValidateCallback[FormData, P, ErrorType]) => shouldValidate(t0).runNow()))
    if (shouldWarn != null) __obj.updateDynamic("shouldWarn")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reduxForm.reduxFormMod.ValidateCallback[FormData, P, ErrorType]) => shouldWarn(t0).runNow()))
    if (!js.isUndefined(submitAsSideEffect)) __obj.updateDynamic("submitAsSideEffect")(submitAsSideEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(touchOnBlur)) __obj.updateDynamic("touchOnBlur")(touchOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(touchOnChange)) __obj.updateDynamic("touchOnChange")(touchOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(updateUnregisteredFields)) __obj.updateDynamic("updateUnregisteredFields")(updateUnregisteredFields.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* values */ FormData, t1: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])) => validate(t0, t1).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: /* values */ FormData, t1: /* props */ P with (typingsJapgolly.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])) => warn(t0, t1).runNow()))
    __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
  }
}

