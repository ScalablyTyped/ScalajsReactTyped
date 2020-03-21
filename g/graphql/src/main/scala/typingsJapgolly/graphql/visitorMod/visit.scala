package typingsJapgolly.graphql.visitorMod

import typingsJapgolly.graphql.VisitorKeyMapASTKindToNod
import typingsJapgolly.graphql.astMod.ASTKindToNode
import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.astMod.ArgumentNode
import typingsJapgolly.graphql.astMod.BooleanValueNode
import typingsJapgolly.graphql.astMod.DirectiveDefinitionNode
import typingsJapgolly.graphql.astMod.DirectiveNode
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.astMod.EnumTypeDefinitionNode
import typingsJapgolly.graphql.astMod.EnumTypeExtensionNode
import typingsJapgolly.graphql.astMod.EnumValueDefinitionNode
import typingsJapgolly.graphql.astMod.EnumValueNode
import typingsJapgolly.graphql.astMod.FieldDefinitionNode
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.FloatValueNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.FragmentSpreadNode
import typingsJapgolly.graphql.astMod.InlineFragmentNode
import typingsJapgolly.graphql.astMod.InputObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InputObjectTypeExtensionNode
import typingsJapgolly.graphql.astMod.InputValueDefinitionNode
import typingsJapgolly.graphql.astMod.IntValueNode
import typingsJapgolly.graphql.astMod.InterfaceTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InterfaceTypeExtensionNode
import typingsJapgolly.graphql.astMod.ListTypeNode
import typingsJapgolly.graphql.astMod.ListValueNode
import typingsJapgolly.graphql.astMod.NameNode
import typingsJapgolly.graphql.astMod.NamedTypeNode
import typingsJapgolly.graphql.astMod.NonNullTypeNode
import typingsJapgolly.graphql.astMod.NullValueNode
import typingsJapgolly.graphql.astMod.ObjectFieldNode
import typingsJapgolly.graphql.astMod.ObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ObjectTypeExtensionNode
import typingsJapgolly.graphql.astMod.ObjectValueNode
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.astMod.OperationTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ScalarTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ScalarTypeExtensionNode
import typingsJapgolly.graphql.astMod.SchemaDefinitionNode
import typingsJapgolly.graphql.astMod.SchemaExtensionNode
import typingsJapgolly.graphql.astMod.SelectionSetNode
import typingsJapgolly.graphql.astMod.StringValueNode
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.astMod.VariableDefinitionNode
import typingsJapgolly.graphql.astMod.VariableNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/visitor", "visit")
@js.native
object visit extends js.Object {
  def apply(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def apply(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
}

