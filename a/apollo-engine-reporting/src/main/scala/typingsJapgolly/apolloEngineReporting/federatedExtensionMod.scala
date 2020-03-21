package typingsJapgolly.apolloEngineReporting

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphqlExtensions.mod.GraphQLExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/federatedExtension", JSImport.Namespace)
@js.native
object federatedExtensionMod extends js.Object {
  @js.native
  class EngineFederatedTracingExtension[TContext] protected () extends GraphQLExtension[TContext] {
    def this(options: AnonRewriteError) = this()
    var done: js.Any = js.native
    var enabled: js.Any = js.native
    var treeBuilder: js.Any = js.native
    @JSName("didEncounterErrors")
    def didEncounterErrors_MEngineFederatedTracingExtension(errors: js.Array[GraphQLError]): Unit = js.native
    @JSName("format")
    def format_MEngineFederatedTracingExtension(): js.UndefOr[js.Tuple2[String, String]] = js.native
    @JSName("requestDidStart")
    def requestDidStart_MEngineFederatedTracingExtension(o: AnonRequestContext[TContext]): Unit = js.native
    @JSName("willResolveField")
    def willResolveField_MEngineFederatedTracingExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): (js.Function2[/* error */ js.Error | Null, /* result */ js.Any, Unit]) | Unit = js.native
  }
  
}

