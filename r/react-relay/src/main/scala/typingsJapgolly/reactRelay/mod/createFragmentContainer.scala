package typingsJapgolly.reactRelay.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.AnonRelay
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  def apply[Props](Component: ComponentType[Props with AnonRelay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = js.native
}

