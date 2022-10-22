package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.anon.UNSTABLErenderPolicy
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseClientQueryMod {
  
  @JSImport("react-relay/relay-hooks/useClientQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: UNSTABLErenderPolicy): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
}
