package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressedDestination extends StObject {
  
  /**
    * An optional value that can contain additional information about the reasons that the address was added to the suppression list for your account.
    */
  var Attributes: js.UndefOr[SuppressedDestinationAttributes] = js.undefined
  
  /**
    * The email address that is on the suppression list for your account.
    */
  var EmailAddress: typingsJapgolly.awsSdk.clientsSesv2Mod.EmailAddress
  
  /**
    * The date and time when the suppressed destination was last updated, shown in Unix time format.
    */
  var LastUpdateTime: js.Date
  
  /**
    * The reason that the address was added to the suppression list for your account.
    */
  var Reason: SuppressionListReason
}
object SuppressedDestination {
  
  inline def apply(EmailAddress: EmailAddress, LastUpdateTime: js.Date, Reason: SuppressionListReason): SuppressedDestination = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestination]
  }
  
  extension [Self <: SuppressedDestination](x: Self) {
    
    inline def setAttributes(value: SuppressedDestinationAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setReason(value: SuppressionListReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
