package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePresentationResponse extends StObject {
  
  /** The presentation the updates were applied to. */
  var presentationId: js.UndefOr[String] = js.undefined
  
  /** The reply of the updates. This maps 1:1 with the updates, although replies to some requests may be empty. */
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  
  /** The updated write control after applying the request. */
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}
object BatchUpdatePresentationResponse {
  
  inline def apply(): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
  
  extension [Self <: BatchUpdatePresentationResponse](x: Self) {
    
    inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    inline def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
