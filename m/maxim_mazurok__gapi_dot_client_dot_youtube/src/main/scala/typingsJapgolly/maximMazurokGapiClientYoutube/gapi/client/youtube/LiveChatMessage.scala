package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessage extends StObject {
  
  /** The authorDetails object contains basic details about the user that posted this message. */
  var authorDetails: js.UndefOr[LiveChatMessageAuthorDetails] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube assigns to uniquely identify the message. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessage". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The snippet object contains basic details about the message. */
  var snippet: js.UndefOr[LiveChatMessageSnippet] = js.undefined
}
object LiveChatMessage {
  
  inline def apply(): LiveChatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessage]
  }
  
  extension [Self <: LiveChatMessage](x: Self) {
    
    inline def setAuthorDetails(value: LiveChatMessageAuthorDetails): Self = StObject.set(x, "authorDetails", value.asInstanceOf[js.Any])
    
    inline def setAuthorDetailsUndefined: Self = StObject.set(x, "authorDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: LiveChatMessageSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
