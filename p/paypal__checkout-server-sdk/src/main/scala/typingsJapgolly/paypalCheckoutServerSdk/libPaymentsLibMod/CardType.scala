package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CardType")
@js.native
object CardType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType & String] = js.native
  
  @js.native
  sealed trait CREDIT
    extends StObject
       with CardType
  /* "CREDIT" */ val CREDIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.CREDIT & String = js.native
  
  @js.native
  sealed trait DEBIT
    extends StObject
       with CardType
  /* "DEBIT" */ val DEBIT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.DEBIT & String = js.native
  
  @js.native
  sealed trait PREPAID
    extends StObject
       with CardType
  /* "PREPAID" */ val PREPAID: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.PREPAID & String = js.native
  
  @js.native
  sealed trait STORE
    extends StObject
       with CardType
  /* "STORE" */ val STORE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.STORE & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with CardType
  /* "UNKNOWN" */ val UNKNOWN: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.UNKNOWN & String = js.native
}
