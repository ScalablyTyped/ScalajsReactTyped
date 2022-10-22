package typingsJapgolly.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesResponse extends StObject {
  
  /**
    * An object containing a set of identities and associated mappings.
    */
  var Identities: js.UndefOr[IdentitiesList] = js.undefined
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object ListIdentitiesResponse {
  
  inline def apply(): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  extension [Self <: ListIdentitiesResponse](x: Self) {
    
    inline def setIdentities(value: IdentitiesList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: IdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value*))
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
