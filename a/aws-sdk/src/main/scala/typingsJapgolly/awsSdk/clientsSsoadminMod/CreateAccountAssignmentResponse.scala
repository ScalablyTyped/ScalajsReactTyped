package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountAssignmentResponse extends StObject {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
}
object CreateAccountAssignmentResponse {
  
  inline def apply(): CreateAccountAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountAssignmentResponse]
  }
  
  extension [Self <: CreateAccountAssignmentResponse](x: Self) {
    
    inline def setAccountAssignmentCreationStatus(value: AccountAssignmentOperationStatus): Self = StObject.set(x, "AccountAssignmentCreationStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountAssignmentCreationStatusUndefined: Self = StObject.set(x, "AccountAssignmentCreationStatus", js.undefined)
  }
}
