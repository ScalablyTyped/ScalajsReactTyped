package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.ListTypeNode
import typingsJapgolly.graphql.astMod.NamedTypeNode
import typingsJapgolly.graphql.astMod.NonNullTypeNode
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "typeFromAST")
@js.native
object typeFromAST extends js.Object {
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLList[_]] = js.native
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLNonNull[_]] = js.native
}

