package typingsJapgolly.relayRuntime.relayQueryResponseCacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayQueryResponseCache extends js.Object {
  def clear(): Unit
  def get(queryID: String, variables: Variables): GraphQLResponse | Null
  def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit
}

object RelayQueryResponseCache {
  @scala.inline
  def apply(
    clear: Callback,
    get: (String, Variables) => CallbackTo[GraphQLResponse | Null],
    set: (String, Variables, GraphQLResponse) => Callback
  ): RelayQueryResponseCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables) => get(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, t2: typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse) => set(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RelayQueryResponseCache]
  }
}

