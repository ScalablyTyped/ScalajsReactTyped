package typingsJapgolly.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlConfig.typesMod.IntrospectionResult
import typingsJapgolly.graphqlRequest.mod.GraphQLClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions/endpoints/EndpointsExtension", "GraphQLEndpoint")
@js.native
class GraphQLEndpoint protected () extends js.Object {
  def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  var headers: StringDictionary[String] = js.native
  var subscription: GraphQLConfigEnpointsSubscription = js.native
  var url: String = js.native
  def getClient(): GraphQLClient = js.native
  def getClient(clientOptions: js.Any): GraphQLClient = js.native
  def resolveIntrospection(): js.Promise[IntrospectionResult] = js.native
  def resolveSchema(): js.Promise[GraphQLSchema] = js.native
  def resolveSchemaSDL(): js.Promise[String] = js.native
}

