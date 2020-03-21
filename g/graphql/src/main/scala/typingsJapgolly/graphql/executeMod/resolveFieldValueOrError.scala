package typingsJapgolly.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "resolveFieldValueOrError")
@js.native
object resolveFieldValueOrError extends js.Object {
  def apply[TSource](
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[TSource, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    resolveFn: GraphQLFieldResolver[TSource, _, StringDictionary[_]],
    source: TSource,
    info: GraphQLResolveInfo
  ): js.Error | js.Any = js.native
}

