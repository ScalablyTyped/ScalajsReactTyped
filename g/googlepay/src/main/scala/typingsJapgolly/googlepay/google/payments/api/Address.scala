package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a user's address.
  */
trait Address extends StObject {
  
  /**
    * The first line of the address.
    *
    * Will be set to empty string if the address does not have a first
    * line.
    *
    * @default ""
    */
  var address1: js.UndefOr[String] = js.undefined
  
  /**
    * The second line of the address.
    *
    * Will be set to empty string if the address does not have a second
    * line.
    *
    * @default ""
    */
  var address2: js.UndefOr[String] = js.undefined
  
  /**
    * The third line of the address.
    *
    * Will be set to empty string if the address does not have a third
    * line.
    *
    * @default ""
    */
  var address3: js.UndefOr[String] = js.undefined
  
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String
  
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String
  
  /**
    * The locality (e.g. city or town).
    */
  var locality: String
  
  /**
    * Name of the recipient at this address.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number.
    *
    * This field will only be present if the caller requested that a phone
    * number be returned.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    */
  var postalCode: String
  
  /**
    * The sorting code.
    *
    * Note: some regions do not have sorting codes. In those cases
    * this field will be set to an empty string.
    */
  var sortingCode: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    inline def setAddress3(value: String): Self = StObject.set(x, "address3", value.asInstanceOf[js.Any])
    
    inline def setAddress3Undefined: Self = StObject.set(x, "address3", js.undefined)
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    
    inline def setSortingCodeUndefined: Self = StObject.set(x, "sortingCode", js.undefined)
  }
}
