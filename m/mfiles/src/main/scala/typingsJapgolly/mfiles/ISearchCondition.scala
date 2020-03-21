package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCondition extends js.Object {
  var ConditionType: MFConditionType
  var Expression: IExpression
  var TypedValue: ITypedValue
  def Clone(): ISearchCondition
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit
}

object ISearchCondition {
  @scala.inline
  def apply(
    Clone: CallbackTo[ISearchCondition],
    ConditionType: MFConditionType,
    Expression: IExpression,
    Set: (IExpression, MFConditionType, ITypedValue) => Callback,
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal(ConditionType = ConditionType.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Set")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IExpression, t1: typingsJapgolly.mfiles.MFiles.MFConditionType, t2: typingsJapgolly.mfiles.ITypedValue) => Set(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISearchCondition]
  }
}

