package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CVVCode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CVVCode")
@js.native
object CVVCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CVVCode & String] = js.native
  
  @js.native
  sealed trait ALL_OTHERS
    extends StObject
       with CVVCode
  /* "All others" */ val ALL_OTHERS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.ALL_OTHERS & String = js.native
  
  @js.native
  sealed trait E
    extends StObject
       with CVVCode
  /* "E" */ val E: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.E & String = js.native
  
  @js.native
  sealed trait I
    extends StObject
       with CVVCode
  /* "I" */ val I: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.I & String = js.native
  
  @js.native
  sealed trait M
    extends StObject
       with CVVCode
  /* "M" */ val M: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.M & String = js.native
  
  @js.native
  sealed trait Maestro_matched
    extends StObject
       with CVVCode
  /* "0" */ val Maestro_matched: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_matched & String = js.native
  
  @js.native
  sealed trait Maestro_not_available
    extends StObject
       with CVVCode
  /* "4" */ val Maestro_not_available: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_available & String = js.native
  
  @js.native
  sealed trait Maestro_not_implemented
    extends StObject
       with CVVCode
  /* "2" */ val Maestro_not_implemented: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_implemented & String = js.native
  
  @js.native
  sealed trait Maestro_not_match
    extends StObject
       with CVVCode
  /* "1" */ val Maestro_not_match: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_match & String = js.native
  
  @js.native
  sealed trait Maestro_not_present
    extends StObject
       with CVVCode
  /* "3" */ val Maestro_not_present: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_present & String = js.native
  
  @js.native
  sealed trait N
    extends StObject
       with CVVCode
  /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.N & String = js.native
  
  @js.native
  sealed trait P
    extends StObject
       with CVVCode
  /* "P" */ val P: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.P & String = js.native
  
  @js.native
  sealed trait S
    extends StObject
       with CVVCode
  /* "S" */ val S: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.S & String = js.native
  
  @js.native
  sealed trait U
    extends StObject
       with CVVCode
  /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.U & String = js.native
  
  @js.native
  sealed trait X
    extends StObject
       with CVVCode
  /* "X" */ val X: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.X & String = js.native
}
