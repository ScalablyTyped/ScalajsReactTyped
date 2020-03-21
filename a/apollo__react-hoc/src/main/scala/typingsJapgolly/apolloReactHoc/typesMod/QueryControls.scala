package typingsJapgolly.apolloReactHoc.typesMod

import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.observableQueryMod.FetchMoreOptions
import typingsJapgolly.apolloClient.observableQueryMod.UpdateQueryOptions
import typingsJapgolly.apolloClient.typesMod.ApolloQueryResult
import typingsJapgolly.apolloClient.typesMod.OperationVariables
import typingsJapgolly.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryControls[TData, TGraphQLVariables] extends js.Object {
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var networkStatus: Double = js.native
  var variables: TGraphQLVariables = js.native
  def fetchMore(
    fetchMoreOptions: (FetchMoreQueryOptions[TGraphQLVariables, _]) with (FetchMoreOptions[TData, TGraphQLVariables])
  ): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(): js.Promise[ApolloQueryResult[TData]] = js.native
  def refetch(variables: TGraphQLVariables): js.Promise[ApolloQueryResult[TData]] = js.native
  def startPolling(pollInterval: Double): Unit = js.native
  def stopPolling(): Unit = js.native
  def subscribeToMore(options: SubscribeToMoreOptions[_, OperationVariables, _]): js.Function0[Unit] = js.native
  def updateQuery(mapFn: js.Function2[/* previousQueryResult */ js.Any, /* options */ UpdateQueryOptions[_], _]): Unit = js.native
}

