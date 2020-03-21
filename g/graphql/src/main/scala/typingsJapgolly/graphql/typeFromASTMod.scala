package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.ListTypeNode
import typingsJapgolly.graphql.astMod.NamedTypeNode
import typingsJapgolly.graphql.astMod.NonNullTypeNode
import typingsJapgolly.graphql.definitionMod.GraphQLList
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLNonNull
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
}

