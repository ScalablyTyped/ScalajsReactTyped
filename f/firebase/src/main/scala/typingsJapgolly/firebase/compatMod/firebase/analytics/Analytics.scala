package typingsJapgolly.firebase.compatMod.firebase.analytics

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebase.anon.Affiliation
import typingsJapgolly.firebase.anon.Checkoutoption
import typingsJapgolly.firebase.anon.Checkoutstep
import typingsJapgolly.firebase.anon.Contenttype
import typingsJapgolly.firebase.anon.Coupon
import typingsJapgolly.firebase.anon.Description
import typingsJapgolly.firebase.anon.Dictkey
import typingsJapgolly.firebase.anon.DictkeyCurrency
import typingsJapgolly.firebase.anon.Eventcategory
import typingsJapgolly.firebase.anon.Firebasescreen
import typingsJapgolly.firebase.anon.Itemid
import typingsJapgolly.firebase.anon.Itemlistid
import typingsJapgolly.firebase.anon.Items
import typingsJapgolly.firebase.anon.Method
import typingsJapgolly.firebase.anon.Pagelocation
import typingsJapgolly.firebase.anon.Promotionid
import typingsJapgolly.firebase.anon.Searchterm
import typingsJapgolly.firebase.anon.Value
import typingsJapgolly.firebase.compatMod.firebase.app.App
import typingsJapgolly.firebase.firebaseStrings.add_payment_info
import typingsJapgolly.firebase.firebaseStrings.add_shipping_info
import typingsJapgolly.firebase.firebaseStrings.add_to_cart
import typingsJapgolly.firebase.firebaseStrings.add_to_wishlist
import typingsJapgolly.firebase.firebaseStrings.begin_checkout
import typingsJapgolly.firebase.firebaseStrings.checkout_progress
import typingsJapgolly.firebase.firebaseStrings.exception
import typingsJapgolly.firebase.firebaseStrings.generate_lead
import typingsJapgolly.firebase.firebaseStrings.login
import typingsJapgolly.firebase.firebaseStrings.page_view
import typingsJapgolly.firebase.firebaseStrings.purchase
import typingsJapgolly.firebase.firebaseStrings.refund
import typingsJapgolly.firebase.firebaseStrings.remove_from_cart
import typingsJapgolly.firebase.firebaseStrings.screen_view
import typingsJapgolly.firebase.firebaseStrings.search
import typingsJapgolly.firebase.firebaseStrings.select_content
import typingsJapgolly.firebase.firebaseStrings.select_item
import typingsJapgolly.firebase.firebaseStrings.select_promotion
import typingsJapgolly.firebase.firebaseStrings.set_checkout_option
import typingsJapgolly.firebase.firebaseStrings.share
import typingsJapgolly.firebase.firebaseStrings.sign_up
import typingsJapgolly.firebase.firebaseStrings.timing_complete
import typingsJapgolly.firebase.firebaseStrings.view_cart
import typingsJapgolly.firebase.firebaseStrings.view_item
import typingsJapgolly.firebase.firebaseStrings.view_item_list
import typingsJapgolly.firebase.firebaseStrings.view_promotion
import typingsJapgolly.firebase.firebaseStrings.view_search_results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends StObject {
  
  /**
    * The {@link firebase.app.App app} associated with the `Analytics` service
    * instance.
    *
    * @example
    * ```javascript
    * var app = analytics.app;
    * ```
    */
  var app: App = js.native
  
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  def logEvent(
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results
  ): Unit = js.native
  def logEvent(
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = js.native
  def logEvent(eventName: purchase | refund, eventParams: Affiliation): Unit = js.native
  def logEvent(eventName: purchase | refund, eventParams: Affiliation, options: AnalyticsCallOptions): Unit = js.native
  def logEvent(
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: typingsJapgolly.firebase.anon.Currency
  ): Unit = js.native
  def logEvent(
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: typingsJapgolly.firebase.anon.Currency,
    options: AnalyticsCallOptions
  ): Unit = js.native
  def logEvent(eventName: view_cart | view_item, eventParams: DictkeyCurrency): Unit = js.native
  def logEvent(eventName: view_cart | view_item, eventParams: DictkeyCurrency, options: AnalyticsCallOptions): Unit = js.native
  def logEvent(eventName: select_promotion | view_promotion, eventParams: Promotionid): Unit = js.native
  def logEvent(
    eventName: select_promotion | view_promotion,
    eventParams: Promotionid,
    options: AnalyticsCallOptions
  ): Unit = js.native
  def logEvent(eventName: search | view_search_results, eventParams: Searchterm): Unit = js.native
  def logEvent(eventName: search | view_search_results, eventParams: Searchterm, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  def logEvent[T /* <: String */](eventName: CustomEventName[T]): Unit = js.native
  def logEvent[T /* <: String */](eventName: CustomEventName[T], eventParams: StringDictionary[Any]): Unit = js.native
  def logEvent[T /* <: String */](eventName: CustomEventName[T], eventParams: StringDictionary[Any], options: AnalyticsCallOptions): Unit = js.native
  def logEvent[T /* <: String */](eventName: CustomEventName[T], eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Dictkey): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Dictkey, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Coupon): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Coupon, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Items): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Items, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Checkoutoption): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Checkoutoption, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * See
    * {@link https://developers.google.com/analytics/devguides/collection/ga4/exceptions
    * | Measure exceptions}.
    */
  @JSName("logEvent")
  def logEvent_exception(eventName: exception): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Description): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Description, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Value): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Value, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_login(eventName: login): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Method, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * See
    * {@link https://developers.google.com/analytics/devguides/collection/ga4/page-view
    * | Page views}.
    */
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Pagelocation): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Pagelocation, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * See {@link https://firebase.google.com/docs/analytics/screenviews
    * | Track Screenviews}.
    */
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Firebasescreen): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Firebasescreen, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Contenttype): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Contenttype, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Itemlistid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Checkoutstep): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Checkoutstep, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_share(eventName: share): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Itemid): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Itemid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Method, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Eventcategory): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Eventcategory, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/ga4-events
    * | the GA4 reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Itemlistid, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Sets whether analytics collection is enabled for this app on this device.
    * window['ga-disable-analyticsId'] = true;
    */
  def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'screen_name'.
    *
    * @deprecated Use {@link logEvent} with `eventName` as 'screen_view' and add relevant `eventParams`.
    * See {@link https://firebase.google.com/docs/analytics/screenviews | Track Screenviews}.
    */
  def setCurrentScreen(screenName: String): Unit = js.native
  def setCurrentScreen(screenName: String, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'user_id'.
    */
  def setUserId(id: String): Unit = js.native
  def setUserId(id: String, options: AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set all params specified.
    */
  def setUserProperties(properties: CustomParams): Unit = js.native
  def setUserProperties(properties: CustomParams, options: AnalyticsCallOptions): Unit = js.native
}
