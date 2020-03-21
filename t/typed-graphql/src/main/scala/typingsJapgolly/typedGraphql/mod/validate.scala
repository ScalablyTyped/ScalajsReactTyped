package typingsJapgolly.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: GraphQLSchema, ast: Document): js.Array[js.Error] = js.native
  def apply(schema: GraphQLSchema, ast: Document, rules: js.Array[_]): js.Array[js.Error] = js.native
}

