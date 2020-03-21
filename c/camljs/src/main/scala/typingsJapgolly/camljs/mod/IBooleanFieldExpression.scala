package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Boolean): IExpression
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Boolean): IExpression
}

object IBooleanFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Boolean => CallbackTo[IExpression],
    IsFalse: CallbackTo[IExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    IsTrue: CallbackTo[IExpression],
    NotEqualTo: Boolean => CallbackTo[IExpression]
  ): IBooleanFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: scala.Boolean) => EqualTo(t0).runNow()))
    __obj.updateDynamic("IsFalse")(IsFalse.toJsFn)
    __obj.updateDynamic("IsNotNull")(IsNotNull.toJsFn)
    __obj.updateDynamic("IsNull")(IsNull.toJsFn)
    __obj.updateDynamic("IsTrue")(IsTrue.toJsFn)
    __obj.updateDynamic("NotEqualTo")(js.Any.fromFunction1((t0: scala.Boolean) => NotEqualTo(t0).runNow()))
    __obj.asInstanceOf[IBooleanFieldExpression]
  }
}

