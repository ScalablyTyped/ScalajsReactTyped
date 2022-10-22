package typingsJapgolly.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait receiveArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * The channel over which the data was published.
    */
  var channel: String
  
  /**
    * The published data.
    */
  var data: Any
  
  /**
    * Details about the client publishing the data.
    */
  var publishingClient: typingsJapgolly.fmWebsync.fm.websync.publishingClient
}
object receiveArgs {
  
  inline def apply(
    channel: String,
    client: client,
    clientId: String,
    data: Any,
    meta: Any,
    publishingClient: publishingClient,
    timestamp: js.Date
  ): receiveArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], publishingClient = publishingClient.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[receiveArgs]
  }
  
  extension [Self <: receiveArgs](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPublishingClient(value: publishingClient): Self = StObject.set(x, "publishingClient", value.asInstanceOf[js.Any])
  }
}
