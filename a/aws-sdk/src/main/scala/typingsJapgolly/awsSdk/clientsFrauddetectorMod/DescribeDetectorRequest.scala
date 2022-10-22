package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: identifier
  
  /**
    * The maximum number of results to return for the request.
    */
  var maxResults: js.UndefOr[DetectorVersionMaxResults] = js.undefined
  
  /**
    * The next token from the previous response.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeDetectorRequest {
  
  inline def apply(detectorId: identifier): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  
  extension [Self <: DescribeDetectorRequest](x: Self) {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DetectorVersionMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
