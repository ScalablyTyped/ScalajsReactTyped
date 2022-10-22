package typingsJapgolly.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerPaymentProfileListRequest")
@js.native
open class GetCustomerPaymentProfileListRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typingsJapgolly.authorizenet.anon.GetCustomerPaymentProfileListRequest = js.native
  
  def getMonth(): Any = js.native
  
  def getPaging(): Any = js.native
  
  def getSearchType(): Any = js.native
  
  def getSorting(): Any = js.native
  
  var month: Any = js.native
  
  var paging: Any = js.native
  
  var searchType: Any = js.native
  
  def setMonth(p_month: Any): Unit = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
  
  def setSearchType(p_searchType: Any): Unit = js.native
  
  def setSorting(p_sorting: Any): Unit = js.native
  
  var sorting: Any = js.native
}
