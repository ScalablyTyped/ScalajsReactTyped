package typingsJapgolly.apolloGraphql.schemaMod

import typingsJapgolly.apolloGraphql.buildSchemaFromSDLMod.GraphQLSchemaModule
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "buildSchemaFromSDL")
@js.native
object buildSchemaFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
}

