package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldExpression extends js.Object {
  /** Checks whether the value of the field begins with the specified substring */
  def BeginsWith(value: String): IExpression
  /** Checks whether the value of the field contains the specified substring */
  def Contains(value: String): IExpression
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: String): IExpression
  /** Checks whether the value of the field is equal to one of the specified values */
  def In(arrayOfValues: js.Array[String]): IExpression
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: String): IExpression
}

object ITextFieldExpression {
  @scala.inline
  def apply(
    BeginsWith: String => CallbackTo[IExpression],
    Contains: String => CallbackTo[IExpression],
    EqualTo: String => CallbackTo[IExpression],
    In: js.Array[String] => CallbackTo[IExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    NotEqualTo: String => CallbackTo[IExpression]
  ): ITextFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginsWith")(js.Any.fromFunction1((t0: java.lang.String) => BeginsWith(t0).runNow()))
    __obj.updateDynamic("Contains")(js.Any.fromFunction1((t0: java.lang.String) => Contains(t0).runNow()))
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: java.lang.String) => EqualTo(t0).runNow()))
    __obj.updateDynamic("In")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => In(t0).runNow()))
    __obj.updateDynamic("IsNotNull")(IsNotNull.toJsFn)
    __obj.updateDynamic("IsNull")(IsNull.toJsFn)
    __obj.updateDynamic("NotEqualTo")(js.Any.fromFunction1((t0: java.lang.String) => NotEqualTo(t0).runNow()))
    __obj.asInstanceOf[ITextFieldExpression]
  }
}

