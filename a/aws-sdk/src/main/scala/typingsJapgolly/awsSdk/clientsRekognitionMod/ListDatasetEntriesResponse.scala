package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetEntriesResponse extends StObject {
  
  /**
    *  A list of entries (images) in the dataset. 
    */
  var DatasetEntries: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.DatasetEntries] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
}
object ListDatasetEntriesResponse {
  
  inline def apply(): ListDatasetEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetEntriesResponse]
  }
  
  extension [Self <: ListDatasetEntriesResponse](x: Self) {
    
    inline def setDatasetEntries(value: DatasetEntries): Self = StObject.set(x, "DatasetEntries", value.asInstanceOf[js.Any])
    
    inline def setDatasetEntriesUndefined: Self = StObject.set(x, "DatasetEntries", js.undefined)
    
    inline def setDatasetEntriesVarargs(value: DatasetEntry*): Self = StObject.set(x, "DatasetEntries", js.Array(value*))
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
