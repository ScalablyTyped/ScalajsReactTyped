package typingsJapgolly.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommerceEventType extends StObject
@JSImport("@mparticle/web-sdk", "CommerceEventType")
@js.native
object CommerceEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommerceEventType & Double] = js.native
  
  @js.native
  sealed trait ProductAddToCart
    extends StObject
       with CommerceEventType
  /* 10 */ val ProductAddToCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart & Double = js.native
  
  @js.native
  sealed trait ProductAddToWishlist
    extends StObject
       with CommerceEventType
  /* 20 */ val ProductAddToWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToWishlist & Double = js.native
  
  @js.native
  sealed trait ProductCheckout
    extends StObject
       with CommerceEventType
  /* 12 */ val ProductCheckout: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckout & Double = js.native
  
  @js.native
  sealed trait ProductCheckoutOption
    extends StObject
       with CommerceEventType
  /* 13 */ val ProductCheckoutOption: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckoutOption & Double = js.native
  
  @js.native
  sealed trait ProductClick
    extends StObject
       with CommerceEventType
  /* 14 */ val ProductClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductClick & Double = js.native
  
  @js.native
  sealed trait ProductImpression
    extends StObject
       with CommerceEventType
  /* 22 */ val ProductImpression: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductImpression & Double = js.native
  
  @js.native
  sealed trait ProductPurchase
    extends StObject
       with CommerceEventType
  /* 16 */ val ProductPurchase: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductPurchase & Double = js.native
  
  @js.native
  sealed trait ProductRefund
    extends StObject
       with CommerceEventType
  /* 17 */ val ProductRefund: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRefund & Double = js.native
  
  @js.native
  sealed trait ProductRemoveFromCart
    extends StObject
       with CommerceEventType
  /* 11 */ val ProductRemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromCart & Double = js.native
  
  @js.native
  sealed trait ProductRemoveFromWishlist
    extends StObject
       with CommerceEventType
  /* 21 */ val ProductRemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromWishlist & Double = js.native
  
  @js.native
  sealed trait ProductViewDetail
    extends StObject
       with CommerceEventType
  /* 15 */ val ProductViewDetail: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductViewDetail & Double = js.native
  
  @js.native
  sealed trait PromotionClick
    extends StObject
       with CommerceEventType
  /* 19 */ val PromotionClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionClick & Double = js.native
  
  @js.native
  sealed trait PromotionView
    extends StObject
       with CommerceEventType
  /* 18 */ val PromotionView: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionView & Double = js.native
}
