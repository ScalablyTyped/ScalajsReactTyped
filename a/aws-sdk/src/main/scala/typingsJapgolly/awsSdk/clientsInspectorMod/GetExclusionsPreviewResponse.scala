package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExclusionsPreviewResponse extends StObject {
  
  /**
    * Information about the exclusions included in the preview.
    */
  var exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined
  
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Specifies the status of the request to generate an exclusions preview.
    */
  var previewStatus: PreviewStatus
}
object GetExclusionsPreviewResponse {
  
  inline def apply(previewStatus: PreviewStatus): GetExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewStatus = previewStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExclusionsPreviewResponse]
  }
  
  extension [Self <: GetExclusionsPreviewResponse](x: Self) {
    
    inline def setExclusionPreviews(value: ExclusionPreviewList): Self = StObject.set(x, "exclusionPreviews", value.asInstanceOf[js.Any])
    
    inline def setExclusionPreviewsUndefined: Self = StObject.set(x, "exclusionPreviews", js.undefined)
    
    inline def setExclusionPreviewsVarargs(value: ExclusionPreview*): Self = StObject.set(x, "exclusionPreviews", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPreviewStatus(value: PreviewStatus): Self = StObject.set(x, "previewStatus", value.asInstanceOf[js.Any])
  }
}
