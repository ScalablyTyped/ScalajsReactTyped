package typingsJapgolly.relayRuntime.connectionHandlerMod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReadOnlyRecordProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "getConnection")
@js.native
object getConnection extends js.Object {
  def apply(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def apply(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
}

