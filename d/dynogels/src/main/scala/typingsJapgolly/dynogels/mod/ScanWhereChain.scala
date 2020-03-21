package typingsJapgolly.dynogels.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanWhereChain extends ExtendedChain[Scan] {
  def notNull(): Scan
}

object ScanWhereChain {
  @scala.inline
  def apply(
    beginsWith: js.Any => CallbackTo[Scan],
    between: (js.Any, js.Any) => CallbackTo[Scan],
    contains: js.Any => CallbackTo[Scan],
    eq: js.Any => CallbackTo[Scan],
    equals: js.Any => CallbackTo[Scan],
    exists: CallbackTo[Scan],
    gt: js.Any => CallbackTo[Scan],
    gte: js.Any => CallbackTo[Scan],
    in: js.Array[js.Any] => CallbackTo[Scan],
    lt: js.Any => CallbackTo[Scan],
    lte: js.Any => CallbackTo[Scan],
    ne: js.Any => CallbackTo[Scan],
    notContains: js.Any => CallbackTo[Scan],
    notNull: CallbackTo[Scan],
    `null`: CallbackTo[Scan]
  ): ScanWhereChain = {
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
    __obj.updateDynamic("notNull")(notNull.toJsFn)
    __obj.updateDynamic("null")(`null`.toJsFn)
    __obj.asInstanceOf[ScanWhereChain]
  }
}

