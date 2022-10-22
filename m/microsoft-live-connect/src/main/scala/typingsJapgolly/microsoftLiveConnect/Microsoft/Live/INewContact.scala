package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import typingsJapgolly.microsoftLiveConnect.anon.Business
import typingsJapgolly.microsoftLiveConnect.anon.Employer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new contact.
  */
trait INewContact extends StObject {
  
  /**
    * The contact's email addresses.
    */
  var emails: js.UndefOr[Business] = js.undefined
  
  /**
    * The contact's first name.
    */
  var first_name: js.UndefOr[String] = js.undefined
  
  /**
    * The contact's last name.
    */
  var last_name: js.UndefOr[String] = js.undefined
  
  /**
    * An array that contains the contact's work info.
    */
  var work: js.UndefOr[js.Array[Employer]] = js.undefined
}
object INewContact {
  
  inline def apply(): INewContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INewContact]
  }
  
  extension [Self <: INewContact](x: Self) {
    
    inline def setEmails(value: Business): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setWork(value: js.Array[Employer]): Self = StObject.set(x, "work", value.asInstanceOf[js.Any])
    
    inline def setWorkUndefined: Self = StObject.set(x, "work", js.undefined)
    
    inline def setWorkVarargs(value: Employer*): Self = StObject.set(x, "work", js.Array(value*))
  }
}
