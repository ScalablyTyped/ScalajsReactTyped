package typingsJapgolly.reactRelay.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.AnonRelayRelayRefetchProp
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createRefetchContainer")
@js.native
object createRefetchContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with AnonRelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
}

