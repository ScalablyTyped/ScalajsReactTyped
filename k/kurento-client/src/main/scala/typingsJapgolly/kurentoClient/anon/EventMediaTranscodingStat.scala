package typingsJapgolly.kurentoClient.anon

import typingsJapgolly.kurentoClient.kurentoClientStrings.MediaTranscodingStateChange
import typingsJapgolly.kurentoClient.mod.MediaTranscodingState
import typingsJapgolly.kurentoClient.mod.MediaType
import typingsJapgolly.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaTranscodingStateChange', {  state :kurento-client.kurento-client.MediaTranscodingState,   binName :string,   mediaType :kurento-client.kurento-client.MediaType}> */
trait EventMediaTranscodingStat extends StObject {
  
  var binName: String
  
  var mediaType: MediaType
  
  var source: String
  
  var state: MediaTranscodingState
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: MediaTranscodingStateChange
}
object EventMediaTranscodingStat {
  
  inline def apply(
    binName: String,
    mediaType: MediaType,
    source: String,
    state: MediaTranscodingState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventMediaTranscodingStat = {
    val __obj = js.Dynamic.literal(binName = binName.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaTranscodingStateChange")
    __obj.asInstanceOf[EventMediaTranscodingStat]
  }
  
  extension [Self <: EventMediaTranscodingStat](x: Self) {
    
    inline def setBinName(value: String): Self = StObject.set(x, "binName", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: MediaTranscodingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaTranscodingStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
