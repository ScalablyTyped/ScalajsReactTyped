package typingsJapgolly.graphql.extendSchemaMod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/extendSchema", "extendSchema")
@js.native
object extendSchema extends js.Object {
  def apply(schema: GraphQLSchema, documentAST: DocumentNode): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, documentAST: DocumentNode, options: Options): GraphQLSchema = js.native
}

