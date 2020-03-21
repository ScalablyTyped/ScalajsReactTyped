package typingsJapgolly.apolloReactCommon.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloClient.typesMod.PureQueryOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationFunctionOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[TData | (js.Function1[/* vars */ TVariables | js.Object, TData])] = js.undefined
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesFunction] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object MutationFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    optimisticResponse: TData | (js.Function1[/* vars */ TVariables | js.Object, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Callback = null,
    variables: TVariables = null
  ): MutationFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, t1: /* mutationResult */ typingsJapgolly.apolloLink.typesMod.FetchResult[
  TData, 
  typingsJapgolly.std.Record[java.lang.String, js.Any], 
  typingsJapgolly.std.Record[java.lang.String, js.Any]]) => update(t0, t1).runNow()))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFunctionOptions[TData, TVariables]]
  }
}

