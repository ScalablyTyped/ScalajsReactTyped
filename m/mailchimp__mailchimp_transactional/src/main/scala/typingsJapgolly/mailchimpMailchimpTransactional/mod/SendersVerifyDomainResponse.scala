package typingsJapgolly.mailchimpMailchimpTransactional.mod

import typingsJapgolly.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.already_verified
import typingsJapgolly.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.sent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersVerifyDomainResponse extends StObject {
  
  /** the domain name you provided */
  var domain: String
  
  /** the email address the verification email was sent to */
  var email: String
  
  /**
    * "sent" indicates that the verification has been sent, "already_verified" indicates that the domain
    * has already been verified with your account
    */
  var status: sent | already_verified
}
object SendersVerifyDomainResponse {
  
  inline def apply(domain: String, email: String, status: sent | already_verified): SendersVerifyDomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersVerifyDomainResponse]
  }
  
  extension [Self <: SendersVerifyDomainResponse](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: sent | already_verified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
