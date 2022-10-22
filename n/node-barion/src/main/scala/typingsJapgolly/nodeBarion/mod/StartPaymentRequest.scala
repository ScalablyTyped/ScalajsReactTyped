package typingsJapgolly.nodeBarion.mod

import typingsJapgolly.nodeBarion.nodeBarionStrings.All
import typingsJapgolly.nodeBarion.nodeBarionStrings.ApplePay
import typingsJapgolly.nodeBarion.nodeBarionStrings.Balance
import typingsJapgolly.nodeBarion.nodeBarionStrings.BankCard
import typingsJapgolly.nodeBarion.nodeBarionStrings.BankTransfer
import typingsJapgolly.nodeBarion.nodeBarionStrings.CZK
import typingsJapgolly.nodeBarion.nodeBarionStrings.ChallengeRequired
import typingsJapgolly.nodeBarion.nodeBarionStrings.DelayedCapture
import typingsJapgolly.nodeBarion.nodeBarionStrings.EUR
import typingsJapgolly.nodeBarion.nodeBarionStrings.GooglePay
import typingsJapgolly.nodeBarion.nodeBarionStrings.HUF
import typingsJapgolly.nodeBarion.nodeBarionStrings.Immediate
import typingsJapgolly.nodeBarion.nodeBarionStrings.MerchantInitiatedPayment
import typingsJapgolly.nodeBarion.nodeBarionStrings.NoChallengeNeeded
import typingsJapgolly.nodeBarion.nodeBarionStrings.NoPreference
import typingsJapgolly.nodeBarion.nodeBarionStrings.OneClickPayment
import typingsJapgolly.nodeBarion.nodeBarionStrings.RecurringPayment
import typingsJapgolly.nodeBarion.nodeBarionStrings.Reservation
import typingsJapgolly.nodeBarion.nodeBarionStrings.USD
import typingsJapgolly.nodeBarion.nodeBarionStrings.`cs-CZ`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`de-DE`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`en-US`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`es-ES`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`fr-FR`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`hu-HU`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`sk-SK`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`sl-SI`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPaymentRequest extends StObject {
  
  var BillingAddress: js.UndefOr[typingsJapgolly.nodeBarion.mod.BillingAddress] = js.undefined
  
  var CallbackUrl: String
  
  var CardHolderNameHint: js.UndefOr[String] = js.undefined
  
  var ChallengePreference: js.UndefOr[NoPreference | ChallengeRequired | NoChallengeNeeded] = js.undefined
  
  var Currency: CZK | EUR | HUF | USD
  
  var DelayedCapturePeriod: js.UndefOr[String] = js.undefined
  
  var FundingSources: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]
  
  var GuestCheckOut: Boolean
  
  var InitiateRecurrence: js.UndefOr[Boolean] = js.undefined
  
  var Locale: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`
  
  var OrderNumber: js.UndefOr[String] = js.undefined
  
  var POSKey: String
  
  var PayerAccount: js.UndefOr[PayerAccountInformation] = js.undefined
  
  var PayerHint: js.UndefOr[String] = js.undefined
  
  var PayerHomeNumber: js.UndefOr[String] = js.undefined
  
  var PayerPhoneNumber: js.UndefOr[String] = js.undefined
  
  var PayerWorkPhoneNumber: js.UndefOr[String] = js.undefined
  
  var PaymentRequestId: String
  
  var PaymentType: Immediate | Reservation | DelayedCapture
  
  var PaymentWindow: js.UndefOr[String] = js.undefined
  
  var PurchaseInformation: js.UndefOr[typingsJapgolly.nodeBarion.mod.PurchaseInformation] = js.undefined
  
  var RecurrenceId: js.UndefOr[String] = js.undefined
  
  var RecurrenceType: js.UndefOr[OneClickPayment | MerchantInitiatedPayment | RecurringPayment] = js.undefined
  
  var RedirectUrl: String
  
  var ReservationPeriod: js.UndefOr[String] = js.undefined
  
  var ShippingAddress: js.UndefOr[typingsJapgolly.nodeBarion.mod.ShippingAddress] = js.undefined
  
  var TraceId: js.UndefOr[String] = js.undefined
  
  var Transactions: js.Array[PaymentTransaction]
}
object StartPaymentRequest {
  
  inline def apply(
    CallbackUrl: String,
    Currency: CZK | EUR | HUF | USD,
    FundingSources: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer],
    GuestCheckOut: Boolean,
    Locale: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`,
    POSKey: String,
    PaymentRequestId: String,
    PaymentType: Immediate | Reservation | DelayedCapture,
    RedirectUrl: String,
    Transactions: js.Array[PaymentTransaction]
  ): StartPaymentRequest = {
    val __obj = js.Dynamic.literal(CallbackUrl = CallbackUrl.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], FundingSources = FundingSources.asInstanceOf[js.Any], GuestCheckOut = GuestCheckOut.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], POSKey = POSKey.asInstanceOf[js.Any], PaymentRequestId = PaymentRequestId.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], RedirectUrl = RedirectUrl.asInstanceOf[js.Any], Transactions = Transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPaymentRequest]
  }
  
  extension [Self <: StartPaymentRequest](x: Self) {
    
    inline def setBillingAddress(value: BillingAddress): Self = StObject.set(x, "BillingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "BillingAddress", js.undefined)
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "CallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCardHolderNameHint(value: String): Self = StObject.set(x, "CardHolderNameHint", value.asInstanceOf[js.Any])
    
    inline def setCardHolderNameHintUndefined: Self = StObject.set(x, "CardHolderNameHint", js.undefined)
    
    inline def setChallengePreference(value: NoPreference | ChallengeRequired | NoChallengeNeeded): Self = StObject.set(x, "ChallengePreference", value.asInstanceOf[js.Any])
    
    inline def setChallengePreferenceUndefined: Self = StObject.set(x, "ChallengePreference", js.undefined)
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setDelayedCapturePeriod(value: String): Self = StObject.set(x, "DelayedCapturePeriod", value.asInstanceOf[js.Any])
    
    inline def setDelayedCapturePeriodUndefined: Self = StObject.set(x, "DelayedCapturePeriod", js.undefined)
    
    inline def setFundingSources(value: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]): Self = StObject.set(x, "FundingSources", value.asInstanceOf[js.Any])
    
    inline def setFundingSourcesVarargs(value: (All | Balance | BankCard | GooglePay | ApplePay | BankTransfer)*): Self = StObject.set(x, "FundingSources", js.Array(value*))
    
    inline def setGuestCheckOut(value: Boolean): Self = StObject.set(x, "GuestCheckOut", value.asInstanceOf[js.Any])
    
    inline def setInitiateRecurrence(value: Boolean): Self = StObject.set(x, "InitiateRecurrence", value.asInstanceOf[js.Any])
    
    inline def setInitiateRecurrenceUndefined: Self = StObject.set(x, "InitiateRecurrence", js.undefined)
    
    inline def setLocale(value: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setOrderNumber(value: String): Self = StObject.set(x, "OrderNumber", value.asInstanceOf[js.Any])
    
    inline def setOrderNumberUndefined: Self = StObject.set(x, "OrderNumber", js.undefined)
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setPayerAccount(value: PayerAccountInformation): Self = StObject.set(x, "PayerAccount", value.asInstanceOf[js.Any])
    
    inline def setPayerAccountUndefined: Self = StObject.set(x, "PayerAccount", js.undefined)
    
    inline def setPayerHint(value: String): Self = StObject.set(x, "PayerHint", value.asInstanceOf[js.Any])
    
    inline def setPayerHintUndefined: Self = StObject.set(x, "PayerHint", js.undefined)
    
    inline def setPayerHomeNumber(value: String): Self = StObject.set(x, "PayerHomeNumber", value.asInstanceOf[js.Any])
    
    inline def setPayerHomeNumberUndefined: Self = StObject.set(x, "PayerHomeNumber", js.undefined)
    
    inline def setPayerPhoneNumber(value: String): Self = StObject.set(x, "PayerPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPayerPhoneNumberUndefined: Self = StObject.set(x, "PayerPhoneNumber", js.undefined)
    
    inline def setPayerWorkPhoneNumber(value: String): Self = StObject.set(x, "PayerWorkPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPayerWorkPhoneNumberUndefined: Self = StObject.set(x, "PayerWorkPhoneNumber", js.undefined)
    
    inline def setPaymentRequestId(value: String): Self = StObject.set(x, "PaymentRequestId", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: Immediate | Reservation | DelayedCapture): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentWindow(value: String): Self = StObject.set(x, "PaymentWindow", value.asInstanceOf[js.Any])
    
    inline def setPaymentWindowUndefined: Self = StObject.set(x, "PaymentWindow", js.undefined)
    
    inline def setPurchaseInformation(value: PurchaseInformation): Self = StObject.set(x, "PurchaseInformation", value.asInstanceOf[js.Any])
    
    inline def setPurchaseInformationUndefined: Self = StObject.set(x, "PurchaseInformation", js.undefined)
    
    inline def setRecurrenceId(value: String): Self = StObject.set(x, "RecurrenceId", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceIdUndefined: Self = StObject.set(x, "RecurrenceId", js.undefined)
    
    inline def setRecurrenceType(value: OneClickPayment | MerchantInitiatedPayment | RecurringPayment): Self = StObject.set(x, "RecurrenceType", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceTypeUndefined: Self = StObject.set(x, "RecurrenceType", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "RedirectUrl", value.asInstanceOf[js.Any])
    
    inline def setReservationPeriod(value: String): Self = StObject.set(x, "ReservationPeriod", value.asInstanceOf[js.Any])
    
    inline def setReservationPeriodUndefined: Self = StObject.set(x, "ReservationPeriod", js.undefined)
    
    inline def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "ShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "ShippingAddress", js.undefined)
    
    inline def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
    
    inline def setTraceIdUndefined: Self = StObject.set(x, "TraceId", js.undefined)
    
    inline def setTransactions(value: js.Array[PaymentTransaction]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: PaymentTransaction*): Self = StObject.set(x, "Transactions", js.Array(value*))
  }
}
