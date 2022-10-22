package typingsJapgolly.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverResponse extends StObject {
  
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}
object UpdateResolverResponse {
  
  inline def apply(): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverResponse]
  }
  
  extension [Self <: UpdateResolverResponse](x: Self) {
    
    inline def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
