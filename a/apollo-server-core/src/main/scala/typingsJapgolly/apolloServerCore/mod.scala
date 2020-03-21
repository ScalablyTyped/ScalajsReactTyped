package typingsJapgolly.apolloServerCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsJapgolly.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsJapgolly.apolloServerCore.runHttpQueryMod.HttpQueryRequest
import typingsJapgolly.apolloServerCore.runHttpQueryMod.HttpQueryResponse
import typingsJapgolly.apolloServerCore.typesMod.Config
import typingsJapgolly.apolloServerEnv.mod.Request
import typingsJapgolly.apolloServerErrors.AnonDebug
import typingsJapgolly.apolloServerErrors.ErrorextensionsRecordstri
import typingsJapgolly.apolloServerErrors.ErrorextensionsRecordstriExtensions
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphql.mod.GraphQLScalarType
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.std.Record
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.ApolloError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, extensions: Record[String, _]) = this()
  }
  
  @js.native
  class ApolloServerBase protected ()
    extends typingsJapgolly.apolloServerCore.apolloServerMod.ApolloServerBase {
    def this(config: Config) = this()
  }
  
  @js.native
  class AuthenticationError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.AuthenticationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ForbiddenError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.ForbiddenError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLExtension[TContext] ()
    extends typingsJapgolly.graphqlExtensions.mod.GraphQLExtension[TContext]
  
  @js.native
  class HttpQueryError protected ()
    extends typingsJapgolly.apolloServerCore.runHttpQueryMod.HttpQueryError {
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  }
  
  @js.native
  class InvalidGraphQLRequestError () extends GraphQLError
  
  @js.native
  class SyntaxError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.SyntaxError {
    def this(message: String) = this()
  }
  
  @js.native
  class UserInputError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.UserInputError {
    def this(message: String) = this()
    def this(message: String, properties: Record[String, _]) = this()
  }
  
  @js.native
  class ValidationError protected ()
    extends typingsJapgolly.apolloServerErrors.mod.ValidationError {
    def this(message: String) = this()
  }
  
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val processFileUploads: js.UndefOr[FnCall] = js.native
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  def formatApolloErrors(errors: js.Array[js.Error]): js.Array[typingsJapgolly.apolloServerErrors.mod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[js.Error], options: AnonDebug): js.Array[typingsJapgolly.apolloServerErrors.mod.ApolloError] = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def resolveGraphqlOptions(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def resolveGraphqlOptions(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def toApolloError(error: ErrorextensionsRecordstri): ErrorextensionsRecordstriExtensions = js.native
  def toApolloError(error: ErrorextensionsRecordstri, code: String): ErrorextensionsRecordstriExtensions = js.native
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: AnonEditorcursorShape = js.native
    var version: String = js.native
  }
  
}

