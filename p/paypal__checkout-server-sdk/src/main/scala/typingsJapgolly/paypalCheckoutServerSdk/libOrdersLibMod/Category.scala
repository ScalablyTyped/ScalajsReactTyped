package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category & String] = js.native
  
  @js.native
  sealed trait DIGITAL_GOODS
    extends StObject
       with Category
  /* "DIGITAL_GOODS" */ val DIGITAL_GOODS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.DIGITAL_GOODS & String = js.native
  
  @js.native
  sealed trait DONATION
    extends StObject
       with Category
  /* "DONATION" */ val DONATION: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.DONATION & String = js.native
  
  @js.native
  sealed trait PHYSICAL_GOODS
    extends StObject
       with Category
  /* "PHYSICAL_GOODS" */ val PHYSICAL_GOODS: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Category.PHYSICAL_GOODS & String = js.native
}
