package typingsJapgolly.formik.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formik.typesMod.FormikActions
import typingsJapgolly.formik.typesMod.FormikConfig
import typingsJapgolly.formik.typesMod.FormikErrors
import typingsJapgolly.formik.typesMod.FormikProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formik {
  def apply[Values](
    initialValues: Values,
    onSubmit: (Values, FormikActions[Values]) => Callback,
    component: ComponentType[FormikProps[Values]] | Node = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    initialStatus: js.Any = null,
    isInitialValid: Boolean | (js.Function1[js.Object, Boolean]) = null,
    onReset: (Values, /* formikActions */ FormikActions[Values]) => Callback = null,
    render: /* props */ FormikProps[Values] => CallbackTo[Node] = null,
    validate: Values => CallbackTo[Unit | js.Object | js.Promise[FormikErrors[Values]]] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | js.Function0[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ FormikProps[Values], Node]) | Node = null
  ): UnmountedWithRoot[
    FormikConfig[Values], 
    typingsJapgolly.formik.mod.Formik[Values], 
    Unit, 
    FormikConfig[Values]
  ] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction2((t0: Values, t1: typingsJapgolly.formik.typesMod.FormikActions[Values]) => onSubmit(t0, t1).runNow()))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2((t0: Values, t1: /* formikActions */ typingsJapgolly.formik.typesMod.FormikActions[Values]) => onReset(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.typesMod.FormikProps[Values]) => render(t0).runNow()))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: Values) => validate(t0).runNow()))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formik.typesMod.FormikConfig[Values], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.formik.mod.Formik[Values]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formik.typesMod.FormikConfig[Values]])
  }
  @JSImport("formik", "Formik")
  @js.native
  object componentImport extends js.Object
  
}

