package typingsJapgolly.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "buildResolveInfo")
@js.native
object buildResolveInfo extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[_, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path
  ): GraphQLResolveInfo = js.native
}

