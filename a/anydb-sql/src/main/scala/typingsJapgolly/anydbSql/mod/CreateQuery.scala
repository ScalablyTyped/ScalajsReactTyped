package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery extends Executable[Unit] {
  def ifNotExists(): Executable[Unit]
}

object CreateQuery {
  @scala.inline
  def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    ifNotExists: CallbackTo[Executable[Unit]],
    toQuery: CallbackTo[QueryLike]
  ): CreateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => allWithin(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("execWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => execWithin(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => getWithin(t0).runNow()))
    __obj.updateDynamic("ifNotExists")(ifNotExists.toJsFn)
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.asInstanceOf[CreateQuery]
  }
}

