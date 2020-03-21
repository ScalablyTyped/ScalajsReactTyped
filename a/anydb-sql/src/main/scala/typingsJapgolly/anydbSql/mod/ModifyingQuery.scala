package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery extends Executable[Unit] {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

object ModifyingQuery {
  @scala.inline
  def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    returning: /* repeated */ js.Any => CallbackTo[Query[js.Any]],
    toQuery: CallbackTo[QueryLike],
    where: /* repeated */ js.Any => CallbackTo[ModifyingQuery]
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => allWithin(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("execWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => execWithin(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => getWithin(t0).runNow()))
    __obj.updateDynamic("returning")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => returning(t0).runNow()))
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.updateDynamic("where")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => where(t0).runNow()))
    __obj.asInstanceOf[ModifyingQuery]
  }
}

