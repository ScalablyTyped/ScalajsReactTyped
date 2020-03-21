package typingsJapgolly.hlsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // interface Segment {}
  // interface TimeRange {}
  // interface SubtitleTracks {}
  type CustomLogger = js.Function1[/* repeated */ js.Any, scala.Unit]
  type K_AUDIO_TRACKS_UPDATED = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTracksUpdated
  type K_AUDIO_TRACK_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTrackLoaded
  type K_AUDIO_TRACK_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTrackLoading
  type K_AUDIO_TRACK_LOAD_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.audioTrackLoadError
  type K_AUDIO_TRACK_LOAD_TIMEOUT = typingsJapgolly.hlsJs.hlsJsStrings.audioTrackLoadTimeout
  type K_AUDIO_TRACK_SWITCH = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTrackSwitch
  type K_AUDIO_TRACK_SWITCHED = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTrackSwitched
  type K_AUDIO_TRACK_SWITCHING = typingsJapgolly.hlsJs.hlsJsStrings.hlsAudioTrackSwitching
  type K_BUFFER_ADD_CODEC_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.bufferAddCodecError
  type K_BUFFER_APPENDED = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferAppended
  type K_BUFFER_APPENDING = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferAppending
  type K_BUFFER_APPENDING_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.bufferAppendingError
  type K_BUFFER_APPEND_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.bufferAppendError
  type K_BUFFER_CODECS = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferCodecs
  type K_BUFFER_CREATED = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferCreated
  type K_BUFFER_EOS = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferEOS
  type K_BUFFER_FLUSHED = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferFlushed
  type K_BUFFER_FLUSHING = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferFlushing
  type K_BUFFER_FULL_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.bufferFullError
  type K_BUFFER_NUDGE_ON_STALL = typingsJapgolly.hlsJs.hlsJsStrings.bufferNudgeOnStall
  type K_BUFFER_RESET = typingsJapgolly.hlsJs.hlsJsStrings.hlsBufferReset
  type K_BUFFER_SEEK_OVER_HOLE = typingsJapgolly.hlsJs.hlsJsStrings.bufferSeekOverHole
  type K_BUFFER_STALLED_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.bufferStalledError
  type K_DESTROYING = typingsJapgolly.hlsJs.hlsJsStrings.hlsDestroying
  type K_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.hlsError
  type K_FPS_DROP = typingsJapgolly.hlsJs.hlsJsStrings.hlsFpsDrop
  type K_FPS_DROP_LEVEL_CAPPING = typingsJapgolly.hlsJs.hlsJsStrings.hlsFpsDropLevelCapping
  type K_FRAG_BUFFERED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragBuffered
  type K_FRAG_CHANGED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragChanged
  type K_FRAG_DECRYPTED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragDecrypted
  type K_FRAG_DECRYPT_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.fragDecryptError
  type K_FRAG_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragLoaded
  type K_FRAG_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragLoading
  type K_FRAG_LOAD_EMERGENCY_ABORTED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragLoadEmergencyAborted
  type K_FRAG_LOAD_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.fragLoadError
  type K_FRAG_LOAD_PROGRESS = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragLoadProgress
  type K_FRAG_LOAD_TIMEOUT = typingsJapgolly.hlsJs.hlsJsStrings.fragLoadTimeout
  type K_FRAG_LOOP_LOADING_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.fragLoopLoadingError
  type K_FRAG_PARSED = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragParsed
  type K_FRAG_PARSING_DATA = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragParsingData
  type K_FRAG_PARSING_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.fragParsingError
  type K_FRAG_PARSING_INIT_SEGMENT = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragParsingInitSegment
  type K_FRAG_PARSING_METADATA = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragParsingMetadata
  type K_FRAG_PARSING_USERDATA = typingsJapgolly.hlsJs.hlsJsStrings.hlsFragParsingUserData
  type K_INIT_PTS_FOUND = typingsJapgolly.hlsJs.hlsJsStrings.hlsInitPtsFound
  type K_INTERNAL_EXCEPTION = typingsJapgolly.hlsJs.hlsJsStrings.interalException
  type K_KEY_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsKeyLoaded
  type K_KEY_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsKeyLoading
  type K_KEY_LOAD_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.keyLoadError
  type K_KEY_LOAD_TIMEOUT = typingsJapgolly.hlsJs.hlsJsStrings.keyLoadTimeout
  type K_KEY_SYSTEM_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.keySystemError
  type K_LEVEL_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelLoaded
  type K_LEVEL_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelLoading
  type K_LEVEL_LOAD_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.levelLoadError
  type K_LEVEL_LOAD_TIMEOUT = typingsJapgolly.hlsJs.hlsJsStrings.levelLoadTimeout
  type K_LEVEL_PTS_UPDATED = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelPtsUpdated
  type K_LEVEL_SWITCHED = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelSwitched
  type K_LEVEL_SWITCHING = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelSwitching
  // OTHER_ERROR //
  type K_LEVEL_SWITCH_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.levelSwitchError
  type K_LEVEL_UPDATED = typingsJapgolly.hlsJs.hlsJsStrings.hlsLevelUpdated
  // MEDIA_ERRORS //
  type K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.manifestIncompatibleCodecsError
  type K_MANIFEST_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsManifestLoaded
  type K_MANIFEST_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsManifestLoading
  // Error Keys
  type K_MANIFEST_LOAD_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.manifestLoadError
  type K_MANIFEST_LOAD_TIMEOUT = typingsJapgolly.hlsJs.hlsJsStrings.manifestLoadTimeout
  type K_MANIFEST_PARSED = typingsJapgolly.hlsJs.hlsJsStrings.hlsManifestParsed
  type K_MANIFEST_PARSING_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.manifestParsingError
  type K_MEDIA_ATTACHED = typingsJapgolly.hlsJs.hlsJsStrings.hlsMediaAttached
  type K_MEDIA_ATTACHING = typingsJapgolly.hlsJs.hlsJsStrings.hlsMediaAttaching
  type K_MEDIA_DETACHED = typingsJapgolly.hlsJs.hlsJsStrings.hlsMediaDetached
  type K_MEDIA_DETACHING = typingsJapgolly.hlsJs.hlsJsStrings.hlsMediaDetaching
  type K_MEDIA_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.mediaError
  type K_MUX_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.muxError
  // Error Type Keys
  type K_NETWORK_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.networkError
  type K_OTHER_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.otherError
  // MUX_ERROR //
  type K_REMUX_ALLOC_ERROR = typingsJapgolly.hlsJs.hlsJsStrings.remuxAllocError
  type K_STREAM_STATE_TRANSITION = typingsJapgolly.hlsJs.hlsJsStrings.hlsStreamStateTransition
  type K_SUBTITLE_FRAG_PROCESSED = typingsJapgolly.hlsJs.hlsJsStrings.hlsSubtitleFragProcessed
  type K_SUBTITLE_TRACKS_UPDATED = typingsJapgolly.hlsJs.hlsJsStrings.hlsSubtitleTracksUpdated
  type K_SUBTITLE_TRACK_LOADED = typingsJapgolly.hlsJs.hlsJsStrings.hlsSubtitleTrackLoaded
  type K_SUBTITLE_TRACK_LOADING = typingsJapgolly.hlsJs.hlsJsStrings.hlsSubtitleTrackLoading
  type K_SUBTITLE_TRACK_SWITCH = typingsJapgolly.hlsJs.hlsJsStrings.hlsSubtitleTrackSwitch
  type LevelAttr = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
