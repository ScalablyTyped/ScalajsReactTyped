package typingsJapgolly.relayRuntime.connectionHandlerMod

import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeBefore")
@js.native
object insertEdgeBefore extends js.Object {
  def apply(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  def apply(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
}

