package typingsJapgolly.apolloReactHooks

import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsJapgolly.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsJapgolly.apolloReactCommon.typesMod.QueryResult
import typingsJapgolly.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.MutationHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.MutationTuple
import typingsJapgolly.apolloReactHooks.typesMod.QueryHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.QueryLazyOptions
import typingsJapgolly.apolloReactHooks.typesMod.SubscriptionHookOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderPromises ()
    extends typingsJapgolly.apolloReactHooks.renderPromisesMod.RenderPromises
  
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def resetApolloContext(): Unit = js.native
  def useApolloClient(): default[js.Object] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode): AnonError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): AnonError[TVariables, TData] = js.native
}

