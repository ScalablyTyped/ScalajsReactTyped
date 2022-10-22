package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyConfigurationType extends StObject {
  
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined
  
  /**
    * The email address that is sending the email. The address must be either individually verified with Amazon Simple Email Service, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.undefined
  
  /**
    * The multi-factor authentication (MFA) email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined
  
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined
  
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. This identity permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType
}
object NotifyConfigurationType {
  
  inline def apply(SourceArn: ArnType): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyConfigurationType]
  }
  
  extension [Self <: NotifyConfigurationType](x: Self) {
    
    inline def setBlockEmail(value: NotifyEmailType): Self = StObject.set(x, "BlockEmail", value.asInstanceOf[js.Any])
    
    inline def setBlockEmailUndefined: Self = StObject.set(x, "BlockEmail", js.undefined)
    
    inline def setFrom(value: StringType): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setMfaEmail(value: NotifyEmailType): Self = StObject.set(x, "MfaEmail", value.asInstanceOf[js.Any])
    
    inline def setMfaEmailUndefined: Self = StObject.set(x, "MfaEmail", js.undefined)
    
    inline def setNoActionEmail(value: NotifyEmailType): Self = StObject.set(x, "NoActionEmail", value.asInstanceOf[js.Any])
    
    inline def setNoActionEmailUndefined: Self = StObject.set(x, "NoActionEmail", js.undefined)
    
    inline def setReplyTo(value: StringType): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    inline def setSourceArn(value: ArnType): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
