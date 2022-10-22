package typingsJapgolly.checCommerceJs

import typingsJapgolly.checCommerceJs.mod.^
import typingsJapgolly.checCommerceJs.typesAssetMod.Asset
import typingsJapgolly.checCommerceJs.typesLineItemMod.LineItem
import typingsJapgolly.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresCartMod {
  
  @JSImport("@chec/commerce.js/features/cart", "Cart")
  @js.native
  open class Cart protected () extends StObject {
    def this(commerce: ^) = this()
    
    def add(productId: String): js.Promise[AddUpdateResponse] = js.native
    def add(productId: String, quantity: Double): js.Promise[AddUpdateResponse] = js.native
    def add(productId: String, quantity: Double, variantData: String): js.Promise[AddUpdateResponse] = js.native
    def add(productId: String, quantity: Double, variantData: js.Object): js.Promise[AddUpdateResponse] = js.native
    def add(productId: String, quantity: Unit, variantData: String): js.Promise[AddUpdateResponse] = js.native
    def add(productId: String, quantity: Unit, variantData: js.Object): js.Promise[AddUpdateResponse] = js.native
    
    def checkQuantity(productId: String, quantity: Double): js.Promise[Boolean] = js.native
    
    def contents(): js.Promise[js.Array[LineItem]] = js.native
    
    def delete(): js.Promise[DeleteResponse] = js.native
    
    def empty(): js.Promise[EmptyResponse] = js.native
    
    def id(): String | Null = js.native
    
    def refresh(): js.Promise[typingsJapgolly.checCommerceJs.typesCartMod.Cart] = js.native
    
    def remove(lineId: String): js.Promise[RemoveResponse] = js.native
    
    def request(): js.Promise[Any] = js.native
    def request(endpoint: String): js.Promise[Any] = js.native
    def request(endpoint: String, method: Unit, data: js.Object): js.Promise[Any] = js.native
    def request(endpoint: String, method: Unit, data: js.Object, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: String, method: Unit, data: Unit, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: String, method: RequestMethod): js.Promise[Any] = js.native
    def request(endpoint: String, method: RequestMethod, data: js.Object): js.Promise[Any] = js.native
    def request(endpoint: String, method: RequestMethod, data: js.Object, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: String, method: RequestMethod, data: Unit, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: Unit, data: js.Object): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: Unit, data: js.Object, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: Unit, data: Unit, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: RequestMethod): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: RequestMethod, data: js.Object): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: RequestMethod, data: js.Object, returnFullRequest: Boolean): js.Promise[Any] = js.native
    def request(endpoint: Unit, method: RequestMethod, data: Unit, returnFullRequest: Boolean): js.Promise[Any] = js.native
    
    def retrieve(): js.Promise[typingsJapgolly.checCommerceJs.typesCartMod.Cart] = js.native
    def retrieve(cardId: String): js.Promise[typingsJapgolly.checCommerceJs.typesCartMod.Cart] = js.native
    
    def update(lineId: String, data: js.Object): js.Promise[AddUpdateResponse] = js.native
  }
  
  trait AddUpdateResponse extends StObject {
    
    var cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart
    
    var event: String
    
    var image: Asset | Null
    
    var line_item_id: String
    
    var line_total: Price
    
    var product_id: String
    
    var product_name: String
    
    var quantity: Double
    
    var success: Boolean
  }
  object AddUpdateResponse {
    
    inline def apply(
      cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart,
      event: String,
      line_item_id: String,
      line_total: Price,
      product_id: String,
      product_name: String,
      quantity: Double,
      success: Boolean
    ): AddUpdateResponse = {
      val __obj = js.Dynamic.literal(cart = cart.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], line_item_id = line_item_id.asInstanceOf[js.Any], line_total = line_total.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], image = null)
      __obj.asInstanceOf[AddUpdateResponse]
    }
    
    extension [Self <: AddUpdateResponse](x: Self) {
      
      inline def setCart(value: typingsJapgolly.checCommerceJs.typesCartMod.Cart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Asset): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setLine_item_id(value: String): Self = StObject.set(x, "line_item_id", value.asInstanceOf[js.Any])
      
      inline def setLine_total(value: Price): Self = StObject.set(x, "line_total", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteResponse extends StObject {
    
    var cart_id: String
    
    var event: String
    
    var success: Boolean
  }
  object DeleteResponse {
    
    inline def apply(cart_id: String, event: String, success: Boolean): DeleteResponse = {
      val __obj = js.Dynamic.literal(cart_id = cart_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteResponse]
    }
    
    extension [Self <: DeleteResponse](x: Self) {
      
      inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmptyResponse extends StObject {
    
    var cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart
    
    var event: String
    
    var success: Boolean
  }
  object EmptyResponse {
    
    inline def apply(cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart, event: String, success: Boolean): EmptyResponse = {
      val __obj = js.Dynamic.literal(cart = cart.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyResponse]
    }
    
    extension [Self <: EmptyResponse](x: Self) {
      
      inline def setCart(value: typingsJapgolly.checCommerceJs.typesCartMod.Cart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveResponse extends StObject {
    
    var cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart
    
    var event: String
    
    var line_item_id: String
    
    var success: Boolean
  }
  object RemoveResponse {
    
    inline def apply(
      cart: typingsJapgolly.checCommerceJs.typesCartMod.Cart,
      event: String,
      line_item_id: String,
      success: Boolean
    ): RemoveResponse = {
      val __obj = js.Dynamic.literal(cart = cart.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], line_item_id = line_item_id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveResponse]
    }
    
    extension [Self <: RemoveResponse](x: Self) {
      
      inline def setCart(value: typingsJapgolly.checCommerceJs.typesCartMod.Cart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setLine_item_id(value: String): Self = StObject.set(x, "line_item_id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.get
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.post
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.put
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.patch
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.delete
  */
  trait RequestMethod extends StObject
  object RequestMethod {
    
    inline def delete: typingsJapgolly.checCommerceJs.checCommerceJsStrings.delete = "delete".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.delete]
    
    inline def get: typingsJapgolly.checCommerceJs.checCommerceJsStrings.get = "get".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.get]
    
    inline def patch: typingsJapgolly.checCommerceJs.checCommerceJsStrings.patch = "patch".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.patch]
    
    inline def post: typingsJapgolly.checCommerceJs.checCommerceJsStrings.post = "post".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.post]
    
    inline def put: typingsJapgolly.checCommerceJs.checCommerceJsStrings.put = "put".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.put]
  }
}
