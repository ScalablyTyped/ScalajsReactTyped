package typingsJapgolly.rcFieldForm.interfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcFieldForm.rcFieldFormBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-field-form.rc-field-form/lib/interface.FormInstance, 'validateFields'> & {  validateFields  :rc-field-form.rc-field-form/lib/interface.InternalValidateFields,   prefixName ? :rc-field-form.rc-field-form/lib/interface.InternalNamePath, getInternalHooks (secret : string): rc-field-form.rc-field-form/lib/interface.InternalHooks | null} */
trait InternalFormInstance extends js.Object {
  var getFieldError: js.Function1[/* name */ NamePath, js.Array[String]]
  var getFieldValue: js.Function1[/* name */ NamePath, StoreValue]
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Array[FieldError]]
  var getFieldsValue: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath] | `true`], 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Store
  ]
  var isFieldTouched: js.Function1[/* name */ NamePath, Boolean]
  var isFieldValidating: js.Function1[/* name */ NamePath, Boolean]
  var isFieldsTouched: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]
  var isFieldsValidating: js.Function1[/* nameList */ js.Array[NamePath], Boolean]
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.undefined
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath]], Unit]
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit]
  var setFieldsValue: js.Function1[/* value */ Store, Unit]
  var submit: js.Function0[Unit]
  var validateFields: InternalValidateFields
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null
}

object InternalFormInstance {
  @scala.inline
  def apply(
    getFieldError: /* name */ NamePath => CallbackTo[js.Array[String]],
    getFieldValue: /* name */ NamePath => CallbackTo[StoreValue],
    getFieldsError: /* nameList */ js.UndefOr[js.Array[NamePath]] => CallbackTo[js.Array[FieldError]],
    getFieldsValue: (/* nameList */ js.UndefOr[js.Array[NamePath] | `true`], /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]]) => CallbackTo[Store],
    getInternalHooks: String => CallbackTo[InternalHooks | Null],
    isFieldTouched: /* name */ NamePath => CallbackTo[Boolean],
    isFieldValidating: /* name */ NamePath => CallbackTo[Boolean],
    isFieldsTouched: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* allFieldsTouched */ js.UndefOr[Boolean]) => CallbackTo[Boolean],
    isFieldsValidating: /* nameList */ js.Array[NamePath] => CallbackTo[Boolean],
    resetFields: /* fields */ js.UndefOr[js.Array[NamePath]] => Callback,
    setFields: /* fields */ js.Array[FieldData] => Callback,
    setFieldsValue: /* value */ Store => Callback,
    submit: Callback,
    validateFields: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => CallbackTo[js.Promise[Store]],
    prefixName: InternalNamePath = null
  ): InternalFormInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFieldError")(js.Any.fromFunction1((t0: /* name */ typingsJapgolly.rcFieldForm.interfaceMod.NamePath) => getFieldError(t0).runNow()))
    __obj.updateDynamic("getFieldValue")(js.Any.fromFunction1((t0: /* name */ typingsJapgolly.rcFieldForm.interfaceMod.NamePath) => getFieldValue(t0).runNow()))
    __obj.updateDynamic("getFieldsError")(js.Any.fromFunction1((t0: /* nameList */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]]) => getFieldsError(t0).runNow()))
    __obj.updateDynamic("getFieldsValue")(js.Any.fromFunction2((t0: /* nameList */ js.UndefOr[
  js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath] | typingsJapgolly.rcFieldForm.rcFieldFormBooleans.`true`], t1: /* filterFunc */ js.UndefOr[
  js.Function1[/* meta */ typingsJapgolly.rcFieldForm.interfaceMod.Meta, scala.Boolean]]) => getFieldsValue(t0, t1).runNow()))
    __obj.updateDynamic("getInternalHooks")(js.Any.fromFunction1((t0: java.lang.String) => getInternalHooks(t0).runNow()))
    __obj.updateDynamic("isFieldTouched")(js.Any.fromFunction1((t0: /* name */ typingsJapgolly.rcFieldForm.interfaceMod.NamePath) => isFieldTouched(t0).runNow()))
    __obj.updateDynamic("isFieldValidating")(js.Any.fromFunction1((t0: /* name */ typingsJapgolly.rcFieldForm.interfaceMod.NamePath) => isFieldValidating(t0).runNow()))
    __obj.updateDynamic("isFieldsTouched")(js.Any.fromFunction2((t0: /* nameList */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]], t1: /* allFieldsTouched */ js.UndefOr[scala.Boolean]) => isFieldsTouched(t0, t1).runNow()))
    __obj.updateDynamic("isFieldsValidating")(js.Any.fromFunction1((t0: /* nameList */ js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]) => isFieldsValidating(t0).runNow()))
    __obj.updateDynamic("resetFields")(js.Any.fromFunction1((t0: /* fields */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]]) => resetFields(t0).runNow()))
    __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: /* fields */ js.Array[typingsJapgolly.rcFieldForm.interfaceMod.FieldData]) => setFields(t0).runNow()))
    __obj.updateDynamic("setFieldsValue")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rcFieldForm.interfaceMod.Store) => setFieldsValue(t0).runNow()))
    __obj.updateDynamic("submit")(submit.toJsFn)
    __obj.updateDynamic("validateFields")(js.Any.fromFunction2((t0: /* nameList */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]], t1: /* options */ js.UndefOr[typingsJapgolly.rcFieldForm.interfaceMod.ValidateOptions]) => validateFields(t0, t1).runNow()))
    if (prefixName != null) __obj.updateDynamic("prefixName")(prefixName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFormInstance]
  }
}

