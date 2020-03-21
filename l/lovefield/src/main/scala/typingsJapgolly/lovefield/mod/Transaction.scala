package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lovefield.mod.query.Builder
import typingsJapgolly.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def attach(query: Builder): js.Promise[js.Array[js.Object]]
  def begin(scope: js.Array[Table]): js.Promise[Unit]
  def commit(): js.Promise[Unit]
  def exec(queries: js.Array[Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  def rollback(): js.Promise[Unit]
  def stats(): TransactionStats
}

object Transaction {
  @scala.inline
  def apply(
    attach: Builder => CallbackTo[js.Promise[js.Array[js.Object]]],
    begin: js.Array[Table] => CallbackTo[js.Promise[Unit]],
    commit: CallbackTo[js.Promise[Unit]],
    exec: js.Array[Builder] => CallbackTo[js.Promise[js.Array[js.Array[js.Object]]]],
    rollback: CallbackTo[js.Promise[Unit]],
    stats: CallbackTo[TransactionStats]
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: typingsJapgolly.lovefield.mod.query.Builder) => attach(t0).runNow()))
    __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.lovefield.mod.schema.Table]) => begin(t0).runNow()))
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.lovefield.mod.query.Builder]) => exec(t0).runNow()))
    __obj.updateDynamic("rollback")(rollback.toJsFn)
    __obj.updateDynamic("stats")(stats.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
}

