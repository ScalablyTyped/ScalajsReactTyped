package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelReadMarkerResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateChannelReadMarkerResponse {
  
  inline def apply(): UpdateChannelReadMarkerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelReadMarkerResponse]
  }
  
  extension [Self <: UpdateChannelReadMarkerResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
  }
}
