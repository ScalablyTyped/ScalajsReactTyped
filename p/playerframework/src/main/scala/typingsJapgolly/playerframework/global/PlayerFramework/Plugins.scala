package typingsJapgolly.playerframework.global.PlayerFramework

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playerframework.PlayerFramework.PlaylistItem
import typingsJapgolly.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  @JSGlobal("PlayerFramework.Plugins.AudioSelectorPlugin")
  @js.native
  open class AudioSelectorPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.AudioSelectorPlugin {
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var alignment: String = js.native
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var anchor: HTMLElement = js.native
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var placement: String = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.BufferingPlugin")
  @js.native
  open class BufferingPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.BufferingPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.CaptionSelectorPlugin")
  @js.native
  open class CaptionSelectorPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.CaptionSelectorPlugin {
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var alignment: String = js.native
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var anchor: HTMLElement = js.native
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    var placement: String = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.ChaptersPlugin")
  @js.native
  open class ChaptersPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.ChaptersPlugin {
    
    /* CompleteClass */
    var autoCreateChaptersFromTextTracks: Boolean = js.native
    
    /* CompleteClass */
    var autoCreateDefaultChapters: Boolean = js.native
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var defaultChapterCount: Double = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
    
    /* CompleteClass */
    var visualMarkerClass: String = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.ControlPlugin")
  @js.native
  open class ControlPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.ControlPlugin {
    
    /* CompleteClass */
    override def compactThresholdInInches(): Double = js.native
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    override def isCompact(): Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def orientation(): String = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.DisplayRequestPlugin")
  @js.native
  open class DisplayRequestPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.DisplayRequestPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    var isRequestActive: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.ErrorPlugin")
  @js.native
  open class ErrorPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.ErrorPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.LoaderPlugin")
  @js.native
  open class LoaderPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.LoaderPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.PlayTimeTrackingPlugin")
  @js.native
  open class PlayTimeTrackingPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.PlayTimeTrackingPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    var playTime: Double = js.native
    
    /* CompleteClass */
    var playTimePercentage: Double = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  /**
    *
    **/
  @JSGlobal("PlayerFramework.Plugins.PlaylistPlugin")
  @js.native
  open class PlaylistPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.PlaylistPlugin {
    
    /**
      *
      **/
    /* CompleteClass */
    var autoAdvance: Boolean = js.native
    
    /* CompleteClass */
    override def canGoToNextPlaylistItem(): Boolean = js.native
    
    /* CompleteClass */
    override def canGoToPreviousPlaylistItem(): Boolean = js.native
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /**
      *
      **/
    /* CompleteClass */
    var currentPlaylistItem: PlaylistItem = js.native
    
    /**
      *
      **/
    /* CompleteClass */
    var currentPlaylistItemIndex: Double = js.native
    
    /* CompleteClass */
    override def goToNextPlaylistItem(): Unit = js.native
    
    // Methods
    /* CompleteClass */
    override def goToPreviousPlaylistItem(): Unit = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /**
      *
      **/
    /* CompleteClass */
    var playlist: js.Array[PlaylistItem] = js.native
    
    /**
      *
      **/
    /* CompleteClass */
    var skipBackThreshold: Double = js.native
    
    /**
      *
      **/
    /* CompleteClass */
    var startupPlaylistItemIndex: Double = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.PositionTrackingPlugin")
  @js.native
  open class PositionTrackingPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.PositionTrackingPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var evaluateOnForwardOnly: Boolean = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    var positionPercentage: Double = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.SystemTransportControlsPlugin")
  @js.native
  open class SystemTransportControlsPlugin ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.SystemTransportControlsPlugin {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    var isNextTrackEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isPreviousTrackEnabled: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    var nextTrackExists: Boolean = js.native
    
    /* CompleteClass */
    var previousTrackExists: Boolean = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @JSGlobal("PlayerFramework.Plugins.TrackingPluginBase")
  @js.native
  open class TrackingPluginBase ()
    extends StObject
       with typingsJapgolly.playerframework.PlayerFramework.Plugins.TrackingPluginBase {
    
    /* CompleteClass */
    var currentMediaSource: MediaSource = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isLoaded: Boolean = js.native
    
    /* CompleteClass */
    override def load(): Unit = js.native
    
    /* CompleteClass */
    var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
    
    /* CompleteClass */
    var trackingEvents: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def unload(): Unit = js.native
    
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
}
