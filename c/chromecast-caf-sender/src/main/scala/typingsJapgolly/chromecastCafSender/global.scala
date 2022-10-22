package typingsJapgolly.chromecastCafSender

import typingsJapgolly.chrome.chrome.cast.ErrorCode
import typingsJapgolly.chrome.chrome.cast.Image
import typingsJapgolly.chrome.chrome.cast.Session
import typingsJapgolly.chrome.chrome.cast.media.Media
import typingsJapgolly.chrome.chrome.cast.media.PlayerState
import typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState
import typingsJapgolly.chromecastCafSender.cast.framework.CastState
import typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel
import typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType
import typingsJapgolly.chromecastCafSender.cast.framework.SavedPlayerState
import typingsJapgolly.chromecastCafSender.cast.framework.SessionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cast {
    
    ////////////////////
    // Framework
    ////////////////////
    /**
      * Cast Application Framework
      * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
      */
    object framework {
      
      @JSGlobal("cast.framework")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("cast.framework.ActiveInputState")
      @js.native
      object ActiveInputState extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState & Double] = js.native
        
        /* 0 */ val ACTIVE_INPUT_STATE_NO: typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_NO & Double = js.native
        
        /* -1 */ val ACTIVE_INPUT_STATE_UNKNOWN: typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_UNKNOWN & Double = js.native
        
        /* 1 */ val ACTIVE_INPUT_STATE_YES: typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_YES & Double = js.native
      }
      
      @JSGlobal("cast.framework.ActiveInputStateEventData")
      @js.native
      open class ActiveInputStateEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.ActiveInputStateEventData {
        def this(activeInputState: ActiveInputState) = this()
        
        /* CompleteClass */
        var activeInputState: ActiveInputState = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.ApplicationMetadata")
      @js.native
      open class ApplicationMetadata protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadata {
        def this(sessionObj: Session) = this()
        
        /* CompleteClass */
        var applicationId: String = js.native
        
        /* CompleteClass */
        var images: js.Array[Image] = js.native
        
        /* CompleteClass */
        var name: String = js.native
        
        /* CompleteClass */
        var namespaces: js.Array[String] = js.native
      }
      
      @JSGlobal("cast.framework.ApplicationMetadataEventData")
      @js.native
      open class ApplicationMetadataEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadataEventData {
        def this(metadata: typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadata) = this()
        
        /* CompleteClass */
        var metadata: typingsJapgolly.chromecastCafSender.cast.framework.ApplicationMetadata = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.ApplicationStatusEventData")
      @js.native
      open class ApplicationStatusEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.ApplicationStatusEventData {
        def this(status: String) = this()
        
        /* CompleteClass */
        var status: String = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.CastContext")
      @js.native
      open class CastContext ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.CastContext
      object CastContext {
        
        @JSGlobal("cast.framework.CastContext")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def getInstance(): typingsJapgolly.chromecastCafSender.cast.framework.CastContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.chromecastCafSender.cast.framework.CastContext]
      }
      
      @JSGlobal("cast.framework.CastContextEventType")
      @js.native
      object CastContextEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.CastContextEventType & String] = js.native
        
        /* "caststatechanged" */ val CAST_STATE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.CastContextEventType.CAST_STATE_CHANGED & String = js.native
        
        /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.CastContextEventType.SESSION_STATE_CHANGED & String = js.native
      }
      
      @JSGlobal("cast.framework.CastSession")
      @js.native
      open class CastSession protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.CastSession {
        def this(sessionObj: Session, state: SessionState) = this()
      }
      
      @JSGlobal("cast.framework.CastState")
      @js.native
      object CastState extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.CastState & String] = js.native
        
        /* "CONNECTED" */ val CONNECTED: typingsJapgolly.chromecastCafSender.cast.framework.CastState.CONNECTED & String = js.native
        
        /* "CONNECTING" */ val CONNECTING: typingsJapgolly.chromecastCafSender.cast.framework.CastState.CONNECTING & String = js.native
        
        /* "NOT_CONNECTED" */ val NOT_CONNECTED: typingsJapgolly.chromecastCafSender.cast.framework.CastState.NOT_CONNECTED & String = js.native
        
        /* "NO_DEVICES_AVAILABLE" */ val NO_DEVICES_AVAILABLE: typingsJapgolly.chromecastCafSender.cast.framework.CastState.NO_DEVICES_AVAILABLE & String = js.native
      }
      
      @JSGlobal("cast.framework.CastStateEventData")
      @js.native
      open class CastStateEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.CastStateEventData {
        def this(castState: CastState) = this()
        
        /* CompleteClass */
        var castState: CastState = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      /* note: abstract class */ @JSGlobal("cast.framework.EventData")
      @js.native
      open class EventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.EventData {
        def this(`type`: String) = this()
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.LoggerLevel")
      @js.native
      object LoggerLevel extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel & Double] = js.native
        
        /* 0 */ val DEBUG: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel.DEBUG & Double = js.native
        
        /* 3 */ val ERROR: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel.ERROR & Double = js.native
        
        /* 1 */ val INFO: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel.INFO & Double = js.native
        
        /* 4 */ val NONE: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel.NONE & Double = js.native
        
        /* 2 */ val WARNING: typingsJapgolly.chromecastCafSender.cast.framework.LoggerLevel.WARNING & Double = js.native
      }
      
      @JSGlobal("cast.framework.MediaSessionEventData")
      @js.native
      open class MediaSessionEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.MediaSessionEventData {
        def this(mediaSession: Media) = this()
        
        /* CompleteClass */
        var mediaSession: Media = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.RemotePlayer")
      @js.native
      open class RemotePlayer ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayer {
        
        /* CompleteClass */
        var canControlVolume: Boolean = js.native
        
        /* CompleteClass */
        var canPause: Boolean = js.native
        
        /* CompleteClass */
        var canSeek: Boolean = js.native
        
        /* CompleteClass */
        var controller: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerController | Null = js.native
        
        /* CompleteClass */
        var currentTime: Double = js.native
        
        /* CompleteClass */
        var displayName: String = js.native
        
        /* CompleteClass */
        var displayStatus: String = js.native
        
        /* CompleteClass */
        var duration: Double = js.native
        
        /* CompleteClass */
        var imageUrl: String | Null = js.native
        
        /* CompleteClass */
        var isConnected: Boolean = js.native
        
        /* CompleteClass */
        var isMediaLoaded: Boolean = js.native
        
        /* CompleteClass */
        var isMuted: Boolean = js.native
        
        /* CompleteClass */
        var isPaused: Boolean = js.native
        
        /* CompleteClass */
        var playerState: PlayerState | Null = js.native
        
        /* CompleteClass */
        var savedPlayerState: SavedPlayerState | Null = js.native
        
        /* CompleteClass */
        var statusText: String = js.native
        
        /* CompleteClass */
        var title: String = js.native
        
        /* CompleteClass */
        var volumeLevel: Double = js.native
      }
      
      @JSGlobal("cast.framework.RemotePlayerChangedEvent")
      @js.native
      open class RemotePlayerChangedEvent[T] protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[T] {
        def this(`type`: RemotePlayerEventType, field: String, value: T) = this()
        
        /* CompleteClass */
        var field: String = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
        
        /* CompleteClass */
        var value: T = js.native
      }
      
      @JSGlobal("cast.framework.RemotePlayerController")
      @js.native
      open class RemotePlayerController protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerController {
        def this(player: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayer) = this()
        
        /* CompleteClass */
        override def addEventListener(
          `type`: RemotePlayerEventType,
          handler: js.Function1[
                  /* event */ typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[Any], 
                  Unit
                ]
        ): Unit = js.native
        
        /* CompleteClass */
        override def getFormattedTime(timeInSec: Double): String = js.native
        
        /* CompleteClass */
        override def getSeekPosition(currentTime: Double, duration: Double): Double = js.native
        
        /* CompleteClass */
        override def getSeekTime(currentPosition: Double, duration: Double): Double = js.native
        
        /* CompleteClass */
        override def muteOrUnmute(): Unit = js.native
        
        /* CompleteClass */
        override def playOrPause(): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(
          `type`: RemotePlayerEventType,
          handler: js.Function1[
                  /* event */ typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[Any], 
                  Unit
                ]
        ): Unit = js.native
        
        /* CompleteClass */
        override def seek(): Unit = js.native
        
        /* CompleteClass */
        override def setVolumeLevel(): Unit = js.native
        
        /* CompleteClass */
        override def stop(): Unit = js.native
      }
      
      @JSGlobal("cast.framework.RemotePlayerEventType")
      @js.native
      object RemotePlayerEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[
                typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType & String
              ] = js.native
        
        /* "anyChanged" */ val ANY_CHANGE: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.ANY_CHANGE & String = js.native
        
        /* "canControlVolumeChanged" */ val CAN_CONTROL_VOLUME_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_CONTROL_VOLUME_CHANGED & String = js.native
        
        /* "canPauseChanged" */ val CAN_PAUSE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_PAUSE_CHANGED & String = js.native
        
        /* "canSeekChanged" */ val CAN_SEEK_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_SEEK_CHANGED & String = js.native
        
        /* "currentTimeChanged" */ val CURRENT_TIME_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.CURRENT_TIME_CHANGED & String = js.native
        
        /* "displayNameChanged" */ val DISPLAY_NAME_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.DISPLAY_NAME_CHANGED & String = js.native
        
        /* "displayStatusChanged" */ val DISPLAY_STATUS_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.DISPLAY_STATUS_CHANGED & String = js.native
        
        /* "durationChanged" */ val DURATION_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.DURATION_CHANGED & String = js.native
        
        /* "imageUrlChanged" */ val IMAGE_URL_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.IMAGE_URL_CHANGED & String = js.native
        
        /* "isConnectedChanged" */ val IS_CONNECTED_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_CONNECTED_CHANGED & String = js.native
        
        /* "isMediaLoadedChanged" */ val IS_MEDIA_LOADED_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_MEDIA_LOADED_CHANGED & String = js.native
        
        /* "isMutedChanged" */ val IS_MUTED_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_MUTED_CHANGED & String = js.native
        
        /* "isPausedChanged" */ val IS_PAUSED_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_PAUSED_CHANGED & String = js.native
        
        /* "liveSeekableRange" */ val LIVE_SEEKABLE_RANGE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.LIVE_SEEKABLE_RANGE_CHANGED & String = js.native
        
        /* "mediaInfoChanged" */ val MEDIA_INFO_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.MEDIA_INFO_CHANGED & String = js.native
        
        /* "playerStateChanged" */ val PLAYER_STATE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.PLAYER_STATE_CHANGED & String = js.native
        
        /* "statusTextChanged" */ val STATUS_TEXT_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.STATUS_TEXT_CHANGED & String = js.native
        
        /* "titleChanged" */ val TITLE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.TITLE_CHANGED & String = js.native
        
        /* "volumeLevelChanged" */ val VOLUME_LEVEL_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.RemotePlayerEventType.VOLUME_LEVEL_CHANGED & String = js.native
      }
      
      @JSGlobal("cast.framework.SessionEventType")
      @js.native
      object SessionEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType & String] = js.native
        
        /* "activeinputstatechanged" */ val ACTIVE_INPUT_STATE_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType.ACTIVE_INPUT_STATE_CHANGED & String = js.native
        
        /* "applicationmetadatachanged" */ val APPLICATION_METADATA_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType.APPLICATION_METADATA_CHANGED & String = js.native
        
        /* "applicationstatuschanged" */ val APPLICATION_STATUS_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType.APPLICATION_STATUS_CHANGED & String = js.native
        
        /* "mediasession" */ val MEDIA_SESSION: typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType.MEDIA_SESSION & String = js.native
        
        /* "volumechanged" */ val VOLUME_CHANGED: typingsJapgolly.chromecastCafSender.cast.framework.SessionEventType.VOLUME_CHANGED & String = js.native
      }
      
      @JSGlobal("cast.framework.SessionState")
      @js.native
      object SessionState extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.chromecastCafSender.cast.framework.SessionState & String] = js.native
        
        /* "NO_SESSION" */ val NO_SESSION: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.NO_SESSION & String = js.native
        
        /* "SESSION_ENDED" */ val SESSION_ENDED: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_ENDED & String = js.native
        
        /* "SESSION_ENDING" */ val SESSION_ENDING: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_ENDING & String = js.native
        
        /* "SESSION_RESUMED" */ val SESSION_RESUMED: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_RESUMED & String = js.native
        
        /* "SESSION_STARTED" */ val SESSION_STARTED: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_STARTED & String = js.native
        
        /* "SESSION_STARTING" */ val SESSION_STARTING: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_STARTING & String = js.native
        
        /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: typingsJapgolly.chromecastCafSender.cast.framework.SessionState.SESSION_START_FAILED & String = js.native
      }
      
      @JSGlobal("cast.framework.SessionStateEventData")
      @js.native
      open class SessionStateEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.SessionStateEventData {
        def this(
          session: typingsJapgolly.chromecastCafSender.cast.framework.CastSession,
          sessionState: SessionState,
          opt_errorCode: ErrorCode
        ) = this()
        
        /* CompleteClass */
        var errorCode: ErrorCode = js.native
        
        /* CompleteClass */
        var session: typingsJapgolly.chromecastCafSender.cast.framework.CastSession = js.native
        
        /* CompleteClass */
        var sessionState: SessionState = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("cast.framework.VERSION")
      @js.native
      val VERSION: String = js.native
      
      @JSGlobal("cast.framework.VolumeEventData")
      @js.native
      open class VolumeEventData protected ()
        extends StObject
           with typingsJapgolly.chromecastCafSender.cast.framework.VolumeEventData {
        def this(volume: Double, isMute: Boolean) = this()
        
        /* CompleteClass */
        var isMute: Boolean = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
        
        /* CompleteClass */
        var volume: Double = js.native
      }
      
      inline def setLoggerLevel(level: LoggerLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoggerLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
}
