package typingsJapgolly.graphql.buildASTSchemaMod

import typingsJapgolly.graphql.parserMod.ParseOptions
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def apply(source: Source): GraphQLSchema = js.native
  def apply(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
}

