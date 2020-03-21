package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.AnonMaxErrors
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo,
    options: AnonMaxErrors
  ): js.Array[typingsJapgolly.graphql.graphQLErrorMod.GraphQLError] = js.native
}

