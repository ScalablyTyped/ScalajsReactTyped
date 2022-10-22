package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountResponse extends StObject {
  
  /**
    * The updated Amazon Chime account details.
    */
  var Account: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.Account] = js.undefined
}
object UpdateAccountResponse {
  
  inline def apply(): UpdateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountResponse]
  }
  
  extension [Self <: UpdateAccountResponse](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
