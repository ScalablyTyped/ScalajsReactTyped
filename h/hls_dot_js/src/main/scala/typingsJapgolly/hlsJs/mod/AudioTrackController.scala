package typingsJapgolly.hlsJs.mod

import typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACK_LOADED
import typingsJapgolly.hlsJs.mod.Events.LEVEL_LOADING
import typingsJapgolly.hlsJs.mod.Events.LEVEL_SWITCHING
import typingsJapgolly.hlsJs.mod.Events.MANIFEST_PARSED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTrackController
  extends StObject
     with BasePlaylistController {
  
  def audioTrack: Double = js.native
  def audioTrack_=(newId: Double): Unit = js.native
  
  def audioTracks: js.Array[MediaPlaylist] = js.native
  
  /* private */ var findTrackId: Any = js.native
  
  /* private */ var groupId: Any = js.native
  
  /* protected */ def onAudioTrackLoaded(event: AUDIO_TRACK_LOADED, data: AudioTrackLoadedData): Unit = js.native
  
  /* protected */ def onLevelLoading(event: LEVEL_LOADING, data: LevelLoadingData): Unit = js.native
  
  /* protected */ def onLevelSwitching(event: LEVEL_SWITCHING, data: LevelSwitchingData): Unit = js.native
  
  /* protected */ def onManifestLoading(): Unit = js.native
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var selectDefaultTrack: Any = js.native
  
  /* private */ var selectInitialTrack: Any = js.native
  
  /* private */ var setAudioTrack: Any = js.native
  
  /* private */ var switchLevel: Any = js.native
  
  /* private */ var trackId: Any = js.native
  
  /* private */ var trackName: Any = js.native
  
  /* private */ var tracks: Any = js.native
  
  /* private */ var tracksInGroup: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
}
