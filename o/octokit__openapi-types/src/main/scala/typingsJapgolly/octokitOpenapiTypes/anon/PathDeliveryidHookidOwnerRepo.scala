package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryidHookidOwnerRepo extends StObject {
  
  var path: DeliveryidHookidOwnerRepo
}
object PathDeliveryidHookidOwnerRepo {
  
  inline def apply(path: DeliveryidHookidOwnerRepo): PathDeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryidHookidOwnerRepo]
  }
  
  extension [Self <: PathDeliveryidHookidOwnerRepo](x: Self) {
    
    inline def setPath(value: DeliveryidHookidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
