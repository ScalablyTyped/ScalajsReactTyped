package typingsJapgolly.reduxForm.reduxFormMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: Boolean
  var array: InjectedArrayProps
  var asyncValidating: String | Boolean
  var dirty: Boolean
  var error: ErrorType
  var form: String
  var handleSubmit: SubmitHandler[FormData, P, ErrorType]
  var initialValues: Partial[FormData]
  var initialized: Boolean
  var invalid: Boolean
  var pristine: Boolean
  var registeredFields: StringDictionary[RegisteredField]
  var submitFailed: Boolean
  var submitSucceeded: Boolean
  var submitting: Boolean
  var valid: Boolean
  var warning: js.Any
  def asyncValidate(): Unit
  def autofill(field: String, value: js.Any): Unit
  def blur(field: String, value: js.Any): Unit
  def change(field: String, value: js.Any): Unit
  def clearAsyncError(field: String): Unit
  def destroy(): Unit
  def initialize(data: Partial[FormData]): Unit
  def reset(): Unit
  def touch(field: String*): Unit
  def untouch(field: String*): Unit
}

object InjectedFormProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    anyTouched: Boolean,
    array: InjectedArrayProps,
    asyncValidate: Callback,
    asyncValidating: String | Boolean,
    autofill: (String, js.Any) => Callback,
    blur: (String, js.Any) => Callback,
    change: (String, js.Any) => Callback,
    clearAsyncError: String => Callback,
    destroy: Callback,
    dirty: Boolean,
    error: ErrorType,
    form: String,
    handleSubmit: SubmitHandler[FormData, P, ErrorType],
    initialValues: Partial[FormData],
    initialize: Partial[FormData] => Callback,
    initialized: Boolean,
    invalid: Boolean,
    pristine: Boolean,
    registeredFields: StringDictionary[RegisteredField],
    reset: Callback,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    touch: /* repeated */ String => Callback,
    untouch: /* repeated */ String => Callback,
    valid: Boolean,
    warning: js.Any
  ): InjectedFormProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(anyTouched = anyTouched.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], asyncValidating = asyncValidating.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = handleSubmit.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], registeredFields = registeredFields.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("asyncValidate")(asyncValidate.toJsFn)
    __obj.updateDynamic("autofill")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => autofill(t0, t1).runNow()))
    __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => blur(t0, t1).runNow()))
    __obj.updateDynamic("change")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => change(t0, t1).runNow()))
    __obj.updateDynamic("clearAsyncError")(js.Any.fromFunction1((t0: java.lang.String) => clearAsyncError(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.std.Partial[FormData]) => initialize(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("touch")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => touch(t0).runNow()))
    __obj.updateDynamic("untouch")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => untouch(t0).runNow()))
    __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
  }
}

