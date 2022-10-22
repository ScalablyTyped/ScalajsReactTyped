package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  def charge(data: CardChargeRequest): js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]]
  
  def validate(data: CardValidateRequest): js.Promise[AxiosResponse[CardValidateResponse, Any]]
}
object Card {
  
  inline def apply(
    charge: CardChargeRequest => js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]],
    validate: CardValidateRequest => js.Promise[AxiosResponse[CardValidateResponse, Any]]
  ): Card = {
    val __obj = js.Dynamic.literal(charge = js.Any.fromFunction1(charge), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCharge(value: CardChargeRequest => js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]]): Self = StObject.set(x, "charge", js.Any.fromFunction1(value))
    
    inline def setValidate(value: CardValidateRequest => js.Promise[AxiosResponse[CardValidateResponse, Any]]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
