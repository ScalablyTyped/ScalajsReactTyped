package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.graphql.typeInfoMod.TypeInfo
import typingsJapgolly.graphql.validationContextMod.ASTValidationContext
import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.validationContextMod.ValidationRule
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  @js.native
  class ValidationContext protected ()
    extends typingsJapgolly.graphql.validationContextMod.ValidationContext {
    def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
    def this(
      schema: GraphQLSchema,
      ast: DocumentNode,
      typeInfo: TypeInfo,
      onError: js.Function1[/* err */ GraphQLError, Unit]
    ) = this()
  }
  
  val specifiedRules: js.Array[ValidationRule] = js.native
  def ExecutableDefinitionsRule(context: ASTValidationContext): ASTVisitor = js.native
  def FieldsOnCorrectTypeRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def FragmentsOnCompositeTypesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownFragmentNamesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
  def LoneSchemaDefinitionRule(context: SDLValidationContext): ASTVisitor = js.native
  def NoFragmentCyclesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUndefinedVariablesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedFragmentsRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedVariablesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def OverlappingFieldsCanBeMergedRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def PossibleFragmentSpreadsRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def PossibleTypeExtensionsRule(context: SDLValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def ScalarLeafsRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def SingleFieldSubscriptionsRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueDirectiveNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueEnumValueNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def UniqueFieldDefinitionNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueOperationTypesRule(context: SDLValidationContext): ASTVisitor = js.native
  def UniqueTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def ValuesOfCorrectTypeRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesAreInputTypesRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesInAllowedPositionRule(context: typingsJapgolly.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
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
}

