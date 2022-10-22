package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsCurrencyReceivingType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsCurrencyReceivingType")
@js.native
object ModelEnumsCurrencyReceivingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsCurrencyReceivingType & String] = js.native
  
  @js.native
  sealed trait ACCEPT
    extends StObject
       with ModelEnumsCurrencyReceivingType
  /* "ACCEPT" */ val ACCEPT: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT & String = js.native
  
  @js.native
  sealed trait ACCEPT_OPEN
    extends StObject
       with ModelEnumsCurrencyReceivingType
  /* "ACCEPT_OPEN" */ val ACCEPT_OPEN: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT_OPEN & String = js.native
  
  @js.native
  sealed trait DENY
    extends StObject
       with ModelEnumsCurrencyReceivingType
  /* "DENY" */ val DENY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.DENY & String = js.native
  
  @js.native
  sealed trait HOLD
    extends StObject
       with ModelEnumsCurrencyReceivingType
  /* "HOLD" */ val HOLD: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.HOLD & String = js.native
}
