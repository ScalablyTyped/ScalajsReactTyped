package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityFeedbackForwardingEnabledRequest extends StObject {
  
  /**
    * Sets whether Amazon SES will forward bounce and complaint notifications as email. true specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic publishing otherwise specified. false specifies that Amazon SES will publish bounce and complaint notifications only through Amazon SNS. This value can only be set to false when Amazon SNS topics are set for both Bounce and Complaint notification types.
    */
  var ForwardingEnabled: Enabled
  
  /**
    * The identity for which to set bounce and complaint notification forwarding. Examples: user@example.com, example.com.
    */
  var Identity: typingsJapgolly.awsSdk.clientsSesMod.Identity
}
object SetIdentityFeedbackForwardingEnabledRequest {
  
  inline def apply(ForwardingEnabled: Enabled, Identity: Identity): SetIdentityFeedbackForwardingEnabledRequest = {
    val __obj = js.Dynamic.literal(ForwardingEnabled = ForwardingEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityFeedbackForwardingEnabledRequest]
  }
  
  extension [Self <: SetIdentityFeedbackForwardingEnabledRequest](x: Self) {
    
    inline def setForwardingEnabled(value: Enabled): Self = StObject.set(x, "ForwardingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
  }
}
