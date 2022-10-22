package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonNativeTextTracksData extends StObject {
  
  var tracks: js.Array[NonNativeTextTrack]
}
object NonNativeTextTracksData {
  
  inline def apply(tracks: js.Array[NonNativeTextTrack]): NonNativeTextTracksData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNativeTextTracksData]
  }
  
  extension [Self <: NonNativeTextTracksData](x: Self) {
    
    inline def setTracks(value: js.Array[NonNativeTextTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: NonNativeTextTrack*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
