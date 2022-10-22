package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerProfileResponse")
@js.native
open class GetCustomerProfileResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getProfile(): Any = js.native
  
  def getSubscriptionIds(): Any = js.native
  
  var profile: Any = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
  
  def setSubscriptionIds(p_subscriptionIds: Any): Unit = js.native
  
  var subscriptionIds: Any = js.native
}
