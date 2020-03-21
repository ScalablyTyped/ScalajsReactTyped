package typingsJapgolly.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visitorMod {
  type ASTVisitor = typingsJapgolly.graphql.visitorMod.Visitor[
    typingsJapgolly.graphql.astMod.ASTKindToNode, 
    typingsJapgolly.graphql.astMod.EnumValueDefinitionNode | typingsJapgolly.graphql.astMod.ObjectValueNode | typingsJapgolly.graphql.astMod.FieldDefinitionNode | typingsJapgolly.graphql.astMod.SchemaDefinitionNode | typingsJapgolly.graphql.astMod.InputObjectTypeDefinitionNode | typingsJapgolly.graphql.astMod.DocumentNode | typingsJapgolly.graphql.astMod.DirectiveDefinitionNode | typingsJapgolly.graphql.astMod.InputValueDefinitionNode | typingsJapgolly.graphql.astMod.ListValueNode | typingsJapgolly.graphql.astMod.ScalarTypeDefinitionNode | typingsJapgolly.graphql.astMod.IntValueNode | typingsJapgolly.graphql.astMod.OperationDefinitionNode | typingsJapgolly.graphql.astMod.ArgumentNode | typingsJapgolly.graphql.astMod.FragmentDefinitionNode | typingsJapgolly.graphql.astMod.OperationTypeDefinitionNode | typingsJapgolly.graphql.astMod.FieldNode | typingsJapgolly.graphql.astMod.StringValueNode | typingsJapgolly.graphql.astMod.NameNode | typingsJapgolly.graphql.astMod.ObjectFieldNode | typingsJapgolly.graphql.astMod.EnumValueNode | typingsJapgolly.graphql.astMod.SchemaExtensionNode | typingsJapgolly.graphql.astMod.UnionTypeExtensionNode | typingsJapgolly.graphql.astMod.VariableDefinitionNode | typingsJapgolly.graphql.astMod.VariableNode | typingsJapgolly.graphql.astMod.ObjectTypeDefinitionNode | typingsJapgolly.graphql.astMod.EnumTypeExtensionNode | typingsJapgolly.graphql.astMod.InterfaceTypeDefinitionNode | typingsJapgolly.graphql.astMod.FloatValueNode | typingsJapgolly.graphql.astMod.NonNullTypeNode | typingsJapgolly.graphql.astMod.DirectiveNode | typingsJapgolly.graphql.astMod.SelectionSetNode | typingsJapgolly.graphql.astMod.InputObjectTypeExtensionNode | typingsJapgolly.graphql.astMod.ScalarTypeExtensionNode | typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode | typingsJapgolly.graphql.astMod.NullValueNode | typingsJapgolly.graphql.astMod.InterfaceTypeExtensionNode | typingsJapgolly.graphql.astMod.InlineFragmentNode | typingsJapgolly.graphql.astMod.EnumTypeDefinitionNode | typingsJapgolly.graphql.astMod.NamedTypeNode | typingsJapgolly.graphql.astMod.BooleanValueNode | typingsJapgolly.graphql.astMod.ListTypeNode | typingsJapgolly.graphql.astMod.ObjectTypeExtensionNode | typingsJapgolly.graphql.astMod.FragmentSpreadNode
  ]
  // TODO: Should be `[]`, but that requires TypeScript@3
  type EmptyTuple = js.Array[scala.Nothing]
  type EnterLeaveVisitor[KindToNode, Nodes] = typingsJapgolly.graphql.visitorMod.EnterLeave[
    (typingsJapgolly.graphql.visitorMod.VisitFn[Nodes, Nodes]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>}
    */ typingsJapgolly.graphql.graphqlStrings.EnterLeaveVisitor with KindToNode)
  ]
  type ShapeMapVisitor[KindToNode, Nodes] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof KindToNode ]:? graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]> | graphql.graphql/language/visitor.EnterLeave<graphql.graphql/language/visitor.VisitFn<Nodes, KindToNode[K]>>}
    */ typingsJapgolly.graphql.graphqlStrings.ShapeMapVisitor with js.Any
  type VisitFn[TAnyNode, TVisitedNode] = js.Function5[
    /* node */ TVisitedNode, 
    /* key */ js.UndefOr[java.lang.String | scala.Double], 
    /* parent */ js.UndefOr[TAnyNode | js.Array[TAnyNode]], 
    /* path */ js.Array[java.lang.String | scala.Double], 
    /* ancestors */ js.Array[TAnyNode | js.Array[TAnyNode]], 
    js.Any
  ]
  type Visitor[KindToNode, Nodes] = (typingsJapgolly.graphql.visitorMod.EnterLeaveVisitor[KindToNode, Nodes]) | (typingsJapgolly.graphql.visitorMod.ShapeMapVisitor[KindToNode, Nodes])
  type VisitorKeyMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.ReadonlyArray<keyof T[P]>}
    */ typingsJapgolly.graphql.graphqlStrings.VisitorKeyMap with js.Any
}
