package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseReceivedEvent extends StObject {
  
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Indicates whether requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be
    * or were emitted for this request.
    */
  var hasExtraInfo: Boolean
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Response data.
    */
  var response: Response
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * Resource type.
    */
  var `type`: ResourceType
}
object ResponseReceivedEvent {
  
  inline def apply(
    hasExtraInfo: Boolean,
    loaderId: LoaderId,
    requestId: RequestId,
    response: Response,
    timestamp: MonotonicTime,
    `type`: ResourceType
  ): ResponseReceivedEvent = {
    val __obj = js.Dynamic.literal(hasExtraInfo = hasExtraInfo.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedEvent]
  }
  
  extension [Self <: ResponseReceivedEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setHasExtraInfo(value: Boolean): Self = StObject.set(x, "hasExtraInfo", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
