package typingsJapgolly.apolloClient.apolloClientMod

import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloCache.mod.ApolloCache
import typingsJapgolly.apolloClient.localStateMod.FragmentMatcher
import typingsJapgolly.apolloClient.observableMod.Observable
import typingsJapgolly.apolloClient.observableQueryMod.ObservableQuery
import typingsJapgolly.apolloClient.queryManagerMod.QueryManager
import typingsJapgolly.apolloClient.storeMod.DataStore
import typingsJapgolly.apolloClient.typesMod.ApolloQueryResult
import typingsJapgolly.apolloClient.typesMod.Resolvers
import typingsJapgolly.apolloClient.watchQueryOptionsMod.MutationOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.QueryOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.SubscriptionOptions
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.apolloLink.typesMod.GraphQLRequest
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloClient[TCacheShape] extends DataProxy {
  var cache: ApolloCache[TCacheShape] = js.native
  var clearStoreCallbacks: js.Any = js.native
  var defaultOptions: DefaultOptions = js.native
  var devToolsHookCb: js.Any = js.native
  var disableNetworkFetches: Boolean = js.native
  var link: ApolloLink = js.native
  var localState: js.Any = js.native
  var queryDeduplication: Boolean = js.native
  val queryManager: QueryManager[TCacheShape] = js.native
  var resetStoreCallbacks: js.Any = js.native
  var store: DataStore[TCacheShape] = js.native
  val typeDefs: js.UndefOr[String | (js.Array[DocumentNode | String]) | DocumentNode] = js.native
  var version: String = js.native
  def __actionHookForDevTools(cb: js.Function0[_]): Unit = js.native
  def __requestRaw(payload: GraphQLRequest): Observable[ExecutionResult[ExecutionResultDataDefault]] = js.native
  def addResolvers(resolvers: js.Array[Resolvers]): Unit = js.native
  def addResolvers(resolvers: Resolvers): Unit = js.native
  def clearStore(): js.Promise[js.Array[_]] = js.native
  def extract(): TCacheShape = js.native
  def extract(optimistic: Boolean): TCacheShape = js.native
  def getResolvers(): Resolvers = js.native
  def initQueryManager(): QueryManager[TCacheShape] = js.native
  def mutate[T, TVariables](options: MutationOptions[T, TVariables]): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def onClearStore(cb: js.Function0[js.Promise[_]]): js.Function0[Unit] = js.native
  def onResetStore(cb: js.Function0[js.Promise[_]]): js.Function0[Unit] = js.native
  def query[T, TVariables](options: QueryOptions[TVariables]): js.Promise[ApolloQueryResult[T]] = js.native
  def reFetchObservableQueries(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def reFetchObservableQueries(includeStandby: Boolean): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def resetStore(): js.Promise[js.Array[ApolloQueryResult[_]] | Null] = js.native
  def restore(serializedState: TCacheShape): ApolloCache[TCacheShape] = js.native
  def setLocalStateFragmentMatcher(fragmentMatcher: FragmentMatcher): Unit = js.native
  def setResolvers(resolvers: js.Array[Resolvers]): Unit = js.native
  def setResolvers(resolvers: Resolvers): Unit = js.native
  def stop(): Unit = js.native
  def subscribe[T, TVariables](options: SubscriptionOptions[TVariables]): Observable[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[TVariables]): ObservableQuery[T, TVariables] = js.native
}

