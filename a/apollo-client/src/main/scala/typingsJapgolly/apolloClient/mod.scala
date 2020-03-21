package typingsJapgolly.apolloClient

import typingsJapgolly.apolloClient.apolloClientMod.ApolloClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloClient[TCacheShape] protected ()
    extends typingsJapgolly.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  @js.native
  class ApolloError protected ()
    extends typingsJapgolly.apolloClient.apolloErrorMod.ApolloError {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: AnonErrorMessage) = this()
  }
  
  @js.native
  class ObservableQuery[TData, TVariables] protected ()
    extends typingsJapgolly.apolloClient.observableQueryMod.ObservableQuery[TData, TVariables] {
    def this(hasQueryManagerOptionsShouldSubscribe: AnonOptions[TVariables]) = this()
  }
  
  @js.native
  class default[TCacheShape] protected ()
    extends typingsJapgolly.apolloClient.apolloClientMod.default[TCacheShape] {
    def this(options: ApolloClientOptions[TCacheShape]) = this()
  }
  
  def isApolloError(err: js.Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
  @js.native
  object FetchType extends js.Object {
    /* 1 */ val normal: typingsJapgolly.apolloClient.typesMod.FetchType.normal with Double = js.native
    /* 3 */ val poll: typingsJapgolly.apolloClient.typesMod.FetchType.poll with Double = js.native
    /* 2 */ val refetch: typingsJapgolly.apolloClient.typesMod.FetchType.refetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.apolloClient.typesMod.FetchType with Double] = js.native
  }
  
  @js.native
  object NetworkStatus extends js.Object {
    /* 8 */ val error: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.error with Double = js.native
    /* 3 */ val fetchMore: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.fetchMore with Double = js.native
    /* 1 */ val loading: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.loading with Double = js.native
    /* 6 */ val poll: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.poll with Double = js.native
    /* 7 */ val ready: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.ready with Double = js.native
    /* 4 */ val refetch: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.refetch with Double = js.native
    /* 2 */ val setVariables: typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus.setVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.apolloClient.networkStatusMod.NetworkStatus with Double] = js.native
  }
  
}

