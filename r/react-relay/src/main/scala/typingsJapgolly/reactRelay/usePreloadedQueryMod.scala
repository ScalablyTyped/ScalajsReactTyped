package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/usePreloadedQuery", JSImport.Namespace)
@js.native
object usePreloadedQueryMod extends js.Object {
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
}

