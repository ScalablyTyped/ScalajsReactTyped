package typingsJapgolly.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio track. */
trait AudioTrack extends StObject {
  
  /** Gets or sets the identifier for the audio track. */
  var id: String
  
  /** Gets or sets the label for the audio track. */
  var label: String
  
  /** Gets or sets a string indicating the language of the audio track. */
  var language: String
  
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  var trackKind: MediaTrackKind
}
object AudioTrack {
  
  inline def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): AudioTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  
  extension [Self <: AudioTrack](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setTrackKind(value: MediaTrackKind): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
  }
}
