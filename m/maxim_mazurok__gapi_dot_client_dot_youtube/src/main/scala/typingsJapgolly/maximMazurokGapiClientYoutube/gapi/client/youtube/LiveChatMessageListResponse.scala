package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageListResponse extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[LiveChatMessage]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessageListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The date and time when the underlying stream went offline. */
  var offlineAt: js.UndefOr[String] = js.undefined
  
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  
  /** The amount of time the client should wait before polling again. */
  var pollingIntervalMillis: js.UndefOr[Double] = js.undefined
  
  var tokenPagination: js.UndefOr[Any] = js.undefined
  
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}
object LiveChatMessageListResponse {
  
  inline def apply(): LiveChatMessageListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageListResponse]
  }
  
  extension [Self <: LiveChatMessageListResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setItems(value: js.Array[LiveChatMessage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LiveChatMessage*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOfflineAt(value: String): Self = StObject.set(x, "offlineAt", value.asInstanceOf[js.Any])
    
    inline def setOfflineAtUndefined: Self = StObject.set(x, "offlineAt", js.undefined)
    
    inline def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisUndefined: Self = StObject.set(x, "pollingIntervalMillis", js.undefined)
    
    inline def setTokenPagination(value: Any): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
