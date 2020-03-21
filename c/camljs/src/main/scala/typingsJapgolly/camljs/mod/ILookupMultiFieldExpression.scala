package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookupMultiFieldExpression extends js.Object {
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: js.Any): IExpression
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): ILookupFieldExpression
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: js.Any): IExpression
}

object ILookupMultiFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Any => CallbackTo[IExpression],
    Includes: js.Any => CallbackTo[IExpression],
    IncludesSuchItemThat: CallbackTo[ILookupFieldExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    NotEqualTo: js.Any => CallbackTo[IExpression],
    NotIncludes: js.Any => CallbackTo[IExpression]
  ): ILookupMultiFieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: js.Any) => EqualTo(t0).runNow()))
    __obj.updateDynamic("Includes")(js.Any.fromFunction1((t0: js.Any) => Includes(t0).runNow()))
    __obj.updateDynamic("IncludesSuchItemThat")(IncludesSuchItemThat.toJsFn)
    __obj.updateDynamic("IsNotNull")(IsNotNull.toJsFn)
    __obj.updateDynamic("IsNull")(IsNull.toJsFn)
    __obj.updateDynamic("NotEqualTo")(js.Any.fromFunction1((t0: js.Any) => NotEqualTo(t0).runNow()))
    __obj.updateDynamic("NotIncludes")(js.Any.fromFunction1((t0: js.Any) => NotIncludes(t0).runNow()))
    __obj.asInstanceOf[ILookupMultiFieldExpression]
  }
}

