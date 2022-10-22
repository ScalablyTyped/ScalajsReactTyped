package typingsJapgolly.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphModel extends StObject {
  
  var attrs: js.UndefOr[Any] = js.undefined
  
  var onlineStoreUrl: js.UndefOr[String] = js.undefined
}
object GraphModel {
  
  inline def apply(): GraphModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphModel]
  }
  
  extension [Self <: GraphModel](x: Self) {
    
    inline def setAttrs(value: Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setOnlineStoreUrl(value: String): Self = StObject.set(x, "onlineStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setOnlineStoreUrlUndefined: Self = StObject.set(x, "onlineStoreUrl", js.undefined)
  }
}
