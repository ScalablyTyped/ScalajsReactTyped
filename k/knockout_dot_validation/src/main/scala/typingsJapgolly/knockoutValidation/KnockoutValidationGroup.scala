package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationGroup extends js.Object {
  var errors: js.UndefOr[KnockoutValidationErrors] = js.undefined
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object KnockoutValidationGroup {
  @scala.inline
  def apply(
    errors: KnockoutValidationErrors = null,
    isAnyMessageShown: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    isAnyMessageShown.foreach(p => __obj.updateDynamic("isAnyMessageShown")(p.toJsFn))
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
}

