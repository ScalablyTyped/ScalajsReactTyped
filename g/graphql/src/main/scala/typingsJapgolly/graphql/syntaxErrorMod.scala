package typingsJapgolly.graphql

import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/syntaxError", JSImport.Namespace)
@js.native
object syntaxErrorMod extends js.Object {
  def syntaxError(source: Source, position: Double, description: String): GraphQLError = js.native
}

