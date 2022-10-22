package typingsJapgolly.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupDeveloperIdentityResponse extends StObject {
  
  /**
    * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.
    */
  var DeveloperUserIdentifierList: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityMod.DeveloperUserIdentifierList] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object LookupDeveloperIdentityResponse {
  
  inline def apply(): LookupDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDeveloperIdentityResponse]
  }
  
  extension [Self <: LookupDeveloperIdentityResponse](x: Self) {
    
    inline def setDeveloperUserIdentifierList(value: DeveloperUserIdentifierList): Self = StObject.set(x, "DeveloperUserIdentifierList", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUserIdentifierListUndefined: Self = StObject.set(x, "DeveloperUserIdentifierList", js.undefined)
    
    inline def setDeveloperUserIdentifierListVarargs(value: DeveloperUserIdentifier*): Self = StObject.set(x, "DeveloperUserIdentifierList", js.Array(value*))
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
