package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queryable[T] extends js.Object {
  def delete(): ModifyingQuery
  def select[U](nodes: js.Any*): Query[U]
  def selectDeep[U](nodesOrTables: js.Any*): Query[U]
  def where(nodes: js.Any*): Query[T]
}

object Queryable {
  @scala.inline
  def apply[T](
    delete: CallbackTo[ModifyingQuery],
    select: /* repeated */ js.Any => CallbackTo[Query[js.Any]],
    selectDeep: /* repeated */ js.Any => CallbackTo[Query[js.Any]],
    where: /* repeated */ js.Any => CallbackTo[Query[T]]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => select(t0).runNow()))
    __obj.updateDynamic("selectDeep")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => selectDeep(t0).runNow()))
    __obj.updateDynamic("where")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => where(t0).runNow()))
    __obj.asInstanceOf[Queryable[T]]
  }
}

