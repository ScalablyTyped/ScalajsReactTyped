package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnrollmentStatus extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "EnrollmentStatus")
@js.native
object EnrollmentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EnrollmentStatus & String] = js.native
  
  @js.native
  sealed trait B
    extends StObject
       with EnrollmentStatus
  /* "B" */ val B: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.B & String = js.native
  
  @js.native
  sealed trait N
    extends StObject
       with EnrollmentStatus
  /* "N" */ val N: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.N & String = js.native
  
  @js.native
  sealed trait U
    extends StObject
       with EnrollmentStatus
  /* "U" */ val U: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.U & String = js.native
  
  @js.native
  sealed trait Y
    extends StObject
       with EnrollmentStatus
  /* "Y" */ val Y: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.Y & String = js.native
}
