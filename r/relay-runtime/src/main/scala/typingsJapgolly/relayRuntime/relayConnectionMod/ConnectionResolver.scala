package typingsJapgolly.relayRuntime.relayConnectionMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionResolver[TEdge, TState] extends js.Object {
  def initialize(): TState
  def reduce(state: TState, event: ConnectionEvent[TEdge]): TState
}

object ConnectionResolver {
  @scala.inline
  def apply[TEdge, TState](initialize: CallbackTo[TState], reduce: (TState, ConnectionEvent[TEdge]) => CallbackTo[TState]): ConnectionResolver[TEdge, TState] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.updateDynamic("reduce")(js.Any.fromFunction2((t0: TState, t1: typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionEvent[TEdge]) => reduce(t0, t1).runNow()))
    __obj.asInstanceOf[ConnectionResolver[TEdge, TState]]
  }
}

