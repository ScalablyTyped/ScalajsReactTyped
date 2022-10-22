package typingsJapgolly.playable

import typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState
import typingsJapgolly.playable.distSrcConstantsErrorsMod.Error
import typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent
import typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent
import typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState
import typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority
import typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsMod {
  
  @JSImport("playable/dist/src/constants", "ENGINE_STATES")
  @js.native
  object ENGINE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EngineState & String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.ENDED & String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.LOAD_STARTED & String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.METADATA_LOADED & String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PAUSED & String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PLAYING & String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PLAY_REQUESTED & String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.READY_TO_PLAY & String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.SEEK_IN_PROGRESS & String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.SRC_SET & String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.WAITING & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "ERRORS")
  @js.native
  object ERRORS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error & String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_LOAD & String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_PARSE & String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.LEVEL_LOAD & String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_INCOMPATIBLE & String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_LOAD & String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_PARSE & String = js.native
    
    /* "error-media" */ val MEDIA: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MEDIA & String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.SRC_PARSE & String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.UNKNOWN & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "EngineState")
  @js.native
  object EngineState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState & String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.ENDED & String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.LOAD_STARTED & String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.METADATA_LOADED & String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PAUSED & String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PLAYING & String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.PLAY_REQUESTED & String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.READY_TO_PLAY & String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.SEEK_IN_PROGRESS & String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.SRC_SET & String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState.WAITING & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "Error")
  @js.native
  object Error extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsErrorsMod.Error & String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_LOAD & String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_PARSE & String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.LEVEL_LOAD & String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_INCOMPATIBLE & String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_LOAD & String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_PARSE & String = js.native
    
    /* "error-media" */ val MEDIA: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MEDIA & String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.SRC_PARSE & String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.UNKNOWN & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LIVE_STATES")
  @js.native
  object LIVE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LiveState & String] = js.native
    
    /* "live-state/ended" */ val ENDED: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.ENDED & String = js.native
    
    /* "live-state/initial" */ val INITIAL: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.INITIAL & String = js.native
    
    /* "live-state/none" */ val NONE: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.NONE & String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.NOT_SYNC & String = js.native
    
    /* "live-state/sync" */ val SYNC: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.SYNC & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LiveState")
  @js.native
  object LiveState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState & String] = js.native
    
    /* "live-state/ended" */ val ENDED: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.ENDED & String = js.native
    
    /* "live-state/initial" */ val INITIAL: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.INITIAL & String = js.native
    
    /* "live-state/none" */ val NONE: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.NONE & String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.NOT_SYNC & String = js.native
    
    /* "live-state/sync" */ val SYNC: typingsJapgolly.playable.distSrcConstantsLiveStateMod.LiveState.SYNC & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_DELIVERY_PRIORITY")
  @js.native
  object MEDIA_STREAM_DELIVERY_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority & Double] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE & Double = js.native
    
    /* 3 */ val FORCED: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.FORCED & Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE & Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE & Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_TYPES")
  @js.native
  object MEDIA_STREAM_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType & String] = js.native
    
    /* "DASH" */ val DASH: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.DASH & String = js.native
    
    /* "HLS" */ val HLS: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.HLS & String = js.native
    
    /* "MKV" */ val MKV: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MKV & String = js.native
    
    /* "MOV" */ val MOV: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MOV & String = js.native
    
    /* "MP4" */ val MP4: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MP4 & String = js.native
    
    /* "OGG" */ val OGG: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.OGG & String = js.native
    
    /* "WEBM" */ val WEBM: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.WEBM & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority & Double
      ] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE & Double = js.native
    
    /* 3 */ val FORCED: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.FORCED & Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE & Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE & Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType & String] = js.native
    
    /* "DASH" */ val DASH: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.DASH & String = js.native
    
    /* "HLS" */ val HLS: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.HLS & String = js.native
    
    /* "MKV" */ val MKV: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MKV & String = js.native
    
    /* "MOV" */ val MOV: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MOV & String = js.native
    
    /* "MP4" */ val MP4: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.MP4 & String = js.native
    
    /* "OGG" */ val OGG: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.OGG & String = js.native
    
    /* "WEBM" */ val WEBM: typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType.WEBM & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TEXT_LABELS")
  @js.native
  object TEXT_LABELS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextLabel & String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL & String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP & String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL & String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL & String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_INDICATOR_TEXT & String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_SYNC_LABEL & String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP & String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LOGO_LABEL & String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LOGO_TOOLTIP & String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.MUTE_CONTROL_LABEL & String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PAUSE_CONTROL_LABEL & String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PLAY_CONTROL_LABEL & String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL & String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.VOLUME_CONTROL_LABEL & String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.VOLUME_CONTROL_VALUE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TextLabel")
  @js.native
  object TextLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel & String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL & String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP & String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL & String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL & String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_INDICATOR_TEXT & String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_SYNC_LABEL & String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP & String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LOGO_LABEL & String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.LOGO_TOOLTIP & String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.MUTE_CONTROL_LABEL & String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PAUSE_CONTROL_LABEL & String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PLAY_CONTROL_LABEL & String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL & String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.VOLUME_CONTROL_LABEL & String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typingsJapgolly.playable.distSrcConstantsTextLabelsMod.TextLabel.VOLUME_CONTROL_VALUE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UIEvent")
  @js.native
  object UIEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent & String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.CONTROL_DRAG_END & String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.CONTROL_DRAG_START & String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FOCUS_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FULL_SCREEN_STATE_CHANGED & String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.HIDE_INTERACTION_INDICATOR & String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED & String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADER_HIDE & String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADER_SHOW & String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADING_COVER_HIDE & String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADING_COVER_SHOW & String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MAIN_BLOCK_HIDE & String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MAIN_BLOCK_SHOW & String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_MOVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MUTE_CLICK & String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PAUSE_CLICK & String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE & String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_CLICK & String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_OVERLAY_CLICK & String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_CHANGE & String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_DRAG_ENDED & String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_DRAG_STARTED & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE & String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME & String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.RESIZE & String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.UNMUTE_CLICK & String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.UNMUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.VOLUME_CHANGE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UI_EVENTS")
  @js.native
  object UI_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UIEvent & String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.CONTROL_DRAG_END & String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.CONTROL_DRAG_START & String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FOCUS_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.FULL_SCREEN_STATE_CHANGED & String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.HIDE_INTERACTION_INDICATOR & String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED & String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADER_HIDE & String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADER_SHOW & String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADING_COVER_HIDE & String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.LOADING_COVER_SHOW & String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MAIN_BLOCK_HIDE & String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MAIN_BLOCK_SHOW & String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MOUSE_MOVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MUTE_CLICK & String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.MUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PAUSE_CLICK & String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE & String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_CLICK & String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_OVERLAY_CLICK & String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PLAY_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_CHANGE & String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_DRAG_ENDED & String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_DRAG_STARTED & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE & String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME & String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.RESIZE & String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.UNMUTE_CLICK & String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.UNMUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typingsJapgolly.playable.distSrcConstantsEventsUiMod.UIEvent.VOLUME_CHANGE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VIDEO_EVENTS")
  @js.native
  object VIDEO_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoEvent & String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.CHUNK_LOADED & String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.CURRENT_TIME_UPDATED & String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.DURATION_UPDATED & String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.DYNAMIC_CONTENT_ENDED & String = js.native
    
    /* "video-events/error" */ val ERROR: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.ERROR & String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.LIVE_STATE_CHANGED & String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.MUTE_CHANGED & String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_ABORTED & String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_REQUEST & String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.RESET & String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.SEEK_IN_PROGRESS & String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.SOUND_STATE_CHANGED & String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.STATE_CHANGED & String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_STALLED & String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_SUSPEND & String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.VOLUME_CHANGED & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VideoEvent")
  @js.native
  object VideoEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent & String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.CHUNK_LOADED & String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.CURRENT_TIME_UPDATED & String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.DURATION_UPDATED & String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.DYNAMIC_CONTENT_ENDED & String = js.native
    
    /* "video-events/error" */ val ERROR: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.ERROR & String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.LIVE_STATE_CHANGED & String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.MUTE_CHANGED & String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_ABORTED & String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_REQUEST & String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.RESET & String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.SEEK_IN_PROGRESS & String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.SOUND_STATE_CHANGED & String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.STATE_CHANGED & String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_STALLED & String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_SUSPEND & String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typingsJapgolly.playable.distSrcConstantsEventsVideoMod.VideoEvent.VOLUME_CHANGED & String = js.native
  }
}
