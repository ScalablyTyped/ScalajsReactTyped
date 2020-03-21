package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.HandleFieldPayload
import typingsJapgolly.relayRuntime.relayStoreTypesMod.ReadOnlyRecordProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "ConnectionHandler")
@js.native
object ConnectionHandler extends js.Object {
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def createEdge(
    store: RecordSourceProxy,
    record: RecordProxy[js.Object],
    node: RecordProxy[js.Object],
    edgeType: String
  ): RecordProxy[js.Object] = js.native
  def deleteNode(record: RecordProxy[js.Object], nodeID: DataID): Unit = js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
  def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
  def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = js.native
}

