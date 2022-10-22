package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccountTier extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "AccountTier")
@js.native
object AccountTier extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AccountTier & String] = js.native
  
  @js.native
  sealed trait BUSINESS
    extends StObject
       with AccountTier
  /* "BUSINESS" */ val BUSINESS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.BUSINESS & String = js.native
  
  @js.native
  sealed trait PERSONAL
    extends StObject
       with AccountTier
  /* "PERSONAL" */ val PERSONAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PERSONAL & String = js.native
  
  @js.native
  sealed trait PREMIER
    extends StObject
       with AccountTier
  /* "PREMIER" */ val PREMIER: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PREMIER & String = js.native
}
