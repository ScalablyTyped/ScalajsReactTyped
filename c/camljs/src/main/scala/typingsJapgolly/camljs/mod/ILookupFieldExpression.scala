package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookupFieldExpression extends js.Object {
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression
}

object ILookupFieldExpression {
  @scala.inline
  def apply(
    Id: CallbackTo[INumberFieldExpression],
    ValueAsBoolean: CallbackTo[IBooleanFieldExpression],
    ValueAsDate: CallbackTo[IDateTimeFieldExpression],
    ValueAsDateTime: CallbackTo[IDateTimeFieldExpression],
    ValueAsNumber: CallbackTo[INumberFieldExpression],
    ValueAsText: CallbackTo[ITextFieldExpression]
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Id")(Id.toJsFn)
    __obj.updateDynamic("ValueAsBoolean")(ValueAsBoolean.toJsFn)
    __obj.updateDynamic("ValueAsDate")(ValueAsDate.toJsFn)
    __obj.updateDynamic("ValueAsDateTime")(ValueAsDateTime.toJsFn)
    __obj.updateDynamic("ValueAsNumber")(ValueAsNumber.toJsFn)
    __obj.updateDynamic("ValueAsText")(ValueAsText.toJsFn)
    __obj.asInstanceOf[ILookupFieldExpression]
  }
}

