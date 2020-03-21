package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.relayStoreTypesMod.StoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/commitLocalUpdate", JSImport.Namespace)
@js.native
object commitLocalUpdateMod extends js.Object {
  def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = js.native
}

