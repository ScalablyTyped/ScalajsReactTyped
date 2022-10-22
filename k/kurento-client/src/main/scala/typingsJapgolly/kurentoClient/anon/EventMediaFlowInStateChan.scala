package typingsJapgolly.kurentoClient.anon

import typingsJapgolly.kurentoClient.kurentoClientStrings.MediaFlowInStateChange
import typingsJapgolly.kurentoClient.mod.MediaFlowState
import typingsJapgolly.kurentoClient.mod.MediaType
import typingsJapgolly.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaFlowInStateChange', {  state :kurento-client.kurento-client.MediaFlowState,   mediaType :kurento-client.kurento-client.MediaType,   padName :string}> */
trait EventMediaFlowInStateChan extends StObject {
  
  var mediaType: MediaType
  
  var padName: String
  
  var source: String
  
  var state: MediaFlowState
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: MediaFlowInStateChange
}
object EventMediaFlowInStateChan {
  
  inline def apply(
    mediaType: MediaType,
    padName: String,
    source: String,
    state: MediaFlowState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventMediaFlowInStateChan = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], padName = padName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaFlowInStateChange")
    __obj.asInstanceOf[EventMediaFlowInStateChan]
  }
  
  extension [Self <: EventMediaFlowInStateChan](x: Self) {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setPadName(value: String): Self = StObject.set(x, "padName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: MediaFlowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaFlowInStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
