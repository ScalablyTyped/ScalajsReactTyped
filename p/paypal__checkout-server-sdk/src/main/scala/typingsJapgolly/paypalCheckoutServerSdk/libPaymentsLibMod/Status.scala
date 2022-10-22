package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Status & String] = js.native
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with Status
  /* "CANCELLED" */ val CANCELLED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CANCELLED & String = js.native
  
  @js.native
  sealed trait CAPTURED
    extends StObject
       with Status
  /* "CAPTURED" */ val CAPTURED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CAPTURED & String = js.native
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with Status
  /* "COMPLETED" */ val COMPLETED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.COMPLETED & String = js.native
  
  @js.native
  sealed trait CREATED
    extends StObject
       with Status
  /* "CREATED" */ val CREATED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.CREATED & String = js.native
  
  @js.native
  sealed trait DECLINED
    extends StObject
       with Status
  /* "DECLINED" */ val DECLINED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.DECLINED & String = js.native
  
  @js.native
  sealed trait DENIED
    extends StObject
       with Status
  /* "DENIED" */ val DENIED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.DENIED & String = js.native
  
  @js.native
  sealed trait ELIGIBLE
    extends StObject
       with Status
  /* "ELIGIBLE" */ val ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.ELIGIBLE & String = js.native
  
  @js.native
  sealed trait EXPIRED
    extends StObject
       with Status
  /* "EXPIRED" */ val EXPIRED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.EXPIRED & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with Status
  /* "FAILED" */ val FAILED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.FAILED & String = js.native
  
  @js.native
  sealed trait NOT_ELIGIBLE
    extends StObject
       with Status
  /* "NOT_ELIGIBLE" */ val NOT_ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.NOT_ELIGIBLE & String = js.native
  
  @js.native
  sealed trait PARTIALLY_CAPTURED
    extends StObject
       with Status
  /* "PARTIALLY_CAPTURED" */ val PARTIALLY_CAPTURED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_CAPTURED & String = js.native
  
  @js.native
  sealed trait PARTIALLY_CREATED
    extends StObject
       with Status
  /* "PARTIALLY_CREATED" */ val PARTIALLY_CREATED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_CREATED & String = js.native
  
  @js.native
  sealed trait PARTIALLY_ELIGIBLE
    extends StObject
       with Status
  /* "PARTIALLY_ELIGIBLE" */ val PARTIALLY_ELIGIBLE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_ELIGIBLE & String = js.native
  
  @js.native
  sealed trait PARTIALLY_REFUNDED
    extends StObject
       with Status
  /* "PARTIALLY_REFUNDED" */ val PARTIALLY_REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PARTIALLY_REFUNDED & String = js.native
  
  @js.native
  sealed trait PENDING
    extends StObject
       with Status
  /* "PENDING" */ val PENDING: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.PENDING & String = js.native
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with Status
  /* "REFUNDED" */ val REFUNDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.REFUNDED & String = js.native
  
  @js.native
  sealed trait VOIDED
    extends StObject
       with Status
  /* "VOIDED" */ val VOIDED: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Status.VOIDED & String = js.native
}
