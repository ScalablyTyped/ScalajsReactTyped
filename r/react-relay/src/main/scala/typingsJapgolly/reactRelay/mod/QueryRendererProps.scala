package typingsJapgolly.reactRelay.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactRelay.AnonError
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: AnonError[TOperation]): Node
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment,
    render: AnonError[TOperation] => CallbackTo[Node],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: GraphQLTaggedNode = null
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRelay.AnonError[TOperation]) => render(t0).runNow()))
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

