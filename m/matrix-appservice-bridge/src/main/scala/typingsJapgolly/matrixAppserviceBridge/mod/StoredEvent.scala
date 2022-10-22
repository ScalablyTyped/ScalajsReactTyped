package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libModelsEventsEventMod.StoredEventDoc
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "StoredEvent")
@js.native
open class StoredEvent protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libModelsEventsEventMod.StoredEvent {
  /**
    * Create a store event.
    * @param roomId The matrix room ID
    * @param eventId The matrix event ID
    * @param remoteRoomId The remote room ID
    * @param remoteEventId The remote event ID
    * @param _extras Any extra data that may be included with the event.
    */
  def this(roomId: String, eventId: String, remoteRoomId: String, remoteEventId: String) = this()
  def this(
    roomId: String,
    eventId: String,
    remoteRoomId: String,
    remoteEventId: String,
    _extras: Record[String, Any]
  ) = this()
}
/* static members */
object StoredEvent {
  
  @JSImport("matrix-appservice-bridge", "StoredEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set data about this event from a serialized data object.
    * @param data The serialized data
    */
  inline def deserialize(data: StoredEventDoc): typingsJapgolly.matrixAppserviceBridge.libModelsEventsEventMod.StoredEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matrixAppserviceBridge.libModelsEventsEventMod.StoredEvent]
}
