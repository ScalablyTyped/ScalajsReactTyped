package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetImportJob extends StObject {
  
  /**
    * The creation date and time (in Unix time) of the dataset import job.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * If a dataset import job fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The import mode used by the dataset import job to import new records.
    */
  var importMode: js.UndefOr[ImportMode] = js.undefined
  
  /**
    * The name of the import job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The date and time (in Unix time) the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object DatasetImportJob {
  
  inline def apply(): DatasetImportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetImportJob]
  }
  
  extension [Self <: DatasetImportJob](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    inline def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "datasetImportJobArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobArnUndefined: Self = StObject.set(x, "datasetImportJobArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setImportMode(value: ImportMode): Self = StObject.set(x, "importMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "importMode", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
