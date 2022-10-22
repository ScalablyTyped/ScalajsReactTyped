package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource
import typingsJapgolly.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode
import typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError
import typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode
import typingsJapgolly.winrtUwp.Windows.WinRTError
import typingsJapgolly.winrtUwp.winrtUwpStrings.messagereceivedfrombackground
import typingsJapgolly.winrtUwp.winrtUwpStrings.messagereceivedfromforeground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for playing media files from foreground and background tasks. */
object Playback {
  
  @JSGlobal("Windows.Media.Playback")
  @js.native
  val ^ : js.Any = js.native
  
  /** Provides access to the media player while it is running in the background. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
  @js.native
  open class BackgroundMediaPlayer ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.BackgroundMediaPlayer
  object BackgroundMediaPlayer {
    
    @JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_messagereceivedfrombackground(`type`: messagereceivedfrombackground, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_messagereceivedfromforeground(`type`: messagereceivedfromforeground, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the current instance of the background media player. */
    /* static member */
    @JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer.current")
    @js.native
    def current: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayer = js.native
    inline def current_=(x: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a Boolean value indicating if other media is currently playing on the device.
      * @return Boolean value indicating if other media is currently playing on the device.
      */
    /* static member */
    inline def isMediaPlaying(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaPlaying")().asInstanceOf[Boolean]
    
    /** Occurs when a message is received from the background task. */
    /* static member */
    @JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer.onmessagereceivedfrombackground")
    @js.native
    def onmessagereceivedfrombackground: EventHandler[Any] = js.native
    inline def onmessagereceivedfrombackground_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onmessagereceivedfrombackground")(x.asInstanceOf[js.Any])
    
    /** Occurs when a message is received from the foreground task. */
    /* static member */
    @JSGlobal("Windows.Media.Playback.BackgroundMediaPlayer.onmessagereceivedfromforeground")
    @js.native
    def onmessagereceivedfromforeground: EventHandler[Any] = js.native
    inline def onmessagereceivedfromforeground_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onmessagereceivedfromforeground")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_messagereceivedfrombackground(`type`: messagereceivedfrombackground, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_messagereceivedfromforeground(`type`: messagereceivedfromforeground, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sends a message to the background media player.
      * @param value Set of values representing the message.
      */
    /* static member */
    inline def sendMessageToBackground(value: ValueSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToBackground")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sends a message to the foreground task.
      * @param value Set of values representing the message.
      */
    /* static member */
    inline def sendMessageToForeground(value: ValueSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToForeground")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Shuts down the current background media player. */
    /* static member */
    inline def shutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit]
  }
  
  /** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs")
  @js.native
  open class CurrentMediaPlaybackItemChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs {
    
    /** Gets the new current MediaPlaybackItem . */
    /* CompleteClass */
    var newItem: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
    
    /** Gets the previous current MediaPlaybackItem . */
    /* CompleteClass */
    var oldItem: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
  }
  
  /** Represents a read-only list of audio tracks, of which a single track can be selected at one time. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackAudioTrackList")
  @js.native
  open class MediaPlaybackAudioTrackList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackAudioTrackList
  
  /** Represents a media item that can be played back. This class acts as a wrapper around a MediaSource that exposes the audio tracks, video tracks, and timed metadata tracks included in the media source. */
  @JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
  @js.native
  open class MediaPlaybackItem protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem {
    /* unmapped type */
    /**
      * Initializes a new instance of the MediaPlaybackItem class.
      * @param source The media source from which the MediaPlaybackItem is created.
      */
    def this(source: MediaSource) = this()
  }
  object MediaPlaybackItem {
    
    @JSGlobal("Windows.Media.Playback.MediaPlaybackItem")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Media.Playback.MediaPlaybackItem.findFromMediaSource")
    @js.native
    def findFromMediaSource: Any = js.native
    inline def findFromMediaSource_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findFromMediaSource")(x.asInstanceOf[js.Any])
  }
  
  /** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackItemError")
  @js.native
  open class MediaPlaybackItemError ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemError {
    
    /** Gets the error code associated with the playback item error. */
    /* CompleteClass */
    var errorCode: MediaPlaybackItemErrorCode = js.native
    
    /** Gets the extended error code for the MediaPlaybackItem error. */
    /* CompleteClass */
    var extendedError: WinRTError = js.native
  }
  
  /** Specifies the type of error that occurred while opening a MediaPlaybackItem . */
  @JSGlobal("Windows.Media.Playback.MediaPlaybackItemErrorCode")
  @js.native
  object MediaPlaybackItemErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode & Double
      ] = js.native
    
    /* 1 */ val aborted: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.aborted & Double = js.native
    
    /* 3 */ val decodeError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.decodeError & Double = js.native
    
    /* 5 */ val encryptionError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.encryptionError & Double = js.native
    
    /* 2 */ val networkError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.networkError & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.none & Double = js.native
    
    /* 4 */ val sourceNotSupportedError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode.sourceNotSupportedError & Double = js.native
  }
  
  /** Provides data for the MediaPlaybackList::ItemFailed event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackItemFailedEventArgs")
  @js.native
  open class MediaPlaybackItemFailedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemFailedEventArgs {
    
    /** Gets a wrapper object for the MediaPlaybackItem error that provides high-level information about the cause of the error. */
    /* CompleteClass */
    var error: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemError = js.native
    
    /** Gets the MediaPlaybackItem associated with the error. */
    /* CompleteClass */
    var item: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
  }
  
  /** Provides data for the MediaPlaybackList::ItemOpened event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackItemOpenedEventArgs")
  @js.native
  open class MediaPlaybackItemOpenedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItemOpenedEventArgs {
    
    /** Gets the MediaPlaybackItem that was successfully opened. */
    /* CompleteClass */
    var item: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
  }
  
  /** Represents a list of MediaPlaybackItem objects that can be played back. Provides methods for switching the currently playing item and enabling looping and shuffling. */
  @JSGlobal("Windows.Media.Playback.MediaPlaybackList")
  @js.native
  /** Initializes a new instance of the MediaPlaybackList class. */
  open class MediaPlaybackList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackList
  
  /** Represents a read-only list of timed metadata tracks. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackTimedMetadataTrackList")
  @js.native
  open class MediaPlaybackTimedMetadataTrackList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackTimedMetadataTrackList
  
  /** Represents a read-only list of video tracks, of which a single track can be selected at one time. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlaybackVideoTrackList")
  @js.native
  open class MediaPlaybackVideoTrackList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackVideoTrackList
  
  /** Provides access to media playback functionality such as play, pause, fast-forward, rewind, and volume. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlayer")
  @js.native
  open class MediaPlayer ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayer
  
  /** Specifies the types of audio that can be played by a media player. */
  @JSGlobal("Windows.Media.Playback.MediaPlayerAudioCategory")
  @js.native
  object MediaPlayerAudioCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory & Double
      ] = js.native
    
    /* 2 */ val alerts: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.alerts & Double = js.native
    
    /* 1 */ val communications: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.communications & Double = js.native
    
    /* 6 */ val gameChat: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.gameChat & Double = js.native
    
    /* 4 */ val gameEffects: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.gameEffects & Double = js.native
    
    /* 5 */ val gameMedia: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.gameMedia & Double = js.native
    
    /* 9 */ val media: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.media & Double = js.native
    
    /* 8 */ val movie: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.movie & Double = js.native
    
    /* 0 */ val other: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.other & Double = js.native
    
    /* 3 */ val soundEffects: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.soundEffects & Double = js.native
    
    /* 7 */ val speech: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioCategory.speech & Double = js.native
  }
  
  /** Describes the primary usage of the device that is being used to play back audio. This value is used by MediaPlayer::AudioDeviceType . */
  @JSGlobal("Windows.Media.Playback.MediaPlayerAudioDeviceType")
  @js.native
  object MediaPlayerAudioDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioDeviceType & Double
      ] = js.native
    
    /* 2 */ val communications: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioDeviceType.communications & Double = js.native
    
    /* 0 */ val console: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioDeviceType.console & Double = js.native
    
    /* 1 */ val multimedia: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerAudioDeviceType.multimedia & Double = js.native
  }
  
  /** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlayerDataReceivedEventArgs")
  @js.native
  open class MediaPlayerDataReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerDataReceivedEventArgs {
    
    /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
    /* CompleteClass */
    var data: IMap[String, String] = js.native
  }
  
  /** Indicates possible media player errors. */
  @JSGlobal("Windows.Media.Playback.MediaPlayerError")
  @js.native
  object MediaPlayerError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError & Double] = js.native
    
    /* 1 */ val aborted: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError.aborted & Double = js.native
    
    /* 3 */ val decodingError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError.decodingError & Double = js.native
    
    /* 2 */ val networkError: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError.networkError & Double = js.native
    
    /* 4 */ val sourceNotSupported: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError.sourceNotSupported & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerError.unknown & Double = js.native
  }
  
  /** Provides the data for MediaFailed events. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlayerFailedEventArgs")
  @js.native
  open class MediaPlayerFailedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerFailedEventArgs {
    
    /** Gets the MediaPlayerError value for the error that triggered the event. */
    /* CompleteClass */
    var error: MediaPlayerError = js.native
    
    /** Gets a string describing the error that occurred. */
    /* CompleteClass */
    var errorMessage: String = js.native
    
    /** Gets an HResult that indicates any extra data about the error that occurred. */
    /* CompleteClass */
    var extendedErrorCode: WinRTError = js.native
  }
  
  /** Provides the data for MediaPlayerRateChanged events. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.MediaPlayerRateChangedEventArgs")
  @js.native
  open class MediaPlayerRateChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerRateChangedEventArgs {
    
    /** Gets the new playback rate for the media. */
    /* CompleteClass */
    var newRate: Double = js.native
  }
  
  /** Indicates the possible states that the player can be in. */
  @JSGlobal("Windows.Media.Playback.MediaPlayerState")
  @js.native
  object MediaPlayerState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState & Double] = js.native
    
    /* 2 */ val buffering: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.buffering & Double = js.native
    
    /* 0 */ val closed: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.closed & Double = js.native
    
    /* 1 */ val opening: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.opening & Double = js.native
    
    /* 4 */ val paused: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.paused & Double = js.native
    
    /* 3 */ val playing: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.playing & Double = js.native
    
    /* 5 */ val stopped: typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlayerState.stopped & Double = js.native
  }
  
  /** Represents a marker at specific location in a media stream time-line. */
  @JSGlobal("Windows.Media.Playback.PlaybackMediaMarker")
  @js.native
  open class PlaybackMediaMarker protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarker {
    /**
      * Initializes a new instance of the PlaybackMediaMarker class with the specified offset into the media timeline.
      * @param value The media marker's offset into the media timeline.
      */
    def this(value: Double) = this()
    /**
      * Initializes a new instance of the PlaybackMediaMarker class with the specified offset into the media timeline, type string, and text.
      * @param value The media marker's offset into the media timeline.
      * @param mediaMarketType The type of the media marker.
      * @param text The text of the media marker.
      */
    def this(value: Double, mediaMarketType: String, text: String) = this()
    
    /** Gets the type of the media marker. */
    /* CompleteClass */
    var mediaMarkerType: String = js.native
    
    /** Gets the text associated with the marker. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets the offset in the media timeline where the marker occurs. */
    /* CompleteClass */
    var time: Double = js.native
  }
  
  /** Provides data for PlaybackMediaMarkerReached events. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.PlaybackMediaMarkerReachedEventArgs")
  @js.native
  open class PlaybackMediaMarkerReachedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarkerReachedEventArgs {
    
    /** Gets the PlaybackMediaMarker that was reached. */
    /* CompleteClass */
    var playbackMediaMarker: typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarker = js.native
  }
  
  /** An ordered collection of PlaybackMediaMarker objects. */
  @JSGlobal("Windows.Media.Playback.PlaybackMediaMarkerSequence")
  @js.native
  /** Initializes a new instance of the PlaybackMediaMarkerSequence class. */
  open class PlaybackMediaMarkerSequence ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarkerSequence {
    
    /** Removes all elements from the sequence. */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
      * @return Iterator pointing at the first media marker in the sequence.
      */
    /* CompleteClass */
    override def first(): IIterator[typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarker] = js.native
    
    /**
      * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
      * @param value The media marker to insert into the sequence.
      */
    /* CompleteClass */
    override def insert(value: typingsJapgolly.winrtUwp.Windows.Media.Playback.PlaybackMediaMarker): Unit = js.native
    
    /** Returns the number of items in the sequence. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs")
  @js.native
  open class TimedMetadataPresentationModeChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs {
    
    /** Gets the new presentation mode. */
    /* CompleteClass */
    var newPresentationMode: TimedMetadataTrackPresentationMode = js.native
    
    /** Gets the old presentation mode. */
    /* CompleteClass */
    var oldPresentationMode: TimedMetadataTrackPresentationMode = js.native
    
    /** Gets the TimedMetadataTrack associated with the presentation mode change. */
    /* CompleteClass */
    var track: TimedMetadataTrack = js.native
  }
  
  /** Specifies the presentation mode of a timed metadata track. */
  @JSGlobal("Windows.Media.Playback.TimedMetadataTrackPresentationMode")
  @js.native
  object TimedMetadataTrackPresentationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode & Double
      ] = js.native
    
    /* 2 */ val applicationPresented: typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.applicationPresented & Double = js.native
    
    /* 0 */ val disabled: typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.disabled & Double = js.native
    
    /* 1 */ val hidden: typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.hidden & Double = js.native
    
    /* 3 */ val platformPresented: typingsJapgolly.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.platformPresented & Double = js.native
  }
  
  @JSGlobal("Windows.Media.Playback.ateChangeRequestedEventArgs")
  @js.native
  def ateChangeRequestedEventArgs: Any = js.native
  inline def ateChangeRequestedEventArgs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ateChangeRequestedEventArgs")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Playback.ositionChangeRequestedEventArgs")
  @js.native
  def ositionChangeRequestedEventArgs: Any = js.native
  inline def ositionChangeRequestedEventArgs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ositionChangeRequestedEventArgs")(x.asInstanceOf[js.Any])
}
