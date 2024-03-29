package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBucketsResponse extends StObject {
  
  /**
    * An array of objects, one for each bucket that meets the filter criteria specified in the request.
    */
  var buckets: js.UndefOr[listOfBucketMetadata] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object DescribeBucketsResponse {
  
  inline def apply(): DescribeBucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBucketsResponse]
  }
  
  extension [Self <: DescribeBucketsResponse](x: Self) {
    
    inline def setBuckets(value: listOfBucketMetadata): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: BucketMetadata*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
