package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.findBreakingChangesMod.BreakingChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "findBreakingChanges")
@js.native
object findBreakingChanges extends js.Object {
  def apply(
    oldSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsJapgolly.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
}

