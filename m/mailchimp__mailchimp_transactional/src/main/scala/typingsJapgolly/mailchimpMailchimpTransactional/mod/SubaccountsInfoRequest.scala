package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsInfoRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the subaccount to query */
  var id: String
}
object SubaccountsInfoRequest {
  
  inline def apply(id: String): SubaccountsInfoRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsInfoRequest]
  }
  
  extension [Self <: SubaccountsInfoRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
