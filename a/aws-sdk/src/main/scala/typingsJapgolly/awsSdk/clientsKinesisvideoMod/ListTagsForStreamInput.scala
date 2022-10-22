package typingsJapgolly.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForStreamInput extends StObject {
  
  /**
    * If you specify this parameter and the result of a ListTagsForStream call is truncated, the response includes a token that you can use in the next request to fetch the next batch of tags.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream that you want to list tags for.
    */
  var StreamName: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object ListTagsForStreamInput {
  
  inline def apply(): ListTagsForStreamInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForStreamInput]
  }
  
  extension [Self <: ListTagsForStreamInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
