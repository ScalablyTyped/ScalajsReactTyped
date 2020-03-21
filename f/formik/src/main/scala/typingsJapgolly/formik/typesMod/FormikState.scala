package typingsJapgolly.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikState[Values] extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var errors: FormikErrors[Values]
  var isSubmitting: Boolean
  var isValidating: Boolean
  var status: js.UndefOr[js.Any] = js.undefined
  var submitCount: Double
  var touched: FormikTouched[Values]
  var values: Values
}

object FormikState {
  @scala.inline
  def apply[Values](
    errors: FormikErrors[Values],
    isSubmitting: Boolean,
    isValidating: Boolean,
    submitCount: Double,
    touched: FormikTouched[Values],
    values: Values,
    error: js.Any = null,
    status: js.Any = null
  ): FormikState[Values] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], submitCount = submitCount.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikState[Values]]
  }
}

