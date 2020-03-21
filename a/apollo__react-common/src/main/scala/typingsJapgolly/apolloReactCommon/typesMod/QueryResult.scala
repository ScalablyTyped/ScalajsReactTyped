package typingsJapgolly.apolloReactCommon.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus
import typingsJapgolly.apolloClient.observableQueryMod.FetchMoreOptions
import typingsJapgolly.apolloClient.observableQueryMod.UpdateQueryOptions
import typingsJapgolly.apolloClient.typesMod.ApolloQueryResult
import typingsJapgolly.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typingsJapgolly.apolloReactCommon.AnonQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[TData, TVariables] extends ObservableQueryFields[TData, TVariables] {
  var called: Boolean
  var client: default[_]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    called: Boolean,
    client: default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    refetch: CallbackTo[js.Promise[ApolloQueryResult[TData]]],
    startPolling: /* pollInterval */ Double => Callback,
    stopPolling: Callback,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => CallbackTo[js.Function0[Unit]],
    updateQuery: /* mapFn */ js.Function2[TData, /* options */ UpdateQueryOptions[TVariables], TData] => Callback,
    variables: TVariables,
    data: TData = null,
    error: ApolloError = null
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], fetchMore = fetchMore.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("refetch")(refetch.toJsFn)
    __obj.updateDynamic("startPolling")(js.Any.fromFunction1((t0: /* pollInterval */ scala.Double) => startPolling(t0).runNow()))
    __obj.updateDynamic("stopPolling")(stopPolling.toJsFn)
    __obj.updateDynamic("subscribeToMore")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions[TData, TVariables, TData]) => subscribeToMore(t0).runNow()))
    __obj.updateDynamic("updateQuery")(js.Any.fromFunction1((t0: /* mapFn */ js.Function2[
  TData, 
  /* options */ typingsJapgolly.apolloClient.observableQueryMod.UpdateQueryOptions[TVariables], 
  TData]) => updateQuery(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
}

