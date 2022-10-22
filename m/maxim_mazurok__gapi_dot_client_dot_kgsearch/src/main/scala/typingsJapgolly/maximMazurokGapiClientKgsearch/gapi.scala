package typingsJapgolly.maximMazurokGapiClientKgsearch

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientKgsearch.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object kgsearch {
      
      @js.native
      trait EntitiesResource extends StObject {
        
        /**
          * Searches Knowledge Graph for entities that match the constraints. A list of matched entities will be returned in response, which will be in JSON-LD format and compatible with
          * http://schema.org
          */
        def search(): Request[SearchResponse] = js.native
        def search(request: Accesstoken): Request[SearchResponse] = js.native
      }
      
      trait SearchResponse extends StObject {
        
        /** The local context applicable for the response. See more details at http://www.w3.org/TR/json-ld/#context-definitions. */
        var `@context`: js.UndefOr[Any] = js.undefined
        
        /** The schema type of top-level JSON-LD object, e.g. ItemList. */
        var `@type`: js.UndefOr[Any] = js.undefined
        
        /** The item list of search results. */
        var itemListElement: js.UndefOr[js.Array[Any]] = js.undefined
      }
      object SearchResponse {
        
        inline def apply(): SearchResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SearchResponse]
        }
        
        extension [Self <: SearchResponse](x: Self) {
          
          inline def `set@context`(value: Any): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
          
          inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
          
          inline def `set@type`(value: Any): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
          
          inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
          
          inline def setItemListElement(value: js.Array[Any]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
          
          inline def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
          
          inline def setItemListElementVarargs(value: Any*): Self = StObject.set(x, "itemListElement", js.Array(value*))
        }
      }
    }
  }
}
