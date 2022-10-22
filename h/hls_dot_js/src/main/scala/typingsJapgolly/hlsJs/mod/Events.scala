package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
@JSImport("hls.js", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Events & String] = js.native
  
  @js.native
  sealed trait AUDIO_TRACKS_UPDATED
    extends StObject
       with Events
  /* "hlsAudioTracksUpdated" */ val AUDIO_TRACKS_UPDATED: typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACKS_UPDATED & String = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_LOADED
    extends StObject
       with Events
  /* "hlsAudioTrackLoaded" */ val AUDIO_TRACK_LOADED: typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACK_LOADED & String = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_LOADING
    extends StObject
       with Events
  /* "hlsAudioTrackLoading" */ val AUDIO_TRACK_LOADING: typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACK_LOADING & String = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_SWITCHED
    extends StObject
       with Events
  /* "hlsAudioTrackSwitched" */ val AUDIO_TRACK_SWITCHED: typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACK_SWITCHED & String = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_SWITCHING
    extends StObject
       with Events
  /* "hlsAudioTrackSwitching" */ val AUDIO_TRACK_SWITCHING: typingsJapgolly.hlsJs.mod.Events.AUDIO_TRACK_SWITCHING & String = js.native
  
  @js.native
  sealed trait BACK_BUFFER_REACHED
    extends StObject
       with Events
  /* "hlsBackBufferReached" */ val BACK_BUFFER_REACHED: typingsJapgolly.hlsJs.mod.Events.BACK_BUFFER_REACHED & String = js.native
  
  @js.native
  sealed trait BUFFER_APPENDED
    extends StObject
       with Events
  /* "hlsBufferAppended" */ val BUFFER_APPENDED: typingsJapgolly.hlsJs.mod.Events.BUFFER_APPENDED & String = js.native
  
  @js.native
  sealed trait BUFFER_APPENDING
    extends StObject
       with Events
  /* "hlsBufferAppending" */ val BUFFER_APPENDING: typingsJapgolly.hlsJs.mod.Events.BUFFER_APPENDING & String = js.native
  
  @js.native
  sealed trait BUFFER_CODECS
    extends StObject
       with Events
  /* "hlsBufferCodecs" */ val BUFFER_CODECS: typingsJapgolly.hlsJs.mod.Events.BUFFER_CODECS & String = js.native
  
  @js.native
  sealed trait BUFFER_CREATED
    extends StObject
       with Events
  /* "hlsBufferCreated" */ val BUFFER_CREATED: typingsJapgolly.hlsJs.mod.Events.BUFFER_CREATED & String = js.native
  
  @js.native
  sealed trait BUFFER_EOS
    extends StObject
       with Events
  /* "hlsBufferEos" */ val BUFFER_EOS: typingsJapgolly.hlsJs.mod.Events.BUFFER_EOS & String = js.native
  
  @js.native
  sealed trait BUFFER_FLUSHED
    extends StObject
       with Events
  /* "hlsBufferFlushed" */ val BUFFER_FLUSHED: typingsJapgolly.hlsJs.mod.Events.BUFFER_FLUSHED & String = js.native
  
  @js.native
  sealed trait BUFFER_FLUSHING
    extends StObject
       with Events
  /* "hlsBufferFlushing" */ val BUFFER_FLUSHING: typingsJapgolly.hlsJs.mod.Events.BUFFER_FLUSHING & String = js.native
  
  @js.native
  sealed trait BUFFER_RESET
    extends StObject
       with Events
  /* "hlsBufferReset" */ val BUFFER_RESET: typingsJapgolly.hlsJs.mod.Events.BUFFER_RESET & String = js.native
  
  @js.native
  sealed trait CUES_PARSED
    extends StObject
       with Events
  /* "hlsCuesParsed" */ val CUES_PARSED: typingsJapgolly.hlsJs.mod.Events.CUES_PARSED & String = js.native
  
  @js.native
  sealed trait DESTROYING
    extends StObject
       with Events
  /* "hlsDestroying" */ val DESTROYING: typingsJapgolly.hlsJs.mod.Events.DESTROYING & String = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with Events
  /* "hlsError" */ val ERROR: typingsJapgolly.hlsJs.mod.Events.ERROR & String = js.native
  
  @js.native
  sealed trait FPS_DROP
    extends StObject
       with Events
  /* "hlsFpsDrop" */ val FPS_DROP: typingsJapgolly.hlsJs.mod.Events.FPS_DROP & String = js.native
  
  @js.native
  sealed trait FPS_DROP_LEVEL_CAPPING
    extends StObject
       with Events
  /* "hlsFpsDropLevelCapping" */ val FPS_DROP_LEVEL_CAPPING: typingsJapgolly.hlsJs.mod.Events.FPS_DROP_LEVEL_CAPPING & String = js.native
  
  @js.native
  sealed trait FRAG_BUFFERED
    extends StObject
       with Events
  /* "hlsFragBuffered" */ val FRAG_BUFFERED: typingsJapgolly.hlsJs.mod.Events.FRAG_BUFFERED & String = js.native
  
  @js.native
  sealed trait FRAG_CHANGED
    extends StObject
       with Events
  /* "hlsFragChanged" */ val FRAG_CHANGED: typingsJapgolly.hlsJs.mod.Events.FRAG_CHANGED & String = js.native
  
  @js.native
  sealed trait FRAG_DECRYPTED
    extends StObject
       with Events
  /* "hlsFragDecrypted" */ val FRAG_DECRYPTED: typingsJapgolly.hlsJs.mod.Events.FRAG_DECRYPTED & String = js.native
  
  @js.native
  sealed trait FRAG_LOADED
    extends StObject
       with Events
  /* "hlsFragLoaded" */ val FRAG_LOADED: typingsJapgolly.hlsJs.mod.Events.FRAG_LOADED & String = js.native
  
  @js.native
  sealed trait FRAG_LOADING
    extends StObject
       with Events
  /* "hlsFragLoading" */ val FRAG_LOADING: typingsJapgolly.hlsJs.mod.Events.FRAG_LOADING & String = js.native
  
  @js.native
  sealed trait FRAG_LOAD_EMERGENCY_ABORTED
    extends StObject
       with Events
  /* "hlsFragLoadEmergencyAborted" */ val FRAG_LOAD_EMERGENCY_ABORTED: typingsJapgolly.hlsJs.mod.Events.FRAG_LOAD_EMERGENCY_ABORTED & String = js.native
  
  @js.native
  sealed trait FRAG_PARSED
    extends StObject
       with Events
  /* "hlsFragParsed" */ val FRAG_PARSED: typingsJapgolly.hlsJs.mod.Events.FRAG_PARSED & String = js.native
  
  @js.native
  sealed trait FRAG_PARSING_INIT_SEGMENT
    extends StObject
       with Events
  /* "hlsFragParsingInitSegment" */ val FRAG_PARSING_INIT_SEGMENT: typingsJapgolly.hlsJs.mod.Events.FRAG_PARSING_INIT_SEGMENT & String = js.native
  
  @js.native
  sealed trait FRAG_PARSING_METADATA
    extends StObject
       with Events
  /* "hlsFragParsingMetadata" */ val FRAG_PARSING_METADATA: typingsJapgolly.hlsJs.mod.Events.FRAG_PARSING_METADATA & String = js.native
  
  @js.native
  sealed trait FRAG_PARSING_USERDATA
    extends StObject
       with Events
  /* "hlsFragParsingUserdata" */ val FRAG_PARSING_USERDATA: typingsJapgolly.hlsJs.mod.Events.FRAG_PARSING_USERDATA & String = js.native
  
  @js.native
  sealed trait INIT_PTS_FOUND
    extends StObject
       with Events
  /* "hlsInitPtsFound" */ val INIT_PTS_FOUND: typingsJapgolly.hlsJs.mod.Events.INIT_PTS_FOUND & String = js.native
  
  @js.native
  sealed trait KEY_LOADED
    extends StObject
       with Events
  /* "hlsKeyLoaded" */ val KEY_LOADED: typingsJapgolly.hlsJs.mod.Events.KEY_LOADED & String = js.native
  
  @js.native
  sealed trait KEY_LOADING
    extends StObject
       with Events
  /* "hlsKeyLoading" */ val KEY_LOADING: typingsJapgolly.hlsJs.mod.Events.KEY_LOADING & String = js.native
  
  @js.native
  sealed trait LEVELS_UPDATED
    extends StObject
       with Events
  /* "hlsLevelsUpdated" */ val LEVELS_UPDATED: typingsJapgolly.hlsJs.mod.Events.LEVELS_UPDATED & String = js.native
  
  @js.native
  sealed trait LEVEL_LOADED
    extends StObject
       with Events
  /* "hlsLevelLoaded" */ val LEVEL_LOADED: typingsJapgolly.hlsJs.mod.Events.LEVEL_LOADED & String = js.native
  
  @js.native
  sealed trait LEVEL_LOADING
    extends StObject
       with Events
  /* "hlsLevelLoading" */ val LEVEL_LOADING: typingsJapgolly.hlsJs.mod.Events.LEVEL_LOADING & String = js.native
  
  @js.native
  sealed trait LEVEL_PTS_UPDATED
    extends StObject
       with Events
  /* "hlsLevelPtsUpdated" */ val LEVEL_PTS_UPDATED: typingsJapgolly.hlsJs.mod.Events.LEVEL_PTS_UPDATED & String = js.native
  
  @js.native
  sealed trait LEVEL_SWITCHED
    extends StObject
       with Events
  /* "hlsLevelSwitched" */ val LEVEL_SWITCHED: typingsJapgolly.hlsJs.mod.Events.LEVEL_SWITCHED & String = js.native
  
  @js.native
  sealed trait LEVEL_SWITCHING
    extends StObject
       with Events
  /* "hlsLevelSwitching" */ val LEVEL_SWITCHING: typingsJapgolly.hlsJs.mod.Events.LEVEL_SWITCHING & String = js.native
  
  @js.native
  sealed trait LEVEL_UPDATED
    extends StObject
       with Events
  /* "hlsLevelUpdated" */ val LEVEL_UPDATED: typingsJapgolly.hlsJs.mod.Events.LEVEL_UPDATED & String = js.native
  
  @js.native
  sealed trait LIVE_BACK_BUFFER_REACHED
    extends StObject
       with Events
  /* "hlsLiveBackBufferReached" */ val LIVE_BACK_BUFFER_REACHED: typingsJapgolly.hlsJs.mod.Events.LIVE_BACK_BUFFER_REACHED & String = js.native
  
  @js.native
  sealed trait MANIFEST_LOADED
    extends StObject
       with Events
  /* "hlsManifestLoaded" */ val MANIFEST_LOADED: typingsJapgolly.hlsJs.mod.Events.MANIFEST_LOADED & String = js.native
  
  @js.native
  sealed trait MANIFEST_LOADING
    extends StObject
       with Events
  /* "hlsManifestLoading" */ val MANIFEST_LOADING: typingsJapgolly.hlsJs.mod.Events.MANIFEST_LOADING & String = js.native
  
  @js.native
  sealed trait MANIFEST_PARSED
    extends StObject
       with Events
  /* "hlsManifestParsed" */ val MANIFEST_PARSED: typingsJapgolly.hlsJs.mod.Events.MANIFEST_PARSED & String = js.native
  
  @js.native
  sealed trait MEDIA_ATTACHED
    extends StObject
       with Events
  /* "hlsMediaAttached" */ val MEDIA_ATTACHED: typingsJapgolly.hlsJs.mod.Events.MEDIA_ATTACHED & String = js.native
  
  @js.native
  sealed trait MEDIA_ATTACHING
    extends StObject
       with Events
  /* "hlsMediaAttaching" */ val MEDIA_ATTACHING: typingsJapgolly.hlsJs.mod.Events.MEDIA_ATTACHING & String = js.native
  
  @js.native
  sealed trait MEDIA_DETACHED
    extends StObject
       with Events
  /* "hlsMediaDetached" */ val MEDIA_DETACHED: typingsJapgolly.hlsJs.mod.Events.MEDIA_DETACHED & String = js.native
  
  @js.native
  sealed trait MEDIA_DETACHING
    extends StObject
       with Events
  /* "hlsMediaDetaching" */ val MEDIA_DETACHING: typingsJapgolly.hlsJs.mod.Events.MEDIA_DETACHING & String = js.native
  
  @js.native
  sealed trait NON_NATIVE_TEXT_TRACKS_FOUND
    extends StObject
       with Events
  /* "hlsNonNativeTextTracksFound" */ val NON_NATIVE_TEXT_TRACKS_FOUND: typingsJapgolly.hlsJs.mod.Events.NON_NATIVE_TEXT_TRACKS_FOUND & String = js.native
  
  @js.native
  sealed trait SUBTITLE_FRAG_PROCESSED
    extends StObject
       with Events
  /* "hlsSubtitleFragProcessed" */ val SUBTITLE_FRAG_PROCESSED: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_FRAG_PROCESSED & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACKS_CLEARED
    extends StObject
       with Events
  /* "hlsSubtitleTracksCleared" */ val SUBTITLE_TRACKS_CLEARED: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_TRACKS_CLEARED & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACKS_UPDATED
    extends StObject
       with Events
  /* "hlsSubtitleTracksUpdated" */ val SUBTITLE_TRACKS_UPDATED: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_TRACKS_UPDATED & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACK_LOADED
    extends StObject
       with Events
  /* "hlsSubtitleTrackLoaded" */ val SUBTITLE_TRACK_LOADED: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_TRACK_LOADED & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACK_LOADING
    extends StObject
       with Events
  /* "hlsSubtitleTrackLoading" */ val SUBTITLE_TRACK_LOADING: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_TRACK_LOADING & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACK_SWITCH
    extends StObject
       with Events
  /* "hlsSubtitleTrackSwitch" */ val SUBTITLE_TRACK_SWITCH: typingsJapgolly.hlsJs.mod.Events.SUBTITLE_TRACK_SWITCH & String = js.native
}
