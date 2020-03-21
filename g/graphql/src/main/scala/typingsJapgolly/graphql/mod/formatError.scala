package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

