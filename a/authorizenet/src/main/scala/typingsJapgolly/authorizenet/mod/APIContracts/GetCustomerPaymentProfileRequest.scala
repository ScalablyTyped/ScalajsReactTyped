package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerPaymentProfileRequest")
@js.native
open class GetCustomerPaymentProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerPaymentProfileId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  def getCustomerPaymentProfileId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getIncludeIssuerInfo(): Any = js.native
  
  def getJSON(): typingsJapgolly.authorizenet.anon.GetCustomerPaymentProfileRequest = js.native
  
  def getUnmaskExpirationDate(): Any = js.native
  
  var includeIssuerInfo: Any = js.native
  
  def setCustomerPaymentProfileId(p_customerPaymentProfileId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setIncludeIssuerInfo(p_includeIssuerInfo: Any): Unit = js.native
  
  def setUnmaskExpirationDate(p_unmaskExpirationDate: Any): Unit = js.native
  
  var unmaskExpirationDate: Any = js.native
}
