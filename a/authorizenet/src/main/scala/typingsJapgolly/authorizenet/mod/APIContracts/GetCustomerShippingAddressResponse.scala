package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerShippingAddressResponse")
@js.native
open class GetCustomerShippingAddressResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var address: Any = js.native
  
  var defaultShippingAddress: Any = js.native
  
  def getAddress(): Any = js.native
  
  def getDefaultShippingAddress(): Any = js.native
  
  def getSubscriptionIds(): Any = js.native
  
  def setAddress(p_address: Any): Unit = js.native
  
  def setDefaultShippingAddress(p_defaultShippingAddress: Any): Unit = js.native
  
  def setSubscriptionIds(p_subscriptionIds: Any): Unit = js.native
  
  var subscriptionIds: Any = js.native
}
