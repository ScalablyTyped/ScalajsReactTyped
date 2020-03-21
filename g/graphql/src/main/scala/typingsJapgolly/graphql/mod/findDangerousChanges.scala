package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.findBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findDangerousChanges")
@js.native
object findDangerousChanges extends js.Object {
  def apply(
    oldSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
}

