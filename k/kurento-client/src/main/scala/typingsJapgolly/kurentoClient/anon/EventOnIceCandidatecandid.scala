package typingsJapgolly.kurentoClient.anon

import typingsJapgolly.kurentoClient.kurentoClientStrings.OnIceCandidate
import typingsJapgolly.kurentoClient.mod.IceCandidate
import typingsJapgolly.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'OnIceCandidate', {  candidate :kurento-client.kurento-client.IceCandidate}> */
trait EventOnIceCandidatecandid extends StObject {
  
  var candidate: IceCandidate
  
  var source: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: OnIceCandidate
}
object EventOnIceCandidatecandid {
  
  inline def apply(
    candidate: IceCandidate,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventOnIceCandidatecandid = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OnIceCandidate")
    __obj.asInstanceOf[EventOnIceCandidatecandid]
  }
  
  extension [Self <: EventOnIceCandidatecandid](x: Self) {
    
    inline def setCandidate(value: IceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: OnIceCandidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
