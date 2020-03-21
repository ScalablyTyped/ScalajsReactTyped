package typingsJapgolly.graphql

import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  def assertValidSchema(schema: GraphQLSchema): Unit = js.native
  def validateSchema(schema: GraphQLSchema): js.Array[GraphQLError] = js.native
}

