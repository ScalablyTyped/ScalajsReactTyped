package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelMembershipsForAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUsers
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The maximum number of users that you want returned.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.MaxResults] = js.undefined
  
  /**
    * The token returned from previous API requests until the number of channel memberships is reached.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.NextToken] = js.undefined
}
object ListChannelMembershipsForAppInstanceUserRequest {
  
  inline def apply(): ListChannelMembershipsForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserRequest]
  }
  
  extension [Self <: ListChannelMembershipsForAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
