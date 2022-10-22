package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USSD extends StObject {
  
  def charge(data: USSDChargeRequest): js.Promise[AxiosResponse[USSDChargeResponse, Any]]
}
object USSD {
  
  inline def apply(charge: USSDChargeRequest => js.Promise[AxiosResponse[USSDChargeResponse, Any]]): USSD = {
    val __obj = js.Dynamic.literal(charge = js.Any.fromFunction1(charge))
    __obj.asInstanceOf[USSD]
  }
  
  extension [Self <: USSD](x: Self) {
    
    inline def setCharge(value: USSDChargeRequest => js.Promise[AxiosResponse[USSDChargeResponse, Any]]): Self = StObject.set(x, "charge", js.Any.fromFunction1(value))
  }
}
