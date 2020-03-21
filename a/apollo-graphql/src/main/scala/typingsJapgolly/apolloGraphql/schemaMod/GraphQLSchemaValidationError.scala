package typingsJapgolly.apolloGraphql.schemaMod

import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typingsJapgolly.apolloGraphql.graphQLSchemaValidationErrorMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}

