package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderContact extends StObject {
  
  /** Free-form information about this contact. It could be any information related to this contact in addition to type, title, name, and signature user profile ID. */
  var contactInfo: js.UndefOr[String] = js.undefined
  
  /** Name of this contact. */
  var contactName: js.UndefOr[String] = js.undefined
  
  /** Title of this contact. */
  var contactTitle: js.UndefOr[String] = js.undefined
  
  /** Type of this contact. */
  var contactType: js.UndefOr[String] = js.undefined
  
  /** ID of the user profile containing the signature that will be embedded into order documents. */
  var signatureUserProfileId: js.UndefOr[String] = js.undefined
}
object OrderContact {
  
  inline def apply(): OrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderContact]
  }
  
  extension [Self <: OrderContact](x: Self) {
    
    inline def setContactInfo(value: String): Self = StObject.set(x, "contactInfo", value.asInstanceOf[js.Any])
    
    inline def setContactInfoUndefined: Self = StObject.set(x, "contactInfo", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
    
    inline def setContactTitleUndefined: Self = StObject.set(x, "contactTitle", js.undefined)
    
    inline def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    inline def setSignatureUserProfileId(value: String): Self = StObject.set(x, "signatureUserProfileId", value.asInstanceOf[js.Any])
    
    inline def setSignatureUserProfileIdUndefined: Self = StObject.set(x, "signatureUserProfileId", js.undefined)
  }
}
