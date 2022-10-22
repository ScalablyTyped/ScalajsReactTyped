package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Tier extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Tier")
@js.native
object Tier extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Tier & String] = js.native
  
  @js.native
  sealed trait BUSINESS
    extends StObject
       with Tier
  /* "BUSINESS" */ val BUSINESS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.BUSINESS & String = js.native
  
  @js.native
  sealed trait PERSONAL
    extends StObject
       with Tier
  /* "PERSONAL" */ val PERSONAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PERSONAL & String = js.native
  
  @js.native
  sealed trait PREMIER
    extends StObject
       with Tier
  /* "PREMIER" */ val PREMIER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PREMIER & String = js.native
}
