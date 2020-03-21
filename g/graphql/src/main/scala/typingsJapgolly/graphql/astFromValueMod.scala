package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/astFromValue", JSImport.Namespace)
@js.native
object astFromValueMod extends js.Object {
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

