package typingsJapgolly.graphql

import typingsJapgolly.graphql.introspectionQueryMod.IntrospectionQuery_
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildClientSchema", JSImport.Namespace)
@js.native
object buildClientSchemaMod extends js.Object {
  def buildClientSchema(introspection: IntrospectionQuery_): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): GraphQLSchema = js.native
  type Options = GraphQLSchemaValidationOptions
}

