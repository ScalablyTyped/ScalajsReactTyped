package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAccount extends StObject {
  
  def accountNumber(data: VirtualAccountAccountNumberRequest): js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
}
object VirtualAccount {
  
  inline def apply(
    accountNumber: VirtualAccountAccountNumberRequest => js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
  ): VirtualAccount = {
    val __obj = js.Dynamic.literal(accountNumber = js.Any.fromFunction1(accountNumber))
    __obj.asInstanceOf[VirtualAccount]
  }
  
  extension [Self <: VirtualAccount](x: Self) {
    
    inline def setAccountNumber(
      value: VirtualAccountAccountNumberRequest => js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
    ): Self = StObject.set(x, "accountNumber", js.Any.fromFunction1(value))
  }
}
