package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable[T] extends js.Object {
  def all(): typingsJapgolly.bluebird.mod.^[js.Array[T]]
  def allWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[js.Array[T]]
  def exec(): typingsJapgolly.bluebird.mod.^[Unit]
  def execWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[Unit]
  def get(): typingsJapgolly.bluebird.mod.^[T]
  def getWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[T]
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply[T](
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[T]]],
    allWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[T]]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[T]],
    getWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[T]],
    toQuery: CallbackTo[QueryLike]
  ): Executable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => allWithin(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("execWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => execWithin(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => getWithin(t0).runNow()))
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.asInstanceOf[Executable[T]]
  }
}

