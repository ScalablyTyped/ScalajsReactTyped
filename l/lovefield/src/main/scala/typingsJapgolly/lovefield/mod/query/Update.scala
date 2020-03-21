package typingsJapgolly.lovefield.mod.query

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lovefield.mod.Predicate
import typingsJapgolly.lovefield.mod.schema.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Builder {
  def set(column: Column, value: js.Any): Update
  def where(predicate: Predicate): Update
}

object Update {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => CallbackTo[Builder],
    exec: CallbackTo[js.Promise[js.Array[js.Object]]],
    explain: CallbackTo[String],
    set: (Column, js.Any) => CallbackTo[Update],
    toSql: CallbackTo[String],
    where: Predicate => CallbackTo[Update]
  ): Update = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => bind(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("explain")(explain.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.lovefield.mod.schema.Column, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("toSql")(toSql.toJsFn)
    __obj.updateDynamic("where")(js.Any.fromFunction1((t0: typingsJapgolly.lovefield.mod.Predicate) => where(t0).runNow()))
    __obj.asInstanceOf[Update]
  }
}

