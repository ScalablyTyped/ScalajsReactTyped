package typingsJapgolly.reactRelay.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.AnonRelayRelayPaginationProp
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with AnonRelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}

