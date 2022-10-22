package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libComponentsRoomBridgeStoreMod.RoomStoreEntryDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RoomBridgeStoreEntry")
@js.native
open class RoomBridgeStoreEntry ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsRoomBridgeStoreMod.RoomBridgeStoreEntry {
  def this(doc: RoomStoreEntryDoc) = this()
}
/* static members */
object RoomBridgeStoreEntry {
  
  @JSImport("matrix-appservice-bridge", "RoomBridgeStoreEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeEntry(entry: typingsJapgolly.matrixAppserviceBridge.libComponentsRoomBridgeStoreMod.RoomBridgeStoreEntry): RoomStoreEntryDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[RoomStoreEntryDoc]
}
