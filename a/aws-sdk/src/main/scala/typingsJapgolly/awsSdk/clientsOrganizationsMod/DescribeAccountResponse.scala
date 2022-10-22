package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountResponse extends StObject {
  
  /**
    * A structure that contains information about the requested account.
    */
  var Account: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.Account] = js.undefined
}
object DescribeAccountResponse {
  
  inline def apply(): DescribeAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResponse]
  }
  
  extension [Self <: DescribeAccountResponse](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
