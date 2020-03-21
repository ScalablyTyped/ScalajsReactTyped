package typingsJapgolly.apolloClient.watchQueryOptionsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloClient.typesMod.MutationQueryReducersMap
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationBaseOptions[T, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[T | (js.Function1[/* vars */ TVariables, T])] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Function1[/* result */ ExecutionResult[T], RefetchQueryDescription]) | RefetchQueryDescription
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[T]] = js.undefined
  var updateQueries: js.UndefOr[MutationQueryReducersMap[T]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object MutationBaseOptions {
  @scala.inline
  def apply[T, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    errorPolicy: ErrorPolicy = null,
    optimisticResponse: T | (js.Function1[/* vars */ TVariables, T]) = null,
    refetchQueries: (js.Function1[/* result */ ExecutionResult[T], RefetchQueryDescription]) | RefetchQueryDescription = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]]) => Callback = null,
    updateQueries: MutationQueryReducersMap[T] = null,
    variables: TVariables = null
  ): MutationBaseOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, t1: /* mutationResult */ typingsJapgolly.apolloLink.typesMod.FetchResult[
  T, 
  typingsJapgolly.std.Record[java.lang.String, js.Any], 
  typingsJapgolly.std.Record[java.lang.String, js.Any]]) => update(t0, t1).runNow()))
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationBaseOptions[T, TVariables]]
  }
}

