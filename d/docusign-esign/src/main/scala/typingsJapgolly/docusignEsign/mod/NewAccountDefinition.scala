package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewAccountDefinition extends StObject {
  
  /**
    * The account name for the new account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of
    * [account settings][accountsettings]
    * that determine
    * the features available for the account.
    * Note that some features are determined
    * by the plan used to create the account and cannot be overridden.
    *
    * [accountsettings]: https://developers.docusign.com/esign-rest-api/reference/Accounts/Accounts/create/#account-settings
    *
    */
  var accountSettings: js.UndefOr[
    /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
  ] = js.undefined
  
  /**
    * A complex type that contains the following information for the new account: `Street1`, `Street2`, `City`, `State`, `Zip`, `Phone`, and `Fax`.
    */
  var addressInformation: js.UndefOr[
    /* Contains information about the address associated with the account. */ AccountAddress
  ] = js.undefined
  
  /**
    * A complex type that has information about the credit card used to pay for this account.
    */
  var creditCardInformation: js.UndefOr[
    /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
  ] = js.undefined
  
  /**
    * Information about the bank that processes direct debits for the payment plan.
    */
  var directDebitProcessorInformation: js.UndefOr[
    /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
  ] = js.undefined
  
  /**
    * The Distributor Code that you received from DocuSign.
    */
  var distributorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the `distributorCode`.
    */
  var distributorPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var envelopePartitionId: js.UndefOr[String] = js.undefined
  
  /**
    * A complex type with the initial user information for the new account. Note that some user information is set internally based on the plan and cannot be overridden.
    */
  var initialUser: js.UndefOr[UserInformation] = js.undefined
  
  /**
    * The payment method used for the billing plan. Valid values are:
    *
    * - `NotSupported`
    * - `CreditCard`
    * - `PurchaseOrder`
    * - `Premium`
    * - `Freemium`
    * - `FreeTrial`
    * - `AppStore`
    * - `DigitalExternal`
    * - `DirectDebit`
    */
  var paymentMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the entity that processes payments for the billing plan.
    */
  var paymentProcessorInformation: js.UndefOr[PaymentProcessorInformation] = js.undefined
  
  /**
    * An object used to identify the features and attributes of the account being created.
    */
  var planInformation: js.UndefOr[
    /* An object used to identify the features and attributes of the account being created. */ PlanInformation
  ] = js.undefined
  
  /**
    * A complex type that contains properties for entering referral and discount information.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.undefined
  
  /**
    * Contains properties that map a DocuSign user to a social account such as Facebook or Yahoo.
    */
  var socialAccountInformation: js.UndefOr[SocialAccountInformation] = js.undefined
}
object NewAccountDefinition {
  
  inline def apply(): NewAccountDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewAccountDefinition]
  }
  
  extension [Self <: NewAccountDefinition](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAccountSettings(
      value: /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
    ): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
    
    inline def setAddressInformation(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = StObject.set(x, "addressInformation", value.asInstanceOf[js.Any])
    
    inline def setAddressInformationUndefined: Self = StObject.set(x, "addressInformation", js.undefined)
    
    inline def setCreditCardInformation(
      value: /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
    ): Self = StObject.set(x, "creditCardInformation", value.asInstanceOf[js.Any])
    
    inline def setCreditCardInformationUndefined: Self = StObject.set(x, "creditCardInformation", js.undefined)
    
    inline def setDirectDebitProcessorInformation(
      value: /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
    ): Self = StObject.set(x, "directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitProcessorInformationUndefined: Self = StObject.set(x, "directDebitProcessorInformation", js.undefined)
    
    inline def setDistributorCode(value: String): Self = StObject.set(x, "distributorCode", value.asInstanceOf[js.Any])
    
    inline def setDistributorCodeUndefined: Self = StObject.set(x, "distributorCode", js.undefined)
    
    inline def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
    
    inline def setDistributorPasswordUndefined: Self = StObject.set(x, "distributorPassword", js.undefined)
    
    inline def setEnvelopePartitionId(value: String): Self = StObject.set(x, "envelopePartitionId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopePartitionIdUndefined: Self = StObject.set(x, "envelopePartitionId", js.undefined)
    
    inline def setInitialUser(value: UserInformation): Self = StObject.set(x, "initialUser", value.asInstanceOf[js.Any])
    
    inline def setInitialUserUndefined: Self = StObject.set(x, "initialUser", js.undefined)
    
    inline def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = StObject.set(x, "paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    inline def setPaymentProcessorInformationUndefined: Self = StObject.set(x, "paymentProcessorInformation", js.undefined)
    
    inline def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = StObject.set(x, "planInformation", value.asInstanceOf[js.Any])
    
    inline def setPlanInformationUndefined: Self = StObject.set(x, "planInformation", js.undefined)
    
    inline def setReferralInformation(value: ReferralInformation): Self = StObject.set(x, "referralInformation", value.asInstanceOf[js.Any])
    
    inline def setReferralInformationUndefined: Self = StObject.set(x, "referralInformation", js.undefined)
    
    inline def setSocialAccountInformation(value: SocialAccountInformation): Self = StObject.set(x, "socialAccountInformation", value.asInstanceOf[js.Any])
    
    inline def setSocialAccountInformationUndefined: Self = StObject.set(x, "socialAccountInformation", js.undefined)
  }
}
