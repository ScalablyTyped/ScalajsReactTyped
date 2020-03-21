package typingsJapgolly.relayRuntime.relayDeclarativeMutationConfigMod

import typingsJapgolly.relayRuntime.AnonOptimisticUpdater
import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
@js.native
object convert extends js.Object {
  def apply(configs: js.Array[DeclarativeMutationConfig], request: ConcreteRequest): AnonOptimisticUpdater = js.native
  def apply(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object]
  ): AnonOptimisticUpdater = js.native
  def apply(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object],
    updater: SelectorStoreUpdater[js.Object]
  ): AnonOptimisticUpdater = js.native
}

