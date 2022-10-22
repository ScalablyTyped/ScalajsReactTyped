package typingsJapgolly.paypalCheckoutServerSdk.mod

import typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.BasePaymentHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payments {
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AVSCode")
  @js.native
  object AVSCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode & String] = js.native
    
    /* "A" */ val A: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.A & String = js.native
    
    /* "B" */ val B: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.B & String = js.native
    
    /* "C" */ val C: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.C & String = js.native
    
    /* "D" */ val D: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.D & String = js.native
    
    /* "E" */ val E: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.E & String = js.native
    
    /* "F" */ val F: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.F & String = js.native
    
    /* "G" */ val G: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.G & String = js.native
    
    /* "I" */ val I: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.I & String = js.native
    
    /* "M" */ val M: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.M & String = js.native
    
    /* "0" */ val MAESTRO_ALL_MATCHES: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_ALL_MATCHES & String = js.native
    
    /* "1" */ val MAESTRO_NONE_MATCHES: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_NONE_MATCHES & String = js.native
    
    /* "4" */ val MAESTRO_NOT_AVAILABLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_NOT_AVAILABLE & String = js.native
    
    /* "3" */ val MAESTRO_NOT_PROCESSED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_NOT_PROCESSED & String = js.native
    
    /* "Null" */ val MAESTRO_NOT_RESPONSE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_NOT_RESPONSE & String = js.native
    
    /* "2" */ val MAESTRO_PART_MATCHES: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.MAESTRO_PART_MATCHES & String = js.native
    
    /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.N & String = js.native
    
    /* "P" */ val P: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.P & String = js.native
    
    /* "R" */ val R: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.R & String = js.native
    
    /* "S" */ val S: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.S & String = js.native
    
    /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.U & String = js.native
    
    /* "W" */ val W: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.W & String = js.native
    
    /* "X" */ val X: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.X & String = js.native
    
    /* "Y" */ val Y: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.Y & String = js.native
    
    /* "Z" */ val Z: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AVSCode.Z & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AccountType")
  @js.native
  object AccountType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AccountType & String] = js.native
    
    /* "CHECKING" */ val CHECKING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AccountType.CHECKING & String = js.native
    
    /* "SAVINGS" */ val SAVINGS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.AccountType.SAVINGS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsCaptureRequest")
  @js.native
  open class AuthorizationsCaptureRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsCaptureRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsGetRequest")
  @js.native
  open class AuthorizationsGetRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsGetRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsReauthorizeRequest")
  @js.native
  open class AuthorizationsReauthorizeRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsReauthorizeRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsVoidRequest")
  @js.native
  open class AuthorizationsVoidRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsVoidRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.BasePaymentRequest")
  @js.native
  open class BasePaymentRequest[H /* <: BasePaymentHeaders */, D] protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.BasePaymentRequest[H, D] {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CVVCode")
  @js.native
  object CVVCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode & String] = js.native
    
    /* "All others" */ val ALL_OTHERS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.ALL_OTHERS & String = js.native
    
    /* "E" */ val E: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.E & String = js.native
    
    /* "I" */ val I: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.I & String = js.native
    
    /* "M" */ val M: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.M & String = js.native
    
    /* "0" */ val Maestro_matched: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_matched & String = js.native
    
    /* "4" */ val Maestro_not_available: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_available & String = js.native
    
    /* "2" */ val Maestro_not_implemented: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_implemented & String = js.native
    
    /* "1" */ val Maestro_not_match: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_match & String = js.native
    
    /* "3" */ val Maestro_not_present: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_present & String = js.native
    
    /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.N & String = js.native
    
    /* "P" */ val P: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.P & String = js.native
    
    /* "S" */ val S: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.S & String = js.native
    
    /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.U & String = js.native
    
    /* "X" */ val X: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.X & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CapturesGetRequest")
  @js.native
  open class CapturesGetRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.CapturesGetRequest {
    def this(authorizationId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CapturesRefundRequest")
  @js.native
  open class CapturesRefundRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.CapturesRefundRequest {
    def this(captureId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CardBrand")
  @js.native
  object CardBrand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand & String] = js.native
    
    /* "AMEX" */ val AMEX: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.AMEX & String = js.native
    
    /* "CB_NATIONALE" */ val CB_NATIONALE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CB_NATIONALE & String = js.native
    
    /* "CETELEM" */ val CETELEM: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CETELEM & String = js.native
    
    /* "CHINA_UNION_PAY" */ val CHINA_UNION_PAY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CHINA_UNION_PAY & String = js.native
    
    /* "CONFIDIS" */ val CONFIDIS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CONFIDIS & String = js.native
    
    /* "CONFIGOGA" */ val CONFIGOGA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CONFIGOGA & String = js.native
    
    /* "DELTA" */ val DELTA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.DELTA & String = js.native
    
    /* "DISCOVER" */ val DISCOVER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.DISCOVER & String = js.native
    
    /* "ELECTRON" */ val ELECTRON: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.ELECTRON & String = js.native
    
    /* "JCB" */ val JCB: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.JCB & String = js.native
    
    /* "MAESTRO" */ val MAESTRO: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.MAESTRO & String = js.native
    
    /* "MASTERCARD" */ val MASTERCARD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.MASTERCARD & String = js.native
    
    /* "SOLO" */ val SOLO: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.SOLO & String = js.native
    
    /* "STAR" */ val STAR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.STAR & String = js.native
    
    /* "SWITCH" */ val SWITCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.SWITCH & String = js.native
    
    /* "VISA" */ val VISA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.VISA & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.CardType")
  @js.native
  object CardType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType & String] = js.native
    
    /* "CREDIT" */ val CREDIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.CREDIT & String = js.native
    
    /* "DEBIT" */ val DEBIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.DEBIT & String = js.native
    
    /* "PREPAID" */ val PREPAID: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.PREPAID & String = js.native
    
    /* "STORE" */ val STORE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.STORE & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.UNKNOWN & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.DisbursementMode")
  @js.native
  object DisbursementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisbursementMode & String
      ] = js.native
    
    /* "DELAYED" */ val DELAYED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisbursementMode.DELAYED & String = js.native
    
    /* "INSTANT" */ val INSTANT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisbursementMode.INSTANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.DisputeCategory")
  @js.native
  object DisputeCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisputeCategory & String
      ] = js.native
    
    /* "ITEM_NOT_RECEIVED" */ val ITEM_NOT_RECEIVED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisputeCategory.ITEM_NOT_RECEIVED & String = js.native
    
    /* "UNAUTHORIZED_TRANSACTION" */ val UNAUTHORIZED_TRANSACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.DisputeCategory.UNAUTHORIZED_TRANSACTION & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Method")
  @js.native
  object Method extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method & String] = js.native
    
    /* "CONNECT" */ val CONNECT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.CONNECT & String = js.native
    
    /* "DELETE" */ val DELETE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.DELETE & String = js.native
    
    /* "GET" */ val GET: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.GET & String = js.native
    
    /* "HEAD" */ val HEAD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.HEAD & String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.OPTIONS & String = js.native
    
    /* "PATCH" */ val PATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.PATCH & String = js.native
    
    /* "POST" */ val POST: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.POST & String = js.native
    
    /* "PUT" */ val PUT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.PUT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.PaymentAdviceCode")
  @js.native
  object PaymentAdviceCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode & String
      ] = js.native
    
    /* "03" */ val MASTERCARD_ACCOUNT_CLOSED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_ACCOUNT_CLOSED & String = js.native
    
    /* "02" */ val MASTERCARD_CREDIT_LIMIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_CREDIT_LIMIT & String = js.native
    
    /* "01" */ val MASTERCARD_EXPIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_EXPIRED & String = js.native
    
    /* "21" */ val MASTERCARD_UNSUCCESSFUL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_UNSUCCESSFUL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Reason")
  @js.native
  object Reason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason & String] = js.native
    
    /* "BUYER_COMPLAINT" */ val BUYER_COMPLAINT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.BUYER_COMPLAINT & String = js.native
    
    /* "CHARGEBACK" */ val CHARGEBACK: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.CHARGEBACK & String = js.native
    
    /* "ECHECK" */ val ECHECK: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.ECHECK & String = js.native
    
    /* "INTERNATIONAL_WITHDRAWAL" */ val INTERNATIONAL_WITHDRAWAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.INTERNATIONAL_WITHDRAWAL & String = js.native
    
    /* "OTHER" */ val OTHER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.OTHER & String = js.native
    
    /* "PENDING_REVIEW" */ val PENDING_REVIEW: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.PENDING_REVIEW & String = js.native
    
    /* "RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION" */ val RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION & String = js.native
    
    /* "REFUNDED" */ val REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.REFUNDED & String = js.native
    
    /* "TRANSACTION_APPROVED_AWAITING_FUNDING" */ val TRANSACTION_APPROVED_AWAITING_FUNDING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.TRANSACTION_APPROVED_AWAITING_FUNDING & String = js.native
    
    /* "UNILATERAL" */ val UNILATERAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.UNILATERAL & String = js.native
    
    /* "VERIFICATION_REQUIRED" */ val VERIFICATION_REQUIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.VERIFICATION_REQUIRED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.RefundsGetRequest")
  @js.native
  open class RefundsGetRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.payments.RefundsGetRequest {
    def this(refundId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.ResponseCode")
  @js.native
  object ResponseCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode & String] = js.native
    
    /* "6300" */ val ACCOUNT_NOT_ON_FILE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ACCOUNT_NOT_ON_FILE & String = js.native
    
    /* "PPAG" */ val ADULT_GAMING_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ADULT_GAMING_UNSUPPORTED & String = js.native
    
    /* "PPSE" */ val AMEX_DENIED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMEX_DENIED & String = js.native
    
    /* "PPAE" */ val AMEX_DISABLED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMEX_DISABLED & String = js.native
    
    /* "PPAX" */ val AMOUNT_EXCEEDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_EXCEEDED & String = js.native
    
    /* "PPAI" */ val AMOUNT_INCOMPATIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_INCOMPATIBLE & String = js.native
    
    /* "PPS6" */ val AMOUNT_MISMATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AMOUNT_MISMATCH & String = js.native
    
    /* "0000" */ val APPROVED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.APPROVED & String = js.native
    
    /* "7600" */ val APPROVED_NON_CAPTURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.APPROVED_NON_CAPTURE & String = js.native
    
    /* "PPAV" */ val ARC_AVS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_AVS & String = js.native
    
    /* "PPC2" */ val ARC_CVV: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_CVV & String = js.native
    
    /* "PPSC" */ val ARC_SCORE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ARC_SCORE & String = js.native
    
    /* "7710" */ val AUTHENTICATION_FAILED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTHENTICATION_FAILED & String = js.native
    
    /* "PPDV" */ val AUTH_MESSAGE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTH_MESSAGE & String = js.native
    
    /* "PPAR" */ val AUTH_RESULT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AUTH_RESULT & String = js.native
    
    /* "5170" */ val AVS_FAILURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.AVS_FAILURE & String = js.native
    
    /* "PPBG" */ val BAD_GAMING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_GAMING & String = js.native
    
    /* "1360" */ val BAD_PROCESSING_CODE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_PROCESSING_CODE & String = js.native
    
    /* "0800" */ val BAD_RESPONSE_REVERSAL_REQUIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BAD_RESPONSE_REVERSAL_REQUIRED & String = js.native
    
    /* "PPS3" */ val BANKAUTH_EXPIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_EXPIRED & String = js.native
    
    /* "PPS0" */ val BANKAUTH_ROW_MISMATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_MISMATCH & String = js.native
    
    /* "PPS1" */ val BANKAUTH_ROW_SETTLED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_SETTLED & String = js.native
    
    /* "PPS2" */ val BANKAUTH_ROW_VOIDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BANKAUTH_ROW_VOIDED & String = js.native
    
    /* "PPAD" */ val BILLING_ADDRESS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BILLING_ADDRESS & String = js.native
    
    /* "7800" */ val BIN_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BIN_ERROR & String = js.native
    
    /* "PPMC" */ val BLOCKED_Mastercard: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.BLOCKED_Mastercard & String = js.native
    
    /* "5140" */ val CARD_CLOSED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_CLOSED & String = js.native
    
    /* "5930" */ val CARD_NOT_ACTIVATED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_NOT_ACTIVATED & String = js.native
    
    /* "PPCT" */ val CARD_TYPE_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CARD_TYPE_UNSUPPORTED & String = js.native
    
    /* "PPCE" */ val CE_REGISTRATION_INCOMPLETE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CE_REGISTRATION_INCOMPLETE & String = js.native
    
    /* "8020" */ val CONFIGURATION_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CONFIGURATION_ERROR & String = js.native
    
    /* "PPCO" */ val COUNTRY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.COUNTRY & String = js.native
    
    /* "PPS5" */ val CREDITCARD_MISMATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CREDITCARD_MISMATCH & String = js.native
    
    /* "PPCR" */ val CREDIT_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CREDIT_ERROR & String = js.native
    
    /* "PPUC" */ val CURRENCY_CODE_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_CODE_UNSUPPORTED & String = js.native
    
    /* "PPS4" */ val CURRENCY_MISMATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_MISMATCH & String = js.native
    
    /* "PPCU" */ val CURRENCY_USED_INVALID: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CURRENCY_USED_INVALID & String = js.native
    
    /* "5110" */ val CVV2_FAILURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CVV2_FAILURE & String = js.native
    
    /* "PCVV" */ val CVV_FAILURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.CVV_FAILURE & String = js.native
    
    /* "PPDC" */ val DCC_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DCC_UNSUPPORTED & String = js.native
    
    /* "9100" */ val DECLINED_PLEASE_RETRY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DECLINED_PLEASE_RETRY & String = js.native
    
    /* "PPDI" */ val DINERS_REJECT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DINERS_REJECT & String = js.native
    
    /* "0500" */ val DO_NOT_HONOR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DO_NOT_HONOR & String = js.native
    
    /* "5200" */ val DUPLICATE_TRANSACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.DUPLICATE_TRANSACTION & String = js.native
    
    /* "7700" */ val ERROR_3DS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ERROR_3DS & String = js.native
    
    /* "PPEL" */ val EXCEEDS_FREQUENCY_LIMIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXCEEDS_FREQUENCY_LIMIT & String = js.native
    
    /* "5400" */ val EXPIRED_CARD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRED_CARD & String = js.native
    
    /* "PPEF" */ val EXPIRED_FUNDING_INSTRUMENT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRED_FUNDING_INSTRUMENT & String = js.native
    
    /* "PPEX" */ val EXPIRY_DATE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.EXPIRY_DATE & String = js.native
    
    /* "8100" */ val FATAL_COMMUNICATION_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FATAL_COMMUNICATION_ERROR & String = js.native
    
    /* "PPFV" */ val FIELD_VALIDATION_FAILED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FIELD_VALIDATION_FAILED & String = js.native
    
    /* "PPFE" */ val FUNDING_SOURCE_ALREADY_EXISTS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.FUNDING_SOURCE_ALREADY_EXISTS & String = js.native
    
    /* "PPGR" */ val GAMING_REFUND_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.GAMING_REFUND_ERROR & String = js.native
    
    /* "5100" */ val GENERIC_DECLINE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.GENERIC_DECLINE & String = js.native
    
    /* "PPH1" */ val H1_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.H1_ERROR & String = js.native
    
    /* "9530" */ val HOLD_CALL_CENTER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.HOLD_CALL_CENTER & String = js.native
    
    /* "8010" */ val HOST_KEY_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.HOST_KEY_ERROR & String = js.native
    
    /* "PPIF" */ val IDEMPOTENCY_FAILURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.IDEMPOTENCY_FAILURE & String = js.native
    
    /* "PPIM" */ val ID_MISMATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ID_MISMATCH & String = js.native
    
    /* "5500" */ val INCORRECT_PIN_REENTER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INCORRECT_PIN_REENTER & String = js.native
    
    /* "5120" */ val INSUFFICIENT_FUNDS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INSUFFICIENT_FUNDS & String = js.native
    
    /* "PPER" */ val INTERNAL_SYSTEM_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INTERNAL_SYSTEM_ERROR & String = js.native
    
    /* "1330" */ val INVALID_ACCOUNT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ACCOUNT & String = js.native
    
    /* "1335" */ val INVALID_ACCOUNT_RECURRING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ACCOUNT_RECURRING & String = js.native
    
    /* "1310" */ val INVALID_AMOUNT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_AMOUNT & String = js.native
    
    /* "1317" */ val INVALID_CAPTURE_DATE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CAPTURE_DATE & String = js.native
    
    /* "1382" */ val INVALID_CARD_VERIFICATION_VALUE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CARD_VERIFICATION_VALUE & String = js.native
    
    /* "1320" */ val INVALID_CURRENCY_CODE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_CURRENCY_CODE & String = js.native
    
    /* "1300" */ val INVALID_DATA_FORMAT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_DATA_FORMAT & String = js.native
    
    /* "1380" */ val INVALID_EXPIRATION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_EXPIRATION & String = js.native
    
    /* "PPFI" */ val INVALID_FUNDING_INSTRUMENT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_FUNDING_INSTRUMENT & String = js.native
    
    /* "PPII" */ val INVALID_INPUT_FAILURE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_INPUT_FAILURE & String = js.native
    
    /* "5900" */ val INVALID_ISSUE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ISSUE & String = js.native
    
    /* "1384" */ val INVALID_LIFE_CYCLE_OF_TRANSACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_LIFE_CYCLE_OF_TRANSACTION & String = js.native
    
    /* "1370" */ val INVALID_MCC: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_MCC & String = js.native
    
    /* "1350" */ val INVALID_MERCHANT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_MERCHANT & String = js.native
    
    /* "1390" */ val INVALID_ORDER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_ORDER & String = js.native
    
    /* "5180" */ val INVALID_OR_RESTRICTED_CARD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_OR_RESTRICTED_CARD & String = js.native
    
    /* "PPRF" */ val INVALID_PARENT_TRANSACTION_STATUS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PARENT_TRANSACTION_STATUS & String = js.native
    
    /* "PPPM" */ val INVALID_PAYMENT_METHOD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PAYMENT_METHOD & String = js.native
    
    /* "5130" */ val INVALID_PIN: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PIN & String = js.native
    
    /* "PPPI" */ val INVALID_PRODUCT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_PRODUCT & String = js.native
    
    /* "1340" */ val INVALID_TERMINAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TERMINAL & String = js.native
    
    /* "PPIT" */ val INVALID_TRACE_ID: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRACE_ID & String = js.native
    
    /* "PPTF" */ val INVALID_TRACE_REFERENCE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRACE_REFERENCE & String = js.native
    
    /* "5210" */ val INVALID_TRANSACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION & String = js.native
    
    /* "1312" */ val INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION_CARD_ISSUER_ACQUIRER & String = js.native
    
    /* "PPTI" */ val INVALID_TRANSACTION_ID: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_TRANSACTION_ID & String = js.native
    
    /* "PPTV" */ val INVALID_VERIFICATION_TOKEN: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.INVALID_VERIFICATION_TOKEN & String = js.native
    
    /* "5910" */ val ISSUER_NOT_AVAILABLE_NOT_RETRIABLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_NOT_RETRIABLE & String = js.native
    
    /* "5920" */ val ISSUER_NOT_AVAILABLE_RETRIABLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.ISSUER_NOT_AVAILABLE_RETRIABLE & String = js.native
    
    /* "PPLS" */ val LARGE_STATUS_CODE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LARGE_STATUS_CODE & String = js.native
    
    /* "PPLR" */ val LATE_REVERSAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LATE_REVERSAL & String = js.native
    
    /* "9520" */ val LOST_OR_STOLEN: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.LOST_OR_STOLEN & String = js.native
    
    /* "PPAU" */ val MCC_CODE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.MCC_CODE & String = js.native
    
    /* "PPRR" */ val MERCHANT_NOT_REGISTERED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.MERCHANT_NOT_REGISTERED & String = js.native
    
    /* "PPNT" */ val NETWORK_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NETWORK_ERROR & String = js.native
    
    /* "PPNC" */ val NOT_SUPPORTED_NRC: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NOT_SUPPORTED_NRC & String = js.native
    
    /* "PPPH" */ val NO_PHONE_FOR_DCC_TRANSACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.NO_PHONE_FOR_DCC_TRANSACTION & String = js.native
    
    /* "1000" */ val PARTIAL_AUTHORIZATION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PARTIAL_AUTHORIZATION & String = js.native
    
    /* "5150" */ val PICKUP_CARD_SPECIAL_CONDITIONS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PICKUP_CARD_SPECIAL_CONDITIONS & String = js.native
    
    /* "7900" */ val PIN_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PIN_ERROR & String = js.native
    
    /* "PPMD" */ val PPMD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PPMD & String = js.native
    
    /* "8000" */ val PROCESSOR_SYSTEM_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.PROCESSOR_SYSTEM_ERROR & String = js.native
    
    /* "PPQC" */ val QUASI_CASH_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.QUASI_CASH_UNSUPPORTED & String = js.native
    
    /* "0100" */ val REFERRAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REFERRAL & String = js.native
    
    /* "9540" */ val REFUSED_CARD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REFUSED_CARD & String = js.native
    
    /* "PPFR" */ val RESTRICTED_FUNDING_INSTRUMENT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.RESTRICTED_FUNDING_INSTRUMENT & String = js.native
    
    /* "8110" */ val RETRIABLE_COMMUNICATION_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.RETRIABLE_COMMUNICATION_ERROR & String = js.native
    
    /* "5800" */ val REVERSAL_REJECTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.REVERSAL_REJECTED & String = js.native
    
    /* "PPD3" */ val SECURE_ERROR_3DS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SECURE_ERROR_3DS & String = js.native
    
    /* "9510" */ val SECURITY_VIOLATION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SECURITY_VIOLATION & String = js.native
    
    /* "5190" */ val SOFT_AVS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SOFT_AVS & String = js.native
    
    /* "PPSD" */ val STATUS_DESCRIPTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.STATUS_DESCRIPTION & String = js.native
    
    /* "9500" */ val SUSPECTED_FRAUD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SUSPECTED_FRAUD & String = js.native
    
    /* "8220" */ val SYSTEM_UNAVAILABLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.SYSTEM_UNAVAILABLE & String = js.native
    
    /* "1393" */ val TRANSACTION_CANNOT_BE_COMPLETED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_CANNOT_BE_COMPLETED & String = js.native
    
    /* "5700" */ val TRANSACTION_NOT_PERMITTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_NOT_PERMITTED & String = js.native
    
    /* "PPTT" */ val TRANSACTION_TYPE_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.TRANSACTION_TYPE_UNSUPPORTED & String = js.native
    
    /* "5160" */ val UNAUTHORIZED_USER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNAUTHORIZED_USER & String = js.native
    
    /* "9600" */ val UNRECOGNIZED_RESPONSE_CODE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNRECOGNIZED_RESPONSE_CODE & String = js.native
    
    /* "8030" */ val UNSUPPORTED_OPERATION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORTED_OPERATION & String = js.native
    
    /* "PPUR" */ val UNSUPPORTED_REVERSAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORTED_REVERSAL & String = js.native
    
    /* "PPUE" */ val UNSUPPORT_ENTITY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_ENTITY & String = js.native
    
    /* "PPUI" */ val UNSUPPORT_INSTALLMENT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_INSTALLMENT & String = js.native
    
    /* "PPUP" */ val UNSUPPORT_POS_FLAG: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_POS_FLAG & String = js.native
    
    /* "PPRE" */ val UNSUPPORT_REFUND_ON_PENDING_BC: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.UNSUPPORT_REFUND_ON_PENDING_BC & String = js.native
    
    /* "PPUA" */ val USER_NOT_AUTHORIZED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.USER_NOT_AUTHORIZED & String = js.native
    
    /* "PPVC" */ val VALIDATE_CURRENCY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VALIDATE_CURRENCY & String = js.native
    
    /* "PPVE" */ val VALIDATION_ERROR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VALIDATION_ERROR & String = js.native
    
    /* "PPTE" */ val VERIFICATION_TOKEN_EXPIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VERIFICATION_TOKEN_EXPIRED & String = js.native
    
    /* "PPTR" */ val VERIFICATION_TOKEN_REVOKED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VERIFICATION_TOKEN_REVOKED & String = js.native
    
    /* "PPVT" */ val VIRTUAL_TERMINAL_UNSUPPORTED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ResponseCode.VIRTUAL_TERMINAL_UNSUPPORTED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.ShippingType")
  @js.native
  object ShippingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ShippingType & String] = js.native
    
    /* "PICKUP" */ val PICKUP: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ShippingType.PICKUP & String = js.native
    
    /* "PICKUP_IN_PERSON" */ val PICKUP_IN_PERSON: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ShippingType.PICKUP_IN_PERSON & String = js.native
    
    /* "SHIPPING" */ val SHIPPING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.ShippingType.SHIPPING & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status & String] = js.native
    
    /* "CANCELLED" */ val CANCELLED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CANCELLED & String = js.native
    
    /* "CAPTURED" */ val CAPTURED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CAPTURED & String = js.native
    
    /* "COMPLETED" */ val COMPLETED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.COMPLETED & String = js.native
    
    /* "CREATED" */ val CREATED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CREATED & String = js.native
    
    /* "DECLINED" */ val DECLINED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.DECLINED & String = js.native
    
    /* "DENIED" */ val DENIED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.DENIED & String = js.native
    
    /* "ELIGIBLE" */ val ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.ELIGIBLE & String = js.native
    
    /* "EXPIRED" */ val EXPIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.EXPIRED & String = js.native
    
    /* "FAILED" */ val FAILED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.FAILED & String = js.native
    
    /* "NOT_ELIGIBLE" */ val NOT_ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.NOT_ELIGIBLE & String = js.native
    
    /* "PARTIALLY_CAPTURED" */ val PARTIALLY_CAPTURED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_CAPTURED & String = js.native
    
    /* "PARTIALLY_CREATED" */ val PARTIALLY_CREATED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_CREATED & String = js.native
    
    /* "PARTIALLY_ELIGIBLE" */ val PARTIALLY_ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_ELIGIBLE & String = js.native
    
    /* "PARTIALLY_REFUNDED" */ val PARTIALLY_REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_REFUNDED & String = js.native
    
    /* "PENDING" */ val PENDING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PENDING & String = js.native
    
    /* "REFUNDED" */ val REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.REFUNDED & String = js.native
    
    /* "VOIDED" */ val VOIDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.VOIDED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.TaxIdType")
  @js.native
  object TaxIdType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.TaxIdType & String] = js.native
    
    /* "BR_CNPJ" */ val BR_CNPJ: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.TaxIdType.BR_CNPJ & String = js.native
    
    /* "BR_CPF" */ val BR_CPF: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.TaxIdType.BR_CPF & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "payments.TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.TokenType & String] = js.native
    
    /* "BILLING_AGREEMENT" */ val BILLING_AGREEMENT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.TokenType.BILLING_AGREEMENT & String = js.native
  }
}
