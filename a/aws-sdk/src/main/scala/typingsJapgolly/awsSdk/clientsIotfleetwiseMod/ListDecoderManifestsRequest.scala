package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDecoderManifestsRequest extends StObject {
  
  /**
    *  The maximum number of items to return, between 1 and 100, inclusive. 
    */
  var maxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.maxResults] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the decoder manifest. 
    */
  var modelManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    * A pagination token for the next set of results. If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next set of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value. 
    */
  var nextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object ListDecoderManifestsRequest {
  
  inline def apply(): ListDecoderManifestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDecoderManifestsRequest]
  }
  
  extension [Self <: ListDecoderManifestsRequest](x: Self) {
    
    inline def setMaxResults(value: maxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArnUndefined: Self = StObject.set(x, "modelManifestArn", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
