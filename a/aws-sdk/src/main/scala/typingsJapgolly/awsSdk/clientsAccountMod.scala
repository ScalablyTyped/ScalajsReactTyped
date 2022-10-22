package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import typingsJapgolly.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsAccountMod {
  
  @JSImport("aws-sdk/clients/account", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends Account {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Account extends Service {
    
    @JSName("config")
    var config_Account: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Deletes the specified alternate contact from an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def deleteAlternateContact(): Request[js.Object, AWSError] = js.native
    def deleteAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Deletes the specified alternate contact from an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def deleteAlternateContact(params: DeleteAlternateContactRequest): Request[js.Object, AWSError] = js.native
    def deleteAlternateContact(
      params: DeleteAlternateContactRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
    
    /**
      * Retrieves the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def getAlternateContact(): Request[GetAlternateContactResponse, AWSError] = js.native
    def getAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ GetAlternateContactResponse, Unit]): Request[GetAlternateContactResponse, AWSError] = js.native
    /**
      * Retrieves the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def getAlternateContact(params: GetAlternateContactRequest): Request[GetAlternateContactResponse, AWSError] = js.native
    def getAlternateContact(
      params: GetAlternateContactRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetAlternateContactResponse, Unit]
    ): Request[GetAlternateContactResponse, AWSError] = js.native
    
    /**
      * Retrieves the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
      */
    def getContactInformation(): Request[GetContactInformationResponse, AWSError] = js.native
    def getContactInformation(callback: js.Function2[/* err */ AWSError, /* data */ GetContactInformationResponse, Unit]): Request[GetContactInformationResponse, AWSError] = js.native
    /**
      * Retrieves the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
      */
    def getContactInformation(params: GetContactInformationRequest): Request[GetContactInformationResponse, AWSError] = js.native
    def getContactInformation(
      params: GetContactInformationRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetContactInformationResponse, Unit]
    ): Request[GetContactInformationResponse, AWSError] = js.native
    
    /**
      * Modifies the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def putAlternateContact(): Request[js.Object, AWSError] = js.native
    def putAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Modifies the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
      */
    def putAlternateContact(params: PutAlternateContactRequest): Request[js.Object, AWSError] = js.native
    def putAlternateContact(
      params: PutAlternateContactRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
    
    /**
      * Updates the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
      */
    def putContactInformation(): Request[js.Object, AWSError] = js.native
    def putContactInformation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Updates the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
      */
    def putContactInformation(params: PutContactInformationRequest): Request[js.Object, AWSError] = js.native
    def putContactInformation(
      params: PutContactInformationRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
  }
  
  type AccountId = String
  
  type AddressLine = String
  
  trait AlternateContact extends StObject {
    
    /**
      * The type of alternate contact.
      */
    var AlternateContactType: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AlternateContactType] = js.undefined
    
    /**
      * The email address associated with this alternate contact.
      */
    var EmailAddress: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.EmailAddress] = js.undefined
    
    /**
      * The name associated with this alternate contact.
      */
    var Name: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.Name] = js.undefined
    
    /**
      * The phone number associated with this alternate contact.
      */
    var PhoneNumber: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.PhoneNumber] = js.undefined
    
    /**
      * The title associated with this alternate contact.
      */
    var Title: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.Title] = js.undefined
  }
  object AlternateContact {
    
    inline def apply(): AlternateContact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlternateContact]
    }
    
    extension [Self <: AlternateContact](x: Self) {
      
      inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
      
      inline def setAlternateContactTypeUndefined: Self = StObject.set(x, "AlternateContactType", js.undefined)
      
      inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
      
      inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BILLING
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY
    - java.lang.String
  */
  type AlternateContactType = _AlternateContactType | String
  
  trait Blob extends StObject
  
  type City = String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type CompanyName = String
  
  trait ContactInformation extends StObject {
    
    /**
      * The first line of the primary contact address.
      */
    var AddressLine1: AddressLine
    
    /**
      * The second line of the primary contact address, if any.
      */
    var AddressLine2: js.UndefOr[AddressLine] = js.undefined
    
    /**
      * The third line of the primary contact address, if any.
      */
    var AddressLine3: js.UndefOr[AddressLine] = js.undefined
    
    /**
      * The city of the primary contact address.
      */
    var City: typingsJapgolly.awsSdk.clientsAccountMod.City
    
    /**
      * The name of the company associated with the primary contact information, if any.
      */
    var CompanyName: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.CompanyName] = js.undefined
    
    /**
      * The ISO-3166 two-letter country code for the primary contact address.
      */
    var CountryCode: typingsJapgolly.awsSdk.clientsAccountMod.CountryCode
    
    /**
      * The district or county of the primary contact address, if any.
      */
    var DistrictOrCounty: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.DistrictOrCounty] = js.undefined
    
    /**
      * The full name of the primary contact address.
      */
    var FullName: typingsJapgolly.awsSdk.clientsAccountMod.FullName
    
    /**
      * The phone number of the primary contact information. The number will be validated and, in some countries, checked for activation.
      */
    var PhoneNumber: ContactInformationPhoneNumber
    
    /**
      * The postal code of the primary contact address.
      */
    var PostalCode: typingsJapgolly.awsSdk.clientsAccountMod.PostalCode
    
    /**
      * The state or region of the primary contact address. This field is required in selected countries.
      */
    var StateOrRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.StateOrRegion] = js.undefined
    
    /**
      * The URL of the website associated with the primary contact information, if any.
      */
    var WebsiteUrl: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.WebsiteUrl] = js.undefined
  }
  object ContactInformation {
    
    inline def apply(
      AddressLine1: AddressLine,
      City: City,
      CountryCode: CountryCode,
      FullName: FullName,
      PhoneNumber: ContactInformationPhoneNumber,
      PostalCode: PostalCode
    ): ContactInformation = {
      val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactInformation]
    }
    
    extension [Self <: ContactInformation](x: Self) {
      
      inline def setAddressLine1(value: AddressLine): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
      
      inline def setAddressLine2(value: AddressLine): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
      
      inline def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
      
      inline def setAddressLine3(value: AddressLine): Self = StObject.set(x, "AddressLine3", value.asInstanceOf[js.Any])
      
      inline def setAddressLine3Undefined: Self = StObject.set(x, "AddressLine3", js.undefined)
      
      inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      inline def setCompanyName(value: CompanyName): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
      
      inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
      
      inline def setDistrictOrCounty(value: DistrictOrCounty): Self = StObject.set(x, "DistrictOrCounty", value.asInstanceOf[js.Any])
      
      inline def setDistrictOrCountyUndefined: Self = StObject.set(x, "DistrictOrCounty", js.undefined)
      
      inline def setFullName(value: FullName): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber(value: ContactInformationPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: PostalCode): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
      
      inline def setStateOrRegion(value: StateOrRegion): Self = StObject.set(x, "StateOrRegion", value.asInstanceOf[js.Any])
      
      inline def setStateOrRegionUndefined: Self = StObject.set(x, "StateOrRegion", js.undefined)
      
      inline def setWebsiteUrl(value: WebsiteUrl): Self = StObject.set(x, "WebsiteUrl", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUrlUndefined: Self = StObject.set(x, "WebsiteUrl", js.undefined)
    }
  }
  
  type ContactInformationPhoneNumber = String
  
  type CountryCode = String
  
  trait DeleteAlternateContactRequest extends StObject {
    
    /**
      * Specifies the 12 digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you do not specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account, and the specified account ID must be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId; it must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, then don't specify this parameter, and call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
      */
    var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AccountId] = js.undefined
    
    /**
      * Specifies which of the alternate contacts to delete. 
      */
    var AlternateContactType: typingsJapgolly.awsSdk.clientsAccountMod.AlternateContactType
  }
  object DeleteAlternateContactRequest {
    
    inline def apply(AlternateContactType: AlternateContactType): DeleteAlternateContactRequest = {
      val __obj = js.Dynamic.literal(AlternateContactType = AlternateContactType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteAlternateContactRequest]
    }
    
    extension [Self <: DeleteAlternateContactRequest](x: Self) {
      
      inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
    }
  }
  
  type DistrictOrCounty = String
  
  type EmailAddress = String
  
  type FullName = String
  
  trait GetAlternateContactRequest extends StObject {
    
    /**
      * Specifies the 12 digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you do not specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account, and the specified account ID must be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId; it must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, then don't specify this parameter, and call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
      */
    var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AccountId] = js.undefined
    
    /**
      * Specifies which alternate contact you want to retrieve.
      */
    var AlternateContactType: typingsJapgolly.awsSdk.clientsAccountMod.AlternateContactType
  }
  object GetAlternateContactRequest {
    
    inline def apply(AlternateContactType: AlternateContactType): GetAlternateContactRequest = {
      val __obj = js.Dynamic.literal(AlternateContactType = AlternateContactType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAlternateContactRequest]
    }
    
    extension [Self <: GetAlternateContactRequest](x: Self) {
      
      inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAlternateContactResponse extends StObject {
    
    /**
      * A structure that contains the details for the specified alternate contact.
      */
    var AlternateContact: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AlternateContact] = js.undefined
  }
  object GetAlternateContactResponse {
    
    inline def apply(): GetAlternateContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAlternateContactResponse]
    }
    
    extension [Self <: GetAlternateContactResponse](x: Self) {
      
      inline def setAlternateContact(value: AlternateContact): Self = StObject.set(x, "AlternateContact", value.asInstanceOf[js.Any])
      
      inline def setAlternateContactUndefined: Self = StObject.set(x, "AlternateContact", js.undefined)
    }
  }
  
  trait GetContactInformationRequest extends StObject {
    
    /**
      * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId. It must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, don't specify this parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
      */
    var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AccountId] = js.undefined
  }
  object GetContactInformationRequest {
    
    inline def apply(): GetContactInformationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetContactInformationRequest]
    }
    
    extension [Self <: GetContactInformationRequest](x: Self) {
      
      inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    }
  }
  
  trait GetContactInformationResponse extends StObject {
    
    /**
      * Contains the details of the primary contact information associated with an Amazon Web Services account.
      */
    var ContactInformation: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.ContactInformation] = js.undefined
  }
  object GetContactInformationResponse {
    
    inline def apply(): GetContactInformationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetContactInformationResponse]
    }
    
    extension [Self <: GetContactInformationResponse](x: Self) {
      
      inline def setContactInformation(value: ContactInformation): Self = StObject.set(x, "ContactInformation", value.asInstanceOf[js.Any])
      
      inline def setContactInformationUndefined: Self = StObject.set(x, "ContactInformation", js.undefined)
    }
  }
  
  type Name = String
  
  type PhoneNumber = String
  
  type PostalCode = String
  
  trait PutAlternateContactRequest extends StObject {
    
    /**
      * Specifies the 12 digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you do not specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account, and the specified account ID must be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId; it must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, then don't specify this parameter, and call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
      */
    var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AccountId] = js.undefined
    
    /**
      * Specifies which alternate contact you want to create or update.
      */
    var AlternateContactType: typingsJapgolly.awsSdk.clientsAccountMod.AlternateContactType
    
    /**
      * Specifies an email address for the alternate contact. 
      */
    var EmailAddress: typingsJapgolly.awsSdk.clientsAccountMod.EmailAddress
    
    /**
      * Specifies a name for the alternate contact.
      */
    var Name: typingsJapgolly.awsSdk.clientsAccountMod.Name
    
    /**
      * Specifies a phone number for the alternate contact.
      */
    var PhoneNumber: typingsJapgolly.awsSdk.clientsAccountMod.PhoneNumber
    
    /**
      * Specifies a title for the alternate contact.
      */
    var Title: typingsJapgolly.awsSdk.clientsAccountMod.Title
  }
  object PutAlternateContactRequest {
    
    inline def apply(
      AlternateContactType: AlternateContactType,
      EmailAddress: EmailAddress,
      Name: Name,
      PhoneNumber: PhoneNumber,
      Title: Title
    ): PutAlternateContactRequest = {
      val __obj = js.Dynamic.literal(AlternateContactType = AlternateContactType.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutAlternateContactRequest]
    }
    
    extension [Self <: PutAlternateContactRequest](x: Self) {
      
      inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutContactInformationRequest extends StObject {
    
    /**
      * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId. It must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, don't specify this parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
      */
    var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.AccountId] = js.undefined
    
    /**
      * Contains the details of the primary contact information associated with an Amazon Web Services account.
      */
    var ContactInformation: typingsJapgolly.awsSdk.clientsAccountMod.ContactInformation
  }
  object PutContactInformationRequest {
    
    inline def apply(ContactInformation: ContactInformation): PutContactInformationRequest = {
      val __obj = js.Dynamic.literal(ContactInformation = ContactInformation.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutContactInformationRequest]
    }
    
    extension [Self <: PutContactInformationRequest](x: Self) {
      
      inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setContactInformation(value: ContactInformation): Self = StObject.set(x, "ContactInformation", value.asInstanceOf[js.Any])
    }
  }
  
  type StateOrRegion = String
  
  type Title = String
  
  type WebsiteUrl = String
  
  trait _AlternateContactType extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2021-02-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
