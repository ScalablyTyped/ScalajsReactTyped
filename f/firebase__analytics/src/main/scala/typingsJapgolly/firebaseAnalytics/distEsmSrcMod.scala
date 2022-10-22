package typingsJapgolly.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAnalytics.anon.CheckoutoptionCheckoutstep
import typingsJapgolly.firebaseAnalytics.anon.Checkoutstep
import typingsJapgolly.firebaseAnalytics.anon.Contenttype
import typingsJapgolly.firebaseAnalytics.anon.CouponCurrency
import typingsJapgolly.firebaseAnalytics.anon.CurrencyItemsValue
import typingsJapgolly.firebaseAnalytics.anon.Description
import typingsJapgolly.firebaseAnalytics.anon.DictkeyCouponCurrency
import typingsJapgolly.firebaseAnalytics.anon.DictkeyCurrencyItems
import typingsJapgolly.firebaseAnalytics.anon.DictkeyItemlistid
import typingsJapgolly.firebaseAnalytics.anon.DictkeyItems
import typingsJapgolly.firebaseAnalytics.anon.Eventcategory
import typingsJapgolly.firebaseAnalytics.anon.Firebasescreen
import typingsJapgolly.firebaseAnalytics.anon.Itemid
import typingsJapgolly.firebaseAnalytics.anon.ItemsShippingtier
import typingsJapgolly.firebaseAnalytics.anon.Method
import typingsJapgolly.firebaseAnalytics.anon.Pagelocation
import typingsJapgolly.firebaseAnalytics.anon.Searchterm
import typingsJapgolly.firebaseAnalytics.anon.Tax
import typingsJapgolly.firebaseAnalytics.anon.Value
import typingsJapgolly.firebaseAnalytics.distEsmSrcApiMod.CustomEventName
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.Analytics
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.AnalyticsCallOptions
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.AnalyticsSettings
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentSettings
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.CustomParams
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.SettingsOptions
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.add_payment_info
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.add_shipping_info
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.add_to_cart
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.add_to_wishlist
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.begin_checkout
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.checkout_progress
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.exception
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.generate_lead
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.login
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.page_view
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.purchase
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.refund
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.remove_from_cart
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.screen_view
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.search
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.select_content
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.select_item
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.select_promotion
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.set_checkout_option
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.share
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.sign_up
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.timing_complete
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.view_cart
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.view_item
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.view_item_list
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.view_promotion
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.view_search_results
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcMod {
  
  @JSImport("@firebase/analytics/dist/esm/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnalytics(): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")().asInstanceOf[Analytics]
  inline def getAnalytics(app: FirebaseApp): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  
  inline def initializeAnalytics(app: FirebaseApp): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  inline def initializeAnalytics(app: FirebaseApp, options: AnalyticsSettings): Analytics = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analytics]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: view_cart | view_item, eventParams: CurrencyItemsValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: view_cart | view_item,
    eventParams: CurrencyItemsValue,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: DictkeyCurrencyItems
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: DictkeyCurrencyItems,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: select_promotion | view_promotion,
    eventParams: DictkeyItems
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: select_promotion | view_promotion,
    eventParams: DictkeyItems,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: search | view_search_results, eventParams: Searchterm): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: search | view_search_results,
    eventParams: Searchterm,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: purchase | refund, eventParams: Tax): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: purchase | refund,
    eventParams: Tax,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](analyticsInstance: Analytics, eventName: CustomEventName[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](analyticsInstance: Analytics, eventName: CustomEventName[T], eventParams: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](
    analyticsInstance: Analytics,
    eventName: CustomEventName[T],
    eventParams: StringDictionary[Any],
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](
    analyticsInstance: Analytics,
    eventName: CustomEventName[T],
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_addpaymentinfo(analyticsInstance: Analytics, eventName: add_payment_info): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(
    analyticsInstance: Analytics,
    eventName: add_payment_info,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(analyticsInstance: Analytics, eventName: add_payment_info, eventParams: CouponCurrency): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(
    analyticsInstance: Analytics,
    eventName: add_payment_info,
    eventParams: CouponCurrency,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_addshippinginfo(analyticsInstance: Analytics, eventName: add_shipping_info): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(
    analyticsInstance: Analytics,
    eventName: add_shipping_info,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(analyticsInstance: Analytics, eventName: add_shipping_info, eventParams: ItemsShippingtier): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(
    analyticsInstance: Analytics,
    eventName: add_shipping_info,
    eventParams: ItemsShippingtier,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_begincheckout(analyticsInstance: Analytics, eventName: begin_checkout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(
    analyticsInstance: Analytics,
    eventName: begin_checkout,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(analyticsInstance: Analytics, eventName: begin_checkout, eventParams: DictkeyCouponCurrency): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(
    analyticsInstance: Analytics,
    eventName: begin_checkout,
    eventParams: DictkeyCouponCurrency,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_checkoutprogress(analyticsInstance: Analytics, eventName: checkout_progress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(
    analyticsInstance: Analytics,
    eventName: checkout_progress,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(
    analyticsInstance: Analytics,
    eventName: checkout_progress,
    eventParams: CheckoutoptionCheckoutstep
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(
    analyticsInstance: Analytics,
    eventName: checkout_progress,
    eventParams: CheckoutoptionCheckoutstep,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_exception(analyticsInstance: Analytics, eventName: exception): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(
    analyticsInstance: Analytics,
    eventName: exception,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(analyticsInstance: Analytics, eventName: exception, eventParams: Description): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(
    analyticsInstance: Analytics,
    eventName: exception,
    eventParams: Description,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_generatelead(analyticsInstance: Analytics, eventName: generate_lead): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(
    analyticsInstance: Analytics,
    eventName: generate_lead,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(analyticsInstance: Analytics, eventName: generate_lead, eventParams: Value): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(
    analyticsInstance: Analytics,
    eventName: generate_lead,
    eventParams: Value,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Method): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Method, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_pageview(analyticsInstance: Analytics, eventName: page_view): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(
    analyticsInstance: Analytics,
    eventName: page_view,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(analyticsInstance: Analytics, eventName: page_view, eventParams: Pagelocation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(
    analyticsInstance: Analytics,
    eventName: page_view,
    eventParams: Pagelocation,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_screenview(analyticsInstance: Analytics, eventName: screen_view): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(
    analyticsInstance: Analytics,
    eventName: screen_view,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(analyticsInstance: Analytics, eventName: screen_view, eventParams: Firebasescreen): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(
    analyticsInstance: Analytics,
    eventName: screen_view,
    eventParams: Firebasescreen,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_selectcontent(analyticsInstance: Analytics, eventName: select_content): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(
    analyticsInstance: Analytics,
    eventName: select_content,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(analyticsInstance: Analytics, eventName: select_content, eventParams: Contenttype): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(
    analyticsInstance: Analytics,
    eventName: select_content,
    eventParams: Contenttype,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_selectitem(analyticsInstance: Analytics, eventName: select_item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(
    analyticsInstance: Analytics,
    eventName: select_item,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(analyticsInstance: Analytics, eventName: select_item, eventParams: DictkeyItemlistid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(
    analyticsInstance: Analytics,
    eventName: select_item,
    eventParams: DictkeyItemlistid,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_setcheckoutoption(analyticsInstance: Analytics, eventName: set_checkout_option): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(
    analyticsInstance: Analytics,
    eventName: set_checkout_option,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(analyticsInstance: Analytics, eventName: set_checkout_option, eventParams: Checkoutstep): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(
    analyticsInstance: Analytics,
    eventName: set_checkout_option,
    eventParams: Checkoutstep,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Itemid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Itemid, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up, eventParams: Method): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(
    analyticsInstance: Analytics,
    eventName: sign_up,
    eventParams: Method,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_timingcomplete(analyticsInstance: Analytics, eventName: timing_complete): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(
    analyticsInstance: Analytics,
    eventName: timing_complete,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(analyticsInstance: Analytics, eventName: timing_complete, eventParams: Eventcategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(
    analyticsInstance: Analytics,
    eventName: timing_complete,
    eventParams: Eventcategory,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_viewitemlist(analyticsInstance: Analytics, eventName: view_item_list): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(
    analyticsInstance: Analytics,
    eventName: view_item_list,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(analyticsInstance: Analytics, eventName: view_item_list, eventParams: DictkeyItemlistid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(
    analyticsInstance: Analytics,
    eventName: view_item_list,
    eventParams: DictkeyItemlistid,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAnalyticsCollectionEnabled(analyticsInstance: Analytics, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsCollectionEnabled")(analyticsInstance.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setConsent(consentSettings: ConsentSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConsent")(consentSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCurrentScreen(analyticsInstance: Analytics, screenName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCurrentScreen(analyticsInstance: Analytics, screenName: String, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultEventParameters(customParams: CustomParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultEventParameters")(customParams.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserId(analyticsInstance: Analytics): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: String, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: Null, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUserProperties(analyticsInstance: Analytics, properties: CustomParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserProperties(analyticsInstance: Analytics, properties: CustomParams, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def settings(options: SettingsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject
  }
  
  object global {
    
    type Window = StringDictionary[Any]
  }
}
