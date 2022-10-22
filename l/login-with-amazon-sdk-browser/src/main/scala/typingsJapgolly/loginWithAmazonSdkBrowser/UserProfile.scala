package typingsJapgolly.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains profile information.
  */
/* Inlined std.Partial<{  CustomerId :string,   Name :string,   PostalCode :string,   PrimaryEmail :string}> */
trait UserProfile extends StObject {
  
  var CustomerId: js.UndefOr[String] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var PostalCode: js.UndefOr[String] = js.undefined
  
  var PrimaryEmail: js.UndefOr[String] = js.undefined
}
object UserProfile {
  
  inline def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  extension [Self <: UserProfile](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "CustomerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "CustomerId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "PrimaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "PrimaryEmail", js.undefined)
  }
}
