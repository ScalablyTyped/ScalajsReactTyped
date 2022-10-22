package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerPaymentProfileResponse")
@js.native
open class GetCustomerPaymentProfileResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getPaymentProfile(): Any = js.native
  
  var paymentProfile: Any = js.native
  
  def setPaymentProfile(p_paymentProfile: Any): Unit = js.native
}
