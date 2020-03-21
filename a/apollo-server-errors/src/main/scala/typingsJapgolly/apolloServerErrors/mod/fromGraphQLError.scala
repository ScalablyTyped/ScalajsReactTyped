package typingsJapgolly.apolloServerErrors.mod

import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "fromGraphQLError")
@js.native
object fromGraphQLError extends js.Object {
  def apply(error: GraphQLError): ApolloError = js.native
  def apply(error: GraphQLError, options: ErrorOptions): ApolloError = js.native
}

