package typingsJapgolly.apolloReactHooks.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloClient.typesMod.PureQueryOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.apolloReactCommon.typesMod.BaseMutationOptions
import typingsJapgolly.apolloReactCommon.typesMod.Context
import typingsJapgolly.apolloReactCommon.typesMod.RefetchQueriesFunction
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationHookOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: js.UndefOr[DocumentNode] = js.undefined
}

object MutationHookOptions {
  @scala.inline
  def apply[TData, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: default[js.Object] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    ignoreResults: js.UndefOr[Boolean] = js.undefined,
    mutation: DocumentNode = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Callback = null,
    onError: /* error */ ApolloError => Callback = null,
    optimisticResponse: TData | (js.Function1[TVariables, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Callback = null,
    variables: TVariables = null
  ): MutationHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreResults)) __obj.updateDynamic("ignoreResults")(ignoreResults.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1((t0: TData) => onCompleted(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.apolloClient.mod.ApolloError) => onError(t0).runNow()))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, t1: /* mutationResult */ typingsJapgolly.apolloLink.typesMod.FetchResult[
  TData, 
  typingsJapgolly.std.Record[java.lang.String, js.Any], 
  typingsJapgolly.std.Record[java.lang.String, js.Any]]) => update(t0, t1).runNow()))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationHookOptions[TData, TVariables]]
  }
}

