package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Reason extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "Reason")
@js.native
object Reason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Reason & String] = js.native
  
  @js.native
  sealed trait BUYER_COMPLAINT
    extends StObject
       with Reason
  /* "BUYER_COMPLAINT" */ val BUYER_COMPLAINT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.BUYER_COMPLAINT & String = js.native
  
  @js.native
  sealed trait CHARGEBACK
    extends StObject
       with Reason
  /* "CHARGEBACK" */ val CHARGEBACK: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.CHARGEBACK & String = js.native
  
  @js.native
  sealed trait ECHECK
    extends StObject
       with Reason
  /* "ECHECK" */ val ECHECK: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.ECHECK & String = js.native
  
  @js.native
  sealed trait INTERNATIONAL_WITHDRAWAL
    extends StObject
       with Reason
  /* "INTERNATIONAL_WITHDRAWAL" */ val INTERNATIONAL_WITHDRAWAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.INTERNATIONAL_WITHDRAWAL & String = js.native
  
  @js.native
  sealed trait OTHER
    extends StObject
       with Reason
  /* "OTHER" */ val OTHER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.OTHER & String = js.native
  
  @js.native
  sealed trait PENDING_REVIEW
    extends StObject
       with Reason
  /* "PENDING_REVIEW" */ val PENDING_REVIEW: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.PENDING_REVIEW & String = js.native
  
  @js.native
  sealed trait RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION
    extends StObject
       with Reason
  /* "RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION" */ val RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION & String = js.native
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with Reason
  /* "REFUNDED" */ val REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.REFUNDED & String = js.native
  
  @js.native
  sealed trait TRANSACTION_APPROVED_AWAITING_FUNDING
    extends StObject
       with Reason
  /* "TRANSACTION_APPROVED_AWAITING_FUNDING" */ val TRANSACTION_APPROVED_AWAITING_FUNDING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.TRANSACTION_APPROVED_AWAITING_FUNDING & String = js.native
  
  @js.native
  sealed trait UNILATERAL
    extends StObject
       with Reason
  /* "UNILATERAL" */ val UNILATERAL: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.UNILATERAL & String = js.native
  
  @js.native
  sealed trait VERIFICATION_REQUIRED
    extends StObject
       with Reason
  /* "VERIFICATION_REQUIRED" */ val VERIFICATION_REQUIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Reason.VERIFICATION_REQUIRED & String = js.native
}
