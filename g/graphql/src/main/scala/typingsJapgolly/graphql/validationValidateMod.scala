package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.graphql.typeInfoMod.TypeInfo
import typingsJapgolly.graphql.validationContextMod.SDLValidationRule
import typingsJapgolly.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/validate", JSImport.Namespace)
@js.native
object validationValidateMod extends js.Object {
  def assertValidSDL(documentAST: DocumentNode): js.UndefOr[scala.Nothing] = js.native
  def assertValidSDLExtension(documentAST: DocumentNode, schema: GraphQLSchema): js.UndefOr[scala.Nothing] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo,
    options: AnonMaxErrors
  ): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode, schemaToExtend: Maybe[GraphQLSchema]): js.Array[GraphQLError] = js.native
  def validateSDL(
    documentAST: DocumentNode,
    schemaToExtend: Maybe[GraphQLSchema],
    rules: js.Array[SDLValidationRule]
  ): js.Array[GraphQLError] = js.native
}

