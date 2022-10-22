package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsStrings.closed
import typingsJapgolly.screeps.screepsStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomStatusPermanent
  extends StObject
     with RoomStatus {
  
  var status: normal | closed
  
  var timestamp: Null
}
object RoomStatusPermanent {
  
  inline def apply(status: normal | closed, timestamp: Null): RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatusPermanent]
  }
  
  extension [Self <: RoomStatusPermanent](x: Self) {
    
    inline def setStatus(value: normal | closed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Null): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
