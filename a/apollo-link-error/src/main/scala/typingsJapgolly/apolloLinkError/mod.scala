package typingsJapgolly.apolloLinkError

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.apolloLink.typesMod.NextLink
import typingsJapgolly.apolloLink.typesMod.Operation
import typingsJapgolly.apolloLinkError.mod.ErrorLink.ErrorHandler
import typingsJapgolly.apolloLinkHttpCommon.mod.ServerError
import typingsJapgolly.apolloLinkHttpCommon.mod.ServerParseError
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Record
import typingsJapgolly.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ErrorLink protected () extends ApolloLink {
    def this(errorHandler: ErrorHandler) = this()
    var link: js.Any = js.native
  }
  
  @js.native
  trait ErrorResponse extends js.Object {
    @JSName("forward")
    var forward_Original: NextLink = js.native
    var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
    var networkError: js.UndefOr[js.Error | ServerError | ServerParseError] = js.native
    var operation: Operation = js.native
    var response: js.UndefOr[ExecutionResult[ExecutionResultDataDefault]] = js.native
    def forward(operation: Operation): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
  }
  
  def onError(errorHandler: ErrorHandler): ApolloLink = js.native
  @js.native
  object ErrorLink extends js.Object {
    type ErrorHandler = js.Function1[
        /* error */ ErrorResponse, 
        (Observable[
          FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
        ]) | Unit
      ]
  }
  
}

