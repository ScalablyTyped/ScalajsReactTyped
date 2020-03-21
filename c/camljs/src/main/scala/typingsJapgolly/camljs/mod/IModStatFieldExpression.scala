package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModStatFieldExpression extends js.Object {
  /** Checks whether the value of the field is Approved - same as ModStatId.EqualTo(0) */
  def IsApproved(): IExpression
  /** Checks whether the value of the field is Pending - same as ModStatId.EqualTo(2) */
  def IsPending(): IExpression
  /** Checks whether the value of the field is Rejected - same as ModStatId.EqualTo(1) */
  def IsRejected(): IExpression
  /** Represents moderation status ID. */
  def ModStatId(): INumberFieldExpression
  /** Represents moderation status as localized text. In most cases it is better to use ModStatId in the queries instead of ValueAsText. */
  def ValueAsText(): ITextFieldExpression
}

object IModStatFieldExpression {
  @scala.inline
  def apply(
    IsApproved: CallbackTo[IExpression],
    IsPending: CallbackTo[IExpression],
    IsRejected: CallbackTo[IExpression],
    ModStatId: CallbackTo[INumberFieldExpression],
    ValueAsText: CallbackTo[ITextFieldExpression]
  ): IModStatFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsApproved")(IsApproved.toJsFn)
    __obj.updateDynamic("IsPending")(IsPending.toJsFn)
    __obj.updateDynamic("IsRejected")(IsRejected.toJsFn)
    __obj.updateDynamic("ModStatId")(ModStatId.toJsFn)
    __obj.updateDynamic("ValueAsText")(ValueAsText.toJsFn)
    __obj.asInstanceOf[IModStatFieldExpression]
  }
}

