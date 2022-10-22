package typingsJapgolly.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait connectCompleteArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean
}
object connectCompleteArgs {
  
  inline def apply(client: client, clientId: String, isReconnect: Boolean, meta: Any, timestamp: js.Date): connectCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectCompleteArgs]
  }
  
  extension [Self <: connectCompleteArgs](x: Self) {
    
    inline def setIsReconnect(value: Boolean): Self = StObject.set(x, "isReconnect", value.asInstanceOf[js.Any])
  }
}
