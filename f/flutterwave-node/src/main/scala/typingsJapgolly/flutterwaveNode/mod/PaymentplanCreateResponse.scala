package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.Datecreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanCreateResponse
  extends StObject
     with BaseResponse {
  
  var data: Datecreated
}
object PaymentplanCreateResponse {
  
  inline def apply(data: Datecreated, message: String, status: String): PaymentplanCreateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentplanCreateResponse]
  }
  
  extension [Self <: PaymentplanCreateResponse](x: Self) {
    
    inline def setData(value: Datecreated): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
