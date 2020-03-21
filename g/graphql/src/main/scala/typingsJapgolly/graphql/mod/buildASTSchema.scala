package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.buildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
}

