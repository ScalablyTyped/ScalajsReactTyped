package typingsJapgolly.spotifyWebPlaybackSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Spotify {
  type AddListenerFn = (js.Function2[
    /* event */ typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready | typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready, 
    /* cb */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.PlaybackInstanceListener, 
    scala.Unit
  ]) with (js.Function2[
    typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed, 
    /* cb */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.PlaybackStateListener, 
    scala.Unit
  ]) with (js.Function2[
    /* event */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.ErrorTypes, 
    /* cb */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.ErrorListener, 
    scala.Unit
  ])
  type ErrorListener = js.Function1[/* err */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.Error, scala.Unit]
  type PlaybackInstanceListener = js.Function1[
    /* inst */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.WebPlaybackInstance, 
    scala.Unit
  ]
  type PlaybackStateListener = js.Function1[/* s */ typingsJapgolly.spotifyWebPlaybackSdk.Spotify.PlaybackState, scala.Unit]
}
