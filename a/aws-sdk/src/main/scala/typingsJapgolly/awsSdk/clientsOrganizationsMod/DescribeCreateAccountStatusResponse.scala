package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCreateAccountStatusResponse extends StObject {
  
  /**
    * A structure that contains the current status of an account creation request.
    */
  var CreateAccountStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.CreateAccountStatus] = js.undefined
}
object DescribeCreateAccountStatusResponse {
  
  inline def apply(): DescribeCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
  }
  
  extension [Self <: DescribeCreateAccountStatusResponse](x: Self) {
    
    inline def setCreateAccountStatus(value: CreateAccountStatus): Self = StObject.set(x, "CreateAccountStatus", value.asInstanceOf[js.Any])
    
    inline def setCreateAccountStatusUndefined: Self = StObject.set(x, "CreateAccountStatus", js.undefined)
  }
}
