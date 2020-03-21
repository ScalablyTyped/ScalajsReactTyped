package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayNetworkTypesMod.FetchFunction
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.Network
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayNetwork", JSImport.Namespace)
@js.native
object relayNetworkMod extends js.Object {
  @js.native
  object RelayNetwork extends js.Object {
    def create(fetchFn: FetchFunction): Network = js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
  }
  
}

