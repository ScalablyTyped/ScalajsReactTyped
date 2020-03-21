package typingsJapgolly.reactRelay.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactRelay.AnonCount
import typingsJapgolly.reactRelay.reactRelayStrings.backward
import typingsJapgolly.reactRelay.reactRelayStrings.forward
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig[Props] extends js.Object {
  var direction: js.UndefOr[backward | forward] = js.undefined
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.undefined
  var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.undefined
  var query: GraphQLTaggedNode
  def getVariables(props: Props, paginationInfo: AnonCount, fragmentVariables: Variables): Variables
}

object ConnectionConfig {
  @scala.inline
  def apply[Props](
    getVariables: (Props, AnonCount, Variables) => CallbackTo[Variables],
    query: GraphQLTaggedNode,
    direction: backward | forward = null,
    getConnectionFromProps: /* props */ Props => CallbackTo[js.UndefOr[ConnectionData | Null]] = null,
    getFragmentVariables: (/* prevVars */ Variables, /* totalCount */ Double) => CallbackTo[Variables] = null
  ): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("getVariables")(js.Any.fromFunction3((t0: Props, t1: typingsJapgolly.reactRelay.AnonCount, t2: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables) => getVariables(t0, t1, t2).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getConnectionFromProps != null) __obj.updateDynamic("getConnectionFromProps")(js.Any.fromFunction1((t0: /* props */ Props) => getConnectionFromProps(t0).runNow()))
    if (getFragmentVariables != null) __obj.updateDynamic("getFragmentVariables")(js.Any.fromFunction2((t0: /* prevVars */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, t1: /* totalCount */ scala.Double) => getFragmentVariables(t0, t1).runNow()))
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
}

