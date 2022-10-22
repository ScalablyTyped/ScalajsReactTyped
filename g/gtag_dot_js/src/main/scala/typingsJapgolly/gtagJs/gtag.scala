package typingsJapgolly.gtagJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gtagJs.gtagJsStrings.config
import typingsJapgolly.gtagJs.gtagJsStrings.consent
import typingsJapgolly.gtagJs.gtagJsStrings.denied
import typingsJapgolly.gtagJs.gtagJsStrings.event
import typingsJapgolly.gtagJs.gtagJsStrings.get
import typingsJapgolly.gtagJs.gtagJsStrings.granted
import typingsJapgolly.gtagJs.gtagJsStrings.js_
import typingsJapgolly.gtagJs.gtagJsStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gtag {
  
  trait ConfigParams extends StObject {
    
    var page_location: js.UndefOr[String] = js.undefined
    
    var page_path: js.UndefOr[String] = js.undefined
    
    var page_title: js.UndefOr[String] = js.undefined
    
    var send_page_view: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigParams {
    
    inline def apply(): ConfigParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigParams]
    }
    
    extension [Self <: ConfigParams](x: Self) {
      
      inline def setPage_location(value: String): Self = StObject.set(x, "page_location", value.asInstanceOf[js.Any])
      
      inline def setPage_locationUndefined: Self = StObject.set(x, "page_location", js.undefined)
      
      inline def setPage_path(value: String): Self = StObject.set(x, "page_path", value.asInstanceOf[js.Any])
      
      inline def setPage_pathUndefined: Self = StObject.set(x, "page_path", js.undefined)
      
      inline def setPage_title(value: String): Self = StObject.set(x, "page_title", value.asInstanceOf[js.Any])
      
      inline def setPage_titleUndefined: Self = StObject.set(x, "page_title", js.undefined)
      
      inline def setSend_page_view(value: Boolean): Self = StObject.set(x, "send_page_view", value.asInstanceOf[js.Any])
      
      inline def setSend_page_viewUndefined: Self = StObject.set(x, "send_page_view", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gtagJs.gtagJsStrings.default
    - typingsJapgolly.gtagJs.gtagJsStrings.update
  */
  trait ConsentArg extends StObject
  object ConsentArg {
    
    inline def default: typingsJapgolly.gtagJs.gtagJsStrings.default = "default".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.default]
    
    inline def update: typingsJapgolly.gtagJs.gtagJsStrings.update = "update".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.update]
  }
  
  trait ConsentParams extends StObject {
    
    var ad_storage: js.UndefOr[granted | denied] = js.undefined
    
    var analytics_storage: js.UndefOr[granted | denied] = js.undefined
    
    var region: js.UndefOr[js.Array[String]] = js.undefined
    
    var wait_for_update: js.UndefOr[Double] = js.undefined
  }
  object ConsentParams {
    
    inline def apply(): ConsentParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsentParams]
    }
    
    extension [Self <: ConsentParams](x: Self) {
      
      inline def setAd_storage(value: granted | denied): Self = StObject.set(x, "ad_storage", value.asInstanceOf[js.Any])
      
      inline def setAd_storageUndefined: Self = StObject.set(x, "ad_storage", js.undefined)
      
      inline def setAnalytics_storage(value: granted | denied): Self = StObject.set(x, "analytics_storage", value.asInstanceOf[js.Any])
      
      inline def setAnalytics_storageUndefined: Self = StObject.set(x, "analytics_storage", js.undefined)
      
      inline def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value*))
      
      inline def setWait_for_update(value: Double): Self = StObject.set(x, "wait_for_update", value.asInstanceOf[js.Any])
      
      inline def setWait_for_updateUndefined: Self = StObject.set(x, "wait_for_update", js.undefined)
    }
  }
  
  trait ControlParams extends StObject {
    
    var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var event_timeout: js.UndefOr[Double] = js.undefined
    
    var groups: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ControlParams {
    
    inline def apply(): ControlParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlParams]
    }
    
    extension [Self <: ControlParams](x: Self) {
      
      inline def setEvent_callback(value: Callback): Self = StObject.set(x, "event_callback", value.toJsFn)
      
      inline def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
      
      inline def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
      
      inline def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
      
      inline def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
      
      inline def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
      
      inline def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value*))
    }
  }
  
  type Currency = String | Double
  
  type CustomParams = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gtagJs.gtagJsStrings.add_payment_info
    - typingsJapgolly.gtagJs.gtagJsStrings.add_shipping_info
    - typingsJapgolly.gtagJs.gtagJsStrings.add_to_cart
    - typingsJapgolly.gtagJs.gtagJsStrings.add_to_wishlist
    - typingsJapgolly.gtagJs.gtagJsStrings.begin_checkout
    - typingsJapgolly.gtagJs.gtagJsStrings.checkout_progress
    - typingsJapgolly.gtagJs.gtagJsStrings.earn_virtual_currency
    - typingsJapgolly.gtagJs.gtagJsStrings.exception
    - typingsJapgolly.gtagJs.gtagJsStrings.generate_lead
    - typingsJapgolly.gtagJs.gtagJsStrings.join_group
    - typingsJapgolly.gtagJs.gtagJsStrings.level_end
    - typingsJapgolly.gtagJs.gtagJsStrings.level_start
    - typingsJapgolly.gtagJs.gtagJsStrings.level_up
    - typingsJapgolly.gtagJs.gtagJsStrings.login
    - typingsJapgolly.gtagJs.gtagJsStrings.page_view
    - typingsJapgolly.gtagJs.gtagJsStrings.post_score
    - typingsJapgolly.gtagJs.gtagJsStrings.purchase
    - typingsJapgolly.gtagJs.gtagJsStrings.refund
    - typingsJapgolly.gtagJs.gtagJsStrings.remove_from_cart
    - typingsJapgolly.gtagJs.gtagJsStrings.screen_view
    - typingsJapgolly.gtagJs.gtagJsStrings.search
    - typingsJapgolly.gtagJs.gtagJsStrings.select_content
    - typingsJapgolly.gtagJs.gtagJsStrings.select_item
    - typingsJapgolly.gtagJs.gtagJsStrings.select_promotion
    - typingsJapgolly.gtagJs.gtagJsStrings.set_checkout_option
    - typingsJapgolly.gtagJs.gtagJsStrings.share
    - typingsJapgolly.gtagJs.gtagJsStrings.sign_up
    - typingsJapgolly.gtagJs.gtagJsStrings.spend_virtual_currency
    - typingsJapgolly.gtagJs.gtagJsStrings.tutorial_begin
    - typingsJapgolly.gtagJs.gtagJsStrings.tutorial_complete
    - typingsJapgolly.gtagJs.gtagJsStrings.unlock_achievement
    - typingsJapgolly.gtagJs.gtagJsStrings.timing_complete
    - typingsJapgolly.gtagJs.gtagJsStrings.view_cart
    - typingsJapgolly.gtagJs.gtagJsStrings.view_item
    - typingsJapgolly.gtagJs.gtagJsStrings.view_item_list
    - typingsJapgolly.gtagJs.gtagJsStrings.view_promotion
    - typingsJapgolly.gtagJs.gtagJsStrings.view_search_results
  */
  trait EventNames extends StObject
  object EventNames {
    
    inline def add_payment_info: typingsJapgolly.gtagJs.gtagJsStrings.add_payment_info = "add_payment_info".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.add_payment_info]
    
    inline def add_shipping_info: typingsJapgolly.gtagJs.gtagJsStrings.add_shipping_info = "add_shipping_info".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.add_shipping_info]
    
    inline def add_to_cart: typingsJapgolly.gtagJs.gtagJsStrings.add_to_cart = "add_to_cart".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.add_to_cart]
    
    inline def add_to_wishlist: typingsJapgolly.gtagJs.gtagJsStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.add_to_wishlist]
    
    inline def begin_checkout: typingsJapgolly.gtagJs.gtagJsStrings.begin_checkout = "begin_checkout".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.begin_checkout]
    
    inline def checkout_progress: typingsJapgolly.gtagJs.gtagJsStrings.checkout_progress = "checkout_progress".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.checkout_progress]
    
    inline def earn_virtual_currency: typingsJapgolly.gtagJs.gtagJsStrings.earn_virtual_currency = "earn_virtual_currency".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.earn_virtual_currency]
    
    inline def exception: typingsJapgolly.gtagJs.gtagJsStrings.exception = "exception".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.exception]
    
    inline def generate_lead: typingsJapgolly.gtagJs.gtagJsStrings.generate_lead = "generate_lead".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.generate_lead]
    
    inline def join_group: typingsJapgolly.gtagJs.gtagJsStrings.join_group = "join_group".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.join_group]
    
    inline def level_end: typingsJapgolly.gtagJs.gtagJsStrings.level_end = "level_end".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.level_end]
    
    inline def level_start: typingsJapgolly.gtagJs.gtagJsStrings.level_start = "level_start".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.level_start]
    
    inline def level_up: typingsJapgolly.gtagJs.gtagJsStrings.level_up = "level_up".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.level_up]
    
    inline def login: typingsJapgolly.gtagJs.gtagJsStrings.login = "login".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.login]
    
    inline def page_view: typingsJapgolly.gtagJs.gtagJsStrings.page_view = "page_view".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.page_view]
    
    inline def post_score: typingsJapgolly.gtagJs.gtagJsStrings.post_score = "post_score".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.post_score]
    
    inline def purchase: typingsJapgolly.gtagJs.gtagJsStrings.purchase = "purchase".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.purchase]
    
    inline def refund: typingsJapgolly.gtagJs.gtagJsStrings.refund = "refund".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.refund]
    
    inline def remove_from_cart: typingsJapgolly.gtagJs.gtagJsStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.remove_from_cart]
    
    inline def screen_view: typingsJapgolly.gtagJs.gtagJsStrings.screen_view = "screen_view".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.screen_view]
    
    inline def search: typingsJapgolly.gtagJs.gtagJsStrings.search = "search".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.search]
    
    inline def select_content: typingsJapgolly.gtagJs.gtagJsStrings.select_content = "select_content".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.select_content]
    
    inline def select_item: typingsJapgolly.gtagJs.gtagJsStrings.select_item = "select_item".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.select_item]
    
    inline def select_promotion: typingsJapgolly.gtagJs.gtagJsStrings.select_promotion = "select_promotion".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.select_promotion]
    
    inline def set_checkout_option: typingsJapgolly.gtagJs.gtagJsStrings.set_checkout_option = "set_checkout_option".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.set_checkout_option]
    
    inline def share: typingsJapgolly.gtagJs.gtagJsStrings.share = "share".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.share]
    
    inline def sign_up: typingsJapgolly.gtagJs.gtagJsStrings.sign_up = "sign_up".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.sign_up]
    
    inline def spend_virtual_currency: typingsJapgolly.gtagJs.gtagJsStrings.spend_virtual_currency = "spend_virtual_currency".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.spend_virtual_currency]
    
    inline def timing_complete: typingsJapgolly.gtagJs.gtagJsStrings.timing_complete = "timing_complete".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.timing_complete]
    
    inline def tutorial_begin: typingsJapgolly.gtagJs.gtagJsStrings.tutorial_begin = "tutorial_begin".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.tutorial_begin]
    
    inline def tutorial_complete: typingsJapgolly.gtagJs.gtagJsStrings.tutorial_complete = "tutorial_complete".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.tutorial_complete]
    
    inline def unlock_achievement: typingsJapgolly.gtagJs.gtagJsStrings.unlock_achievement = "unlock_achievement".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.unlock_achievement]
    
    inline def view_cart: typingsJapgolly.gtagJs.gtagJsStrings.view_cart = "view_cart".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.view_cart]
    
    inline def view_item: typingsJapgolly.gtagJs.gtagJsStrings.view_item = "view_item".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.view_item]
    
    inline def view_item_list: typingsJapgolly.gtagJs.gtagJsStrings.view_item_list = "view_item_list".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.view_item_list]
    
    inline def view_promotion: typingsJapgolly.gtagJs.gtagJsStrings.view_promotion = "view_promotion".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.view_promotion]
    
    inline def view_search_results: typingsJapgolly.gtagJs.gtagJsStrings.view_search_results = "view_search_results".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.view_search_results]
  }
  
  trait EventParams extends StObject {
    
    var checkout_option: js.UndefOr[String] = js.undefined
    
    var checkout_step: js.UndefOr[Double] = js.undefined
    
    var content_id: js.UndefOr[String] = js.undefined
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var event_category: js.UndefOr[String] = js.undefined
    
    var event_label: js.UndefOr[String] = js.undefined
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[Item]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[String] = js.undefined
    
    var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
    
    var screen_name: js.UndefOr[String] = js.undefined
    
    var search_term: js.UndefOr[String] = js.undefined
    
    var shipping: js.UndefOr[Currency] = js.undefined
    
    var tax: js.UndefOr[Currency] = js.undefined
    
    var transaction_id: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object EventParams {
    
    inline def apply(): EventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventParams]
    }
    
    extension [Self <: EventParams](x: Self) {
      
      inline def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
      
      inline def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
      
      inline def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
      
      inline def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
      
      inline def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
      
      inline def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
      
      inline def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
      
      inline def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
      
      inline def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
      
      inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
      
      inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
      
      inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
      
      inline def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
      
      inline def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
      
      inline def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
      
      inline def setShipping(value: Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      inline def setTax(value: Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
      
      inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gtagJs.gtagJsStrings.client_id
    - typingsJapgolly.gtagJs.gtagJsStrings.session_id
    - typingsJapgolly.gtagJs.gtagJsStrings.gclid
  */
  trait FieldNames extends StObject
  object FieldNames {
    
    inline def client_id: typingsJapgolly.gtagJs.gtagJsStrings.client_id = "client_id".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.client_id]
    
    inline def gclid: typingsJapgolly.gtagJs.gtagJsStrings.gclid = "gclid".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.gclid]
    
    inline def session_id: typingsJapgolly.gtagJs.gtagJsStrings.session_id = "session_id".asInstanceOf[typingsJapgolly.gtagJs.gtagJsStrings.session_id]
  }
  
  @js.native
  trait Gtag extends StObject {
    
    def apply(command: config, targetId: String): Unit = js.native
    def apply(command: config, targetId: String, config: ConfigParams): Unit = js.native
    def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
    def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
    def apply(command: config, targetId: String, config: EventParams): Unit = js.native
    def apply(command: consent, consentArg: String, consentParams: ConsentParams): Unit = js.native
    def apply(command: consent, consentArg: ConsentArg, consentParams: ConsentParams): Unit = js.native
    def apply(command: event, eventName: String): Unit = js.native
    def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    def apply(command: event, eventName: EventNames): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: EventParams): Unit = js.native
    def apply(command: get, targetId: String, fieldName: String): Unit = js.native
    def apply(
      command: get,
      targetId: String,
      fieldName: String,
      callback: js.Function1[/* field */ js.UndefOr[String | CustomParams], Any]
    ): Unit = js.native
    def apply(command: get, targetId: String, fieldName: FieldNames): Unit = js.native
    def apply(
      command: get,
      targetId: String,
      fieldName: FieldNames,
      callback: js.Function1[/* field */ js.UndefOr[String | CustomParams], Any]
    ): Unit = js.native
    def apply(command: js_, config: js.Date): Unit = js.native
    def apply(command: set, config: CustomParams): Unit = js.native
    def apply(command: set, targetId: String, config: String): Unit = js.native
    def apply(command: set, targetId: String, config: Boolean): Unit = js.native
    def apply(command: set, targetId: String, config: CustomParams): Unit = js.native
  }
  
  /**
    * Interface of an item object used in lists for this event.
    *
    * Reference:
    * @see {@link https://developers.google.com/analytics/devguides/collection/ga4/reference/events#view_item_item view_item_item}
    * @see {@link https://developers.google.com/analytics/devguides/collection/ga4/reference/events#view_item_list_item view_item_list_item}
    * @see {@link https://developers.google.com/analytics/devguides/collection/ga4/reference/events#select_item_item select_item_item}
    * @see {@link https://developers.google.com/analytics/devguides/collection/ga4/reference/events#add_to_cart_item add_to_cart_item}
    * @see {@link https://developers.google.com/analytics/devguides/collection/ga4/reference/events#view_cart_item view_cart_item}
    */
  trait Item extends StObject {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var creative_name: js.UndefOr[String] = js.undefined
    
    var creative_slot: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var discount: js.UndefOr[Currency] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var item_brand: js.UndefOr[String] = js.undefined
    
    var item_category: js.UndefOr[String] = js.undefined
    
    var item_category2: js.UndefOr[String] = js.undefined
    
    var item_category3: js.UndefOr[String] = js.undefined
    
    var item_category4: js.UndefOr[String] = js.undefined
    
    var item_category5: js.UndefOr[String] = js.undefined
    
    var item_id: js.UndefOr[String] = js.undefined
    
    var item_list_id: js.UndefOr[String] = js.undefined
    
    var item_list_name: js.UndefOr[String] = js.undefined
    
    var item_name: js.UndefOr[String] = js.undefined
    
    var item_variant: js.UndefOr[String] = js.undefined
    
    var location_id: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Currency] = js.undefined
    
    var promotion_id: js.UndefOr[String] = js.undefined
    
    var promotion_name: js.UndefOr[String] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      inline def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      inline def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      inline def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      inline def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDiscount(value: Currency): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem_brand(value: String): Self = StObject.set(x, "item_brand", value.asInstanceOf[js.Any])
      
      inline def setItem_brandUndefined: Self = StObject.set(x, "item_brand", js.undefined)
      
      inline def setItem_category(value: String): Self = StObject.set(x, "item_category", value.asInstanceOf[js.Any])
      
      inline def setItem_category2(value: String): Self = StObject.set(x, "item_category2", value.asInstanceOf[js.Any])
      
      inline def setItem_category2Undefined: Self = StObject.set(x, "item_category2", js.undefined)
      
      inline def setItem_category3(value: String): Self = StObject.set(x, "item_category3", value.asInstanceOf[js.Any])
      
      inline def setItem_category3Undefined: Self = StObject.set(x, "item_category3", js.undefined)
      
      inline def setItem_category4(value: String): Self = StObject.set(x, "item_category4", value.asInstanceOf[js.Any])
      
      inline def setItem_category4Undefined: Self = StObject.set(x, "item_category4", js.undefined)
      
      inline def setItem_category5(value: String): Self = StObject.set(x, "item_category5", value.asInstanceOf[js.Any])
      
      inline def setItem_category5Undefined: Self = StObject.set(x, "item_category5", js.undefined)
      
      inline def setItem_categoryUndefined: Self = StObject.set(x, "item_category", js.undefined)
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
      
      inline def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
      
      inline def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
      
      inline def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
      
      inline def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
      
      inline def setItem_name(value: String): Self = StObject.set(x, "item_name", value.asInstanceOf[js.Any])
      
      inline def setItem_nameUndefined: Self = StObject.set(x, "item_name", js.undefined)
      
      inline def setItem_variant(value: String): Self = StObject.set(x, "item_variant", value.asInstanceOf[js.Any])
      
      inline def setItem_variantUndefined: Self = StObject.set(x, "item_variant", js.undefined)
      
      inline def setLocation_id(value: String): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
      
      inline def setLocation_idUndefined: Self = StObject.set(x, "location_id", js.undefined)
      
      inline def setPrice(value: Currency): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
      
      inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
      
      inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
      
      inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  trait Promotion extends StObject {
    
    var creative_name: js.UndefOr[String] = js.undefined
    
    var creative_slot: js.UndefOr[String] = js.undefined
    
    var promotion_id: js.UndefOr[String] = js.undefined
    
    var promotion_name: js.UndefOr[String] = js.undefined
  }
  object Promotion {
    
    inline def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
    
    extension [Self <: Promotion](x: Self) {
      
      inline def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      inline def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      inline def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      inline def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
      
      inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
      
      inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
      
      inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
    }
  }
}
