package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailAssessmentRequest
  extends StObject
     with ThreatAssessmentRequest {
  
  /**
    * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender,
    * advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox,
    * autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
    */
  var destinationRoutingReason: js.UndefOr[NullableOption[MailDestinationRoutingReason]] = js.undefined
  
  // The resource URI of the mail message for assessment.
  var messageUri: js.UndefOr[String] = js.undefined
  
  // The mail recipient whose policies are used to assess the mail.
  var recipientEmail: js.UndefOr[String] = js.undefined
}
object MailAssessmentRequest {
  
  inline def apply(): MailAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailAssessmentRequest]
  }
  
  extension [Self <: MailAssessmentRequest](x: Self) {
    
    inline def setDestinationRoutingReason(value: NullableOption[MailDestinationRoutingReason]): Self = StObject.set(x, "destinationRoutingReason", value.asInstanceOf[js.Any])
    
    inline def setDestinationRoutingReasonNull: Self = StObject.set(x, "destinationRoutingReason", null)
    
    inline def setDestinationRoutingReasonUndefined: Self = StObject.set(x, "destinationRoutingReason", js.undefined)
    
    inline def setMessageUri(value: String): Self = StObject.set(x, "messageUri", value.asInstanceOf[js.Any])
    
    inline def setMessageUriUndefined: Self = StObject.set(x, "messageUri", js.undefined)
    
    inline def setRecipientEmail(value: String): Self = StObject.set(x, "recipientEmail", value.asInstanceOf[js.Any])
    
    inline def setRecipientEmailUndefined: Self = StObject.set(x, "recipientEmail", js.undefined)
  }
}
