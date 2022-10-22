package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhooksFindByIdRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of a webhook belonging to this account */
  var id: Double
}
object WebhooksFindByIdRequest {
  
  inline def apply(id: Double): WebhooksFindByIdRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhooksFindByIdRequest]
  }
  
  extension [Self <: WebhooksFindByIdRequest](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
