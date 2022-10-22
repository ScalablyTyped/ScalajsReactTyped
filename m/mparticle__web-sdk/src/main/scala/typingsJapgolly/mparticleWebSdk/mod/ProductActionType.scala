package typingsJapgolly.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProductActionType extends StObject
@JSImport("@mparticle/web-sdk", "ProductActionType")
@js.native
object ProductActionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductActionType & Double] = js.native
  
  @js.native
  sealed trait AddToCart
    extends StObject
       with ProductActionType
  /* 1 */ val AddToCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToCart & Double = js.native
  
  @js.native
  sealed trait AddToWishlist
    extends StObject
       with ProductActionType
  /* 9 */ val AddToWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToWishlist & Double = js.native
  
  @js.native
  sealed trait Checkout
    extends StObject
       with ProductActionType
  /* 3 */ val Checkout: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Checkout & Double = js.native
  
  @js.native
  sealed trait CheckoutOption
    extends StObject
       with ProductActionType
  /* 4 */ val CheckoutOption: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.CheckoutOption & Double = js.native
  
  @js.native
  sealed trait Click
    extends StObject
       with ProductActionType
  /* 5 */ val Click: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Click & Double = js.native
  
  @js.native
  sealed trait Purchase
    extends StObject
       with ProductActionType
  /* 7 */ val Purchase: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Purchase & Double = js.native
  
  @js.native
  sealed trait Refund
    extends StObject
       with ProductActionType
  /* 8 */ val Refund: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Refund & Double = js.native
  
  @js.native
  sealed trait RemoveFromCart
    extends StObject
       with ProductActionType
  /* 2 */ val RemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromCart & Double = js.native
  
  @js.native
  sealed trait RemoveFromWishlist
    extends StObject
       with ProductActionType
  /* 10 */ val RemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromWishlist & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ProductActionType
  /* 0 */ val Unknown: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Unknown & Double = js.native
  
  @js.native
  sealed trait ViewDetail
    extends StObject
       with ProductActionType
  /* 6 */ val ViewDetail: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.ViewDetail & Double = js.native
}
