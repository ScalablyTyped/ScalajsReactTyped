package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMailboxDetailsResponse extends StObject {
  
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.MailboxQuota] = js.undefined
  
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.MailboxSize] = js.undefined
}
object GetMailboxDetailsResponse {
  
  inline def apply(): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
  
  extension [Self <: GetMailboxDetailsResponse](x: Self) {
    
    inline def setMailboxQuota(value: MailboxQuota): Self = StObject.set(x, "MailboxQuota", value.asInstanceOf[js.Any])
    
    inline def setMailboxQuotaUndefined: Self = StObject.set(x, "MailboxQuota", js.undefined)
    
    inline def setMailboxSize(value: MailboxSize): Self = StObject.set(x, "MailboxSize", value.asInstanceOf[js.Any])
    
    inline def setMailboxSizeUndefined: Self = StObject.set(x, "MailboxSize", js.undefined)
  }
}
