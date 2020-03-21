package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "astFromValue")
@js.native
object astFromValue extends js.Object {
  def apply(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

