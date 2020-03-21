package typingsJapgolly.graphql.buildASTSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DirectiveDefinitionNode
import typingsJapgolly.graphql.astMod.EnumValueDefinitionNode
import typingsJapgolly.graphql.astMod.FieldDefinitionNode
import typingsJapgolly.graphql.astMod.InputValueDefinitionNode
import typingsJapgolly.graphql.astMod.NamedTypeNode
import typingsJapgolly.graphql.astMod.TypeDefinitionNode
import typingsJapgolly.graphql.astMod.TypeNode
import typingsJapgolly.graphql.definitionMod.GraphQLArgumentConfig
import typingsJapgolly.graphql.definitionMod.GraphQLEnumValueConfig
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfig
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldConfig
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "ASTDefinitionBuilder")
@js.native
class ASTDefinitionBuilder protected () extends js.Object {
  def this(options: Maybe[BuildSchemaOptions], resolveType: TypeResolver) = this()
  def buildArg(value: InputValueDefinitionNode): GraphQLArgumentConfig = js.native
  def buildDirective(directive: DirectiveDefinitionNode): GraphQLDirective = js.native
  def buildEnumValue(value: EnumValueDefinitionNode): GraphQLEnumValueConfig = js.native
  def buildField(field: FieldDefinitionNode): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def buildInputField(value: InputValueDefinitionNode): GraphQLInputFieldConfig = js.native
  def buildType(node: NamedTypeNode): GraphQLNamedType = js.native
  def buildType(node: TypeDefinitionNode): GraphQLNamedType = js.native
  def getNamedType(node: NamedTypeNode): GraphQLNamedType = js.native
  def getWrappedType(node: TypeNode): GraphQLType = js.native
}

