package typingsJapgolly.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get multiple tracks
  *
  * GET /v1/tracks?ids={ids}
  * https://developer.spotify.com/web-api/get-several-tracks/
  */
trait MultipleTracksResponse extends StObject {
  
  var tracks: js.Array[TrackObjectFull]
}
object MultipleTracksResponse {
  
  inline def apply(tracks: js.Array[TrackObjectFull]): MultipleTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleTracksResponse]
  }
  
  extension [Self <: MultipleTracksResponse](x: Self) {
    
    inline def setTracks(value: js.Array[TrackObjectFull]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: TrackObjectFull*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
