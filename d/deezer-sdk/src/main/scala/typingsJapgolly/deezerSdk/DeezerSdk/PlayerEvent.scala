package typingsJapgolly.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait PlayerEvent extends StObject
object PlayerEvent {
  
  inline def current_track: typingsJapgolly.deezerSdk.deezerSdkStrings.current_track = "current_track".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.current_track]
  
  inline def mute_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.mute_changed = "mute_changed".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.mute_changed]
  
  inline def player_buffering: typingsJapgolly.deezerSdk.deezerSdkStrings.player_buffering = "player_buffering".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.player_buffering]
  
  inline def player_loaded: typingsJapgolly.deezerSdk.deezerSdkStrings.player_loaded = "player_loaded".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.player_loaded]
  
  inline def player_paused: typingsJapgolly.deezerSdk.deezerSdkStrings.player_paused = "player_paused".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.player_paused]
  
  inline def player_play: typingsJapgolly.deezerSdk.deezerSdkStrings.player_play = "player_play".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.player_play]
  
  inline def player_position: typingsJapgolly.deezerSdk.deezerSdkStrings.player_position = "player_position".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.player_position]
  
  inline def repeat_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.repeat_changed = "repeat_changed".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.repeat_changed]
  
  inline def shuffle_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.shuffle_changed = "shuffle_changed".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.shuffle_changed]
  
  inline def track_end: typingsJapgolly.deezerSdk.deezerSdkStrings.track_end = "track_end".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.track_end]
  
  inline def tracklist_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.tracklist_changed = "tracklist_changed".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.tracklist_changed]
  
  inline def volume_changed: typingsJapgolly.deezerSdk.deezerSdkStrings.volume_changed = "volume_changed".asInstanceOf[typingsJapgolly.deezerSdk.deezerSdkStrings.volume_changed]
}
