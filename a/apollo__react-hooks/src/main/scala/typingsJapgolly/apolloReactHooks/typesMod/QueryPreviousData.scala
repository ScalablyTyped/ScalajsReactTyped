package typingsJapgolly.apolloReactHooks.typesMod

import typingsJapgolly.apolloClient.mod.ApolloClient
import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.typesMod.ApolloQueryResult
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPreviousData[TData, TVariables] extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var observableQueryOptions: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[QueryOptions[TData, TVariables]] = js.undefined
  var query: js.UndefOr[DocumentNode] = js.undefined
  var result: js.UndefOr[ApolloQueryResult[TData] | Null] = js.undefined
}

object QueryPreviousData {
  @scala.inline
  def apply[TData, TVariables](
    client: ApolloClient[js.Object] = null,
    error: ApolloError = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    observableQueryOptions: js.Object = null,
    options: QueryOptions[TData, TVariables] = null,
    query: DocumentNode = null,
    result: ApolloQueryResult[TData] = null
  ): QueryPreviousData[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (observableQueryOptions != null) __obj.updateDynamic("observableQueryOptions")(observableQueryOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPreviousData[TData, TVariables]]
  }
}

