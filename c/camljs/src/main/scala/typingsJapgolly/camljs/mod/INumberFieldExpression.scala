package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFieldExpression extends js.Object {
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Double): IExpression
  /** Checks whether the value of the field is greater than the specified value */
  def GreaterThan(value: Double): IExpression
  /** Checks whether the value of the field is greater than or equal to the specified value */
  def GreaterThanOrEqualTo(value: Double): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[Double]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is less than the specified value */
  def LessThan(value: Double): IExpression
  /** Checks whether the value of the field is less than or equal to the specified value */
  def LessThanOrEqualTo(value: Double): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Double): IExpression
}

object INumberFieldExpression {
  @scala.inline
  def apply(
    EqualTo: Double => CallbackTo[IExpression],
    GreaterThan: Double => CallbackTo[IExpression],
    GreaterThanOrEqualTo: Double => CallbackTo[IExpression],
    In: js.Array[Double] => CallbackTo[IExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    LessThan: Double => CallbackTo[IExpression],
    LessThanOrEqualTo: Double => CallbackTo[IExpression],
    NotEqualTo: Double => CallbackTo[IExpression]
  ): INumberFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: scala.Double) => EqualTo(t0).runNow()))
    __obj.updateDynamic("GreaterThan")(js.Any.fromFunction1((t0: scala.Double) => GreaterThan(t0).runNow()))
    __obj.updateDynamic("GreaterThanOrEqualTo")(js.Any.fromFunction1((t0: scala.Double) => GreaterThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("In")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => In(t0).runNow()))
    __obj.updateDynamic("IsNotNull")(IsNotNull.toJsFn)
    __obj.updateDynamic("IsNull")(IsNull.toJsFn)
    __obj.updateDynamic("LessThan")(js.Any.fromFunction1((t0: scala.Double) => LessThan(t0).runNow()))
    __obj.updateDynamic("LessThanOrEqualTo")(js.Any.fromFunction1((t0: scala.Double) => LessThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("NotEqualTo")(js.Any.fromFunction1((t0: scala.Double) => NotEqualTo(t0).runNow()))
    __obj.asInstanceOf[INumberFieldExpression]
  }
}

