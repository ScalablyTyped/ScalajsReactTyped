package typingsJapgolly.spotifyWebPlaybackSdk.Spotify

import typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.autoplay_failed
import typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready
import typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed
import typingsJapgolly.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddListenerFn = (js.Function2[/* event */ ready | not_ready, /* cb */ PlaybackInstanceListener, Unit]) & (js.Function2[autoplay_failed, /* cb */ EmptyListener, Unit]) & (js.Function2[player_state_changed, /* cb */ PlaybackStateListener, Unit]) & (js.Function2[/* event */ ErrorTypes, /* cb */ ErrorListener, Unit])

type EmptyListener = js.Function0[Unit]

type ErrorListener = js.Function1[/* err */ Error, Unit]

type PlaybackInstanceListener = js.Function1[/* inst */ WebPlaybackInstance, Unit]

type PlaybackStateListener = js.Function1[/* s */ PlaybackState, Unit]
