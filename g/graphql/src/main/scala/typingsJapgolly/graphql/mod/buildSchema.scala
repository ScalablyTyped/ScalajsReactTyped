package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsJapgolly.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsJapgolly.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typingsJapgolly.graphql.schemaMod.GraphQLSchema = js.native
}

