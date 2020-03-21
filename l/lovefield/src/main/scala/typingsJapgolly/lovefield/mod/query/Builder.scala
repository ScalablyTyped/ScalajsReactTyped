package typingsJapgolly.lovefield.mod.query

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def bind(values: js.Any*): Builder
  def exec(): js.Promise[js.Array[js.Object]]
  def explain(): String
  def toSql(): String
}

object Builder {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => CallbackTo[Builder],
    exec: CallbackTo[js.Promise[js.Array[js.Object]]],
    explain: CallbackTo[String],
    toSql: CallbackTo[String]
  ): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => bind(t0).runNow()))
    __obj.updateDynamic("exec")(exec.toJsFn)
    __obj.updateDynamic("explain")(explain.toJsFn)
    __obj.updateDynamic("toSql")(toSql.toJsFn)
    __obj.asInstanceOf[Builder]
  }
}

