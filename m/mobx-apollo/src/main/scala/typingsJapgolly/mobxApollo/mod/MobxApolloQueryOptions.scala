package typingsJapgolly.mobxApollo.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloClient.mod.ApolloClient
import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.typesMod.OperationVariables
import typingsJapgolly.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobxApolloQueryOptions[T] extends WatchQueryOptions[OperationVariables] {
  var client: ApolloClient[_]
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.undefined
  var onFetch: js.UndefOr[js.Function1[/* result */ T, Unit]] = js.undefined
}

object MobxApolloQueryOptions {
  @scala.inline
  def apply[T](
    client: ApolloClient[_],
    query: DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    fetchResults: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ ApolloError => Callback = null,
    onFetch: /* result */ T => Callback = null,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    variables: OperationVariables = null
  ): MobxApolloQueryOptions[T] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.apolloClient.mod.ApolloError) => onError(t0).runNow()))
    if (onFetch != null) __obj.updateDynamic("onFetch")(js.Any.fromFunction1((t0: /* result */ T) => onFetch(t0).runNow()))
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
}

