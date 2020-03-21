package typingsJapgolly.apolloClient

import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/errors/ApolloError", JSImport.Namespace)
@js.native
object apolloErrorMod extends js.Object {
  @js.native
  class ApolloError protected () extends Error {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: AnonErrorMessage) = this()
    var extraInfo: js.Any = js.native
    var graphQLErrors: js.Array[GraphQLError] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var networkError: js.Error | Null = js.native
  }
  
  def isApolloError(err: js.Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
}

