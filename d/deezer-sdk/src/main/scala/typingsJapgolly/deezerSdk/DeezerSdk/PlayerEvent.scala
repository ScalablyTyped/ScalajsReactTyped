package typingsJapgolly.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/events | List of events}\
  * {@link https://developers.deezer.com/sdk/javascript/events-subscribe | Subscribe to an event}
  *
  * @remarks
  * This type is not needed to define the other types, but users may find it useful
  * in some situations anyway.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deezerSdk.deezerSdkStrings.player_loaded
  - typingsJapgolly.deezerSdk.deezerSdkStrings.player_play
  - typingsJapgolly.deezerSdk.deezerSdkStrings.player_paused
  - typingsJapgolly.deezerSdk.deezerSdkStrings.player_position
  - typingsJapgolly.deezerSdk.deezerSdkStrings.player_buffering
  - typingsJapgolly.deezerSdk.deezerSdkStrings.volume_changed
  - typingsJapgolly.deezerSdk.deezerSdkStrings.shuffle_changed
  - typingsJapgolly.deezerSdk.deezerSdkStrings.repeat_changed
  - typingsJapgolly.deezerSdk.deezerSdkStrings.mute_changed
  - typingsJapgolly.deezerSdk.deezerSdkStrings.tracklist_changed
  - typingsJapgolly.deezerSdk.deezerSdkStrings.track_end
  - typingsJapgolly.deezerSdk.deezerSdkStrings.current_track
*/
trait PlayerEvent extends js.Object

object PlayerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current_track: typingsJapgolly.deezerSdk.deezerSdkStrings.current_track = this.cast("current_track")
  @scala.inline
  def mute_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.mute_changed = this.cast("mute_changed")
  @scala.inline
  def player_buffering: typingsJapgolly.deezerSdk.deezerSdkStrings.player_buffering = this.cast("player_buffering")
  @scala.inline
  def player_loaded: typingsJapgolly.deezerSdk.deezerSdkStrings.player_loaded = this.cast("player_loaded")
  @scala.inline
  def player_paused: typingsJapgolly.deezerSdk.deezerSdkStrings.player_paused = this.cast("player_paused")
  @scala.inline
  def player_play: typingsJapgolly.deezerSdk.deezerSdkStrings.player_play = this.cast("player_play")
  @scala.inline
  def player_position: typingsJapgolly.deezerSdk.deezerSdkStrings.player_position = this.cast("player_position")
  @scala.inline
  def repeat_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.repeat_changed = this.cast("repeat_changed")
  @scala.inline
  def shuffle_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.shuffle_changed = this.cast("shuffle_changed")
  @scala.inline
  def track_end: typingsJapgolly.deezerSdk.deezerSdkStrings.track_end = this.cast("track_end")
  @scala.inline
  def tracklist_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.tracklist_changed = this.cast("tracklist_changed")
  @scala.inline
  def volume_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.volume_changed = this.cast("volume_changed")
}

