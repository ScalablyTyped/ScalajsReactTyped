package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexCreationQuery extends Executable[Unit] {
  def fulltext(): IndexCreationQuery
  def on(columns: (Column[_] | OrderByValueNode)*): IndexCreationQuery
  def spatial(): IndexCreationQuery
  def unique(): IndexCreationQuery
  def using(name: String): IndexCreationQuery
  def withParser(parserName: String): IndexCreationQuery
}

object IndexCreationQuery {
  @scala.inline
  def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    fulltext: CallbackTo[IndexCreationQuery],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    on: /* repeated */ Column[js.Any] | OrderByValueNode => CallbackTo[IndexCreationQuery],
    spatial: CallbackTo[IndexCreationQuery],
    toQuery: CallbackTo[QueryLike],
    unique: CallbackTo[IndexCreationQuery],
    using: String => CallbackTo[IndexCreationQuery],
    withParser: String => CallbackTo[IndexCreationQuery]
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("allWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => allWithin(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("execWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => execWithin(t0).runNow()))
    __obj.updateDynamic("fulltext")(fulltext.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getWithin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.DatabaseConnection) => getWithin(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.anydbSql.mod.Column[js.Any] | typingsJapgolly.anydbSql.mod.OrderByValueNode) => on(t0).runNow()))
    __obj.updateDynamic("spatial")(spatial.toJsFn)
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.updateDynamic("unique")(unique.toJsFn)
    __obj.updateDynamic("using")(js.Any.fromFunction1((t0: java.lang.String) => using(t0).runNow()))
    __obj.updateDynamic("withParser")(js.Any.fromFunction1((t0: java.lang.String) => withParser(t0).runNow()))
    __obj.asInstanceOf[IndexCreationQuery]
  }
}

