package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleRequest extends StObject {
  
  /**
    * Id of the channel whose schedule is being deleted.
    */
  var ChannelId: string
}
object DeleteScheduleRequest {
  
  inline def apply(ChannelId: string): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
  
  extension [Self <: DeleteScheduleRequest](x: Self) {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
