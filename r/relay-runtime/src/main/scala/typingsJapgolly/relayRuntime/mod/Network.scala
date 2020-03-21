package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayNetworkTypesMod.FetchFunction
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): typingsJapgolly.relayRuntime.relayNetworkTypesMod.Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typingsJapgolly.relayRuntime.relayNetworkTypesMod.Network = js.native
}

