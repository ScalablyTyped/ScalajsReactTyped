package typingsJapgolly.neo4j.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var expiresAt: js.Date
  var expiresIn: js.Date | Double
  var state: String
  def commit(callback: DoneCallback): Unit
  def cypher(options: CypherOptions, callback: ResultCallback): Request
  def renew(callback: DoneCallback): Unit
  def rollback(callback: DoneCallback): Unit
}

object Transaction {
  @scala.inline
  def apply(
    commit: DoneCallback => Callback,
    cypher: (CypherOptions, ResultCallback) => CallbackTo[Request],
    expiresAt: js.Date,
    expiresIn: js.Date | Double,
    renew: DoneCallback => Callback,
    rollback: DoneCallback => Callback,
    state: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.neo4j.mod.DoneCallback) => commit(t0).runNow()))
    __obj.updateDynamic("cypher")(js.Any.fromFunction2((t0: typingsJapgolly.neo4j.mod.CypherOptions, t1: typingsJapgolly.neo4j.mod.ResultCallback) => cypher(t0, t1).runNow()))
    __obj.updateDynamic("renew")(js.Any.fromFunction1((t0: typingsJapgolly.neo4j.mod.DoneCallback) => renew(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: typingsJapgolly.neo4j.mod.DoneCallback) => rollback(t0).runNow()))
    __obj.asInstanceOf[Transaction]
  }
}

