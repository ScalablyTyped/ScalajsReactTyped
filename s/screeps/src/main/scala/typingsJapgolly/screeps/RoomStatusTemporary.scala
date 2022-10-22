package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.novice
import typingsJapgolly.screeps.screepsStrings.respawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomStatusTemporary
  extends StObject
     with RoomStatus {
  
  var status: novice | respawn
  
  var timestamp: Double
}
object RoomStatusTemporary {
  
  inline def apply(status: novice | respawn, timestamp: Double): RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatusTemporary]
  }
  
  extension [Self <: RoomStatusTemporary](x: Self) {
    
    inline def setStatus(value: novice | respawn): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
