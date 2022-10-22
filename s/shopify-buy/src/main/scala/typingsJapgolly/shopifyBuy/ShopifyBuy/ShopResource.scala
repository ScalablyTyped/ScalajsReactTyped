package typingsJapgolly.shopifyBuy.ShopifyBuy

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShopResource extends StObject {
  
  def fetchInfo(): js.Promise[Shop]
  
  def fetchPolicies(): js.Promise[Shop]
}
object ShopResource {
  
  inline def apply(fetchInfo: CallbackTo[js.Promise[Shop]], fetchPolicies: CallbackTo[js.Promise[Shop]]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = fetchInfo.toJsFn, fetchPolicies = fetchPolicies.toJsFn)
    __obj.asInstanceOf[ShopResource]
  }
  
  extension [Self <: ShopResource](x: Self) {
    
    inline def setFetchInfo(value: CallbackTo[js.Promise[Shop]]): Self = StObject.set(x, "fetchInfo", value.toJsFn)
    
    inline def setFetchPolicies(value: CallbackTo[js.Promise[Shop]]): Self = StObject.set(x, "fetchPolicies", value.toJsFn)
  }
}
