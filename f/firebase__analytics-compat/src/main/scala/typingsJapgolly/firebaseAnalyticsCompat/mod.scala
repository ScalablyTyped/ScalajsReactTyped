package typingsJapgolly.firebaseAnalyticsCompat

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAnalytics.mod.Analytics
import typingsJapgolly.firebaseAnalytics.mod.AnalyticsCallOptions
import typingsJapgolly.firebaseAnalytics.mod.AnalyticsSettings
import typingsJapgolly.firebaseAnalytics.mod.CustomEventName
import typingsJapgolly.firebaseAnalytics.mod.CustomParams
import typingsJapgolly.firebaseAnalyticsCompat.anon.Affiliation
import typingsJapgolly.firebaseAnalyticsCompat.anon.Checkoutoption
import typingsJapgolly.firebaseAnalyticsCompat.anon.Checkoutstep
import typingsJapgolly.firebaseAnalyticsCompat.anon.Contenttype
import typingsJapgolly.firebaseAnalyticsCompat.anon.Coupon
import typingsJapgolly.firebaseAnalyticsCompat.anon.Currency
import typingsJapgolly.firebaseAnalyticsCompat.anon.Description
import typingsJapgolly.firebaseAnalyticsCompat.anon.Dictkey
import typingsJapgolly.firebaseAnalyticsCompat.anon.DictkeyCurrency
import typingsJapgolly.firebaseAnalyticsCompat.anon.Eventcategory
import typingsJapgolly.firebaseAnalyticsCompat.anon.Firebasescreen
import typingsJapgolly.firebaseAnalyticsCompat.anon.Itemid
import typingsJapgolly.firebaseAnalyticsCompat.anon.Itemlistid
import typingsJapgolly.firebaseAnalyticsCompat.anon.Items
import typingsJapgolly.firebaseAnalyticsCompat.anon.Method
import typingsJapgolly.firebaseAnalyticsCompat.anon.Pagelocation
import typingsJapgolly.firebaseAnalyticsCompat.anon.Promotionid
import typingsJapgolly.firebaseAnalyticsCompat.anon.Searchterm
import typingsJapgolly.firebaseAnalyticsCompat.anon.Value
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_payment_info
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_shipping_info
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_to_cart
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_to_wishlist
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.begin_checkout
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.checkout_progress
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.exception
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.generate_lead
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.login
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.page_view
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.purchase
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.refund
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.remove_from_cart
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.screen_view
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.search
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_content
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_item
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_promotion
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.set_checkout_option
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.share
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.sign_up
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.timing_complete
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_cart
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_item
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_item_list
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_promotion
import typingsJapgolly.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_search_results
import typingsJapgolly.firebaseAnalyticsCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp
import typingsJapgolly.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/analytics-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseAnalyticsAugmentingMod {
    
    @JSImport("@firebase/analytics", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAnalytics(app: js.UndefOr[FirebaseApp]): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
    
    inline def initializeAnalytics(app: FirebaseApp, options: js.UndefOr[AnalyticsSettings]): Analytics = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analytics]
    
    inline def logEvent(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results,
      eventParams: js.UndefOr[Affiliation | Currency | DictkeyCurrency | Promotionid | Searchterm],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent[T /* <: String */](
      analyticsInstance: FirebaseAnalytics,
      eventName: CustomEventName[T],
      eventParams: js.UndefOr[StringDictionary[Any]],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_addpaymentinfo(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_payment_info,
      eventParams: js.UndefOr[Dictkey],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_addshippinginfo(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_shipping_info,
      eventParams: js.UndefOr[Coupon],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_begincheckout(
      analyticsInstance: FirebaseAnalytics,
      eventName: begin_checkout,
      eventParams: js.UndefOr[Items],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_checkoutprogress(
      analyticsInstance: FirebaseAnalytics,
      eventName: checkout_progress,
      eventParams: js.UndefOr[Checkoutoption],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_exception(
      analyticsInstance: FirebaseAnalytics,
      eventName: exception,
      eventParams: js.UndefOr[Description],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_generatelead(
      analyticsInstance: FirebaseAnalytics,
      eventName: generate_lead,
      eventParams: js.UndefOr[Value],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_login(
      analyticsInstance: FirebaseAnalytics,
      eventName: login,
      eventParams: js.UndefOr[Method],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_pageview(
      analyticsInstance: FirebaseAnalytics,
      eventName: page_view,
      eventParams: js.UndefOr[Pagelocation],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_screenview(
      analyticsInstance: FirebaseAnalytics,
      eventName: screen_view,
      eventParams: js.UndefOr[Firebasescreen],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_selectcontent(
      analyticsInstance: FirebaseAnalytics,
      eventName: select_content,
      eventParams: js.UndefOr[Contenttype],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_selectitem(
      analyticsInstance: FirebaseAnalytics,
      eventName: select_item,
      eventParams: js.UndefOr[Itemlistid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_setcheckoutoption(
      analyticsInstance: FirebaseAnalytics,
      eventName: set_checkout_option,
      eventParams: js.UndefOr[Checkoutstep],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_share(
      analyticsInstance: FirebaseAnalytics,
      eventName: share,
      eventParams: js.UndefOr[Itemid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_signup(
      analyticsInstance: FirebaseAnalytics,
      eventName: sign_up,
      eventParams: js.UndefOr[Method],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_timingcomplete(
      analyticsInstance: FirebaseAnalytics,
      eventName: timing_complete,
      eventParams: js.UndefOr[Eventcategory],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_viewitemlist(
      analyticsInstance: FirebaseAnalytics,
      eventName: view_item_list,
      eventParams: js.UndefOr[Itemlistid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAnalyticsCollectionEnabled(analyticsInstance: FirebaseAnalytics, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsCollectionEnabled")(analyticsInstance.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCurrentScreen(
      analyticsInstance: FirebaseAnalytics,
      screenName: String,
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUserId(analyticsInstance: FirebaseAnalytics, id: String | Null, options: js.UndefOr[AnalyticsCallOptions]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUserProperties(
      analyticsInstance: FirebaseAnalytics,
      properties: CustomParams,
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def registerAnalytics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAnalytics")().asInstanceOf[Unit]
  
  /**
    * Define extension behavior of `registerAnalytics`
    */
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      def analytics(): FirebaseAnalytics
    }
    object FirebaseApp {
      
      inline def apply(analytics: CallbackTo[FirebaseAnalytics]): FirebaseApp = {
        val __obj = js.Dynamic.literal(analytics = analytics.toJsFn)
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setAnalytics(value: CallbackTo[FirebaseAnalytics]): Self = StObject.set(x, "analytics", value.toJsFn)
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      def analytics(): FirebaseAnalytics = js.native
      def analytics(app: FirebaseApp): FirebaseAnalytics = js.native
    }
  }
}
