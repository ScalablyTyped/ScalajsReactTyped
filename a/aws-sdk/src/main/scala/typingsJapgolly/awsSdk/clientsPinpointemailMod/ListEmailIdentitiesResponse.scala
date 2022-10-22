package typingsJapgolly.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEmailIdentitiesResponse extends StObject {
  
  /**
    * An array that includes all of the identities associated with your Amazon Pinpoint account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined
  
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointemailMod.NextToken] = js.undefined
}
object ListEmailIdentitiesResponse {
  
  inline def apply(): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
  
  extension [Self <: ListEmailIdentitiesResponse](x: Self) {
    
    inline def setEmailIdentities(value: IdentityInfoList): Self = StObject.set(x, "EmailIdentities", value.asInstanceOf[js.Any])
    
    inline def setEmailIdentitiesUndefined: Self = StObject.set(x, "EmailIdentities", js.undefined)
    
    inline def setEmailIdentitiesVarargs(value: IdentityInfo*): Self = StObject.set(x, "EmailIdentities", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
