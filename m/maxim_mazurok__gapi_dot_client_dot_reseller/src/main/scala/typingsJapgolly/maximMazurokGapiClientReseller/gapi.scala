package typingsJapgolly.maximMazurokGapiClientReseller

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Alt
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Callback
import typingsJapgolly.maximMazurokGapiClientReseller.anon.CommitmentInterval
import typingsJapgolly.maximMazurokGapiClientReseller.anon.CurrentLegacySkuId
import typingsJapgolly.maximMazurokGapiClientReseller.anon.CustomerAuthToken
import typingsJapgolly.maximMazurokGapiClientReseller.anon.CustomerId
import typingsJapgolly.maximMazurokGapiClientReseller.anon.CustomerNamePrefix
import typingsJapgolly.maximMazurokGapiClientReseller.anon.DeletionType
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Fields
import typingsJapgolly.maximMazurokGapiClientReseller.anon.IsInTrial
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Key
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientReseller.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientReseller.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientReseller.anon.Resource
import typingsJapgolly.maximMazurokGapiClientReseller.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object reseller {
      
      trait Address extends StObject {
        
        /** A customer's physical address. An address can be composed of one to three lines. The `addressline2` and `addressLine3` are optional. */
        var addressLine1: js.UndefOr[String] = js.undefined
        
        /** Line 2 of the address. */
        var addressLine2: js.UndefOr[String] = js.undefined
        
        /** Line 3 of the address. */
        var addressLine3: js.UndefOr[String] = js.undefined
        
        /** The customer contact's name. This is required. */
        var contactName: js.UndefOr[String] = js.undefined
        
        /**
          * For `countryCode` information, see the ISO 3166 country code elements. Verify that country is approved for resale of Google products. This property is required when creating a new
          * customer.
          */
        var countryCode: js.UndefOr[String] = js.undefined
        
        /** Identifies the resource as a customer address. Value: `customers#address` */
        var kind: js.UndefOr[String] = js.undefined
        
        /** An example of a `locality` value is the city of `San Francisco`. */
        var locality: js.UndefOr[String] = js.undefined
        
        /** The company or company division name. This is required. */
        var organizationName: js.UndefOr[String] = js.undefined
        
        /** A `postalCode` example is a postal zip code such as `94043`. This property is required when creating a new customer. */
        var postalCode: js.UndefOr[String] = js.undefined
        
        /** An example of a `region` value is `CA` for the state of California. */
        var region: js.UndefOr[String] = js.undefined
      }
      object Address {
        
        inline def apply(): Address = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Address]
        }
        
        extension [Self <: Address](x: Self) {
          
          inline def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
          
          inline def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
          
          inline def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
          
          inline def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
          
          inline def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
          
          inline def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
          
          inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
          
          inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
          
          inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
          
          inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
          
          inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
          
          inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
          
          inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
          
          inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
          
          inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
          
          inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
          
          inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        }
      }
      
      trait ChangePlanRequest extends StObject {
        
        /**
          * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in `changePlan` request in order to receive discounted rate. This property
          * is optional. If a deal code has already been added to a subscription, this property may be left empty and the existing discounted rate will still apply (if not empty, only provide
          * the deal code that is already present on the subscription). If a deal code has never been added to a subscription and this property is left blank, regular pricing will apply.
          */
        var dealCode: js.UndefOr[String] = js.undefined
        
        /** Identifies the resource as a subscription change plan request. Value: `subscriptions#changePlanRequest` */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * The `planName` property is required. This is the name of the subscription's payment plan. For more information about the Google payment plans, see API concepts. Possible values are:
          * - `ANNUAL_MONTHLY_PAY` - The annual commitment plan with monthly payments *Caution: *`ANNUAL_MONTHLY_PAY` is returned as `ANNUAL` in all API responses. - `ANNUAL_YEARLY_PAY` - The
          * annual commitment plan with yearly payments - `FLEXIBLE` - The flexible plan - `TRIAL` - The 30-day free trial plan
          */
        var planName: js.UndefOr[String] = js.undefined
        
        /**
          * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a `purchaseOrderId` value is given it appears in the
          * API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
          */
        var purchaseOrderId: js.UndefOr[String] = js.undefined
        
        /** This is a required property. The seats property is the number of user seat licenses. */
        var seats: js.UndefOr[Seats] = js.undefined
      }
      object ChangePlanRequest {
        
        inline def apply(): ChangePlanRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ChangePlanRequest]
        }
        
        extension [Self <: ChangePlanRequest](x: Self) {
          
          inline def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
          
          inline def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
          
          inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
          
          inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
          
          inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
          
          inline def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
          
          inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
        }
      }
      
      trait Customer extends StObject {
        
        /**
          * Like the "Customer email" in the reseller tools, this email is the secondary contact used if something happens to the customer's service such as service outage or a security issue.
          * This property is required when creating a new "domain" customer and should not use the same domain as `customerDomain`. The `alternateEmail` field is not necessary to create a
          * "team" customer.
          */
        var alternateEmail: js.UndefOr[String] = js.undefined
        
        /** The customer's primary domain name string. `customerDomain` is required when creating a new customer. Do not include the `www` prefix in the domain when adding a customer. */
        var customerDomain: js.UndefOr[String] = js.undefined
        
        /** Whether the customer's primary domain has been verified. */
        var customerDomainVerified: js.UndefOr[Boolean] = js.undefined
        
        /**
          * This property will always be returned in a response as the unique identifier generated by Google. In a request, this property can be either the primary domain or the unique
          * identifier generated by Google.
          */
        var customerId: js.UndefOr[String] = js.undefined
        
        /**
          * Identifies the type of the customer. Acceptable values include: * `domain`: Implies a domain-verified customer (default). * `team`: Implies an email-verified customer. For more
          * information, see [managed teams](https://support.google.com/a/users/answer/9939479).
          */
        var customerType: js.UndefOr[String] = js.undefined
        
        /** Identifies the resource as a customer. Value: `reseller#customer` */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * Customer contact phone number. Must start with "+" followed by the country code. The rest of the number can be contiguous numbers or respect the phone local format conventions, but
          * it must be a real phone number and not, for example, "123". This field is silently ignored if invalid.
          */
        var phoneNumber: js.UndefOr[String] = js.undefined
        
        /** A customer's address information. Each field has a limit of 255 charcters. */
        var postalAddress: js.UndefOr[Address] = js.undefined
        
        /** The first admin details of the customer, present in case of TEAM customer. */
        var primaryAdmin: js.UndefOr[PrimaryAdmin] = js.undefined
        
        /**
          * URL to customer's Admin console dashboard. The read-only URL is generated by the API service. This is used if your client application requires the customer to complete a task in the
          * Admin console.
          */
        var resourceUiUrl: js.UndefOr[String] = js.undefined
      }
      object Customer {
        
        inline def apply(): Customer = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Customer]
        }
        
        extension [Self <: Customer](x: Self) {
          
          inline def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
          
          inline def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
          
          inline def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
          
          inline def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
          
          inline def setCustomerDomainVerified(value: Boolean): Self = StObject.set(x, "customerDomainVerified", value.asInstanceOf[js.Any])
          
          inline def setCustomerDomainVerifiedUndefined: Self = StObject.set(x, "customerDomainVerified", js.undefined)
          
          inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
          
          inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
          
          inline def setCustomerType(value: String): Self = StObject.set(x, "customerType", value.asInstanceOf[js.Any])
          
          inline def setCustomerTypeUndefined: Self = StObject.set(x, "customerType", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
          
          inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
          
          inline def setPostalAddress(value: Address): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
          
          inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
          
          inline def setPrimaryAdmin(value: PrimaryAdmin): Self = StObject.set(x, "primaryAdmin", value.asInstanceOf[js.Any])
          
          inline def setPrimaryAdminUndefined: Self = StObject.set(x, "primaryAdmin", js.undefined)
          
          inline def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
          
          inline def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
        }
      }
      
      @js.native
      trait CustomersResource extends StObject {
        
        /**
          * Gets a customer account. Use this operation to see a customer account already in your reseller management, or to see the minimal account information for an existing customer that
          * you do not manage. For more information about the API response for existing customers, see [retrieving a customer
          * account](/admin-sdk/reseller/v1/how-tos/manage_customers#get_customer).
          */
        def get(): Request[Customer] = js.native
        def get(request: Callback): Request[Customer] = js.native
        
        /**
          * Orders a new customer's account. Before ordering a new customer account, establish whether the customer account already exists using the
          * [`customers.get`](/admin-sdk/reseller/v1/reference/customers/get) If the customer account exists as a direct Google account or as a resold customer account from another reseller,
          * use the `customerAuthToken\` as described in [order a resold account for an existing customer](/admin-sdk/reseller/v1/how-tos/manage_customers#create_existing_customer). For more
          * information about ordering a new customer account, see [order a new customer account](/admin-sdk/reseller/v1/how-tos/manage_customers#create_customer). After creating a new customer
          * account, you must provision a user as an administrator. The customer's administrator is required to sign in to the Admin console and sign the G Suite via Reseller agreement to
          * activate the account. Resellers are prohibited from signing the G Suite via Reseller agreement on the customer's behalf. For more information, see [order a new customer
          * account](/admin-sdk/reseller/v1/how-tos/manage_customers#tos).
          */
        def insert(request: CustomerAuthToken): Request[Customer] = js.native
        def insert(request: Fields, body: Customer): Request[Customer] = js.native
        
        def patch(request: Callback, body: Customer): Request[Customer] = js.native
        /**
          * Updates a customer account's settings. This method supports patch semantics. You cannot update `customerType` via the Reseller API, but a `"team"` customer can verify their domain
          * and become `customerType = "domain"`. For more information, see [Verify your domain to unlock Essentials features](https://support.google.com/a/answer/9122284).
          */
        def patch(request: CustomerId): Request[Customer] = js.native
        
        def update(request: Callback, body: Customer): Request[Customer] = js.native
        /**
          * Updates a customer account's settings. You cannot update `customerType` via the Reseller API, but a `"team"` customer can verify their domain and become `customerType = "domain"`.
          * For more information, see [update a customer's settings](/admin-sdk/reseller/v1/how-tos/manage_customers#update_customer).
          */
        def update(request: CustomerId): Request[Customer] = js.native
      }
      
      trait PrimaryAdmin extends StObject {
        
        /**
          * The business email of the primary administrator of the customer. The email verification link is sent to this email address at the time of customer creation. Primary administrators
          * have access to the customer's Admin Console, including the ability to invite and evict users and manage the administrative needs of the customer.
          */
        var primaryEmail: js.UndefOr[String] = js.undefined
      }
      object PrimaryAdmin {
        
        inline def apply(): PrimaryAdmin = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PrimaryAdmin]
        }
        
        extension [Self <: PrimaryAdmin](x: Self) {
          
          inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
          
          inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
        }
      }
      
      trait RenewalSettings extends StObject {
        
        /** Identifies the resource as a subscription renewal setting. Value: `subscriptions#renewalSettings` */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. When renewing a subscription, the `renewalType`
          * is a required property.
          */
        var renewalType: js.UndefOr[String] = js.undefined
      }
      object RenewalSettings {
        
        inline def apply(): RenewalSettings = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RenewalSettings]
        }
        
        extension [Self <: RenewalSettings](x: Self) {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
          
          inline def setRenewalTypeUndefined: Self = StObject.set(x, "renewalType", js.undefined)
        }
      }
      
      trait ResellernotifyGetwatchdetailsResponse extends StObject {
        
        /** List of registered service accounts. */
        var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Topic name of the PubSub */
        var topicName: js.UndefOr[String] = js.undefined
      }
      object ResellernotifyGetwatchdetailsResponse {
        
        inline def apply(): ResellernotifyGetwatchdetailsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
        }
        
        extension [Self <: ResellernotifyGetwatchdetailsResponse](x: Self) {
          
          inline def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
          
          inline def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
          
          inline def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value*))
          
          inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
          
          inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
        }
      }
      
      @js.native
      trait ResellernotifyResource extends StObject {
        
        /** Returns all the details of the watch corresponding to the reseller. */
        def getwatchdetails(): Request[ResellernotifyGetwatchdetailsResponse] = js.native
        def getwatchdetails(request: Accesstoken): Request[ResellernotifyGetwatchdetailsResponse] = js.native
        
        /** Registers a Reseller for receiving notifications. */
        def register(): Request[ResellernotifyResource] = js.native
        def register(request: Alt): Request[ResellernotifyResource] = js.native
        
        /** Topic name of the PubSub */
        var topicName: js.UndefOr[String] = js.native
        
        /** Unregisters a Reseller for receiving notifications. */
        def unregister(): Request[ResellernotifyResource] = js.native
        def unregister(request: Alt): Request[ResellernotifyResource] = js.native
      }
      
      trait Seats extends StObject {
        
        /** Identifies the resource as a subscription seat setting. Value: `subscriptions#seats` */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * Read-only field containing the current number of users that are assigned a license for the product defined in `skuId`. This field's value is equivalent to the numerical count of
          * users returned by the Enterprise License Manager API method: [`listForProductAndSku`](/admin-sdk/licensing/v1/reference/licenseAssignments/listForProductAndSku).
          */
        var licensedNumberOfSeats: js.UndefOr[Double] = js.undefined
        
        /**
          * This is a required property and is exclusive to subscriptions with `FLEXIBLE` or `TRIAL` plans. This property sets the maximum number of licensed users allowed on a subscription.
          * This quantity can be increased up to the maximum limit defined in the reseller's contract. The minimum quantity is the current number of users in the customer account. *Note: *G
          * Suite subscriptions automatically assign a license to every user.
          */
        var maximumNumberOfSeats: js.UndefOr[Double] = js.undefined
        
        /**
          * This is a required property and is exclusive to subscriptions with `ANNUAL_MONTHLY_PAY` and `ANNUAL_YEARLY_PAY` plans. This property sets the maximum number of licenses assignable
          * to users on a subscription. The reseller can add more licenses, but once set, the `numberOfSeats` cannot be reduced until renewal. The reseller is invoiced based on the
          * `numberOfSeats` value regardless of how many of these user licenses are assigned. *Note: *Google Workspace subscriptions automatically assign a license to every user.
          */
        var numberOfSeats: js.UndefOr[Double] = js.undefined
      }
      object Seats {
        
        inline def apply(): Seats = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Seats]
        }
        
        extension [Self <: Seats](x: Self) {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
          
          inline def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
          
          inline def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
          
          inline def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
          
          inline def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
          
          inline def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
        }
      }
      
      trait Subscription extends StObject {
        
        /** Read-only field that returns the current billing method for a subscription. */
        var billingMethod: js.UndefOr[String] = js.undefined
        
        /** The `creationTime` property is the date when subscription was created. It is in milliseconds using the Epoch format. See an example Epoch converter. */
        var creationTime: js.UndefOr[String] = js.undefined
        
        /** Primary domain name of the customer */
        var customerDomain: js.UndefOr[String] = js.undefined
        
        /**
          * This property will always be returned in a response as the unique identifier generated by Google. In a request, this property can be either the primary domain or the unique
          * identifier generated by Google.
          */
        var customerId: js.UndefOr[String] = js.undefined
        
        /**
          * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in `insert` requests in order to receive discounted rate. This property is
          * optional, regular pricing applies if left empty.
          */
        var dealCode: js.UndefOr[String] = js.undefined
        
        /** Identifies the resource as a Subscription. Value: `reseller#subscription` */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * The `plan` property is required. In this version of the API, the G Suite plans are the flexible plan, annual commitment plan, and the 30-day free trial plan. For more information
          * about the API"s payment plans, see the API concepts.
          */
        var plan: js.UndefOr[CommitmentInterval] = js.undefined
        
        /**
          * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a `purchaseOrderId` value is given it appears in the
          * API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
          */
        var purchaseOrderId: js.UndefOr[String] = js.undefined
        
        /** Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. */
        var renewalSettings: js.UndefOr[RenewalSettings] = js.undefined
        
        /**
          * URL to customer's Subscriptions page in the Admin console. The read-only URL is generated by the API service. This is used if your client application requires the customer to
          * complete a task using the Subscriptions page in the Admin console.
          */
        var resourceUiUrl: js.UndefOr[String] = js.undefined
        
        /** This is a required property. The number and limit of user seat licenses in the plan. */
        var seats: js.UndefOr[Seats] = js.undefined
        
        /**
          * A required property. The `skuId` is a unique system identifier for a product's SKU assigned to a customer in the subscription. For products and SKUs available in this version of the
          * API, see Product and SKU IDs.
          */
        var skuId: js.UndefOr[String] = js.undefined
        
        /**
          * Read-only external display name for a product's SKU assigned to a customer in the subscription. SKU names are subject to change at Google's discretion. For products and SKUs
          * available in this version of the API, see Product and SKU IDs.
          */
        var skuName: js.UndefOr[String] = js.undefined
        
        /** This is an optional property. */
        var status: js.UndefOr[String] = js.undefined
        
        /**
          * The `subscriptionId` is the subscription identifier and is unique for each customer. This is a required property. Since a `subscriptionId` changes when a subscription is updated, we
          * recommend not using this ID as a key for persistent data. Use the `subscriptionId` as described in retrieve all reseller subscriptions.
          */
        var subscriptionId: js.UndefOr[String] = js.undefined
        
        /**
          * Read-only field containing an enumerable of all the current suspension reasons for a subscription. It is possible for a subscription to have many concurrent, overlapping suspension
          * reasons. A subscription's `STATUS` is `SUSPENDED` until all pending suspensions are removed. Possible options include: - `PENDING_TOS_ACCEPTANCE` - The customer has not logged in
          * and accepted the G Suite Resold Terms of Services. - `RENEWAL_WITH_TYPE_CANCEL` - The customer's commitment ended and their service was cancelled at the end of their term. -
          * `RESELLER_INITIATED` - A manual suspension invoked by a Reseller. - `TRIAL_ENDED` - The customer's trial expired without a plan selected. - `OTHER` - The customer is suspended for
          * an internal Google reason (e.g. abuse or otherwise).
          */
        var suspensionReasons: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Read-only transfer related information for the subscription. For more information, see retrieve transferable subscriptions for a customer. */
        var transferInfo: js.UndefOr[CurrentLegacySkuId] = js.undefined
        
        /** The G Suite annual commitment and flexible payment plans can be in a 30-day free trial. For more information, see the API concepts. */
        var trialSettings: js.UndefOr[IsInTrial] = js.undefined
      }
      object Subscription {
        
        inline def apply(): Subscription = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Subscription]
        }
        
        extension [Self <: Subscription](x: Self) {
          
          inline def setBillingMethod(value: String): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
          
          inline def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
          
          inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
          
          inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
          
          inline def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
          
          inline def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
          
          inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
          
          inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
          
          inline def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
          
          inline def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPlan(value: CommitmentInterval): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
          
          inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
          
          inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
          
          inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
          
          inline def setRenewalSettings(value: RenewalSettings): Self = StObject.set(x, "renewalSettings", value.asInstanceOf[js.Any])
          
          inline def setRenewalSettingsUndefined: Self = StObject.set(x, "renewalSettings", js.undefined)
          
          inline def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
          
          inline def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
          
          inline def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
          
          inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
          
          inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
          
          inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
          
          inline def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
          
          inline def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
          
          inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
          
          inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
          
          inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
          
          inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
          
          inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
          
          inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
          
          inline def setTransferInfo(value: CurrentLegacySkuId): Self = StObject.set(x, "transferInfo", value.asInstanceOf[js.Any])
          
          inline def setTransferInfoUndefined: Self = StObject.set(x, "transferInfo", js.undefined)
          
          inline def setTrialSettings(value: IsInTrial): Self = StObject.set(x, "trialSettings", value.asInstanceOf[js.Any])
          
          inline def setTrialSettingsUndefined: Self = StObject.set(x, "trialSettings", js.undefined)
        }
      }
      
      trait Subscriptions extends StObject {
        
        /** Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** The subscriptions in this page of results. */
        var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
      }
      object Subscriptions {
        
        inline def apply(): Subscriptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Subscriptions]
        }
        
        extension [Self <: Subscriptions](x: Self) {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
          
          inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
          
          inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
        }
      }
      
      @js.native
      trait SubscriptionsResource extends StObject {
        
        /**
          * Activates a subscription previously suspended by the reseller. If you did not suspend the customer subscription and it is suspended for any other reason, such as for abuse or a
          * pending ToS acceptance, this call will not reactivate the customer subscription.
          */
        def activate(): Request[Subscription] = js.native
        def activate(request: Key): Request[Subscription] = js.native
        
        def changePlan(request: Key, body: ChangePlanRequest): Request[Subscription] = js.native
        /**
          * Updates a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments. How a
          * plan is updated differs depending on the plan and the products. For more information, see the description in [manage
          * subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_subscription_plan).
          */
        def changePlan(request: Oauthtoken): Request[Subscription] = js.native
        
        def changeRenewalSettings(request: Key, body: RenewalSettings): Request[Subscription] = js.native
        /**
          * Updates a user license's renewal settings. This is applicable for accounts with annual commitment plans only. For more information, see the description in [manage
          * subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_renewal).
          */
        def changeRenewalSettings(request: PrettyPrint): Request[Subscription] = js.native
        
        def changeSeats(request: Key, body: Seats): Request[Subscription] = js.native
        /**
          * Updates a subscription's user license settings. For more information about updating an annual commitment plan or a flexible plan subscription’s licenses, see [Manage
          * Subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_subscription_seat).
          */
        def changeSeats(request: QuotaUser): Request[Subscription] = js.native
        
        /** Cancels, suspends, or transfers a subscription to direct. */
        def delete(): Request[Unit] = js.native
        def delete(request: DeletionType): Request[Unit] = js.native
        
        /**
          * Gets a specific subscription. The `subscriptionId` can be found using the [Retrieve all reseller
          * subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#get_all_subscriptions) method. For more information about retrieving a specific subscription, see the information
          * descrived in [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#get_subscription).
          */
        def get(): Request[Subscription] = js.native
        def get(request: Key): Request[Subscription] = js.native
        
        /**
          * Creates or transfer a subscription. Create a subscription for a customer's account that you ordered using the [Order a new customer
          * account](/admin-sdk/reseller/v1/reference/customers/insert.html) method. For more information about creating a subscription for different payment plans, see [manage
          * subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#create_subscription).\ If you did not order the customer's account using the customer insert method, use the
          * customer's `customerAuthToken` when creating a subscription for that customer. If transferring a G Suite subscription with an associated Google Drive or Google Vault subscription,
          * use the [batch operation](/admin-sdk/reseller/v1/how-tos/batch.html) to transfer all of these subscriptions. For more information, see how to [transfer
          * subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#transfer_a_subscription).
          */
        def insert(request: Resource): Request[Subscription] = js.native
        def insert(request: UploadType, body: Subscription): Request[Subscription] = js.native
        
        /**
          * Lists of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions. Optionally,
          * this method can filter the response by a `customerNamePrefix`. For more information, see [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions).
          */
        def list(): Request[Subscriptions] = js.native
        def list(request: CustomerNamePrefix): Request[Subscriptions] = js.native
        
        /**
          * Immediately move a 30-day free trial subscription to a paid service subscription. This method is only applicable if a payment plan has already been set up for the 30-day trial
          * subscription. For more information, see [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#paid_service).
          */
        def startPaidService(): Request[Subscription] = js.native
        def startPaidService(request: Key): Request[Subscription] = js.native
        
        /**
          * Suspends an active subscription. You can use this method to suspend a paid subscription that is currently in the `ACTIVE` state. * For `FLEXIBLE` subscriptions, billing is paused. *
          * For `ANNUAL_MONTHLY_PAY` or `ANNUAL_YEARLY_PAY` subscriptions: * Suspending the subscription does not change the renewal date that was originally committed to. * A suspended
          * subscription does not renew. If you activate the subscription after the original renewal date, a new annual subscription will be created, starting on the day of activation. We
          * strongly encourage you to suspend subscriptions only for short periods of time as suspensions over 60 days may result in the subscription being cancelled.
          */
        def suspend(): Request[Subscription] = js.native
        def suspend(request: Key): Request[Subscription] = js.native
      }
    }
  }
}
