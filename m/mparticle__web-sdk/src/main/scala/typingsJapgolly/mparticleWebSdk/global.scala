package typingsJapgolly.mparticleWebSdk

import typingsJapgolly.mparticleWebSdk.mod.AliasUsers
import typingsJapgolly.mparticleWebSdk.mod.CreateAliasRequest
import typingsJapgolly.mparticleWebSdk.mod.CreateCCPAConsent
import typingsJapgolly.mparticleWebSdk.mod.CreateConsentState
import typingsJapgolly.mparticleWebSdk.mod.CreateGDPRConsent
import typingsJapgolly.mparticleWebSdk.mod.CreateImpression
import typingsJapgolly.mparticleWebSdk.mod.CreateProduct
import typingsJapgolly.mparticleWebSdk.mod.CreatePromotion
import typingsJapgolly.mparticleWebSdk.mod.CreateTransactionAttributes
import typingsJapgolly.mparticleWebSdk.mod.EndSession_
import typingsJapgolly.mparticleWebSdk.mod.GetAppName_
import typingsJapgolly.mparticleWebSdk.mod.GetAppVersion_
import typingsJapgolly.mparticleWebSdk.mod.GetCurrentUser
import typingsJapgolly.mparticleWebSdk.mod.GetDeviceId_
import typingsJapgolly.mparticleWebSdk.mod.GetIntegrationAttributes_
import typingsJapgolly.mparticleWebSdk.mod.GetSession
import typingsJapgolly.mparticleWebSdk.mod.GetUser
import typingsJapgolly.mparticleWebSdk.mod.GetUsers
import typingsJapgolly.mparticleWebSdk.mod.GetVersion_
import typingsJapgolly.mparticleWebSdk.mod.Identify
import typingsJapgolly.mparticleWebSdk.mod.Init_
import typingsJapgolly.mparticleWebSdk.mod.IsInitialized_
import typingsJapgolly.mparticleWebSdk.mod.LogBaseEvent_
import typingsJapgolly.mparticleWebSdk.mod.LogCheckout
import typingsJapgolly.mparticleWebSdk.mod.LogError_
import typingsJapgolly.mparticleWebSdk.mod.LogEvent_
import typingsJapgolly.mparticleWebSdk.mod.LogForm_
import typingsJapgolly.mparticleWebSdk.mod.LogImpression
import typingsJapgolly.mparticleWebSdk.mod.LogLink_
import typingsJapgolly.mparticleWebSdk.mod.LogPageView_
import typingsJapgolly.mparticleWebSdk.mod.LogProductAction
import typingsJapgolly.mparticleWebSdk.mod.LogPromotion
import typingsJapgolly.mparticleWebSdk.mod.LogPurchase
import typingsJapgolly.mparticleWebSdk.mod.LogRefund
import typingsJapgolly.mparticleWebSdk.mod.Login
import typingsJapgolly.mparticleWebSdk.mod.Logout
import typingsJapgolly.mparticleWebSdk.mod.Modify
import typingsJapgolly.mparticleWebSdk.mod.Ready_
import typingsJapgolly.mparticleWebSdk.mod.Reset_
import typingsJapgolly.mparticleWebSdk.mod.SetAppName_
import typingsJapgolly.mparticleWebSdk.mod.SetAppVersion_
import typingsJapgolly.mparticleWebSdk.mod.SetCurrencyCode
import typingsJapgolly.mparticleWebSdk.mod.SetDeviceId_
import typingsJapgolly.mparticleWebSdk.mod.SetIntegrationAttribute_
import typingsJapgolly.mparticleWebSdk.mod.SetLogLevel_
import typingsJapgolly.mparticleWebSdk.mod.SetOptOut_
import typingsJapgolly.mparticleWebSdk.mod.SetPosition_
import typingsJapgolly.mparticleWebSdk.mod.SetSessionAttribute_
import typingsJapgolly.mparticleWebSdk.mod.StartNewSession_
import typingsJapgolly.mparticleWebSdk.mod.StartTrackingLocation_
import typingsJapgolly.mparticleWebSdk.mod.StopTrackingLocation_
import typingsJapgolly.mparticleWebSdk.mod.Upload_
import typingsJapgolly.mparticleWebSdk.mod.mParticleInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mParticle {
    
    @JSGlobal("mParticle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("mParticle.CommerceEventType")
    @js.native
    object CommerceEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.mparticleWebSdk.mod.CommerceEventType & Double] = js.native
      
      /* 10 */ val ProductAddToCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToCart & Double = js.native
      
      /* 20 */ val ProductAddToWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductAddToWishlist & Double = js.native
      
      /* 12 */ val ProductCheckout: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckout & Double = js.native
      
      /* 13 */ val ProductCheckoutOption: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductCheckoutOption & Double = js.native
      
      /* 14 */ val ProductClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductClick & Double = js.native
      
      /* 22 */ val ProductImpression: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductImpression & Double = js.native
      
      /* 16 */ val ProductPurchase: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductPurchase & Double = js.native
      
      /* 17 */ val ProductRefund: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRefund & Double = js.native
      
      /* 11 */ val ProductRemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromCart & Double = js.native
      
      /* 21 */ val ProductRemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductRemoveFromWishlist & Double = js.native
      
      /* 15 */ val ProductViewDetail: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.ProductViewDetail & Double = js.native
      
      /* 19 */ val PromotionClick: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionClick & Double = js.native
      
      /* 18 */ val PromotionView: typingsJapgolly.mparticleWebSdk.mod.CommerceEventType.PromotionView & Double = js.native
    }
    
    object Consent {
      
      @JSGlobal("mParticle.Consent.createCCPAConsent")
      @js.native
      val createCCPAConsent: CreateCCPAConsent = js.native
      
      @JSGlobal("mParticle.Consent.createConsentState")
      @js.native
      val createConsentState: CreateConsentState = js.native
      
      @JSGlobal("mParticle.Consent.createGDPRConsent")
      @js.native
      val createGDPRConsent: CreateGDPRConsent = js.native
    }
    
    @JSGlobal("mParticle.EventType")
    @js.native
    object EventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.mparticleWebSdk.mod.EventType & Double] = js.native
      
      /* 2 */ val Location: typingsJapgolly.mparticleWebSdk.mod.EventType.Location & Double = js.native
      
      /* 9 */ val Media: typingsJapgolly.mparticleWebSdk.mod.EventType.Media & Double = js.native
      
      /* 1 */ val Navigation: typingsJapgolly.mparticleWebSdk.mod.EventType.Navigation & Double = js.native
      
      /* 8 */ val Other: typingsJapgolly.mparticleWebSdk.mod.EventType.Other & Double = js.native
      
      /* 3 */ val Search: typingsJapgolly.mparticleWebSdk.mod.EventType.Search & Double = js.native
      
      /* 7 */ val Social: typingsJapgolly.mparticleWebSdk.mod.EventType.Social & Double = js.native
      
      /* 4 */ val Transaction: typingsJapgolly.mparticleWebSdk.mod.EventType.Transaction & Double = js.native
      
      /* 0 */ val Unknown: typingsJapgolly.mparticleWebSdk.mod.EventType.Unknown & Double = js.native
      
      /* 5 */ val UserContent: typingsJapgolly.mparticleWebSdk.mod.EventType.UserContent & Double = js.native
      
      /* 6 */ val UserPreference: typingsJapgolly.mparticleWebSdk.mod.EventType.UserPreference & Double = js.native
    }
    
    object Identity {
      
      @JSGlobal("mParticle.Identity.HTTPCodes")
      @js.native
      val HTTPCodes: Any = js.native
      
      @JSGlobal("mParticle.Identity.aliasUsers")
      @js.native
      val aliasUsers: AliasUsers = js.native
      
      @JSGlobal("mParticle.Identity.createAliasRequest")
      @js.native
      val createAliasRequest: CreateAliasRequest = js.native
      
      @JSGlobal("mParticle.Identity.getCurrentUser")
      @js.native
      val getCurrentUser: GetCurrentUser = js.native
      
      @JSGlobal("mParticle.Identity.getUser")
      @js.native
      val getUser: GetUser = js.native
      
      @JSGlobal("mParticle.Identity.getUsers")
      @js.native
      val getUsers: GetUsers = js.native
      
      @JSGlobal("mParticle.Identity.identify")
      @js.native
      val identify: Identify = js.native
      
      @JSGlobal("mParticle.Identity.login")
      @js.native
      val login: Login = js.native
      
      @JSGlobal("mParticle.Identity.logout")
      @js.native
      val logout: Logout = js.native
      
      @JSGlobal("mParticle.Identity.modify")
      @js.native
      val modify: Modify = js.native
    }
    
    @JSGlobal("mParticle.IdentityType")
    @js.native
    object IdentityType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.mparticleWebSdk.mod.IdentityType & Double] = js.native
      
      /* 1 */ val CustomerId: typingsJapgolly.mparticleWebSdk.mod.IdentityType.CustomerId & Double = js.native
      
      /* 7 */ val Email: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Email & Double = js.native
      
      /* 2 */ val Facebook: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Facebook & Double = js.native
      
      /* 9 */ val FacebookCustomAudienceId: typingsJapgolly.mparticleWebSdk.mod.IdentityType.FacebookCustomAudienceId & Double = js.native
      
      /* 4 */ val Google: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Google & Double = js.native
      
      /* 5 */ val Microsoft: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Microsoft & Double = js.native
      
      /* 19 */ val MobileNumber: typingsJapgolly.mparticleWebSdk.mod.IdentityType.MobileNumber & Double = js.native
      
      /* 0 */ val Other: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other & Double = js.native
      
      /* 18 */ val Other10: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other10 & Double = js.native
      
      /* 10 */ val Other2: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other2 & Double = js.native
      
      /* 11 */ val Other3: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other3 & Double = js.native
      
      /* 12 */ val Other4: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other4 & Double = js.native
      
      /* 13 */ val Other5: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other5 & Double = js.native
      
      /* 14 */ val Other6: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other6 & Double = js.native
      
      /* 15 */ val Other7: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other7 & Double = js.native
      
      /* 16 */ val Other8: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other8 & Double = js.native
      
      /* 17 */ val Other9: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Other9 & Double = js.native
      
      /* 20 */ val PhoneNumber2: typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber2 & Double = js.native
      
      /* 21 */ val PhoneNumber3: typingsJapgolly.mparticleWebSdk.mod.IdentityType.PhoneNumber3 & Double = js.native
      
      /* 3 */ val Twitter: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Twitter & Double = js.native
      
      /* 6 */ val Yahoo: typingsJapgolly.mparticleWebSdk.mod.IdentityType.Yahoo & Double = js.native
    }
    
    @JSGlobal("mParticle.ProductActionType")
    @js.native
    object ProductActionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.mparticleWebSdk.mod.ProductActionType & Double] = js.native
      
      /* 1 */ val AddToCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToCart & Double = js.native
      
      /* 9 */ val AddToWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.AddToWishlist & Double = js.native
      
      /* 3 */ val Checkout: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Checkout & Double = js.native
      
      /* 4 */ val CheckoutOption: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.CheckoutOption & Double = js.native
      
      /* 5 */ val Click: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Click & Double = js.native
      
      /* 7 */ val Purchase: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Purchase & Double = js.native
      
      /* 8 */ val Refund: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Refund & Double = js.native
      
      /* 2 */ val RemoveFromCart: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromCart & Double = js.native
      
      /* 10 */ val RemoveFromWishlist: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.RemoveFromWishlist & Double = js.native
      
      /* 0 */ val Unknown: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.Unknown & Double = js.native
      
      /* 6 */ val ViewDetail: typingsJapgolly.mparticleWebSdk.mod.ProductActionType.ViewDetail & Double = js.native
    }
    
    @JSGlobal("mParticle.PromotionType")
    @js.native
    object PromotionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.mparticleWebSdk.mod.PromotionType & Double] = js.native
      
      /* 1 */ val PromotionClick: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionClick & Double = js.native
      
      /* 2 */ val PromotionView: typingsJapgolly.mparticleWebSdk.mod.PromotionType.PromotionView & Double = js.native
      
      /* 0 */ val Unknown: typingsJapgolly.mparticleWebSdk.mod.PromotionType.Unknown & Double = js.native
    }
    
    object eCommerce {
      
      // expandCommerceEvent function for internal use
      @JSGlobal("mParticle.eCommerce.Cart")
      @js.native
      val Cart: typingsJapgolly.mparticleWebSdk.mod.Cart = js.native
      
      @JSGlobal("mParticle.eCommerce.createImpression")
      @js.native
      val createImpression: CreateImpression = js.native
      
      @JSGlobal("mParticle.eCommerce.createProduct")
      @js.native
      val createProduct: CreateProduct = js.native
      
      @JSGlobal("mParticle.eCommerce.createPromotion")
      @js.native
      val createPromotion: CreatePromotion = js.native
      
      @JSGlobal("mParticle.eCommerce.createTransactionAttributes")
      @js.native
      val createTransactionAttributes: CreateTransactionAttributes = js.native
      
      @JSGlobal("mParticle.eCommerce.logCheckout")
      @js.native
      val logCheckout: LogCheckout = js.native
      
      @JSGlobal("mParticle.eCommerce.logImpression")
      @js.native
      val logImpression: LogImpression = js.native
      
      @JSGlobal("mParticle.eCommerce.logProductAction")
      @js.native
      val logProductAction: LogProductAction = js.native
      
      @JSGlobal("mParticle.eCommerce.logPromotion")
      @js.native
      val logPromotion: LogPromotion = js.native
      
      @JSGlobal("mParticle.eCommerce.logPurchase")
      @js.native
      val logPurchase: LogPurchase = js.native
      
      /**
        *
        * @deprecated logRefund has been deprecated
        */
      @JSGlobal("mParticle.eCommerce.logRefund")
      @js.native
      val logRefund: LogRefund = js.native
      
      @JSGlobal("mParticle.eCommerce.setCurrencyCode")
      @js.native
      val setCurrencyCode: SetCurrencyCode = js.native
    }
    
    @JSGlobal("mParticle.endSession")
    @js.native
    val endSession: EndSession_ = js.native
    
    @JSGlobal("mParticle.getAppName")
    @js.native
    val getAppName: GetAppName_ = js.native
    
    @JSGlobal("mParticle.getAppVersion")
    @js.native
    val getAppVersion: GetAppVersion_ = js.native
    
    @JSGlobal("mParticle.getDeviceId")
    @js.native
    val getDeviceId: GetDeviceId_ = js.native
    
    inline def getInstance(): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[mParticleInstance]
    inline def getInstance(instanceName: String): mParticleInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[mParticleInstance]
    
    @JSGlobal("mParticle.getIntegrationAttributes")
    @js.native
    val getIntegrationAttributes: GetIntegrationAttributes_ = js.native
    
    @JSGlobal("mParticle.getVersion")
    @js.native
    val getVersion: GetVersion_ = js.native
    
    @JSGlobal("mParticle.init")
    @js.native
    val init: Init_ = js.native
    
    @JSGlobal("mParticle.isInitialized")
    @js.native
    val isInitialized: IsInitialized_ = js.native
    
    @JSGlobal("mParticle.logBaseEvent")
    @js.native
    val logBaseEvent: LogBaseEvent_ = js.native
    
    @JSGlobal("mParticle.logError")
    @js.native
    val logError: LogError_ = js.native
    
    @JSGlobal("mParticle.logEvent")
    @js.native
    val logEvent: LogEvent_ = js.native
    
    @JSGlobal("mParticle.logForm")
    @js.native
    val logForm: LogForm_ = js.native
    
    @JSGlobal("mParticle.logLink")
    @js.native
    val logLink: LogLink_ = js.native
    
    @JSGlobal("mParticle.logPageView")
    @js.native
    val logPageView: LogPageView_ = js.native
    
    @JSGlobal("mParticle.ready")
    @js.native
    val ready: Ready_ = js.native
    
    @JSGlobal("mParticle.reset")
    @js.native
    val reset: Reset_ = js.native
    
    object sessionManager {
      
      @JSGlobal("mParticle.sessionManager.getSession")
      @js.native
      val getSession: GetSession = js.native
    }
    
    @JSGlobal("mParticle.setAppName")
    @js.native
    val setAppName: SetAppName_ = js.native
    
    @JSGlobal("mParticle.setAppVersion")
    @js.native
    val setAppVersion: SetAppVersion_ = js.native
    
    @JSGlobal("mParticle.setDeviceId")
    @js.native
    val setDeviceId: SetDeviceId_ = js.native
    
    @JSGlobal("mParticle.setIntegrationAttribute")
    @js.native
    val setIntegrationAttribute: SetIntegrationAttribute_ = js.native
    
    @JSGlobal("mParticle.setLogLevel")
    @js.native
    val setLogLevel: SetLogLevel_ = js.native
    
    @JSGlobal("mParticle.setOptOut")
    @js.native
    val setOptOut: SetOptOut_ = js.native
    
    @JSGlobal("mParticle.setPosition")
    @js.native
    val setPosition: SetPosition_ = js.native
    
    @JSGlobal("mParticle.setSessionAttribute")
    @js.native
    val setSessionAttribute: SetSessionAttribute_ = js.native
    
    @JSGlobal("mParticle.startNewSession")
    @js.native
    val startNewSession: StartNewSession_ = js.native
    
    @JSGlobal("mParticle.startTrackingLocation")
    @js.native
    val startTrackingLocation: StartTrackingLocation_ = js.native
    
    @JSGlobal("mParticle.stopTrackingLocation")
    @js.native
    val stopTrackingLocation: StopTrackingLocation_ = js.native
    
    @JSGlobal("mParticle.upload")
    @js.native
    val upload: Upload_ = js.native
  }
}
