package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getRequest")
@js.native
object getRequest extends js.Object {
  def apply(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
}

