package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get audio features for several tracks
  * 
  * GET /v1/audio-features?ids={ids}
  * https://developer.spotify.com/get-several-audio-features/
  */
trait MultipleAudioFeaturesResponse extends js.Object {
  var audio_features: js.Array[AudioFeaturesObject]
}

object MultipleAudioFeaturesResponse {
  @scala.inline
  def apply(audio_features: js.Array[AudioFeaturesObject]): MultipleAudioFeaturesResponse = {
    val __obj = js.Dynamic.literal(audio_features = audio_features.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultipleAudioFeaturesResponse]
  }
}

