package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamSessionRequest extends StObject {
  
  /**
    * ARN of the channel resource
    */
  var channelArn: ChannelArn
  
  /**
    * Unique identifier for a live or previously live stream in the specified channel. If no streamId is provided, this returns the most recent stream session for the channel, if it exists.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
}
object GetStreamSessionRequest {
  
  inline def apply(channelArn: ChannelArn): GetStreamSessionRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamSessionRequest]
  }
  
  extension [Self <: GetStreamSessionRequest](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
