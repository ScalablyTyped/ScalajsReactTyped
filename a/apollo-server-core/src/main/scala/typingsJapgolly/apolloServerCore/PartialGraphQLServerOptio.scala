package typingsJapgolly.apolloServerCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsJapgolly.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsJapgolly.apolloServerCaching.mod.InMemoryLRUCache
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.DataSources
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsJapgolly.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName
import typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash
import typingsJapgolly.apolloServerTypes.mod.GraphQLExecutionResult
import typingsJapgolly.apolloServerTypes.mod.GraphQLExecutor
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.GraphQLResponse
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphql.mod.ValidationContext
import typingsJapgolly.graphqlExtensions.mod.GraphQLExtension
import typingsJapgolly.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<any, any>> */
trait PartialGraphQLServerOptio extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.undefined
  var context: js.UndefOr[js.Any | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[_]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var documentStore: js.UndefOr[InMemoryLRUCache[DocumentNode]] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[_], 
      GraphQLResponse
    ]
  ] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.undefined
  var reporting: js.UndefOr[Boolean] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object PartialGraphQLServerOptio {
  @scala.inline
  def apply(
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions = null,
    context: js.Any | js.Function0[scala.Nothing] = null,
    dataSources: js.UndefOr[CallbackTo[DataSources[js.Any]]] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    documentStore: InMemoryLRUCache[DocumentNode] = null,
    executor: /* requestContext */ WithRequired[
      GraphQLRequestContext[Record[String, js.Any]], 
      document | operationName | operation | queryHash
    ] => CallbackTo[ValueOrPromise[GraphQLExecutionResult]] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    formatError: /* error */ GraphQLError => CallbackTo[GraphQLFormattedError[Record[String, js.Any]]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[js.Any]) => CallbackTo[GraphQLResponse] = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: js.Array[ApolloServerPlugin[Record[String, _]]] = null,
    reporting: js.UndefOr[Boolean] = js.undefined,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any = null,
    schema: GraphQLSchema = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): PartialGraphQLServerOptio = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    dataSources.foreach(p => __obj.updateDynamic("dataSources")(p.toJsFn))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[typingsJapgolly.std.Record[java.lang.String, js.Any]], 
  typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash]) => executor(t0).runNow()))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => fieldResolver(t0, t1, t2, t3).runNow()))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatError(t0).runNow()))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2((t0: /* response */ typingsJapgolly.apolloServerTypes.mod.GraphQLResponse | scala.Null, t1: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[js.Any]) => formatResponse(t0, t1).runNow()))
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reporting)) __obj.updateDynamic("reporting")(reporting.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGraphQLServerOptio]
  }
}

