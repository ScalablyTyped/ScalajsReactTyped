package typingsJapgolly.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.spotifyWebPlaybackSdk.Spotify.PlayerInit
import typingsJapgolly.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSpotify extends js.Object {
  var SpotifyPlayer: Instantiable1[
    /* options */ PlayerInit, 
    typingsJapgolly.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
  ]
}

object TypeofSpotify {
  @scala.inline
  def apply(SpotifyPlayer: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): TypeofSpotify = {
    val __obj = js.Dynamic.literal(SpotifyPlayer = SpotifyPlayer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofSpotify]
  }
}

