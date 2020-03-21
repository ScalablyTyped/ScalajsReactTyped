package typingsJapgolly.lovefield.mod.query

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lovefield.mod.Predicate
import typingsJapgolly.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends Builder {
  def from(table: Table): Delete
  def where(predicate: Predicate): Delete
}

object Delete {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => CallbackTo[Builder],
    exec: CallbackTo[js.Promise[js.Array[js.Object]]],
    explain: CallbackTo[String],
    from: Table => CallbackTo[Delete],
    toSql: CallbackTo[String],
    where: Predicate => CallbackTo[Delete]
  ): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => bind(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("explain")(explain.toJsFn)
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: typingsJapgolly.lovefield.mod.schema.Table) => from(t0).runNow()))
    __obj.updateDynamic("toSql")(toSql.toJsFn)
    __obj.updateDynamic("where")(js.Any.fromFunction1((t0: typingsJapgolly.lovefield.mod.Predicate) => where(t0).runNow()))
    __obj.asInstanceOf[Delete]
  }
}

