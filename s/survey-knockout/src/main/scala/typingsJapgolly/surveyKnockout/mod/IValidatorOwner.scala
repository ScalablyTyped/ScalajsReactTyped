package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any
  def getDataFilteredProperties(): js.Any
  def getDataFilteredValues(): js.Any
  def getValidatorTitle(): String
  def getValidators(): js.Array[SurveyValidator]
}

object IValidatorOwner {
  @scala.inline
  def apply(
    getDataFilteredProperties: CallbackTo[js.Any],
    getDataFilteredValues: CallbackTo[js.Any],
    getValidatorTitle: CallbackTo[String],
    getValidators: CallbackTo[js.Array[SurveyValidator]],
    validatedValue: js.Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("getDataFilteredProperties")(getDataFilteredProperties.toJsFn)
    __obj.updateDynamic("getDataFilteredValues")(getDataFilteredValues.toJsFn)
    __obj.updateDynamic("getValidatorTitle")(getValidatorTitle.toJsFn)
    __obj.updateDynamic("getValidators")(getValidators.toJsFn)
    __obj.asInstanceOf[IValidatorOwner]
  }
}

