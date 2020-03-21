package typingsJapgolly.graphqlCompose.mod

import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.InlineFragmentNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "getProjectionFromAST")
@js.native
object getProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
}

