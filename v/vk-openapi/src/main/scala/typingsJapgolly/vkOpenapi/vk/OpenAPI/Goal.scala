package typingsJapgolly.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Goal {
  
  type API = js.Function2[/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.customize_product
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.initiate_checkout
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.purchase
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.contact
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.lead
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.schedule
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.complete_registration
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.submit_application
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.start_trial
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.subscribe
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.page_view
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.view_content
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.search
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.find_location
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.donate
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.conversion
  */
  trait GoalEvent extends StObject
  object GoalEvent {
    
    inline def add_payment_info: typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    inline def add_to_cart: typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    inline def add_to_wishlist: typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    inline def complete_registration: typingsJapgolly.vkOpenapi.vkOpenapiStrings.complete_registration = "complete_registration".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.complete_registration]
    
    inline def contact: typingsJapgolly.vkOpenapi.vkOpenapiStrings.contact = "contact".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.contact]
    
    inline def conversion: typingsJapgolly.vkOpenapi.vkOpenapiStrings.conversion = "conversion".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.conversion]
    
    inline def customize_product: typingsJapgolly.vkOpenapi.vkOpenapiStrings.customize_product = "customize_product".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.customize_product]
    
    inline def donate: typingsJapgolly.vkOpenapi.vkOpenapiStrings.donate = "donate".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.donate]
    
    inline def find_location: typingsJapgolly.vkOpenapi.vkOpenapiStrings.find_location = "find_location".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.find_location]
    
    inline def initiate_checkout: typingsJapgolly.vkOpenapi.vkOpenapiStrings.initiate_checkout = "initiate_checkout".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.initiate_checkout]
    
    inline def lead: typingsJapgolly.vkOpenapi.vkOpenapiStrings.lead = "lead".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.lead]
    
    inline def page_view: typingsJapgolly.vkOpenapi.vkOpenapiStrings.page_view = "page_view".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.page_view]
    
    inline def purchase: typingsJapgolly.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.purchase]
    
    inline def schedule: typingsJapgolly.vkOpenapi.vkOpenapiStrings.schedule = "schedule".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.schedule]
    
    inline def search: typingsJapgolly.vkOpenapi.vkOpenapiStrings.search = "search".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.search]
    
    inline def start_trial: typingsJapgolly.vkOpenapi.vkOpenapiStrings.start_trial = "start_trial".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.start_trial]
    
    inline def submit_application: typingsJapgolly.vkOpenapi.vkOpenapiStrings.submit_application = "submit_application".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.submit_application]
    
    inline def subscribe: typingsJapgolly.vkOpenapi.vkOpenapiStrings.subscribe = "subscribe".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.subscribe]
    
    inline def view_content: typingsJapgolly.vkOpenapi.vkOpenapiStrings.view_content = "view_content".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.view_content]
  }
  
  trait GoalParams extends StObject {
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object GoalParams {
    
    inline def apply(): GoalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoalParams]
    }
    
    extension [Self <: GoalParams](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
