package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOutput extends StObject {
  
  /**
    *  If response is truncated, SageMaker includes a token in the response. You can use this token in your subsequent request to fetch next set of tokens. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of Tag objects, each with a tag key and a value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsOutput {
  
  inline def apply(): ListTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOutput]
  }
  
  extension [Self <: ListTagsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
