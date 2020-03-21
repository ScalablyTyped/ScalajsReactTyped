package typingsJapgolly.apolloReactHooks.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsJapgolly.apolloReactCommon.typesMod.Context
import typingsJapgolly.apolloReactCommon.typesMod.QueryFunctionOptions
import typingsJapgolly.apolloReactCommon.typesMod.QueryResult
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var children: js.UndefOr[js.Function1[/* result */ QueryResult[TData, TVariables], Node]] = js.undefined
  var query: DocumentNode
}

object QueryOptions {
  @scala.inline
  def apply[TData, TVariables](
    query: DocumentNode,
    children: /* result */ QueryResult[TData, TVariables] => CallbackTo[Node] = null,
    client: default[_] = null,
    context: Context = null,
    displayName: String = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Callback = null,
    onError: /* error */ ApolloError => Callback = null,
    partialRefetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.apolloReactCommon.typesMod.QueryResult[TData, TVariables]) => children(t0).runNow()))
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1((t0: TData) => onCompleted(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.apolloClient.mod.ApolloError) => onError(t0).runNow()))
    if (!js.isUndefined(partialRefetch)) __obj.updateDynamic("partialRefetch")(partialRefetch.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TData, TVariables]]
  }
}

