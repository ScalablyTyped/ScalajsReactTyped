package typingsJapgolly.rrule.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMethods extends js.Object {
  def after(date: js.Date, inc: Boolean): js.Date
  def all(): js.Array[js.Date]
  def before(date: js.Date, inc: Boolean): js.Date
  def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date]
}

object QueryMethods {
  @scala.inline
  def apply(
    after: (js.Date, Boolean) => CallbackTo[js.Date],
    all: CallbackTo[js.Array[js.Date]],
    before: (js.Date, Boolean) => CallbackTo[js.Date],
    between: (js.Date, js.Date, Boolean) => CallbackTo[js.Array[js.Date]]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction2((t0: js.Date, t1: scala.Boolean) => after(t0, t1).runNow()))
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("before")(js.Any.fromFunction2((t0: js.Date, t1: scala.Boolean) => before(t0, t1).runNow()))
    __obj.updateDynamic("between")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: scala.Boolean) => between(t0, t1, t2).runNow()))
    __obj.asInstanceOf[QueryMethods]
  }
}

