package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.definitionMod.GraphQLCompositeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "doTypesOverlap")
@js.native
object doTypesOverlap extends js.Object {
  def apply(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
}

