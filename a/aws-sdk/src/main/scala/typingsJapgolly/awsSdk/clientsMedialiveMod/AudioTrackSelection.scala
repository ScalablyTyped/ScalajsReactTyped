package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackSelection extends StObject {
  
  /**
    * Selects one or more unique audio tracks from within a source.
    */
  var Tracks: listOfAudioTrack
}
object AudioTrackSelection {
  
  inline def apply(Tracks: listOfAudioTrack): AudioTrackSelection = {
    val __obj = js.Dynamic.literal(Tracks = Tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackSelection]
  }
  
  extension [Self <: AudioTrackSelection](x: Self) {
    
    inline def setTracks(value: listOfAudioTrack): Self = StObject.set(x, "Tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: AudioTrack*): Self = StObject.set(x, "Tracks", js.Array(value*))
  }
}
