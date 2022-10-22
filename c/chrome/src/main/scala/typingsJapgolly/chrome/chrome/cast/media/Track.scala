package typingsJapgolly.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var customData: js.Object
  
  var language: String
  
  var name: String
  
  var subtype: TextTrackType
  
  var trackContentId: String
  
  var trackContentType: String
  
  var trackId: Double
  
  var `type`: TrackType
}
object Track {
  
  inline def apply(
    customData: js.Object,
    language: String,
    name: String,
    subtype: TextTrackType,
    trackContentId: String,
    trackContentType: String,
    trackId: Double,
    `type`: TrackType
  ): Track = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], trackContentId = trackContentId.asInstanceOf[js.Any], trackContentType = trackContentType.asInstanceOf[js.Any], trackId = trackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  extension [Self <: Track](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: TextTrackType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setTrackContentId(value: String): Self = StObject.set(x, "trackContentId", value.asInstanceOf[js.Any])
    
    inline def setTrackContentType(value: String): Self = StObject.set(x, "trackContentType", value.asInstanceOf[js.Any])
    
    inline def setTrackId(value: Double): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    inline def setType(value: TrackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
