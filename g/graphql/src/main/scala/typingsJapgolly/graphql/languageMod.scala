package typingsJapgolly.graphql

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
import typingsJapgolly.graphql.astMod.TypeNode
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.astMod.VariableDefinitionNode
import typingsJapgolly.graphql.astMod.VariableNode
import typingsJapgolly.graphql.directiveLocationMod._DirectiveLocation
import typingsJapgolly.graphql.kindsMod._Kind
import typingsJapgolly.graphql.lexerMod.Lexer
import typingsJapgolly.graphql.locationMod.SourceLocation
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.parserMod.ParseOptions
import typingsJapgolly.graphql.sourceMod.Location
import typingsJapgolly.graphql.tokenKindMod._TokenKind
import typingsJapgolly.graphql.typeInfoMod.TypeInfo
import typingsJapgolly.graphql.visitorMod.VisitFn
import typingsJapgolly.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Source protected ()
    extends typingsJapgolly.graphql.sourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  val BREAK: js.Any = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val Kind: _Kind = js.native
  val TokenKind: _TokenKind = js.native
  def createLexer[TOptions](source: typingsJapgolly.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def getLocation(source: typingsJapgolly.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typingsJapgolly.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsJapgolly.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsJapgolly.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsJapgolly.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printLocation(location: typingsJapgolly.graphql.astMod.Location): String = js.native
  def printSourceLocation(source: typingsJapgolly.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
}

