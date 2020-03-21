package typingsJapgolly.spotifyWebPlaybackSdk

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Spotify: TypeofSpotify
  def onSpotifyWebPlaybackSDKReady(): Unit
}

object Window {
  @scala.inline
  def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: Callback): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any])
    __obj.updateDynamic("onSpotifyWebPlaybackSDKReady")(onSpotifyWebPlaybackSDKReady.toJsFn)
    __obj.asInstanceOf[Window]
  }
}

