package typingsJapgolly.formik.withFormikMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formik.typesMod.FormikSharedConfig
import typingsJapgolly.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload] extends FormikSharedConfig[Props] {
  var displayName: js.UndefOr[String] = js.undefined
  var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.undefined
  var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.undefined
  var validate: js.UndefOr[
    js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[_]]
  ] = js.undefined
  var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.undefined
  def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit
}

object WithFormikConfig {
  @scala.inline
  def apply[Props, Values /* <: FormikValues */, DeprecatedPayload](
    handleSubmit: (Values, FormikBag[Props, Values]) => Callback,
    displayName: String = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    isInitialValid: Boolean | (js.Function1[Props, Boolean]) = null,
    mapPropsToStatus: /* props */ Props => CallbackTo[js.Any] = null,
    mapPropsToValues: /* props */ Props => CallbackTo[Values] = null,
    mapValuesToPayload: /* values */ Values => CallbackTo[DeprecatedPayload] = null,
    validate: (/* values */ Values, /* props */ Props) => CallbackTo[Unit | js.Object | js.Promise[js.Any]] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | (js.Function1[/* props */ Props, _]) = null
  ): WithFormikConfig[Props, Values, DeprecatedPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleSubmit")(js.Any.fromFunction2((t0: Values, t1: typingsJapgolly.formik.withFormikMod.FormikBag[Props, Values]) => handleSubmit(t0, t1).runNow()))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (mapPropsToStatus != null) __obj.updateDynamic("mapPropsToStatus")(js.Any.fromFunction1((t0: /* props */ Props) => mapPropsToStatus(t0).runNow()))
    if (mapPropsToValues != null) __obj.updateDynamic("mapPropsToValues")(js.Any.fromFunction1((t0: /* props */ Props) => mapPropsToValues(t0).runNow()))
    if (mapValuesToPayload != null) __obj.updateDynamic("mapValuesToPayload")(js.Any.fromFunction1((t0: /* values */ Values) => mapValuesToPayload(t0).runNow()))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* values */ Values, t1: /* props */ Props) => validate(t0, t1).runNow()))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
  }
}

