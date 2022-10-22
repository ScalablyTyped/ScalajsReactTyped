package typingsJapgolly.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to CreateDataset completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from CreateDataset. In this case, safely retry your call to CreateDataset by using the same ClientToken parameter value. If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple dataset creation requests. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to CreateDataset. An idempotency token is active for 8 hours. 
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The location of the manifest file that Amazon Lookout for Vision uses to create the dataset. If you don't specify DatasetSource, an empty dataset is created and the operation synchronously returns. Later, you can add JSON Lines by calling UpdateDatasetEntries.  If you specify a value for DataSource, the manifest at the S3 location is validated and used to create the dataset. The call to CreateDataset is asynchronous and might take a while to complete. To find out the current status, Check the value of Status returned in a call to DescribeDataset.
    */
  var DatasetSource: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.DatasetSource] = js.undefined
  
  /**
    * The type of the dataset. Specify train for a training dataset. Specify test for a test dataset.
    */
  var DatasetType: typingsJapgolly.awsSdk.clientsLookoutvisionMod.DatasetType
  
  /**
    * The name of the project in which you want to create a dataset.
    */
  var ProjectName: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ProjectName
}
object CreateDatasetRequest {
  
  inline def apply(DatasetType: DatasetType, ProjectName: ProjectName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetType = DatasetType.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDatasetSource(value: DatasetSource): Self = StObject.set(x, "DatasetSource", value.asInstanceOf[js.Any])
    
    inline def setDatasetSourceUndefined: Self = StObject.set(x, "DatasetSource", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
