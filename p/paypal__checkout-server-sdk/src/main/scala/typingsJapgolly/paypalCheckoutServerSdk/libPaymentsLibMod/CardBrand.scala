package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardBrand extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CardBrand")
@js.native
object CardBrand extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardBrand & String] = js.native
  
  @js.native
  sealed trait AMEX
    extends StObject
       with CardBrand
  /* "AMEX" */ val AMEX: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.AMEX & String = js.native
  
  @js.native
  sealed trait CB_NATIONALE
    extends StObject
       with CardBrand
  /* "CB_NATIONALE" */ val CB_NATIONALE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CB_NATIONALE & String = js.native
  
  @js.native
  sealed trait CETELEM
    extends StObject
       with CardBrand
  /* "CETELEM" */ val CETELEM: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CETELEM & String = js.native
  
  @js.native
  sealed trait CHINA_UNION_PAY
    extends StObject
       with CardBrand
  /* "CHINA_UNION_PAY" */ val CHINA_UNION_PAY: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CHINA_UNION_PAY & String = js.native
  
  @js.native
  sealed trait CONFIDIS
    extends StObject
       with CardBrand
  /* "CONFIDIS" */ val CONFIDIS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CONFIDIS & String = js.native
  
  @js.native
  sealed trait CONFIGOGA
    extends StObject
       with CardBrand
  /* "CONFIGOGA" */ val CONFIGOGA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.CONFIGOGA & String = js.native
  
  @js.native
  sealed trait DELTA
    extends StObject
       with CardBrand
  /* "DELTA" */ val DELTA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.DELTA & String = js.native
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with CardBrand
  /* "DISCOVER" */ val DISCOVER: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.DISCOVER & String = js.native
  
  @js.native
  sealed trait ELECTRON
    extends StObject
       with CardBrand
  /* "ELECTRON" */ val ELECTRON: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.ELECTRON & String = js.native
  
  @js.native
  sealed trait JCB
    extends StObject
       with CardBrand
  /* "JCB" */ val JCB: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.JCB & String = js.native
  
  @js.native
  sealed trait MAESTRO
    extends StObject
       with CardBrand
  /* "MAESTRO" */ val MAESTRO: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.MAESTRO & String = js.native
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with CardBrand
  /* "MASTERCARD" */ val MASTERCARD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.MASTERCARD & String = js.native
  
  @js.native
  sealed trait SOLO
    extends StObject
       with CardBrand
  /* "SOLO" */ val SOLO: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.SOLO & String = js.native
  
  @js.native
  sealed trait STAR
    extends StObject
       with CardBrand
  /* "STAR" */ val STAR: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.STAR & String = js.native
  
  @js.native
  sealed trait SWITCH
    extends StObject
       with CardBrand
  /* "SWITCH" */ val SWITCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.SWITCH & String = js.native
  
  @js.native
  sealed trait VISA
    extends StObject
       with CardBrand
  /* "VISA" */ val VISA: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand.VISA & String = js.native
}
