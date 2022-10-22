package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsModeratedByAppInstanceUserResponse extends StObject {
  
  /**
    * The moderated channels in the request.
    */
  var Channels: js.UndefOr[ChannelModeratedByAppInstanceUserSummaryList] = js.undefined
  
  /**
    * The token returned from previous API requests until the number of channels moderated by the user is reached.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.NextToken] = js.undefined
}
object ListChannelsModeratedByAppInstanceUserResponse {
  
  inline def apply(): ListChannelsModeratedByAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserResponse]
  }
  
  extension [Self <: ListChannelsModeratedByAppInstanceUserResponse](x: Self) {
    
    inline def setChannels(value: ChannelModeratedByAppInstanceUserSummaryList): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: ChannelModeratedByAppInstanceUserSummary*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
