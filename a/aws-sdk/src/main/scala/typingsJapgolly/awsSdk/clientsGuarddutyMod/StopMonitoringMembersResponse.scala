package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMonitoringMembersResponse extends StObject {
  
  /**
    * A list of objects that contain an accountId for each account that could not be processed, and a result string that indicates why the account was not processed. 
    */
  var UnprocessedAccounts: typingsJapgolly.awsSdk.clientsGuarddutyMod.UnprocessedAccounts
}
object StopMonitoringMembersResponse {
  
  inline def apply(UnprocessedAccounts: UnprocessedAccounts): StopMonitoringMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringMembersResponse]
  }
  
  extension [Self <: StopMonitoringMembersResponse](x: Self) {
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
