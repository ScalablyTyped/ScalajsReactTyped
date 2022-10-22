package typingsJapgolly.mparticleWebSdk

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mparticleWebSdk.mod.AliasUsersCallback
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToWishlist
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckout
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckoutOption
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductClick
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductImpression
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductPurchase
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRefund
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromCart
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromWishlist
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductViewDetail
import typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionView
import typingsJapgolly.mparticleWebSdk.mod.ConsentState
import typingsJapgolly.mparticleWebSdk.mod.CreateAliasRequest
import typingsJapgolly.mparticleWebSdk.mod.CreateConsentState
import typingsJapgolly.mparticleWebSdk.mod.CreateGDPRConsent
import typingsJapgolly.mparticleWebSdk.mod.CreateImpression
import typingsJapgolly.mparticleWebSdk.mod.CreateProduct
import typingsJapgolly.mparticleWebSdk.mod.CreatePromotion
import typingsJapgolly.mparticleWebSdk.mod.CreateTransactionAttributes
import typingsJapgolly.mparticleWebSdk.mod.EventType.Media
import typingsJapgolly.mparticleWebSdk.mod.EventType.Navigation
import typingsJapgolly.mparticleWebSdk.mod.EventType.Search
import typingsJapgolly.mparticleWebSdk.mod.EventType.Social
import typingsJapgolly.mparticleWebSdk.mod.EventType.Transaction
import typingsJapgolly.mparticleWebSdk.mod.EventType.UserContent
import typingsJapgolly.mparticleWebSdk.mod.EventType.UserPreference
import typingsJapgolly.mparticleWebSdk.mod.GetCurrentUser
import typingsJapgolly.mparticleWebSdk.mod.GetUser
import typingsJapgolly.mparticleWebSdk.mod.GetUsers
import typingsJapgolly.mparticleWebSdk.mod.Identify
import typingsJapgolly.mparticleWebSdk.mod.IdentityApiData
import typingsJapgolly.mparticleWebSdk.mod.IdentityCallback
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Email
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Facebook
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.FacebookCustomAudienceId
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Google
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Microsoft
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.MobileNumber
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other10
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other2
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other3
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other4
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other5
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other6
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other7
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other8
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other9
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber2
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber3
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Twitter
import typingsJapgolly.mparticleWebSdk.mod.IdentityType.Yahoo
import typingsJapgolly.mparticleWebSdk.mod.Impression
import typingsJapgolly.mparticleWebSdk.mod.LogCheckout
import typingsJapgolly.mparticleWebSdk.mod.LogImpression
import typingsJapgolly.mparticleWebSdk.mod.LogProductAction
import typingsJapgolly.mparticleWebSdk.mod.LogPromotion
import typingsJapgolly.mparticleWebSdk.mod.LogPurchase
import typingsJapgolly.mparticleWebSdk.mod.LogRefund
import typingsJapgolly.mparticleWebSdk.mod.Login
import typingsJapgolly.mparticleWebSdk.mod.Logout
import typingsJapgolly.mparticleWebSdk.mod.MPID
import typingsJapgolly.mparticleWebSdk.mod.Modify
import typingsJapgolly.mparticleWebSdk.mod.PrivacyConsentState
import typingsJapgolly.mparticleWebSdk.mod.Product
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToWishlist
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Checkout
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.CheckoutOption
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Click
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Purchase
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Refund
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromCart
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromWishlist
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Unknown
import typingsJapgolly.mparticleWebSdk.mod.ProductActionType.ViewDetail
import typingsJapgolly.mparticleWebSdk.mod.Promotion
import typingsJapgolly.mparticleWebSdk.mod.SDKEventAttrs
import typingsJapgolly.mparticleWebSdk.mod.SDKEventCustomFlags
import typingsJapgolly.mparticleWebSdk.mod.SDKEventOptions
import typingsJapgolly.mparticleWebSdk.mod.SetCurrencyCode
import typingsJapgolly.mparticleWebSdk.mod.TransactionAttributes
import typingsJapgolly.mparticleWebSdk.mod.User
import typingsJapgolly.mparticleWebSdk.mod.UserAliasRequest
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddToCart extends StObject {
    
    var AddToCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToCart
    
    var AddToWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToWishlist
    
    var Checkout: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Checkout
    
    var CheckoutOption: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.CheckoutOption
    
    var Click: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Click
    
    var Purchase: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Purchase
    
    var Refund: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Refund
    
    var RemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromCart
    
    var RemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromWishlist
    
    var Unknown: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Unknown
    
    var ViewDetail: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.ViewDetail
  }
  object AddToCart {
    
    inline def apply(
      AddToCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToCart,
      AddToWishlist: AddToWishlist,
      Checkout: Checkout,
      CheckoutOption: CheckoutOption,
      Click: Click,
      Purchase: Purchase,
      Refund: Refund,
      RemoveFromCart: RemoveFromCart,
      RemoveFromWishlist: RemoveFromWishlist,
      Unknown: Unknown,
      ViewDetail: ViewDetail
    ): AddToCart = {
      val __obj = js.Dynamic.literal(AddToCart = AddToCart.asInstanceOf[js.Any], AddToWishlist = AddToWishlist.asInstanceOf[js.Any], Checkout = Checkout.asInstanceOf[js.Any], CheckoutOption = CheckoutOption.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Purchase = Purchase.asInstanceOf[js.Any], Refund = Refund.asInstanceOf[js.Any], RemoveFromCart = RemoveFromCart.asInstanceOf[js.Any], RemoveFromWishlist = RemoveFromWishlist.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any], ViewDetail = ViewDetail.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToCart]
    }
    
    extension [Self <: AddToCart](x: Self) {
      
      inline def setAddToCart(value: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToCart): Self = StObject.set(x, "AddToCart", value.asInstanceOf[js.Any])
      
      inline def setAddToWishlist(value: AddToWishlist): Self = StObject.set(x, "AddToWishlist", value.asInstanceOf[js.Any])
      
      inline def setCheckout(value: Checkout): Self = StObject.set(x, "Checkout", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOption(value: CheckoutOption): Self = StObject.set(x, "CheckoutOption", value.asInstanceOf[js.Any])
      
      inline def setClick(value: Click): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
      
      inline def setPurchase(value: Purchase): Self = StObject.set(x, "Purchase", value.asInstanceOf[js.Any])
      
      inline def setRefund(value: Refund): Self = StObject.set(x, "Refund", value.asInstanceOf[js.Any])
      
      inline def setRemoveFromCart(value: RemoveFromCart): Self = StObject.set(x, "RemoveFromCart", value.asInstanceOf[js.Any])
      
      inline def setRemoveFromWishlist(value: RemoveFromWishlist): Self = StObject.set(x, "RemoveFromWishlist", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
      
      inline def setViewDetail(value: ViewDetail): Self = StObject.set(x, "ViewDetail", value.asInstanceOf[js.Any])
    }
  }
  
  trait AliasUsers extends StObject {
    
    var HTTPCodes: Any
    
    def aliasUsers(aliasRequest: UserAliasRequest): Unit
    def aliasUsers(aliasRequest: UserAliasRequest, callback: AliasUsersCallback): Unit
    @JSName("aliasUsers")
    var aliasUsers_Original: typingsJapgolly.mparticleWebSdk.mod.AliasUsers
    
    def createAliasRequest(sourceUser: User, destinationUser: User): UserAliasRequest
    @JSName("createAliasRequest")
    var createAliasRequest_Original: CreateAliasRequest
    
    def getCurrentUser(): User
    @JSName("getCurrentUser")
    var getCurrentUser_Original: GetCurrentUser
    
    def getUser(mpid: MPID): User
    @JSName("getUser")
    var getUser_Original: GetUser
    
    def getUsers(): js.Array[User]
    @JSName("getUsers")
    var getUsers_Original: GetUsers
    
    def identify(identityApiData: IdentityApiData): Unit
    def identify(identityApiData: IdentityApiData, callback: IdentityCallback): Unit
    @JSName("identify")
    var identify_Original: Identify
    
    def login(identityApiData: IdentityApiData): Unit
    def login(identityApiData: IdentityApiData, callback: IdentityCallback): Unit
    @JSName("login")
    var login_Original: Login
    
    def logout(): Unit
    def logout(identityApiData: js.Object): Unit
    def logout(identityApiData: js.Object, callback: IdentityCallback): Unit
    def logout(identityApiData: Null, callback: IdentityCallback): Unit
    def logout(identityApiData: Unit, callback: IdentityCallback): Unit
    def logout(identityApiData: IdentityApiData): Unit
    def logout(identityApiData: IdentityApiData, callback: IdentityCallback): Unit
    @JSName("logout")
    var logout_Original: Logout
    
    def modify(identityApiData: IdentityApiData): Unit
    def modify(identityApiData: IdentityApiData, callback: IdentityCallback): Unit
    @JSName("modify")
    var modify_Original: Modify
  }
  object AliasUsers {
    
    inline def apply(
      HTTPCodes: Any,
      aliasUsers: (/* aliasRequest */ UserAliasRequest, /* callback */ js.UndefOr[AliasUsersCallback]) => Callback,
      createAliasRequest: (/* sourceUser */ User, /* destinationUser */ User) => UserAliasRequest,
      getCurrentUser: CallbackTo[User],
      getUser: /* mpid */ MPID => User,
      getUsers: CallbackTo[js.Array[User]],
      identify: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback,
      login: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback,
      logout: (/* identityApiData */ js.UndefOr[IdentityApiData | js.Object | Null], /* callback */ js.UndefOr[IdentityCallback]) => Callback,
      modify: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback
    ): AliasUsers = {
      val __obj = js.Dynamic.literal(HTTPCodes = HTTPCodes.asInstanceOf[js.Any], aliasUsers = js.Any.fromFunction2((t0: /* aliasRequest */ UserAliasRequest, t1: /* callback */ js.UndefOr[AliasUsersCallback]) => (aliasUsers(t0, t1)).runNow()), createAliasRequest = js.Any.fromFunction2(createAliasRequest), getCurrentUser = getCurrentUser.toJsFn, getUser = js.Any.fromFunction1(getUser), getUsers = getUsers.toJsFn, identify = js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (identify(t0, t1)).runNow()), login = js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (login(t0, t1)).runNow()), logout = js.Any.fromFunction2((t0: /* identityApiData */ js.UndefOr[IdentityApiData | js.Object | Null], t1: /* callback */ js.UndefOr[IdentityCallback]) => (logout(t0, t1)).runNow()), modify = js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (modify(t0, t1)).runNow()))
      __obj.asInstanceOf[AliasUsers]
    }
    
    extension [Self <: AliasUsers](x: Self) {
      
      inline def setAliasUsers(
        value: (/* aliasRequest */ UserAliasRequest, /* callback */ js.UndefOr[AliasUsersCallback]) => Callback
      ): Self = StObject.set(x, "aliasUsers", js.Any.fromFunction2((t0: /* aliasRequest */ UserAliasRequest, t1: /* callback */ js.UndefOr[AliasUsersCallback]) => (value(t0, t1)).runNow()))
      
      inline def setCreateAliasRequest(value: (/* sourceUser */ User, /* destinationUser */ User) => UserAliasRequest): Self = StObject.set(x, "createAliasRequest", js.Any.fromFunction2(value))
      
      inline def setGetCurrentUser(value: CallbackTo[User]): Self = StObject.set(x, "getCurrentUser", value.toJsFn)
      
      inline def setGetUser(value: /* mpid */ MPID => User): Self = StObject.set(x, "getUser", js.Any.fromFunction1(value))
      
      inline def setGetUsers(value: CallbackTo[js.Array[User]]): Self = StObject.set(x, "getUsers", value.toJsFn)
      
      inline def setHTTPCodes(value: Any): Self = StObject.set(x, "HTTPCodes", value.asInstanceOf[js.Any])
      
      inline def setIdentify(
        value: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback
      ): Self = StObject.set(x, "identify", js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (value(t0, t1)).runNow()))
      
      inline def setLogin(
        value: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback
      ): Self = StObject.set(x, "login", js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (value(t0, t1)).runNow()))
      
      inline def setLogout(
        value: (/* identityApiData */ js.UndefOr[IdentityApiData | js.Object | Null], /* callback */ js.UndefOr[IdentityCallback]) => Callback
      ): Self = StObject.set(x, "logout", js.Any.fromFunction2((t0: /* identityApiData */ js.UndefOr[IdentityApiData | js.Object | Null], t1: /* callback */ js.UndefOr[IdentityCallback]) => (value(t0, t1)).runNow()))
      
      inline def setModify(
        value: (/* identityApiData */ IdentityApiData, /* callback */ js.UndefOr[IdentityCallback]) => Callback
      ): Self = StObject.set(x, "modify", js.Any.fromFunction2((t0: /* identityApiData */ IdentityApiData, t1: /* callback */ js.UndefOr[IdentityCallback]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Cart extends StObject {
    
    var Cart: typingsJapgolly.mparticleWebSdk.mod.Cart
    
    def createImpression(name: String, product: js.Array[Product]): Impression
    def createImpression(name: String, product: Product): Impression
    @JSName("createImpression")
    var createImpression_Original: CreateImpression
    
    def createProduct(
      name: String,
      sku: String,
      price: Double,
      quantity: js.UndefOr[Double],
      variant: js.UndefOr[String],
      category: js.UndefOr[String],
      brand: js.UndefOr[String],
      position: js.UndefOr[Double],
      coupon: js.UndefOr[String],
      attributes: js.UndefOr[SDKEventAttrs]
    ): Product
    @JSName("createProduct")
    var createProduct_Original: CreateProduct
    
    def createPromotion(id: String): Promotion
    def createPromotion(id: String, creative: String): Promotion
    def createPromotion(id: String, creative: String, name: String): Promotion
    def createPromotion(id: String, creative: String, name: String, position: Double): Promotion
    def createPromotion(id: String, creative: String, name: Unit, position: Double): Promotion
    def createPromotion(id: String, creative: Unit, name: String): Promotion
    def createPromotion(id: String, creative: Unit, name: String, position: Double): Promotion
    def createPromotion(id: String, creative: Unit, name: Unit, position: Double): Promotion
    @JSName("createPromotion")
    var createPromotion_Original: CreatePromotion
    
    def createTransactionAttributes(
      id: String | Double,
      affiliation: js.UndefOr[String],
      couponCode: js.UndefOr[String],
      revenue: js.UndefOr[Double],
      shipping: js.UndefOr[Double],
      tax: js.UndefOr[Double]
    ): TransactionAttributes
    @JSName("createTransactionAttributes")
    var createTransactionAttributes_Original: CreateTransactionAttributes
    
    def logCheckout(step: Double): Unit
    def logCheckout(step: Double, options: String): Unit
    def logCheckout(step: Double, options: String, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
    def logCheckout(step: Double, options: String, attrs: SDKEventAttrs): Unit
    def logCheckout(step: Double, options: String, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
    def logCheckout(step: Double, options: Unit, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
    def logCheckout(step: Double, options: Unit, attrs: SDKEventAttrs): Unit
    def logCheckout(step: Double, options: Unit, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
    @JSName("logCheckout")
    var logCheckout_Original: LogCheckout
    
    def logImpression(impression: js.Array[Impression]): Unit
    def logImpression(impression: js.Array[Impression], attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
    def logImpression(impression: js.Array[Impression], attrs: Unit, customFlags: Record[String, Any]): Unit
    def logImpression(
      impression: js.Array[Impression],
      attrs: Unit,
      customFlags: Record[String, Any],
      eventOptions: SDKEventOptions
    ): Unit
    def logImpression(impression: js.Array[Impression], attrs: Record[String, Any]): Unit
    def logImpression(
      impression: js.Array[Impression],
      attrs: Record[String, Any],
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logImpression(impression: js.Array[Impression], attrs: Record[String, Any], customFlags: Record[String, Any]): Unit
    def logImpression(
      impression: js.Array[Impression],
      attrs: Record[String, Any],
      customFlags: Record[String, Any],
      eventOptions: SDKEventOptions
    ): Unit
    def logImpression(impression: Impression): Unit
    def logImpression(impression: Impression, attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
    def logImpression(impression: Impression, attrs: Unit, customFlags: Record[String, Any]): Unit
    def logImpression(
      impression: Impression,
      attrs: Unit,
      customFlags: Record[String, Any],
      eventOptions: SDKEventOptions
    ): Unit
    def logImpression(impression: Impression, attrs: Record[String, Any]): Unit
    def logImpression(
      impression: Impression,
      attrs: Record[String, Any],
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logImpression(impression: Impression, attrs: Record[String, Any], customFlags: Record[String, Any]): Unit
    def logImpression(
      impression: Impression,
      attrs: Record[String, Any],
      customFlags: Record[String, Any],
      eventOptions: SDKEventOptions
    ): Unit
    @JSName("logImpression")
    var logImpression_Original: LogImpression
    
    def logProductAction(productActionType: ProductActionType, product: js.Array[Product]): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: SDKEventCustomFlags
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(productActionType: ProductActionType, product: js.Array[Product], attrs: SDKEventAttrs): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: js.Array[Product],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(productActionType: ProductActionType, product: Product): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: SDKEventCustomFlags
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(productActionType: ProductActionType, product: Product, attrs: SDKEventAttrs): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: Unit,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes
    ): Unit
    def logProductAction(
      productActionType: ProductActionType,
      product: Product,
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      transactionAttributes: TransactionAttributes,
      eventOptions: SDKEventOptions
    ): Unit
    @JSName("logProductAction")
    var logProductAction_Original: LogProductAction
    
    def logPromotion(`type`: Double, promotion: js.Array[Promotion]): Unit
    def logPromotion(
      `type`: Double,
      promotion: js.Array[Promotion],
      attrs: Unit,
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: js.Array[Promotion], attrs: Unit, customFlags: SDKEventCustomFlags): Unit
    def logPromotion(
      `type`: Double,
      promotion: js.Array[Promotion],
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: js.Array[Promotion], attrs: SDKEventAttrs): Unit
    def logPromotion(
      `type`: Double,
      promotion: js.Array[Promotion],
      attrs: SDKEventAttrs,
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(
      `type`: Double,
      promotion: js.Array[Promotion],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags
    ): Unit
    def logPromotion(
      `type`: Double,
      promotion: js.Array[Promotion],
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: Promotion): Unit
    def logPromotion(
      `type`: Double,
      promotion: Promotion,
      attrs: Unit,
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: Promotion, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
    def logPromotion(
      `type`: Double,
      promotion: Promotion,
      attrs: Unit,
      customFlags: SDKEventCustomFlags,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: Promotion, attrs: SDKEventAttrs): Unit
    def logPromotion(
      `type`: Double,
      promotion: Promotion,
      attrs: SDKEventAttrs,
      customFlags: Unit,
      eventOptions: SDKEventOptions
    ): Unit
    def logPromotion(`type`: Double, promotion: Promotion, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
    def logPromotion(
      `type`: Double,
      promotion: Promotion,
      attrs: SDKEventAttrs,
      customFlags: SDKEventCustomFlags,
      eventOptions: SDKEventOptions
    ): Unit
    @JSName("logPromotion")
    var logPromotion_Original: LogPromotion
    
    def logPurchase(
      transactionAttributes: TransactionAttributes,
      product: js.Array[Product],
      clearCart: Boolean,
      attrs: Record[String, Any],
      customFlags: Record[String, Any]
    ): Unit
    def logPurchase(
      transactionAttributes: TransactionAttributes,
      product: Product,
      clearCart: Boolean,
      attrs: Record[String, Any],
      customFlags: Record[String, Any]
    ): Unit
    @JSName("logPurchase")
    var logPurchase_Original: LogPurchase
    
    def logRefund(
      transactionAttributes: TransactionAttributes,
      product: js.Array[Product],
      clearCart: Boolean,
      attrs: Record[String, Any],
      customFlags: Record[String, Any]
    ): Unit
    def logRefund(
      transactionAttributes: TransactionAttributes,
      product: Product,
      clearCart: Boolean,
      attrs: Record[String, Any],
      customFlags: Record[String, Any]
    ): Unit
    @JSName("logRefund")
    var logRefund_Original: LogRefund
    
    def setCurrencyCode(code: String): Unit
    @JSName("setCurrencyCode")
    var setCurrencyCode_Original: SetCurrencyCode
  }
  object Cart {
    
    inline def apply(
      Cart: typingsJapgolly.mparticleWebSdk.mod.Cart,
      createImpression: (/* name */ String, /* product */ Product | js.Array[Product]) => Impression,
      createProduct: (/* name */ String, /* sku */ String, /* price */ Double, /* quantity */ js.UndefOr[Double], /* variant */ js.UndefOr[String], /* category */ js.UndefOr[String], /* brand */ js.UndefOr[String], /* position */ js.UndefOr[Double], /* coupon */ js.UndefOr[String], /* attributes */ js.UndefOr[SDKEventAttrs]) => Product,
      createPromotion: (/* id */ String, /* creative */ js.UndefOr[String], /* name */ js.UndefOr[String], /* position */ js.UndefOr[Double]) => Promotion,
      createTransactionAttributes: (/* id */ String | Double, /* affiliation */ js.UndefOr[String], /* couponCode */ js.UndefOr[String], /* revenue */ js.UndefOr[Double], /* shipping */ js.UndefOr[Double], /* tax */ js.UndefOr[Double]) => TransactionAttributes,
      logCheckout: (/* step */ Double, /* options */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags]) => Callback,
      logImpression: (/* impression */ js.Array[Impression] | Impression, /* attrs */ js.UndefOr[Record[String, Any]], /* customFlags */ js.UndefOr[Record[String, Any]], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback,
      logProductAction: (/* productActionType */ ProductActionType, /* product */ js.Array[Product] | Product, /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* transactionAttributes */ js.UndefOr[TransactionAttributes], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback,
      logPromotion: (/* type */ Double, /* promotion */ js.Array[Promotion] | Promotion, /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback,
      logPurchase: (/* transactionAttributes */ TransactionAttributes, /* product */ js.Array[Product] | Product, /* clearCart */ Boolean, /* attrs */ Record[String, Any], /* customFlags */ Record[String, Any]) => Callback,
      logRefund: (/* transactionAttributes */ TransactionAttributes, /* product */ js.Array[Product] | Product, /* clearCart */ Boolean, /* attrs */ Record[String, Any], /* customFlags */ Record[String, Any]) => Callback,
      setCurrencyCode: /* code */ String => Callback
    ): Cart = {
      val __obj = js.Dynamic.literal(Cart = Cart.asInstanceOf[js.Any], createImpression = js.Any.fromFunction2(createImpression), createProduct = js.Any.fromFunction10(createProduct), createPromotion = js.Any.fromFunction4(createPromotion), createTransactionAttributes = js.Any.fromFunction6(createTransactionAttributes), logCheckout = js.Any.fromFunction4((t0: /* step */ Double, t1: /* options */ js.UndefOr[String], t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags]) => (logCheckout(t0, t1, t2, t3)).runNow()), logImpression = js.Any.fromFunction4((t0: /* impression */ js.Array[Impression] | Impression, t1: /* attrs */ js.UndefOr[Record[String, Any]], t2: /* customFlags */ js.UndefOr[Record[String, Any]], t3: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logImpression(t0, t1, t2, t3)).runNow()), logProductAction = js.Any.fromFunction6((t0: /* productActionType */ ProductActionType, t1: /* product */ js.Array[Product] | Product, t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* transactionAttributes */ js.UndefOr[TransactionAttributes], t5: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logProductAction(t0, t1, t2, t3, t4, t5)).runNow()), logPromotion = js.Any.fromFunction5((t0: /* type */ Double, t1: /* promotion */ js.Array[Promotion] | Promotion, t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logPromotion(t0, t1, t2, t3, t4)).runNow()), logPurchase = js.Any.fromFunction5((t0: /* transactionAttributes */ TransactionAttributes, t1: /* product */ js.Array[Product] | Product, t2: /* clearCart */ Boolean, t3: /* attrs */ Record[String, Any], t4: /* customFlags */ Record[String, Any]) => (logPurchase(t0, t1, t2, t3, t4)).runNow()), logRefund = js.Any.fromFunction5((t0: /* transactionAttributes */ TransactionAttributes, t1: /* product */ js.Array[Product] | Product, t2: /* clearCart */ Boolean, t3: /* attrs */ Record[String, Any], t4: /* customFlags */ Record[String, Any]) => (logRefund(t0, t1, t2, t3, t4)).runNow()), setCurrencyCode = js.Any.fromFunction1((t0: /* code */ String) => setCurrencyCode(t0).runNow()))
      __obj.asInstanceOf[Cart]
    }
    
    extension [Self <: Cart](x: Self) {
      
      inline def setCart(value: typingsJapgolly.mparticleWebSdk.mod.Cart): Self = StObject.set(x, "Cart", value.asInstanceOf[js.Any])
      
      inline def setCreateImpression(value: (/* name */ String, /* product */ Product | js.Array[Product]) => Impression): Self = StObject.set(x, "createImpression", js.Any.fromFunction2(value))
      
      inline def setCreateProduct(
        value: (/* name */ String, /* sku */ String, /* price */ Double, /* quantity */ js.UndefOr[Double], /* variant */ js.UndefOr[String], /* category */ js.UndefOr[String], /* brand */ js.UndefOr[String], /* position */ js.UndefOr[Double], /* coupon */ js.UndefOr[String], /* attributes */ js.UndefOr[SDKEventAttrs]) => Product
      ): Self = StObject.set(x, "createProduct", js.Any.fromFunction10(value))
      
      inline def setCreatePromotion(
        value: (/* id */ String, /* creative */ js.UndefOr[String], /* name */ js.UndefOr[String], /* position */ js.UndefOr[Double]) => Promotion
      ): Self = StObject.set(x, "createPromotion", js.Any.fromFunction4(value))
      
      inline def setCreateTransactionAttributes(
        value: (/* id */ String | Double, /* affiliation */ js.UndefOr[String], /* couponCode */ js.UndefOr[String], /* revenue */ js.UndefOr[Double], /* shipping */ js.UndefOr[Double], /* tax */ js.UndefOr[Double]) => TransactionAttributes
      ): Self = StObject.set(x, "createTransactionAttributes", js.Any.fromFunction6(value))
      
      inline def setLogCheckout(
        value: (/* step */ Double, /* options */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags]) => Callback
      ): Self = StObject.set(x, "logCheckout", js.Any.fromFunction4((t0: /* step */ Double, t1: /* options */ js.UndefOr[String], t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setLogImpression(
        value: (/* impression */ js.Array[Impression] | Impression, /* attrs */ js.UndefOr[Record[String, Any]], /* customFlags */ js.UndefOr[Record[String, Any]], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback
      ): Self = StObject.set(x, "logImpression", js.Any.fromFunction4((t0: /* impression */ js.Array[Impression] | Impression, t1: /* attrs */ js.UndefOr[Record[String, Any]], t2: /* customFlags */ js.UndefOr[Record[String, Any]], t3: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setLogProductAction(
        value: (/* productActionType */ ProductActionType, /* product */ js.Array[Product] | Product, /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* transactionAttributes */ js.UndefOr[TransactionAttributes], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback
      ): Self = StObject.set(x, "logProductAction", js.Any.fromFunction6((t0: /* productActionType */ ProductActionType, t1: /* product */ js.Array[Product] | Product, t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* transactionAttributes */ js.UndefOr[TransactionAttributes], t5: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setLogPromotion(
        value: (/* type */ Double, /* promotion */ js.Array[Promotion] | Promotion, /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => Callback
      ): Self = StObject.set(x, "logPromotion", js.Any.fromFunction5((t0: /* type */ Double, t1: /* promotion */ js.Array[Promotion] | Promotion, t2: /* attrs */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setLogPurchase(
        value: (/* transactionAttributes */ TransactionAttributes, /* product */ js.Array[Product] | Product, /* clearCart */ Boolean, /* attrs */ Record[String, Any], /* customFlags */ Record[String, Any]) => Callback
      ): Self = StObject.set(x, "logPurchase", js.Any.fromFunction5((t0: /* transactionAttributes */ TransactionAttributes, t1: /* product */ js.Array[Product] | Product, t2: /* clearCart */ Boolean, t3: /* attrs */ Record[String, Any], t4: /* customFlags */ Record[String, Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setLogRefund(
        value: (/* transactionAttributes */ TransactionAttributes, /* product */ js.Array[Product] | Product, /* clearCart */ Boolean, /* attrs */ Record[String, Any], /* customFlags */ Record[String, Any]) => Callback
      ): Self = StObject.set(x, "logRefund", js.Any.fromFunction5((t0: /* transactionAttributes */ TransactionAttributes, t1: /* product */ js.Array[Product] | Product, t2: /* clearCart */ Boolean, t3: /* attrs */ Record[String, Any], t4: /* customFlags */ Record[String, Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setSetCurrencyCode(value: /* code */ String => Callback): Self = StObject.set(x, "setCurrencyCode", js.Any.fromFunction1((t0: /* code */ String) => value(t0).runNow()))
    }
  }
  
  trait CreateCCPAConsent extends StObject {
    
    def createCCPAConsent(
      consented: Boolean,
      timestamp: Double,
      consentDocument: String,
      location: String,
      hardwareId: String
    ): PrivacyConsentState
    @JSName("createCCPAConsent")
    var createCCPAConsent_Original: typingsJapgolly.mparticleWebSdk.mod.CreateCCPAConsent
    
    def createConsentState(): ConsentState
    @JSName("createConsentState")
    var createConsentState_Original: CreateConsentState
    
    def createGDPRConsent(
      consented: Boolean,
      timestamp: Double,
      consentDocument: String,
      location: String,
      hardwareId: String
    ): PrivacyConsentState
    @JSName("createGDPRConsent")
    var createGDPRConsent_Original: CreateGDPRConsent
  }
  object CreateCCPAConsent {
    
    inline def apply(
      createCCPAConsent: (/* consented */ Boolean, /* timestamp */ Double, /* consentDocument */ String, /* location */ String, /* hardwareId */ String) => PrivacyConsentState,
      createConsentState: CallbackTo[ConsentState],
      createGDPRConsent: (/* consented */ Boolean, /* timestamp */ Double, /* consentDocument */ String, /* location */ String, /* hardwareId */ String) => PrivacyConsentState
    ): CreateCCPAConsent = {
      val __obj = js.Dynamic.literal(createCCPAConsent = js.Any.fromFunction5(createCCPAConsent), createConsentState = createConsentState.toJsFn, createGDPRConsent = js.Any.fromFunction5(createGDPRConsent))
      __obj.asInstanceOf[CreateCCPAConsent]
    }
    
    extension [Self <: CreateCCPAConsent](x: Self) {
      
      inline def setCreateCCPAConsent(
        value: (/* consented */ Boolean, /* timestamp */ Double, /* consentDocument */ String, /* location */ String, /* hardwareId */ String) => PrivacyConsentState
      ): Self = StObject.set(x, "createCCPAConsent", js.Any.fromFunction5(value))
      
      inline def setCreateConsentState(value: CallbackTo[ConsentState]): Self = StObject.set(x, "createConsentState", value.toJsFn)
      
      inline def setCreateGDPRConsent(
        value: (/* consented */ Boolean, /* timestamp */ Double, /* consentDocument */ String, /* location */ String, /* hardwareId */ String) => PrivacyConsentState
      ): Self = StObject.set(x, "createGDPRConsent", js.Any.fromFunction5(value))
    }
  }
  
  trait CustomerId extends StObject {
    
    var CustomerId: typingsJapgolly.mparticleWebSdk.mod.IdentityType.CustomerId
    
    var Email: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Email
    
    var Facebook: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Facebook
    
    var FacebookCustomAudienceId: typingsJapgolly.mparticleWebSdk.mod.IdentityType.FacebookCustomAudienceId
    
    var Google: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Google
    
    var Microsoft: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Microsoft
    
    var MobileNumber: typingsJapgolly.mparticleWebSdk.mod.IdentityType.MobileNumber
    
    var Other: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other
    
    var Other10: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other10
    
    var Other2: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other2
    
    var Other3: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other3
    
    var Other4: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other4
    
    var Other5: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other5
    
    var Other6: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other6
    
    var Other7: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other7
    
    var Other8: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other8
    
    var Other9: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other9
    
    var PhoneNumber2: typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber2
    
    var PhoneNumber3: typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber3
    
    var Twitter: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Twitter
    
    var Yahoo: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Yahoo
  }
  object CustomerId {
    
    inline def apply(
      CustomerId: typingsJapgolly.mparticleWebSdk.mod.IdentityType.CustomerId,
      Email: Email,
      Facebook: Facebook,
      FacebookCustomAudienceId: FacebookCustomAudienceId,
      Google: Google,
      Microsoft: Microsoft,
      MobileNumber: MobileNumber,
      Other: Other,
      Other10: Other10,
      Other2: Other2,
      Other3: Other3,
      Other4: Other4,
      Other5: Other5,
      Other6: Other6,
      Other7: Other7,
      Other8: Other8,
      Other9: Other9,
      PhoneNumber2: PhoneNumber2,
      PhoneNumber3: PhoneNumber3,
      Twitter: Twitter,
      Yahoo: Yahoo
    ): CustomerId = {
      val __obj = js.Dynamic.literal(CustomerId = CustomerId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Facebook = Facebook.asInstanceOf[js.Any], FacebookCustomAudienceId = FacebookCustomAudienceId.asInstanceOf[js.Any], Google = Google.asInstanceOf[js.Any], Microsoft = Microsoft.asInstanceOf[js.Any], MobileNumber = MobileNumber.asInstanceOf[js.Any], Other = Other.asInstanceOf[js.Any], Other10 = Other10.asInstanceOf[js.Any], Other2 = Other2.asInstanceOf[js.Any], Other3 = Other3.asInstanceOf[js.Any], Other4 = Other4.asInstanceOf[js.Any], Other5 = Other5.asInstanceOf[js.Any], Other6 = Other6.asInstanceOf[js.Any], Other7 = Other7.asInstanceOf[js.Any], Other8 = Other8.asInstanceOf[js.Any], Other9 = Other9.asInstanceOf[js.Any], PhoneNumber2 = PhoneNumber2.asInstanceOf[js.Any], PhoneNumber3 = PhoneNumber3.asInstanceOf[js.Any], Twitter = Twitter.asInstanceOf[js.Any], Yahoo = Yahoo.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerId]
    }
    
    extension [Self <: CustomerId](x: Self) {
      
      inline def setCustomerId(value: typingsJapgolly.mparticleWebSdk.mod.IdentityType.CustomerId): Self = StObject.set(x, "CustomerId", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setFacebook(value: Facebook): Self = StObject.set(x, "Facebook", value.asInstanceOf[js.Any])
      
      inline def setFacebookCustomAudienceId(value: FacebookCustomAudienceId): Self = StObject.set(x, "FacebookCustomAudienceId", value.asInstanceOf[js.Any])
      
      inline def setGoogle(value: Google): Self = StObject.set(x, "Google", value.asInstanceOf[js.Any])
      
      inline def setMicrosoft(value: Microsoft): Self = StObject.set(x, "Microsoft", value.asInstanceOf[js.Any])
      
      inline def setMobileNumber(value: MobileNumber): Self = StObject.set(x, "MobileNumber", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Other): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
      
      inline def setOther10(value: Other10): Self = StObject.set(x, "Other10", value.asInstanceOf[js.Any])
      
      inline def setOther2(value: Other2): Self = StObject.set(x, "Other2", value.asInstanceOf[js.Any])
      
      inline def setOther3(value: Other3): Self = StObject.set(x, "Other3", value.asInstanceOf[js.Any])
      
      inline def setOther4(value: Other4): Self = StObject.set(x, "Other4", value.asInstanceOf[js.Any])
      
      inline def setOther5(value: Other5): Self = StObject.set(x, "Other5", value.asInstanceOf[js.Any])
      
      inline def setOther6(value: Other6): Self = StObject.set(x, "Other6", value.asInstanceOf[js.Any])
      
      inline def setOther7(value: Other7): Self = StObject.set(x, "Other7", value.asInstanceOf[js.Any])
      
      inline def setOther8(value: Other8): Self = StObject.set(x, "Other8", value.asInstanceOf[js.Any])
      
      inline def setOther9(value: Other9): Self = StObject.set(x, "Other9", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber2(value: PhoneNumber2): Self = StObject.set(x, "PhoneNumber2", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber3(value: PhoneNumber3): Self = StObject.set(x, "PhoneNumber3", value.asInstanceOf[js.Any])
      
      inline def setTwitter(value: Twitter): Self = StObject.set(x, "Twitter", value.asInstanceOf[js.Any])
      
      inline def setYahoo(value: Yahoo): Self = StObject.set(x, "Yahoo", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSession extends StObject {
    
    def getSession(): String
    @JSName("getSession")
    var getSession_Original: typingsJapgolly.mparticleWebSdk.mod.GetSession
  }
  object GetSession {
    
    inline def apply(getSession: CallbackTo[String]): GetSession = {
      val __obj = js.Dynamic.literal(getSession = getSession.toJsFn)
      __obj.asInstanceOf[GetSession]
    }
    
    extension [Self <: GetSession](x: Self) {
      
      inline def setGetSession(value: CallbackTo[String]): Self = StObject.set(x, "getSession", value.toJsFn)
    }
  }
  
  trait HttpCode extends StObject {
    
    var httpCode: Double
    
    var message: String
  }
  object HttpCode {
    
    inline def apply(httpCode: Double, message: String): HttpCode = {
      val __obj = js.Dynamic.literal(httpCode = httpCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpCode]
    }
    
    extension [Self <: HttpCode](x: Self) {
      
      inline def setHttpCode(value: Double): Self = StObject.set(x, "httpCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var Location: typingsJapgolly.mparticleWebSdk.mod.EventType.Location
    
    var Media: typingsJapgolly.mparticleWebSdk.mod.EventType.Media
    
    var Navigation: typingsJapgolly.mparticleWebSdk.mod.EventType.Navigation
    
    var Other: typingsJapgolly.mparticleWebSdk.mod.EventType.Other
    
    var Search: typingsJapgolly.mparticleWebSdk.mod.EventType.Search
    
    var Social: typingsJapgolly.mparticleWebSdk.mod.EventType.Social
    
    var Transaction: typingsJapgolly.mparticleWebSdk.mod.EventType.Transaction
    
    var Unknown: typingsJapgolly.mparticleWebSdk.mod.EventType.Unknown
    
    var UserContent: typingsJapgolly.mparticleWebSdk.mod.EventType.UserContent
    
    var UserPreference: typingsJapgolly.mparticleWebSdk.mod.EventType.UserPreference
  }
  object Location {
    
    inline def apply(
      Location: typingsJapgolly.mparticleWebSdk.mod.EventType.Location,
      Media: Media,
      Navigation: Navigation,
      Other: typingsJapgolly.mparticleWebSdk.mod.EventType.Other,
      Search: Search,
      Social: Social,
      Transaction: Transaction,
      Unknown: typingsJapgolly.mparticleWebSdk.mod.EventType.Unknown,
      UserContent: UserContent,
      UserPreference: UserPreference
    ): Location = {
      val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Navigation = Navigation.asInstanceOf[js.Any], Other = Other.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any], Social = Social.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any], UserContent = UserContent.asInstanceOf[js.Any], UserPreference = UserPreference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLocation(value: typingsJapgolly.mparticleWebSdk.mod.EventType.Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: Navigation): Self = StObject.set(x, "Navigation", value.asInstanceOf[js.Any])
      
      inline def setOther(value: typingsJapgolly.mparticleWebSdk.mod.EventType.Other): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Search): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
      
      inline def setSocial(value: Social): Self = StObject.set(x, "Social", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: Transaction): Self = StObject.set(x, "Transaction", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: typingsJapgolly.mparticleWebSdk.mod.EventType.Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
      
      inline def setUserContent(value: UserContent): Self = StObject.set(x, "UserContent", value.asInstanceOf[js.Any])
      
      inline def setUserPreference(value: UserPreference): Self = StObject.set(x, "UserPreference", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProductAddToCart extends StObject {
    
    var ProductAddToCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart
    
    var ProductAddToWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToWishlist
    
    var ProductCheckout: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckout
    
    var ProductCheckoutOption: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckoutOption
    
    var ProductClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductClick
    
    var ProductImpression: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductImpression
    
    var ProductPurchase: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductPurchase
    
    var ProductRefund: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRefund
    
    var ProductRemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromCart
    
    var ProductRemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromWishlist
    
    var ProductViewDetail: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductViewDetail
    
    var PromotionClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionClick
    
    var PromotionView: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionView
  }
  object ProductAddToCart {
    
    inline def apply(
      ProductAddToCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart,
      ProductAddToWishlist: ProductAddToWishlist,
      ProductCheckout: ProductCheckout,
      ProductCheckoutOption: ProductCheckoutOption,
      ProductClick: ProductClick,
      ProductImpression: ProductImpression,
      ProductPurchase: ProductPurchase,
      ProductRefund: ProductRefund,
      ProductRemoveFromCart: ProductRemoveFromCart,
      ProductRemoveFromWishlist: ProductRemoveFromWishlist,
      ProductViewDetail: ProductViewDetail,
      PromotionClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionClick,
      PromotionView: PromotionView
    ): ProductAddToCart = {
      val __obj = js.Dynamic.literal(ProductAddToCart = ProductAddToCart.asInstanceOf[js.Any], ProductAddToWishlist = ProductAddToWishlist.asInstanceOf[js.Any], ProductCheckout = ProductCheckout.asInstanceOf[js.Any], ProductCheckoutOption = ProductCheckoutOption.asInstanceOf[js.Any], ProductClick = ProductClick.asInstanceOf[js.Any], ProductImpression = ProductImpression.asInstanceOf[js.Any], ProductPurchase = ProductPurchase.asInstanceOf[js.Any], ProductRefund = ProductRefund.asInstanceOf[js.Any], ProductRemoveFromCart = ProductRemoveFromCart.asInstanceOf[js.Any], ProductRemoveFromWishlist = ProductRemoveFromWishlist.asInstanceOf[js.Any], ProductViewDetail = ProductViewDetail.asInstanceOf[js.Any], PromotionClick = PromotionClick.asInstanceOf[js.Any], PromotionView = PromotionView.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductAddToCart]
    }
    
    extension [Self <: ProductAddToCart](x: Self) {
      
      inline def setProductAddToCart(value: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart): Self = StObject.set(x, "ProductAddToCart", value.asInstanceOf[js.Any])
      
      inline def setProductAddToWishlist(value: ProductAddToWishlist): Self = StObject.set(x, "ProductAddToWishlist", value.asInstanceOf[js.Any])
      
      inline def setProductCheckout(value: ProductCheckout): Self = StObject.set(x, "ProductCheckout", value.asInstanceOf[js.Any])
      
      inline def setProductCheckoutOption(value: ProductCheckoutOption): Self = StObject.set(x, "ProductCheckoutOption", value.asInstanceOf[js.Any])
      
      inline def setProductClick(value: ProductClick): Self = StObject.set(x, "ProductClick", value.asInstanceOf[js.Any])
      
      inline def setProductImpression(value: ProductImpression): Self = StObject.set(x, "ProductImpression", value.asInstanceOf[js.Any])
      
      inline def setProductPurchase(value: ProductPurchase): Self = StObject.set(x, "ProductPurchase", value.asInstanceOf[js.Any])
      
      inline def setProductRefund(value: ProductRefund): Self = StObject.set(x, "ProductRefund", value.asInstanceOf[js.Any])
      
      inline def setProductRemoveFromCart(value: ProductRemoveFromCart): Self = StObject.set(x, "ProductRemoveFromCart", value.asInstanceOf[js.Any])
      
      inline def setProductRemoveFromWishlist(value: ProductRemoveFromWishlist): Self = StObject.set(x, "ProductRemoveFromWishlist", value.asInstanceOf[js.Any])
      
      inline def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
      
      inline def setPromotionClick(value: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionClick): Self = StObject.set(x, "PromotionClick", value.asInstanceOf[js.Any])
      
      inline def setPromotionView(value: PromotionView): Self = StObject.set(x, "PromotionView", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromotionClick extends StObject {
    
    var PromotionClick: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionClick
    
    var PromotionView: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionView
    
    var Unknown: typingsJapgolly.mparticleWebSdk.mod.PromotionType.Unknown
  }
  object PromotionClick {
    
    inline def apply(
      PromotionClick: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionClick,
      PromotionView: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionView,
      Unknown: typingsJapgolly.mparticleWebSdk.mod.PromotionType.Unknown
    ): PromotionClick = {
      val __obj = js.Dynamic.literal(PromotionClick = PromotionClick.asInstanceOf[js.Any], PromotionView = PromotionView.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromotionClick]
    }
    
    extension [Self <: PromotionClick](x: Self) {
      
      inline def setPromotionClick(value: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionClick): Self = StObject.set(x, "PromotionClick", value.asInstanceOf[js.Any])
      
      inline def setPromotionView(value: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionView): Self = StObject.set(x, "PromotionView", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: typingsJapgolly.mparticleWebSdk.mod.PromotionType.Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    }
  }
}
