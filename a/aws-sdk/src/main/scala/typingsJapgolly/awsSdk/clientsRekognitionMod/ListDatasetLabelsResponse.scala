package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetLabelsResponse extends StObject {
  
  /**
    *  A list of the labels in the dataset. 
    */
  var DatasetLabelDescriptions: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.DatasetLabelDescriptions] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
}
object ListDatasetLabelsResponse {
  
  inline def apply(): ListDatasetLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetLabelsResponse]
  }
  
  extension [Self <: ListDatasetLabelsResponse](x: Self) {
    
    inline def setDatasetLabelDescriptions(value: DatasetLabelDescriptions): Self = StObject.set(x, "DatasetLabelDescriptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetLabelDescriptionsUndefined: Self = StObject.set(x, "DatasetLabelDescriptions", js.undefined)
    
    inline def setDatasetLabelDescriptionsVarargs(value: DatasetLabelDescription*): Self = StObject.set(x, "DatasetLabelDescriptions", js.Array(value*))
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
