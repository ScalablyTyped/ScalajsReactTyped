package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) specified in your request.
    */
  var ResourceArn: js.UndefOr[TranscribeArn] = js.undefined
  
  /**
    * Lists all tags associated with the given transcription job, vocabulary, model, or resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsForResourceResponse {
  
  inline def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  extension [Self <: ListTagsForResourceResponse](x: Self) {
    
    inline def setResourceArn(value: TranscribeArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
