package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createRequestDescriptor")
@js.native
object createRequestDescriptor extends js.Object {
  def apply(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}

