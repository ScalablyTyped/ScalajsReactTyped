package typingsJapgolly.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendChannelMessageResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ID string assigned to each message.
    */
  var MessageId: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.MessageId] = js.undefined
  
  /**
    * The status of the channel message.
    */
  var Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
  
  /**
    * The ID of the SubChannel in the response.
    */
  var SubChannelId: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object SendChannelMessageResponse {
  
  inline def apply(): SendChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendChannelMessageResponse]
  }
  
  extension [Self <: SendChannelMessageResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setStatus(value: ChannelMessageStatusStructure): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
