package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", JSImport.Namespace)
@js.native
object relayModernOperationDescriptorMod extends js.Object {
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}

