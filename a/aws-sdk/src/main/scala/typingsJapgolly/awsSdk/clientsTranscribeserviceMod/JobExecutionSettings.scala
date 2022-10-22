package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionSettings extends StObject {
  
  /**
    * Allows you to enable job queuing when your concurrent request limit is exceeded. When AllowDeferredExecution is set to true, transcription job requests are placed in a queue until the number of jobs falls below the concurrent request limit. If AllowDeferredExecution is set to false and the number of transcription job requests exceed the concurrent request limit, you get a LimitExceededException error. Note that job queuing is enabled by default for Call Analytics jobs. If you include AllowDeferredExecution in your request, you must also include DataAccessRoleArn.
    */
  var AllowDeferredExecution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files. If the role you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs. Note that if you include DataAccessRoleArn in your request, you must also include AllowDeferredExecution.
    */
  var DataAccessRoleArn: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn] = js.undefined
}
object JobExecutionSettings {
  
  inline def apply(): JobExecutionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSettings]
  }
  
  extension [Self <: JobExecutionSettings](x: Self) {
    
    inline def setAllowDeferredExecution(value: Boolean): Self = StObject.set(x, "AllowDeferredExecution", value.asInstanceOf[js.Any])
    
    inline def setAllowDeferredExecutionUndefined: Self = StObject.set(x, "AllowDeferredExecution", js.undefined)
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
  }
}
