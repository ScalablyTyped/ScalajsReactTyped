package typingsJapgolly.atAngularForms.atAngularFormsMod

import typingsJapgolly.atAngularForms.atAngularFormsStrings.blur
import typingsJapgolly.atAngularForms.atAngularFormsStrings.change
import typingsJapgolly.atAngularForms.atAngularFormsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractControlOptions extends js.Object {
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.undefined
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.undefined
}

object AbstractControlOptions {
  @scala.inline
  def apply(
    asyncValidators: AsyncValidatorFn | js.Array[AsyncValidatorFn] = null,
    updateOn: change | blur | submit = null,
    validators: ValidatorFn | js.Array[ValidatorFn] = null
  ): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractControlOptions]
  }
}

