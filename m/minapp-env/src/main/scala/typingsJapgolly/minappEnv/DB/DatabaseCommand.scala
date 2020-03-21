package typingsJapgolly.minappEnv.DB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseCommand extends js.Object {
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  def eq(`val`: js.Any): DatabaseQueryCommand
  def gt(`val`: js.Any): DatabaseQueryCommand
  def gte(`val`: js.Any): DatabaseQueryCommand
  def in(`val`: Array[_]): DatabaseQueryCommand
  def inc(`val`: Double): DatabaseUpdateCommand
  def lt(`val`: js.Any): DatabaseQueryCommand
  def lte(`val`: js.Any): DatabaseQueryCommand
  def mul(`val`: Double): DatabaseUpdateCommand
  def neq(`val`: js.Any): DatabaseQueryCommand
  def nin(`val`: Array[_]): DatabaseQueryCommand
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  def pop(): DatabaseUpdateCommand
  def push(values: js.Any*): DatabaseUpdateCommand
  def remove(): DatabaseUpdateCommand
  def set(`val`: js.Any): DatabaseUpdateCommand
  def shift(): DatabaseUpdateCommand
  def unshift(values: js.Any*): DatabaseUpdateCommand
}

object DatabaseCommand {
  @scala.inline
  def apply(
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => CallbackTo[DatabaseLogicCommand],
    eq: js.Any => CallbackTo[DatabaseQueryCommand],
    gt: js.Any => CallbackTo[DatabaseQueryCommand],
    gte: js.Any => CallbackTo[DatabaseQueryCommand],
    in: Array[js.Any] => CallbackTo[DatabaseQueryCommand],
    inc: Double => CallbackTo[DatabaseUpdateCommand],
    lt: js.Any => CallbackTo[DatabaseQueryCommand],
    lte: js.Any => CallbackTo[DatabaseQueryCommand],
    mul: Double => CallbackTo[DatabaseUpdateCommand],
    neq: js.Any => CallbackTo[DatabaseQueryCommand],
    nin: Array[js.Any] => CallbackTo[DatabaseQueryCommand],
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => CallbackTo[DatabaseLogicCommand],
    pop: CallbackTo[DatabaseUpdateCommand],
    push: /* repeated */ js.Any => CallbackTo[DatabaseUpdateCommand],
    remove: CallbackTo[DatabaseUpdateCommand],
    set: js.Any => CallbackTo[DatabaseUpdateCommand],
    shift: CallbackTo[DatabaseUpdateCommand],
    unshift: /* repeated */ js.Any => CallbackTo[DatabaseUpdateCommand]
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | typingsJapgolly.minappEnv.DB.IQueryCondition) => and(t0).runNow()))
    __obj.updateDynamic("eq")(js.Any.fromFunction1((t0: js.Any) => eq(t0).runNow()))
    __obj.updateDynamic("gt")(js.Any.fromFunction1((t0: js.Any) => gt(t0).runNow()))
    __obj.updateDynamic("gte")(js.Any.fromFunction1((t0: js.Any) => gte(t0).runNow()))
    __obj.updateDynamic("in")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.Array[js.Any]) => in(t0).runNow()))
    __obj.updateDynamic("inc")(js.Any.fromFunction1((t0: scala.Double) => inc(t0).runNow()))
    __obj.updateDynamic("lt")(js.Any.fromFunction1((t0: js.Any) => lt(t0).runNow()))
    __obj.updateDynamic("lte")(js.Any.fromFunction1((t0: js.Any) => lte(t0).runNow()))
    __obj.updateDynamic("mul")(js.Any.fromFunction1((t0: scala.Double) => mul(t0).runNow()))
    __obj.updateDynamic("neq")(js.Any.fromFunction1((t0: js.Any) => neq(t0).runNow()))
    __obj.updateDynamic("nin")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.Array[js.Any]) => nin(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | typingsJapgolly.minappEnv.DB.IQueryCondition) => or(t0).runNow()))
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => push(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Any) => set(t0).runNow()))
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => unshift(t0).runNow()))
    __obj.asInstanceOf[DatabaseCommand]
  }
}

