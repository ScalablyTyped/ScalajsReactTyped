package typingsJapgolly.relayRuntime.connectionHandlerMod

import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "buildConnectionEdge")
@js.native
object buildConnectionEdge extends js.Object {
  def apply(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def apply(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
}

