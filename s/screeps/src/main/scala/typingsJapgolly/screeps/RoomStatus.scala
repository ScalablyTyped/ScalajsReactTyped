package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.closed
import typingsJapgolly.screeps.screepsStrings.normal
import typingsJapgolly.screeps.screepsStrings.novice
import typingsJapgolly.screeps.screepsStrings.respawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.screeps.RoomStatusPermanent
  - typingsJapgolly.screeps.RoomStatusTemporary
*/
trait RoomStatus extends StObject
object RoomStatus {
  
  inline def RoomStatusPermanent(status: normal | closed, timestamp: Null): typingsJapgolly.screeps.RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.screeps.RoomStatusPermanent]
  }
  
  inline def RoomStatusTemporary(status: novice | respawn, timestamp: Double): typingsJapgolly.screeps.RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.screeps.RoomStatusTemporary]
  }
}
