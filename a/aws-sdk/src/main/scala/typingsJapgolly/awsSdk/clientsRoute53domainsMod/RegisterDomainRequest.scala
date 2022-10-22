package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDomainRequest extends StObject {
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var AdminContact: ContactDetail
  
  /**
    * Indicates whether the domain will be automatically renewed (true) or not (false). Autorenewal only takes effect after the account is charged. Default: true 
    */
  var AutoRenew: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain name that you want to register. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.   Internationalized domain names are not supported for some top-level domains. To determine whether the TLD that you want to use supports internationalized domain names, see Domains that You Can Register with Amazon Route 53. For more information, see Formatting Internationalized Domain Names. 
    */
  var DomainName: typingsJapgolly.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * The number of years that you want to register the domain for. Domains are registered for a minimum of one year. The maximum period depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: typingsJapgolly.awsSdk.clientsRoute53domainsMod.DurationInYears
  
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.undefined
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the admin contact.  You must specify the same privacy setting for the administrative, registrant, and technical contacts.  Default: true 
    */
  var PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the registrant contact (the domain owner).  You must specify the same privacy setting for the administrative, registrant, and technical contacts.  Default: true 
    */
  var PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries return contact information either for Amazon Registrar (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you specify false, WHOIS queries return the information that you entered for the technical contact.  You must specify the same privacy setting for the administrative, registrant, and technical contacts.  Default: true 
    */
  var PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var RegistrantContact: ContactDetail
  
  /**
    * Provides detailed contact information. For information about the values that you specify for each element, see ContactDetail.
    */
  var TechContact: ContactDetail
}
object RegisterDomainRequest {
  
  inline def apply(
    AdminContact: ContactDetail,
    DomainName: DomainName,
    DurationInYears: DurationInYears,
    RegistrantContact: ContactDetail,
    TechContact: ContactDetail
  ): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal(AdminContact = AdminContact.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DurationInYears = DurationInYears.asInstanceOf[js.Any], RegistrantContact = RegistrantContact.asInstanceOf[js.Any], TechContact = TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainRequest]
  }
  
  extension [Self <: RegisterDomainRequest](x: Self) {
    
    inline def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
    inline def setAutoRenew(value: Boolean): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDurationInYears(value: DurationInYears): Self = StObject.set(x, "DurationInYears", value.asInstanceOf[js.Any])
    
    inline def setIdnLangCode(value: LangCode): Self = StObject.set(x, "IdnLangCode", value.asInstanceOf[js.Any])
    
    inline def setIdnLangCodeUndefined: Self = StObject.set(x, "IdnLangCode", js.undefined)
    
    inline def setPrivacyProtectAdminContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectAdminContact", value.asInstanceOf[js.Any])
    
    inline def setPrivacyProtectAdminContactUndefined: Self = StObject.set(x, "PrivacyProtectAdminContact", js.undefined)
    
    inline def setPrivacyProtectRegistrantContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectRegistrantContact", value.asInstanceOf[js.Any])
    
    inline def setPrivacyProtectRegistrantContactUndefined: Self = StObject.set(x, "PrivacyProtectRegistrantContact", js.undefined)
    
    inline def setPrivacyProtectTechContact(value: Boolean): Self = StObject.set(x, "PrivacyProtectTechContact", value.asInstanceOf[js.Any])
    
    inline def setPrivacyProtectTechContactUndefined: Self = StObject.set(x, "PrivacyProtectTechContact", js.undefined)
    
    inline def setRegistrantContact(value: ContactDetail): Self = StObject.set(x, "RegistrantContact", value.asInstanceOf[js.Any])
    
    inline def setTechContact(value: ContactDetail): Self = StObject.set(x, "TechContact", value.asInstanceOf[js.Any])
  }
}
