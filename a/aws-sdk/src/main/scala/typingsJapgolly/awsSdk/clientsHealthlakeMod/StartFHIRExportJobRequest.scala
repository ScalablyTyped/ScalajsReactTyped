package typingsJapgolly.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFHIRExportJobRequest extends StObject {
  
  /**
    * An optional user provided token used for ensuring idempotency.
    */
  var ClientToken: ClientTokenString
  
  /**
    * The Amazon Resource Name used during the initiation of the job.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * The AWS generated ID for the Data Store from which files are being exported for an export job.
    */
  var DatastoreId: typingsJapgolly.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The user generated name for an export job.
    */
  var JobName: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthlakeMod.JobName] = js.undefined
  
  /**
    * The output data configuration that was supplied when the export job was created.
    */
  var OutputDataConfig: typingsJapgolly.awsSdk.clientsHealthlakeMod.OutputDataConfig
}
object StartFHIRExportJobRequest {
  
  inline def apply(
    ClientToken: ClientTokenString,
    DataAccessRoleArn: IamRoleArn,
    DatastoreId: DatastoreId,
    OutputDataConfig: OutputDataConfig
  ): StartFHIRExportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DatastoreId = DatastoreId.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFHIRExportJobRequest]
  }
  
  extension [Self <: StartFHIRExportJobRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
  }
}
