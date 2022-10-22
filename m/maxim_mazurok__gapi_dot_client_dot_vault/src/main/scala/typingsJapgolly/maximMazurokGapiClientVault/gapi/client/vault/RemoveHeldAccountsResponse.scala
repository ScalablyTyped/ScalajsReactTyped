package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveHeldAccountsResponse extends StObject {
  
  /** A list of statuses for the deleted accounts. Results have the same order as the request. */
  var statuses: js.UndefOr[js.Array[Status]] = js.undefined
}
object RemoveHeldAccountsResponse {
  
  inline def apply(): RemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHeldAccountsResponse]
  }
  
  extension [Self <: RemoveHeldAccountsResponse](x: Self) {
    
    inline def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
