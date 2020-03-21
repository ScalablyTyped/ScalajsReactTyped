package typingsJapgolly.apolloGraphql.mod

import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typingsJapgolly.apolloGraphql.schemaMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}

