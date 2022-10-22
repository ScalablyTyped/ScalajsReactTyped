package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsPauseRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the subaccount to pause */
  var id: String
}
object SubaccountsPauseRequest {
  
  inline def apply(id: String): SubaccountsPauseRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsPauseRequest]
  }
  
  extension [Self <: SubaccountsPauseRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
