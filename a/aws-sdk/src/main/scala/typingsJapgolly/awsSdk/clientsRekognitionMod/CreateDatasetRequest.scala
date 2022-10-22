package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    *  The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3 bucket location of an Amazon Sagemaker format manifest file. If you don't specify datasetSource, an empty dataset is created. To add labeled images to the dataset, You can use the console or call UpdateDatasetEntries. 
    */
  var DatasetSource: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.DatasetSource] = js.undefined
  
  /**
    *  The type of the dataset. Specify train to create a training dataset. Specify test to create a test dataset. 
    */
  var DatasetType: typingsJapgolly.awsSdk.clientsRekognitionMod.DatasetType
  
  /**
    *  The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset. 
    */
  var ProjectArn: typingsJapgolly.awsSdk.clientsRekognitionMod.ProjectArn
}
object CreateDatasetRequest {
  
  inline def apply(DatasetType: DatasetType, ProjectArn: ProjectArn): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetType = DatasetType.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setDatasetSource(value: DatasetSource): Self = StObject.set(x, "DatasetSource", value.asInstanceOf[js.Any])
    
    inline def setDatasetSourceUndefined: Self = StObject.set(x, "DatasetSource", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
