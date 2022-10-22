package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRevisionAssetsRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
  
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string
}
object ListRevisionAssetsRequest {
  
  inline def apply(DataSetId: string, RevisionId: string): ListRevisionAssetsRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRevisionAssetsRequest]
  }
  
  extension [Self <: ListRevisionAssetsRequest](x: Self) {
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
