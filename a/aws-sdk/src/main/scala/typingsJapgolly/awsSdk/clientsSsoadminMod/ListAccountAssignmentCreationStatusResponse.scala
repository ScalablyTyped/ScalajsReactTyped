package typingsJapgolly.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssignmentCreationStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentsCreationStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountAssignmentCreationStatusResponse {
  
  inline def apply(): ListAccountAssignmentCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssignmentCreationStatusResponse]
  }
  
  extension [Self <: ListAccountAssignmentCreationStatusResponse](x: Self) {
    
    inline def setAccountAssignmentsCreationStatus(value: AccountAssignmentOperationStatusList): Self = StObject.set(x, "AccountAssignmentsCreationStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountAssignmentsCreationStatusUndefined: Self = StObject.set(x, "AccountAssignmentsCreationStatus", js.undefined)
    
    inline def setAccountAssignmentsCreationStatusVarargs(value: AccountAssignmentOperationStatusMetadata*): Self = StObject.set(x, "AccountAssignmentsCreationStatus", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
