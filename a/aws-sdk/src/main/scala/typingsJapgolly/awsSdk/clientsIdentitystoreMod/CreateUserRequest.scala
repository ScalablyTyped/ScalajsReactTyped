package typingsJapgolly.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserRequest extends StObject {
  
  /**
    * A list of Address objects containing addresses associated with the user.
    */
  var Addresses: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.Addresses] = js.undefined
  
  /**
    * A string containing the user's name. This value is typically formatted for display when the user is referenced. For example, "John Doe."
    */
  var DisplayName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A list of Email objects containing email addresses associated with the user.
    */
  var Emails: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.Emails] = js.undefined
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typingsJapgolly.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * A string containing the user's geographical region or location.
    */
  var Locale: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * An object containing the user's name.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.Name] = js.undefined
  
  /**
    * A string containing an alternate name for the user.
    */
  var NickName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A list of PhoneNumber objects containing phone numbers associated with the user.
    */
  var PhoneNumbers: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.PhoneNumbers] = js.undefined
  
  /**
    * A string containing the preferred language of the user. For example, "American English" or "en-us."
    */
  var PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing a URL that may be associated with the user.
    */
  var ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the user's time zone.
    */
  var Timezone: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the user's title. Possible values are left unspecified given that they depend on each customer's specific needs.
    */
  var Title: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
    */
  var UserName: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.UserName] = js.undefined
  
  /**
    * A string indicating the user's type. Possible values depend on each customer's specific needs, so they are left unspecified.
    */
  var UserType: js.UndefOr[SensitiveStringType] = js.undefined
}
object CreateUserRequest {
  
  inline def apply(IdentityStoreId: IdentityStoreId): CreateUserRequest = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  extension [Self <: CreateUserRequest](x: Self) {
    
    inline def setAddresses(value: Addresses): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setDisplayName(value: SensitiveStringType): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmails(value: Emails): Self = StObject.set(x, "Emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "Emails", js.undefined)
    
    inline def setEmailsVarargs(value: Email*): Self = StObject.set(x, "Emails", js.Array(value*))
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: SensitiveStringType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNickName(value: SensitiveStringType): Self = StObject.set(x, "NickName", value.asInstanceOf[js.Any])
    
    inline def setNickNameUndefined: Self = StObject.set(x, "NickName", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumbers): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
    
    inline def setPreferredLanguage(value: SensitiveStringType): Self = StObject.set(x, "PreferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "PreferredLanguage", js.undefined)
    
    inline def setProfileUrl(value: SensitiveStringType): Self = StObject.set(x, "ProfileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "ProfileUrl", js.undefined)
    
    inline def setTimezone(value: SensitiveStringType): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setTitle(value: SensitiveStringType): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserType(value: SensitiveStringType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
