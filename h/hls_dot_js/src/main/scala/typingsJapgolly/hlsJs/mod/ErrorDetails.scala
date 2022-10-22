package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorDetails extends StObject
@JSImport("hls.js", "ErrorDetails")
@js.native
object ErrorDetails extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorDetails & String] = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "audioTrackLoadError" */ val AUDIO_TRACK_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.AUDIO_TRACK_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait AUDIO_TRACK_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "audioTrackLoadTimeOut" */ val AUDIO_TRACK_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait BUFFER_ADD_CODEC_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferAddCodecError" */ val BUFFER_ADD_CODEC_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_ADD_CODEC_ERROR & String = js.native
  
  @js.native
  sealed trait BUFFER_APPENDING_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferAppendingError" */ val BUFFER_APPENDING_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_APPENDING_ERROR & String = js.native
  
  @js.native
  sealed trait BUFFER_APPEND_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferAppendError" */ val BUFFER_APPEND_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_APPEND_ERROR & String = js.native
  
  @js.native
  sealed trait BUFFER_FULL_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferFullError" */ val BUFFER_FULL_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_FULL_ERROR & String = js.native
  
  @js.native
  sealed trait BUFFER_INCOMPATIBLE_CODECS_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferIncompatibleCodecsError" */ val BUFFER_INCOMPATIBLE_CODECS_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_INCOMPATIBLE_CODECS_ERROR & String = js.native
  
  @js.native
  sealed trait BUFFER_NUDGE_ON_STALL
    extends StObject
       with ErrorDetails
  /* "bufferNudgeOnStall" */ val BUFFER_NUDGE_ON_STALL: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_NUDGE_ON_STALL & String = js.native
  
  @js.native
  sealed trait BUFFER_SEEK_OVER_HOLE
    extends StObject
       with ErrorDetails
  /* "bufferSeekOverHole" */ val BUFFER_SEEK_OVER_HOLE: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_SEEK_OVER_HOLE & String = js.native
  
  @js.native
  sealed trait BUFFER_STALLED_ERROR
    extends StObject
       with ErrorDetails
  /* "bufferStalledError" */ val BUFFER_STALLED_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.BUFFER_STALLED_ERROR & String = js.native
  
  @js.native
  sealed trait FRAG_DECRYPT_ERROR
    extends StObject
       with ErrorDetails
  /* "fragDecryptError" */ val FRAG_DECRYPT_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.FRAG_DECRYPT_ERROR & String = js.native
  
  @js.native
  sealed trait FRAG_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "fragLoadError" */ val FRAG_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.FRAG_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait FRAG_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "fragLoadTimeOut" */ val FRAG_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.FRAG_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait FRAG_PARSING_ERROR
    extends StObject
       with ErrorDetails
  /* "fragParsingError" */ val FRAG_PARSING_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.FRAG_PARSING_ERROR & String = js.native
  
  @js.native
  sealed trait INTERNAL_ABORTED
    extends StObject
       with ErrorDetails
  /* "aborted" */ val INTERNAL_ABORTED: typingsJapgolly.hlsJs.mod.ErrorDetails.INTERNAL_ABORTED & String = js.native
  
  @js.native
  sealed trait INTERNAL_EXCEPTION
    extends StObject
       with ErrorDetails
  /* "internalException" */ val INTERNAL_EXCEPTION: typingsJapgolly.hlsJs.mod.ErrorDetails.INTERNAL_EXCEPTION & String = js.native
  
  @js.native
  sealed trait KEY_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "keyLoadError" */ val KEY_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait KEY_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "keyLoadTimeOut" */ val KEY_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_LICENSE_REQUEST_FAILED
    extends StObject
       with ErrorDetails
  /* "keySystemLicenseRequestFailed" */ val KEY_SYSTEM_LICENSE_REQUEST_FAILED: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_SYSTEM_LICENSE_REQUEST_FAILED & String = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_NO_ACCESS
    extends StObject
       with ErrorDetails
  /* "keySystemNoAccess" */ val KEY_SYSTEM_NO_ACCESS: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_ACCESS & String = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_NO_INIT_DATA
    extends StObject
       with ErrorDetails
  /* "keySystemNoInitData" */ val KEY_SYSTEM_NO_INIT_DATA: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_INIT_DATA & String = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_NO_KEYS
    extends StObject
       with ErrorDetails
  /* "keySystemNoKeys" */ val KEY_SYSTEM_NO_KEYS: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_KEYS & String = js.native
  
  @js.native
  sealed trait KEY_SYSTEM_NO_SESSION
    extends StObject
       with ErrorDetails
  /* "keySystemNoSession" */ val KEY_SYSTEM_NO_SESSION: typingsJapgolly.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_SESSION & String = js.native
  
  @js.native
  sealed trait LEVEL_EMPTY_ERROR
    extends StObject
       with ErrorDetails
  /* "levelEmptyError" */ val LEVEL_EMPTY_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.LEVEL_EMPTY_ERROR & String = js.native
  
  @js.native
  sealed trait LEVEL_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "levelLoadError" */ val LEVEL_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.LEVEL_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait LEVEL_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "levelLoadTimeOut" */ val LEVEL_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.LEVEL_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait LEVEL_SWITCH_ERROR
    extends StObject
       with ErrorDetails
  /* "levelSwitchError" */ val LEVEL_SWITCH_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.LEVEL_SWITCH_ERROR & String = js.native
  
  @js.native
  sealed trait MANIFEST_INCOMPATIBLE_CODECS_ERROR
    extends StObject
       with ErrorDetails
  /* "manifestIncompatibleCodecsError" */ val MANIFEST_INCOMPATIBLE_CODECS_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR & String = js.native
  
  @js.native
  sealed trait MANIFEST_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "manifestLoadError" */ val MANIFEST_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.MANIFEST_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait MANIFEST_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "manifestLoadTimeOut" */ val MANIFEST_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.MANIFEST_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait MANIFEST_PARSING_ERROR
    extends StObject
       with ErrorDetails
  /* "manifestParsingError" */ val MANIFEST_PARSING_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.MANIFEST_PARSING_ERROR & String = js.native
  
  @js.native
  sealed trait REMUX_ALLOC_ERROR
    extends StObject
       with ErrorDetails
  /* "remuxAllocError" */ val REMUX_ALLOC_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.REMUX_ALLOC_ERROR & String = js.native
  
  @js.native
  sealed trait SUBTITLE_LOAD_ERROR
    extends StObject
       with ErrorDetails
  /* "subtitleTrackLoadError" */ val SUBTITLE_LOAD_ERROR: typingsJapgolly.hlsJs.mod.ErrorDetails.SUBTITLE_LOAD_ERROR & String = js.native
  
  @js.native
  sealed trait SUBTITLE_TRACK_LOAD_TIMEOUT
    extends StObject
       with ErrorDetails
  /* "subtitleTrackLoadTimeOut" */ val SUBTITLE_TRACK_LOAD_TIMEOUT: typingsJapgolly.hlsJs.mod.ErrorDetails.SUBTITLE_TRACK_LOAD_TIMEOUT & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ErrorDetails
  /* "unknown" */ val UNKNOWN: typingsJapgolly.hlsJs.mod.ErrorDetails.UNKNOWN & String = js.native
}
