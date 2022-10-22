package typingsJapgolly.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenRequest extends StObject {
  
  /**
    *  The name of the domain that is in scope for the generated authorization token. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The time, in seconds, that the generated authorization token is valid. Valid values are 0 and any number between 900 (15 minutes) and 43200 (12 hours). A value of 0 will set the expiration of the authorization token to the same expiration of the user's role's temporary credentials.
    */
  var durationSeconds: js.UndefOr[AuthorizationTokenDurationSeconds] = js.undefined
}
object GetAuthorizationTokenRequest {
  
  inline def apply(domain: DomainName): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  
  extension [Self <: GetAuthorizationTokenRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setDurationSeconds(value: AuthorizationTokenDurationSeconds): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
  }
}
