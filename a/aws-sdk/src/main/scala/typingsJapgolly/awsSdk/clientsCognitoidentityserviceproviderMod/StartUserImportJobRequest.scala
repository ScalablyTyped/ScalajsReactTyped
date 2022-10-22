package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartUserImportJobRequest extends StObject {
  
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}
object StartUserImportJobRequest {
  
  inline def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): StartUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartUserImportJobRequest]
  }
  
  extension [Self <: StartUserImportJobRequest](x: Self) {
    
    inline def setJobId(value: UserImportJobIdType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
