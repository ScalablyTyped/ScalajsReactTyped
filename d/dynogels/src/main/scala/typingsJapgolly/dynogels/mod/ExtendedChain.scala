package typingsJapgolly.dynogels.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedChain[T] extends BaseChain[T] {
  def contains(value: js.Any): T
  def in(values: js.Array[_]): T
  def ne(value: js.Any): T
  def notContains(value: js.Any): T
}

object ExtendedChain {
  @scala.inline
  def apply[T](
    beginsWith: js.Any => CallbackTo[T],
    between: (js.Any, js.Any) => CallbackTo[T],
    contains: js.Any => CallbackTo[T],
    eq: js.Any => CallbackTo[T],
    equals: js.Any => CallbackTo[T],
    exists: CallbackTo[T],
    gt: js.Any => CallbackTo[T],
    gte: js.Any => CallbackTo[T],
    in: js.Array[js.Any] => CallbackTo[T],
    lt: js.Any => CallbackTo[T],
    lte: js.Any => CallbackTo[T],
    ne: js.Any => CallbackTo[T],
    notContains: js.Any => CallbackTo[T],
    `null`: CallbackTo[T]
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginsWith")(js.Any.fromFunction1((t0: js.Any) => beginsWith(t0).runNow()))
    __obj.updateDynamic("between")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => between(t0, t1).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: js.Any) => contains(t0).runNow()))
    __obj.updateDynamic("eq")(js.Any.fromFunction1((t0: js.Any) => eq(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: js.Any) => equals(t0).runNow()))
    __obj.updateDynamic("exists")(exists.toJsFn)
    __obj.updateDynamic("gt")(js.Any.fromFunction1((t0: js.Any) => gt(t0).runNow()))
    __obj.updateDynamic("gte")(js.Any.fromFunction1((t0: js.Any) => gte(t0).runNow()))
    __obj.updateDynamic("in")(js.Any.fromFunction1((t0: js.Array[js.Any]) => in(t0).runNow()))
    __obj.updateDynamic("lt")(js.Any.fromFunction1((t0: js.Any) => lt(t0).runNow()))
    __obj.updateDynamic("lte")(js.Any.fromFunction1((t0: js.Any) => lte(t0).runNow()))
    __obj.updateDynamic("ne")(js.Any.fromFunction1((t0: js.Any) => ne(t0).runNow()))
    __obj.updateDynamic("notContains")(js.Any.fromFunction1((t0: js.Any) => notContains(t0).runNow()))
    __obj.updateDynamic("null")(`null`.toJsFn)
    __obj.asInstanceOf[ExtendedChain[T]]
  }
}

