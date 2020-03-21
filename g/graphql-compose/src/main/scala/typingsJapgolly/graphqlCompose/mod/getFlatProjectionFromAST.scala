package typingsJapgolly.graphqlCompose.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.InlineFragmentNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "getFlatProjectionFromAST")
@js.native
object getFlatProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
}

