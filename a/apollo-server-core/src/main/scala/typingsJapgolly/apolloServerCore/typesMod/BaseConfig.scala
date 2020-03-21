package typingsJapgolly.apolloServerCore.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.DataSources
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
import typingsJapgolly.graphql.mod.ValidationContext
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<apollo-server-core.apollo-server-core/dist/types.Context<object>, any>, 'formatError' | 'debug' | 'rootValue' | 'validationRules' | 'executor' | 'formatResponse' | 'fieldResolver' | 'tracing' | 'dataSources' | 'cache'> */
trait BaseConfig extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[Context[js.Object]]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, Context[js.Object], StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[Context[js.Object]], 
      GraphQLResponse
    ]
  ] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.undefined
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object BaseConfig {
  @scala.inline
  def apply(
    cache: KeyValueCache[String] = null,
    dataSources: js.UndefOr[CallbackTo[DataSources[Context[js.Object]]]] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    executor: /* requestContext */ WithRequired[
      GraphQLRequestContext[Record[String, js.Any]], 
      document | operationName | operation | queryHash
    ] => CallbackTo[ValueOrPromise[GraphQLExecutionResult]] = null,
    fieldResolver: (js.Any, StringDictionary[js.Any], Context[js.Object], /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    formatError: /* error */ GraphQLError => CallbackTo[GraphQLFormattedError[Record[String, js.Any]]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => CallbackTo[GraphQLResponse] = null,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): BaseConfig = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    dataSources.foreach(p => __obj.updateDynamic("dataSources")(p.toJsFn))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[typingsJapgolly.std.Record[java.lang.String, js.Any]], 
  typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.document | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operationName | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.operation | typingsJapgolly.apolloServerTypes.apolloServerTypesStrings.queryHash]) => executor(t0).runNow()))
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: typingsJapgolly.apolloServerCore.typesMod.Context[js.Object], t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => fieldResolver(t0, t1, t2, t3).runNow()))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatError(t0).runNow()))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2((t0: /* response */ typingsJapgolly.apolloServerTypes.mod.GraphQLResponse | scala.Null, t1: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[typingsJapgolly.apolloServerCore.typesMod.Context[js.Object]]) => formatResponse(t0, t1).runNow()))
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfig]
  }
}

