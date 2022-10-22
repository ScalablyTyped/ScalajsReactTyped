package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Issuer extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Issuer")
@js.native
object Issuer extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Issuer & String] = js.native
  
  @js.native
  sealed trait CARD_ISSUER_INSTALLMENTS
    extends StObject
       with Issuer
  /* "CARD_ISSUER_INSTALLMENTS" */ val CARD_ISSUER_INSTALLMENTS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.CARD_ISSUER_INSTALLMENTS & String = js.native
  
  @js.native
  sealed trait PAYPAL
    extends StObject
       with Issuer
  /* "PAYPAL" */ val PAYPAL: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.PAYPAL & String = js.native
}
