package typingsJapgolly.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmergencyContact extends StObject {
  
  /**
    * Additional notes regarding the contact. 
    */
  var ContactNotes: js.UndefOr[typingsJapgolly.awsSdk.clientsShieldMod.ContactNotes] = js.undefined
  
  /**
    * The email address for the contact.
    */
  var EmailAddress: typingsJapgolly.awsSdk.clientsShieldMod.EmailAddress
  
  /**
    * The phone number for the contact.
    */
  var PhoneNumber: js.UndefOr[typingsJapgolly.awsSdk.clientsShieldMod.PhoneNumber] = js.undefined
}
object EmergencyContact {
  
  inline def apply(EmailAddress: EmailAddress): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmergencyContact]
  }
  
  extension [Self <: EmergencyContact](x: Self) {
    
    inline def setContactNotes(value: ContactNotes): Self = StObject.set(x, "ContactNotes", value.asInstanceOf[js.Any])
    
    inline def setContactNotesUndefined: Self = StObject.set(x, "ContactNotes", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
