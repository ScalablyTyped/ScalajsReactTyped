package typingsJapgolly.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait baseResponseArgs
  extends StObject
     with baseArgs {
  
  /**
    * The singleton client.
    */
  var client: typingsJapgolly.fmWebsync.fm.websync.client
  
  /**
    * The ID of the singleton client.
    */
  var clientId: String
  
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: Any
  
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: js.Date
}
object baseResponseArgs {
  
  inline def apply(client: client, clientId: String, meta: Any, timestamp: js.Date): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseResponseArgs]
  }
  
  extension [Self <: baseResponseArgs](x: Self) {
    
    inline def setClient(value: client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
