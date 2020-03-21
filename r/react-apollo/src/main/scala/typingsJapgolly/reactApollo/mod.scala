package typingsJapgolly.reactApollo

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsJapgolly.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typingsJapgolly.apolloReactCommon.typesMod.OperationVariables
import typingsJapgolly.apolloReactCommon.typesMod.QueryResult
import typingsJapgolly.apolloReactComponents.typesMod.MutationComponentOptions
import typingsJapgolly.apolloReactComponents.typesMod.QueryComponentOptions
import typingsJapgolly.apolloReactComponents.typesMod.SubscriptionComponentOptions
import typingsJapgolly.apolloReactHoc.typesMod.ChildProps
import typingsJapgolly.apolloReactHoc.typesMod.OperationOption
import typingsJapgolly.apolloReactHoc.typesMod.WithApolloClient
import typingsJapgolly.apolloReactHooks.AnonError
import typingsJapgolly.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.MutationHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.MutationTuple
import typingsJapgolly.apolloReactHooks.typesMod.QueryHookOptions
import typingsJapgolly.apolloReactHooks.typesMod.QueryLazyOptions
import typingsJapgolly.apolloReactHooks.typesMod.SubscriptionHookOptions
import typingsJapgolly.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactApollo.reactApolloStrings.client
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def getDataFromTree(tree: Node): js.Promise[String] = js.native
  def getDataFromTree(tree: Node, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def graphql[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def renderToStringWithData(component: Element): js.Promise[String] = js.native
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
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]]): ComponentClassP[(Omit[TProps, client]) with js.Object] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClassP[(Omit[TProps, client]) with js.Object] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def withMutation[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClassP[TProps with js.Object]
  ] = js.native
  @js.native
  object Mutation extends js.Object {
    def apply[TData, TVariables](props: MutationComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var awaitRefetchQueries: Requireable[Boolean] = js.native
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var mutation: Validator[js.Object] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var optimisticResponse: Requireable[js.Object] = js.native
      var refetchQueries: Requireable[
            (js.Function1[/* repeated */ _, _]) | (js.Array[js.UndefOr[String | js.Object | Null]])
          ] = js.native
      var update: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Query extends js.Object {
    def apply[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
  @js.native
  object Subscription extends js.Object {
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

