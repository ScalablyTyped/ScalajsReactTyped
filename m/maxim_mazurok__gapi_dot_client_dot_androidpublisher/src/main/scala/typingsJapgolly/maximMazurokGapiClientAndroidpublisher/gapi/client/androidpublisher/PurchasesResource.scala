package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchasesResource extends StObject {
  
  var products: ProductsResource
  
  var subscriptions: SubscriptionsResource
  
  var subscriptionsv2: Subscriptionsv2Resource
  
  var voidedpurchases: VoidedpurchasesResource
}
object PurchasesResource {
  
  inline def apply(
    products: ProductsResource,
    subscriptions: SubscriptionsResource,
    subscriptionsv2: Subscriptionsv2Resource,
    voidedpurchases: VoidedpurchasesResource
  ): PurchasesResource = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], subscriptionsv2 = subscriptionsv2.asInstanceOf[js.Any], voidedpurchases = voidedpurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasesResource]
  }
  
  extension [Self <: PurchasesResource](x: Self) {
    
    inline def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsv2(value: Subscriptionsv2Resource): Self = StObject.set(x, "subscriptionsv2", value.asInstanceOf[js.Any])
    
    inline def setVoidedpurchases(value: VoidedpurchasesResource): Self = StObject.set(x, "voidedpurchases", value.asInstanceOf[js.Any])
  }
}
