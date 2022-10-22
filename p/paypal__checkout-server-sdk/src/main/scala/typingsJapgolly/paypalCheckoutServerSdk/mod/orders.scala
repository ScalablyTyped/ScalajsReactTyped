package typingsJapgolly.paypalCheckoutServerSdk.mod

import typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orders {
  
  @JSImport("@paypal/checkout-server-sdk", "orders.AccountTier")
  @js.native
  object AccountTier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.AuthenticationStatus")
  @js.native
  object AuthenticationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus & String
      ] = js.native
    
    /* "A" */ val A: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.A & String = js.native
    
    /* "C" */ val C: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.C & String = js.native
    
    /* "D" */ val D: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.D & String = js.native
    
    /* "I" */ val I: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.I & String = js.native
    
    /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.N & String = js.native
    
    /* "R" */ val R: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.R & String = js.native
    
    /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.U & String = js.native
    
    /* "Y" */ val Y: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.BaseOrderRequest")
  @js.native
  open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.BaseOrderRequest[H, B] {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category & String] = js.native
    
    /* "DIGITAL_GOODS" */ val DIGITAL_GOODS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.DIGITAL_GOODS & String = js.native
    
    /* "DONATION" */ val DONATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.DONATION & String = js.native
    
    /* "PHYSICAL_GOODS" */ val PHYSICAL_GOODS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.PHYSICAL_GOODS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Contingency")
  @js.native
  object Contingency extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Contingency & String] = js.native
    
    /* "3D_SECURE" */ val `3D_SECURE`: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Contingency.`3D_SECURE` & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Enrolled")
  @js.native
  object Enrolled extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled & String] = js.native
    
    /* "B" */ val B: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.B & String = js.native
    
    /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.N & String = js.native
    
    /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.U & String = js.native
    
    /* "Y" */ val Y: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.EnrollmentStatus")
  @js.native
  object EnrollmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus & String
      ] = js.native
    
    /* "B" */ val B: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.B & String = js.native
    
    /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.N & String = js.native
    
    /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.U & String = js.native
    
    /* "Y" */ val Y: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.IdentityDocumentType")
  @js.native
  object IdentityDocumentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType & String
      ] = js.native
    
    /* "INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER" */ val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER & String = js.native
    
    /* "NATIONAL_IDENTIFICATION_NUMBER" */ val NATIONAL_IDENTIFICATION_NUMBER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.NATIONAL_IDENTIFICATION_NUMBER & String = js.native
    
    /* "PASSPORT_NUMBER" */ val PASSPORT_NUMBER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.PASSPORT_NUMBER & String = js.native
    
    /* "SOCIAL_SECURITY_NUMBER" */ val SOCIAL_SECURITY_NUMBER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.SOCIAL_SECURITY_NUMBER & String = js.native
    
    /* "SSN4" */ val SSN4: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.SSN4 & String = js.native
    
    /* "TAX_IDENTIFICATION_NUMBER" */ val TAX_IDENTIFICATION_NUMBER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Issuer")
  @js.native
  object Issuer extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Issuer & String] = js.native
    
    /* "CARD_ISSUER_INSTALLMENTS" */ val CARD_ISSUER_INSTALLMENTS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.CARD_ISSUER_INSTALLMENTS & String = js.native
    
    /* "PAYPAL" */ val PAYPAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.PAYPAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.LandingPage")
  @js.native
  object LandingPage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage & String] = js.native
    
    /* "BILLING" */ val BILLING: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.BILLING & String = js.native
    
    /* "LOGIN" */ val LOGIN: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.LOGIN & String = js.native
    
    /* "NO_PREFERENCE" */ val NO_PREFERENCE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.NO_PREFERENCE & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.LiabilityShift")
  @js.native
  object LiabilityShift extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift & String] = js.native
    
    /* "NO" */ val NO: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.NO & String = js.native
    
    /* "POSSIBLE" */ val POSSIBLE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.POSSIBLE & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.UNKNOWN & String = js.native
    
    /* "YES" */ val YES: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.YES & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsCurrencyReceivingType")
  @js.native
  object ModelEnumsCurrencyReceivingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType & String
      ] = js.native
    
    /* "ACCEPT" */ val ACCEPT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT & String = js.native
    
    /* "ACCEPT_OPEN" */ val ACCEPT_OPEN: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT_OPEN & String = js.native
    
    /* "DENY" */ val DENY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.DENY & String = js.native
    
    /* "HOLD" */ val HOLD: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.HOLD & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsDisbursementType")
  @js.native
  object ModelEnumsDisbursementType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType & String
      ] = js.native
    
    /* "DELAYED" */ val DELAYED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType.DELAYED & String = js.native
    
    /* "INSTANT" */ val INSTANT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType.INSTANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsFacilitatorType")
  @js.native
  object ModelEnumsFacilitatorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType & String
      ] = js.native
    
    /* "API_CALLER" */ val API_CALLER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.API_CALLER & String = js.native
    
    /* "INTERNAL" */ val INTERNAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.INTERNAL & String = js.native
    
    /* "PARTNER" */ val PARTNER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.PARTNER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsLiabilityType")
  @js.native
  object ModelEnumsLiabilityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType & String
      ] = js.native
    
    /* "FULL" */ val FULL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType.FULL & String = js.native
    
    /* "PARTIAL" */ val PARTIAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType.PARTIAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsParticipantType")
  @js.native
  object ModelEnumsParticipantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType & String
      ] = js.native
    
    /* "FACILITATOR" */ val FACILITATOR: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.FACILITATOR & String = js.native
    
    /* "RECEIVER" */ val RECEIVER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.RECEIVER & String = js.native
    
    /* "SENDER" */ val SENDER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.SENDER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsPricingType")
  @js.native
  object ModelEnumsPricingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType & String
      ] = js.native
    
    /* "BLENDED" */ val BLENDED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.BLENDED & String = js.native
    
    /* "IC_PLUS" */ val IC_PLUS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.IC_PLUS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Operation")
  @js.native
  object Operation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation & String] = js.native
    
    /* "add" */ val ADD: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.ADD & String = js.native
    
    /* "copy" */ val COPY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.COPY & String = js.native
    
    /* "move" */ val MOVE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.MOVE & String = js.native
    
    /* "remove" */ val REMOVE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REMOVE & String = js.native
    
    /* "replace" */ val REPLACE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REPLACE & String = js.native
    
    /* "test" */ val TEST: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.TEST & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersAuthorizeRequest")
  @js.native
  open class OrdersAuthorizeRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersAuthorizeRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCaptureRequest")
  @js.native
  open class OrdersCaptureRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersCaptureRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCreateRequest")
  @js.native
  open class OrdersCreateRequest ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersCreateRequest
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersGetRequest")
  @js.native
  open class OrdersGetRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersGetRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersPatchRequest")
  @js.native
  open class OrdersPatchRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersPatchRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersValidateRequest")
  @js.native
  open class OrdersValidateRequest protected ()
    extends typingsJapgolly.paypalCheckoutServerSdk.libLibMod.orders.OrdersValidateRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Orthography")
  @js.native
  object Orthography extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography & String] = js.native
    
    /* "Arab" */ val Arab: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Arab & String = js.native
    
    /* "Armn" */ val Armn: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Armn & String = js.native
    
    /* "Beng" */ val Beng: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Beng & String = js.native
    
    /* "Cans" */ val Cans: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Cans & String = js.native
    
    /* "Cyrl" */ val Cyrl: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Cyrl & String = js.native
    
    /* "Deva" */ val Deva: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Deva & String = js.native
    
    /* "Ethi" */ val Ethi: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Ethi & String = js.native
    
    /* "Geor" */ val Geor: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Geor & String = js.native
    
    /* "Grek" */ val Grek: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Grek & String = js.native
    
    /* "Gujr" */ val Gujr: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Gujr & String = js.native
    
    /* "Guru" */ val Guru: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Guru & String = js.native
    
    /* "Hani" */ val Hani: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Hani & String = js.native
    
    /* "Hebr" */ val Hebr: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Hebr & String = js.native
    
    /* "Java" */ val Java: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Java & String = js.native
    
    /* "Jpan" */ val Jpan: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Jpan & String = js.native
    
    /* "Kana" */ val Kana: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Kana & String = js.native
    
    /* "Khmr" */ val Khmr: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Khmr & String = js.native
    
    /* "Knda" */ val Knda: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Knda & String = js.native
    
    /* "Kore" */ val Kore: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Kore & String = js.native
    
    /* "Laoo" */ val Laoo: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Laoo & String = js.native
    
    /* "Latn" */ val Latn: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Latn & String = js.native
    
    /* "Mlym" */ val Mlym: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mlym & String = js.native
    
    /* "Mong" */ val Mong: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mong & String = js.native
    
    /* "Mymr" */ val Mymr: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mymr & String = js.native
    
    /* "Orya" */ val Orya: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Orya & String = js.native
    
    /* "Sinh" */ val Sinh: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Sinh & String = js.native
    
    /* "Sund" */ val Sund: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Sund & String = js.native
    
    /* "Syrc" */ val Syrc: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Syrc & String = js.native
    
    /* "Taml" */ val Taml: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Taml & String = js.native
    
    /* "Telu" */ val Telu: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Telu & String = js.native
    
    /* "Thaa" */ val Thaa: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Thaa & String = js.native
    
    /* "Thai" */ val Thai: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Thai & String = js.native
    
    /* "Tibt" */ val Tibt: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Tibt & String = js.native
    
    /* "Yiii" */ val Yiii: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Yiii & String = js.native
    
    /* "Zyyy" */ val Zyyy: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Zyyy & String = js.native
    
    /* "Zzzz" */ val Zzzz: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Zzzz & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PayeePreferred")
  @js.native
  object PayeePreferred extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred & String] = js.native
    
    /* "IMMEDIATE_PAYMENT_REQUIRED" */ val IMMEDIATE_PAYMENT_REQUIRED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.IMMEDIATE_PAYMENT_REQUIRED & String = js.native
    
    /* "UNRESTRICTED" */ val UNRESTRICTED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.UNRESTRICTED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PaymentInitiator")
  @js.native
  object PaymentInitiator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator & String
      ] = js.native
    
    /* "CUSTOMER" */ val CUSTOMER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator.CUSTOMER & String = js.native
    
    /* "MERCHANT" */ val MERCHANT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator.MERCHANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PaymentType")
  @js.native
  object PaymentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType & String] = js.native
    
    /* "ONE_TIME" */ val ONE_TIME: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.ONE_TIME & String = js.native
    
    /* "RECURRING" */ val RECURRING: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.RECURRING & String = js.native
    
    /* "UNSCHEDULED" */ val UNSCHEDULED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.UNSCHEDULED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PhoneType")
  @js.native
  object PhoneType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType & String] = js.native
    
    /* "FAX" */ val FAX: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.FAX & String = js.native
    
    /* "HOME" */ val HOME: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.HOME & String = js.native
    
    /* "MOBILE" */ val MOBILE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.MOBILE & String = js.native
    
    /* "OTHER" */ val OTHER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.OTHER & String = js.native
    
    /* "PAGER" */ val PAGER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.PAGER & String = js.native
    
    /* "WORK" */ val WORK: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.WORK & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.StandardEntryClassCode")
  @js.native
  object StandardEntryClassCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode & String
      ] = js.native
    
    /* "CCD" */ val CCD: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.CCD & String = js.native
    
    /* "PPD" */ val PP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.PP & String = js.native
    
    /* "TEL" */ val TEL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.TEL & String = js.native
    
    /* "WEB" */ val WEB: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.WEB & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Tier")
  @js.native
  object Tier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Usage")
  @js.native
  object Usage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Usage & String] = js.native
    
    /* "DERIVED" */ val DERIVED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Usage.DERIVED & String = js.native
    
    /* "FIRST" */ val FIRST: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Usage.FIRST & String = js.native
    
    /* "SUBSEQUENT" */ val SUBSEQUENT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Usage.SUBSEQUENT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.business_type")
  @js.native
  object businessType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType & String] = js.native
    
    /* "ANY_OTHER_BUSINESS_ENTITY" */ val ANY_OTHER_BUSINESS_ENTITY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ANY_OTHER_BUSINESS_ENTITY & String = js.native
    
    /* "ASSOCIATION" */ val ASSOCIATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ASSOCIATION & String = js.native
    
    /* "CORPORATION" */ val CORPORATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.CORPORATION & String = js.native
    
    /* "GENERAL_PARTNERSHIP" */ val GENERAL_PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GENERAL_PARTNERSHIP & String = js.native
    
    /* "GOVERNMENT" */ val GOVERNMENT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GOVERNMENT & String = js.native
    
    /* "INDIVIDUAL" */ val INDIVIDUAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.INDIVIDUAL & String = js.native
    
    /* "LIMITED_LIABILITY_PARTNERSHIP" */ val LIMITED_LIABILITY_PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PARTNERSHIP & String = js.native
    
    /* "LIMITED_LIABILITY_PRIVATE_CORPORATION" */ val LIMITED_LIABILITY_PRIVATE_CORPORATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PRIVATE_CORPORATION & String = js.native
    
    /* "LIMITED_LIABILITY_PROPRIETORS" */ val LIMITED_LIABILITY_PROPRIETORS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PROPRIETORS & String = js.native
    
    /* "LIMITED_PARTNERSHIP" */ val LIMITED_PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP & String = js.native
    
    /* "LIMITED_PARTNERSHIP_PRIVATE_CORPORATION" */ val LIMITED_PARTNERSHIP_PRIVATE_CORPORATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP_PRIVATE_CORPORATION & String = js.native
    
    /* "NONPROFIT" */ val NONPROFIT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.NONPROFIT & String = js.native
    
    /* "ONLY_BUY_OR_SEND_MONEY" */ val ONLY_BUY_OR_SEND_MONEY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ONLY_BUY_OR_SEND_MONEY & String = js.native
    
    /* "OTHER_CORPORATE_BODY" */ val OTHER_CORPORATE_BODY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.OTHER_CORPORATE_BODY & String = js.native
    
    /* "PARTNERSHIP" */ val PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PARTNERSHIP & String = js.native
    
    /* "PRIVATE_CORPORATION" */ val PRIVATE_CORPORATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_CORPORATION & String = js.native
    
    /* "PRIVATE_PARTNERSHIP" */ val PRIVATE_PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_PARTNERSHIP & String = js.native
    
    /* "PROPRIETORSHIP" */ val PROPRIETORSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP & String = js.native
    
    /* "PROPRIETORSHIP_CRAFTSMAN" */ val PROPRIETORSHIP_CRAFTSMAN: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP_CRAFTSMAN & String = js.native
    
    /* "PROPRIETORY_COMPANY" */ val PROPRIETORY_COMPANY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORY_COMPANY & String = js.native
    
    /* "PUBLIC_COMPANY" */ val PUBLIC_COMPANY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_COMPANY & String = js.native
    
    /* "PUBLIC_CORPORATION" */ val PUBLIC_CORPORATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_CORPORATION & String = js.native
    
    /* "PUBLIC_PARTNERSHIP" */ val PUBLIC_PARTNERSHIP: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_PARTNERSHIP & String = js.native
    
    /* "REGISTERED_COOPERATIVE" */ val REGISTERED_COOPERATIVE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.businessType.REGISTERED_COOPERATIVE & String = js.native
  }
}
