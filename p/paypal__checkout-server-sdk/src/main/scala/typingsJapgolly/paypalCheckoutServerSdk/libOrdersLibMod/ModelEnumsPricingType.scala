package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsPricingType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsPricingType")
@js.native
object ModelEnumsPricingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsPricingType & String] = js.native
  
  @js.native
  sealed trait BLENDED
    extends StObject
       with ModelEnumsPricingType
  /* "BLENDED" */ val BLENDED: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.BLENDED & String = js.native
  
  @js.native
  sealed trait IC_PLUS
    extends StObject
       with ModelEnumsPricingType
  /* "IC_PLUS" */ val IC_PLUS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.IC_PLUS & String = js.native
}
