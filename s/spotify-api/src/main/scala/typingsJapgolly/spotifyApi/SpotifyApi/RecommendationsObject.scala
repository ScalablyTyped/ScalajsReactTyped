package typingsJapgolly.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-object)
  */
trait RecommendationsObject extends StObject {
  
  var seeds: js.Array[RecommendationsSeedObject]
  
  var tracks: js.Array[RecommendationTrackObject]
}
object RecommendationsObject {
  
  inline def apply(seeds: js.Array[RecommendationsSeedObject], tracks: js.Array[RecommendationTrackObject]): RecommendationsObject = {
    val __obj = js.Dynamic.literal(seeds = seeds.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsObject]
  }
  
  extension [Self <: RecommendationsObject](x: Self) {
    
    inline def setSeeds(value: js.Array[RecommendationsSeedObject]): Self = StObject.set(x, "seeds", value.asInstanceOf[js.Any])
    
    inline def setSeedsVarargs(value: RecommendationsSeedObject*): Self = StObject.set(x, "seeds", js.Array(value*))
    
    inline def setTracks(value: js.Array[RecommendationTrackObject]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: RecommendationTrackObject*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
