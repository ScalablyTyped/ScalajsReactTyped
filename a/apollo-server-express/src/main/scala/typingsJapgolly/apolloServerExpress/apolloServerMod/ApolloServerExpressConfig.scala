package typingsJapgolly.apolloServerExpress.apolloServerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsJapgolly.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsJapgolly.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsJapgolly.apolloServerCore.PartialSubscriptionServer
import typingsJapgolly.apolloServerCore.TypeofSchemaDirectiveVisi
import typingsJapgolly.apolloServerCore.apolloServerCoreBooleans.`false`
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.DataSources
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsJapgolly.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsJapgolly.apolloServerCore.typesMod.Config
import typingsJapgolly.apolloServerCore.typesMod.Context
import typingsJapgolly.apolloServerCore.typesMod.ContextFunction
import typingsJapgolly.apolloServerCore.typesMod.FileUploadOptions
import typingsJapgolly.apolloServerCore.typesMod.GraphQLService
import typingsJapgolly.apolloServerCore.typesMod.PluginDefinition
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash
import typingsJapgolly.apolloServerTypes.mod.GraphQLExecutionResult
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.GraphQLResponse
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import typingsJapgolly.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphql.mod.ValidationContext
import typingsJapgolly.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsJapgolly.graphqlTools.interfacesMod.IMocks
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerExpressConfig extends Config {
  @JSName("context")
  var context_ApolloServerExpressConfig: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.undefined
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions | Boolean = null,
    context: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object] = null,
    dataSources: js.UndefOr[CallbackTo[DataSources[Context[js.Object]]]] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    engine: Boolean | EngineReportingOptions[Context[js.Object]] = null,
    executor: /* requestContext */ WithRequired[
      GraphQLRequestContext[Record[String, js.Any]], 
      document | operationName | operation | queryHash
    ] => CallbackTo[ValueOrPromise[GraphQLExecutionResult]] = null,
    experimental_approximateDocumentStoreMiB: Int | Double = null,
    extensions: js.Array[js.Function0[typingsJapgolly.graphqlExtensions.mod.GraphQLExtension[_]]] = null,
    fieldResolver: (js.Any, StringDictionary[js.Any], Context[js.Object], /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    formatError: /* error */ GraphQLError => CallbackTo[GraphQLFormattedError[Record[String, js.Any]]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => CallbackTo[GraphQLResponse] = null,
    gateway: GraphQLService = null,
    introspection: js.UndefOr[Boolean] = js.undefined,
    mockEntireSchema: js.UndefOr[Boolean] = js.undefined,
    mocks: Boolean | IMocks = null,
    modules: js.Array[GraphQLSchemaModule] = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions | `false` = null,
    playground: PlaygroundConfig = null,
    plugins: js.Array[PluginDefinition] = null,
    resolvers: (IResolvers[_, _]) | (js.Array[IResolvers[_, _]]) = null,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any = null,
    schema: GraphQLSchema = null,
    schemaDirectives: Record[String, TypeofSchemaDirectiveVisi] = null,
    subscriptions: PartialSubscriptionServer | String | `false` = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    typeDefs: DocumentNode | (js.Array[DocumentNode | String]) | String = null,
    uploads: Boolean | FileUploadOptions = null,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    dataSources.foreach(p => __obj.updateDynamic("dataSources")(p.toJsFn))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[typingsJapgolly.std.Record[java.lang.String, js.Any]], 
  typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash]) => executor(t0).runNow()))
    if (experimental_approximateDocumentStoreMiB != null) __obj.updateDynamic("experimental_approximateDocumentStoreMiB")(experimental_approximateDocumentStoreMiB.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: typingsJapgolly.apolloServerCore.typesMod.Context[js.Object], t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => fieldResolver(t0, t1, t2, t3).runNow()))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatError(t0).runNow()))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2((t0: /* response */ typingsJapgolly.apolloServerTypes.mod.GraphQLResponse | scala.Null, t1: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[typingsJapgolly.apolloServerCore.typesMod.Context[js.Object]]) => formatResponse(t0, t1).runNow()))
    if (gateway != null) __obj.updateDynamic("gateway")(gateway.asInstanceOf[js.Any])
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection.asInstanceOf[js.Any])
    if (!js.isUndefined(mockEntireSchema)) __obj.updateDynamic("mockEntireSchema")(mockEntireSchema.asInstanceOf[js.Any])
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (playground != null) __obj.updateDynamic("playground")(playground.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
}

