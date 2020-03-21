package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.extendSchemaMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "extendSchema")
@js.native
object extendSchema extends js.Object {
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def apply(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: Options
  ): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
}

