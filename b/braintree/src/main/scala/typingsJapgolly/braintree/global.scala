package typingsJapgolly.braintree

import typingsJapgolly.braintree.anon.Active
import typingsJapgolly.braintree.anon.All
import typingsJapgolly.braintree.anon.Api
import typingsJapgolly.braintree.anon.ApplicationIncomplete
import typingsJapgolly.braintree.anon.AuthorizationExpired
import typingsJapgolly.braintree.anon.Bank
import typingsJapgolly.braintree.anon.Canceled
import typingsJapgolly.braintree.anon.Credit
import typingsJapgolly.braintree.anon.FullInformation
import typingsJapgolly.braintree.anon.Held
import typingsJapgolly.braintree.anon.International
import typingsJapgolly.braintree.anon.No
import typingsJapgolly.braintree.anon.Sale
import typingsJapgolly.braintree.mod.GatewayConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object braintree {
    
    @JSGlobal("braintree.AccountUpdaterDailyReport")
    @js.native
    open class AccountUpdaterDailyReport ()
      extends typingsJapgolly.braintree.mod.AccountUpdaterDailyReport
    
    @JSGlobal("braintree.AddOn")
    @js.native
    open class AddOn ()
      extends typingsJapgolly.braintree.mod.AddOn
    
    @JSGlobal("braintree.Address")
    @js.native
    open class Address ()
      extends typingsJapgolly.braintree.mod.Address
    
    @JSGlobal("braintree.AndroidPayCard")
    @js.native
    open class AndroidPayCard ()
      extends typingsJapgolly.braintree.mod.AndroidPayCard
    
    @JSGlobal("braintree.ApplePayCard")
    @js.native
    open class ApplePayCard ()
      extends typingsJapgolly.braintree.mod.ApplePayCard
    
    @JSGlobal("braintree.BraintreeGateway")
    @js.native
    open class BraintreeGateway protected ()
      extends typingsJapgolly.braintree.mod.BraintreeGateway {
      def this(config: GatewayConfig) = this()
    }
    
    @JSGlobal("braintree.CreditCard")
    @js.native
    open class CreditCard ()
      extends typingsJapgolly.braintree.mod.CreditCard
    /* static members */
    object CreditCard {
      
      @JSGlobal("braintree.CreditCard")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.CreditCard.CardType")
      @js.native
      def CardType: All = js.native
      
      @JSGlobal("braintree.CreditCard.CardTypeIndicator")
      @js.native
      def CardTypeIndicator: No = js.native
      inline def CardTypeIndicator_=(x: No): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardTypeIndicator")(x.asInstanceOf[js.Any])
      
      inline def CardType_=(x: All): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardType")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.CreditCard.CustomerLocation")
      @js.native
      def CustomerLocation: International = js.native
      inline def CustomerLocation_=(x: International): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomerLocation")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.CreditCardVerification")
    @js.native
    open class CreditCardVerification ()
      extends typingsJapgolly.braintree.mod.CreditCardVerification
    
    @JSGlobal("braintree.Customer")
    @js.native
    open class Customer ()
      extends typingsJapgolly.braintree.mod.Customer
    
    @JSGlobal("braintree.Disbursement")
    @js.native
    open class Disbursement ()
      extends typingsJapgolly.braintree.mod.Disbursement
    /* static members */
    object Disbursement {
      
      @JSGlobal("braintree.Disbursement")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Disbursement.Types")
      @js.native
      def Types: Credit = js.native
      inline def Types_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Types")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.Discount")
    @js.native
    open class Discount ()
      extends typingsJapgolly.braintree.mod.Discount
    
    @JSGlobal("braintree.Dispute")
    @js.native
    open class Dispute ()
      extends typingsJapgolly.braintree.mod.Dispute
    
    @JSGlobal("braintree.Environment")
    @js.native
    object Environment extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.braintree.mod.Environment & String] = js.native
      
      /* "Development" */ val Development: typingsJapgolly.braintree.mod.Environment.Development & String = js.native
      
      /* "Production" */ val Production: typingsJapgolly.braintree.mod.Environment.Production & String = js.native
      
      /* "Qa" */ val Qa: typingsJapgolly.braintree.mod.Environment.Qa & String = js.native
      
      /* "Sandbox" */ val Sandbox: typingsJapgolly.braintree.mod.Environment.Sandbox & String = js.native
    }
    
    @JSGlobal("braintree.MasterpassCard")
    @js.native
    open class MasterpassCard ()
      extends typingsJapgolly.braintree.mod.MasterpassCard
    
    @JSGlobal("braintree.MerchantAccount")
    @js.native
    open class MerchantAccount ()
      extends typingsJapgolly.braintree.mod.MerchantAccount
    /* static members */
    object MerchantAccount {
      
      @JSGlobal("braintree.MerchantAccount")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.MerchantAccount.FundingDestination")
      @js.native
      def FundingDestination: Bank = js.native
      inline def FundingDestination_=(x: Bank): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FundingDestination")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.MerchantAccount.Status")
      @js.native
      def Status: Active = js.native
      inline def Status_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.PayPalAccount")
    @js.native
    open class PayPalAccount ()
      extends typingsJapgolly.braintree.mod.PayPalAccount
    
    @JSGlobal("braintree.PaymentMethodNonce")
    @js.native
    open class PaymentMethodNonce ()
      extends typingsJapgolly.braintree.mod.PaymentMethodNonce
    
    @JSGlobal("braintree.Plan")
    @js.native
    open class Plan ()
      extends typingsJapgolly.braintree.mod.Plan
    
    @JSGlobal("braintree.SamsungPayCard")
    @js.native
    open class SamsungPayCard ()
      extends typingsJapgolly.braintree.mod.SamsungPayCard
    
    @JSGlobal("braintree.SettlementBatchSummary")
    @js.native
    open class SettlementBatchSummary ()
      extends typingsJapgolly.braintree.mod.SettlementBatchSummary
    
    @JSGlobal("braintree.Subscription")
    @js.native
    open class Subscription ()
      extends typingsJapgolly.braintree.mod.Subscription
    /* static members */
    object Subscription {
      
      @JSGlobal("braintree.Subscription")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Subscription.Status")
      @js.native
      def Status: Canceled = js.native
      inline def Status_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.Test")
    @js.native
    open class Test ()
      extends typingsJapgolly.braintree.mod.Test
    
    @JSGlobal("braintree.Transaction")
    @js.native
    open class Transaction ()
      extends typingsJapgolly.braintree.mod.Transaction
    /* static members */
    object Transaction {
      
      @JSGlobal("braintree.Transaction")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Transaction.CreatedUsing")
      @js.native
      def CreatedUsing: FullInformation = js.native
      inline def CreatedUsing_=(x: FullInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatedUsing")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.EscrowStatus")
      @js.native
      def EscrowStatus: Held = js.native
      inline def EscrowStatus_=(x: Held): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EscrowStatus")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.GatewayRejectionReason")
      @js.native
      def GatewayRejectionReason: ApplicationIncomplete = js.native
      inline def GatewayRejectionReason_=(x: ApplicationIncomplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GatewayRejectionReason")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Source")
      @js.native
      def Source: Api = js.native
      inline def Source_=(x: Api): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Source")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Status")
      @js.native
      def Status: AuthorizationExpired = js.native
      inline def Status_=(x: AuthorizationExpired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Type")
      @js.native
      def Type: Sale = js.native
      inline def Type_=(x: Sale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Type")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.TransactionLineItem")
    @js.native
    open class TransactionLineItem ()
      extends typingsJapgolly.braintree.mod.TransactionLineItem
    
    @JSGlobal("braintree.VenmoAccount")
    @js.native
    open class VenmoAccount ()
      extends typingsJapgolly.braintree.mod.VenmoAccount
    
    @JSGlobal("braintree.VisaCheckoutCard")
    @js.native
    open class VisaCheckoutCard ()
      extends typingsJapgolly.braintree.mod.VisaCheckoutCard
  }
}
