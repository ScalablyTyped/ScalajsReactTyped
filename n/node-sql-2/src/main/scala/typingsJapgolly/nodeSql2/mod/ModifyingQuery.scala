package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery extends Executable {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

object ModifyingQuery {
  @scala.inline
  def apply(
    returning: /* repeated */ js.Any => CallbackTo[Query[js.Any]],
    toQuery: CallbackTo[QueryLike],
    where: /* repeated */ js.Any => CallbackTo[ModifyingQuery]
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("returning")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => returning(t0).runNow()))
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.updateDynamic("where")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => where(t0).runNow()))
    __obj.asInstanceOf[ModifyingQuery]
  }
}

