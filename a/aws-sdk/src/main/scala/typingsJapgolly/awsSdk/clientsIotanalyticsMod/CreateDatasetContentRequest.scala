package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetContentRequest extends StObject {
  
  /**
    * The name of the dataset.
    */
  var datasetName: DatasetName
  
  /**
    * The version ID of the dataset content. To specify versionId for a dataset content, the dataset must use a DeltaTimer filter.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}
object CreateDatasetContentRequest {
  
  inline def apply(datasetName: DatasetName): CreateDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetContentRequest]
  }
  
  extension [Self <: CreateDatasetContentRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: DatasetContentVersion): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
