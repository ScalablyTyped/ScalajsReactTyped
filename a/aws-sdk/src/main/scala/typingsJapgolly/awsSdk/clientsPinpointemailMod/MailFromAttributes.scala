package typingsJapgolly.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailFromAttributes extends StObject {
  
  /**
    * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to UseDefaultValue, Amazon Pinpoint uses amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, Amazon Pinpoint returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMxFailure: typingsJapgolly.awsSdk.clientsPinpointemailMod.BehaviorOnMxFailure
  
  /**
    * The name of a domain that an email identity uses as a custom MAIL FROM domain.
    */
  var MailFromDomain: MailFromDomainName
  
  /**
    * The status of the MAIL FROM domain. This status can have the following values:    PENDING – Amazon Pinpoint hasn't started searching for the MX record yet.    SUCCESS – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.    FAILED – Amazon Pinpoint can't find the required MX record, or the record no longer exists.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.  
    */
  var MailFromDomainStatus: typingsJapgolly.awsSdk.clientsPinpointemailMod.MailFromDomainStatus
}
object MailFromAttributes {
  
  inline def apply(
    BehaviorOnMxFailure: BehaviorOnMxFailure,
    MailFromDomain: MailFromDomainName,
    MailFromDomainStatus: MailFromDomainStatus
  ): MailFromAttributes = {
    val __obj = js.Dynamic.literal(BehaviorOnMxFailure = BehaviorOnMxFailure.asInstanceOf[js.Any], MailFromDomain = MailFromDomain.asInstanceOf[js.Any], MailFromDomainStatus = MailFromDomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromAttributes]
  }
  
  extension [Self <: MailFromAttributes](x: Self) {
    
    inline def setBehaviorOnMxFailure(value: BehaviorOnMxFailure): Self = StObject.set(x, "BehaviorOnMxFailure", value.asInstanceOf[js.Any])
    
    inline def setMailFromDomain(value: MailFromDomainName): Self = StObject.set(x, "MailFromDomain", value.asInstanceOf[js.Any])
    
    inline def setMailFromDomainStatus(value: MailFromDomainStatus): Self = StObject.set(x, "MailFromDomainStatus", value.asInstanceOf[js.Any])
  }
}
