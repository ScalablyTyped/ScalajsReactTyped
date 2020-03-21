package typingsJapgolly.formik.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikConfig[Values]
  extends FormikSharedConfig[js.Object] {
  var children: js.UndefOr[(js.Function1[/* props */ FormikProps[Values], Node]) | Node] = js.undefined
  var component: js.UndefOr[ComponentType[FormikProps[Values]] | Node] = js.undefined
  var initialStatus: js.UndefOr[js.Any] = js.undefined
  var initialValues: Values
  var onReset: js.UndefOr[
    js.Function2[/* values */ Values, /* formikActions */ FormikActions[Values], Unit]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], Node]] = js.undefined
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.undefined
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  def onSubmit(values: Values, formikActions: FormikActions[Values]): Unit
}

object FormikConfig {
  @scala.inline
  def apply[Values](
    initialValues: Values,
    onSubmit: (Values, FormikActions[Values]) => Callback,
    children: (js.Function1[/* props */ FormikProps[Values], Node]) | Node = null,
    component: ComponentType[FormikProps[Values]] | Node = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    initialStatus: js.Any = null,
    isInitialValid: Boolean | (js.Function1[js.Object, Boolean]) = null,
    onReset: (/* values */ Values, /* formikActions */ FormikActions[Values]) => Callback = null,
    render: /* props */ FormikProps[Values] => CallbackTo[Node] = null,
    validate: /* values */ Values => CallbackTo[Unit | js.Object | js.Promise[FormikErrors[Values]]] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | js.Function0[_] = null
  ): FormikConfig[Values] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any])
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction2((t0: Values, t1: typingsJapgolly.formik.typesMod.FormikActions[Values]) => onSubmit(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2((t0: /* values */ Values, t1: /* formikActions */ typingsJapgolly.formik.typesMod.FormikActions[Values]) => onReset(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.typesMod.FormikProps[Values]) => render(t0).runNow()))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* values */ Values) => validate(t0).runNow()))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikConfig[Values]]
  }
}

