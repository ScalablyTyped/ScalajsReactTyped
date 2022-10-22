package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesRequest extends StObject {
  
  /**
    * A filter that returns only images created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only images created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only images modified on or after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only images modified on or before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of images to return in the response. The default value is 10. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A filter that returns only images whose name contains the specified string.
    */
  var NameContains: js.UndefOr[ImageNameContains] = js.undefined
  
  /**
    * If the previous call to ListImages didn't return the full set of images, the call returns a token for getting the next set of images.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CREATION_TIME.
    */
  var SortBy: js.UndefOr[ImageSortBy] = js.undefined
  
  /**
    * The sort order. The default value is DESCENDING.
    */
  var SortOrder: js.UndefOr[ImageSortOrder] = js.undefined
}
object ListImagesRequest {
  
  inline def apply(): ListImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesRequest]
  }
  
  extension [Self <: ListImagesRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: ImageNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ImageSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: ImageSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
