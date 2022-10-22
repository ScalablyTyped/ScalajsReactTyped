package typingsJapgolly.playerframework.PlayerFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  trait AudioSelectorPlugin
    extends StObject
       with PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement
    
    def hide(): Unit
    
    /**
      * Not available in phone.
      **/
    var placement: String
    
    def show(): Unit
  }
  object AudioSelectorPlugin {
    
    inline def apply(
      alignment: String,
      anchor: HTMLElement,
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      placement: String,
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): AudioSelectorPlugin = {
      val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[AudioSelectorPlugin]
    }
    
    extension [Self <: AudioSelectorPlugin](x: Self) {
      
      inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait BufferingPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object BufferingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): BufferingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[BufferingPlugin]
    }
    
    extension [Self <: BufferingPlugin](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait CaptionSelectorPlugin
    extends StObject
       with PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement
    
    def hide(): Unit
    
    /**
      * Not available in phone.
      **/
    var placement: String
    
    def show(): Unit
  }
  object CaptionSelectorPlugin {
    
    inline def apply(
      alignment: String,
      anchor: HTMLElement,
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      placement: String,
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): CaptionSelectorPlugin = {
      val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[CaptionSelectorPlugin]
    }
    
    extension [Self <: CaptionSelectorPlugin](x: Self) {
      
      inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ChaptersPlugin
    extends StObject
       with PluginBase {
    
    var autoCreateChaptersFromTextTracks: Boolean
    
    var autoCreateDefaultChapters: Boolean
    
    var defaultChapterCount: Double
    
    var visualMarkerClass: String
  }
  object ChaptersPlugin {
    
    inline def apply(
      autoCreateChaptersFromTextTracks: Boolean,
      autoCreateDefaultChapters: Boolean,
      currentMediaSource: MediaSource,
      defaultChapterCount: Double,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      unload: Callback,
      update: MediaSource => Callback,
      visualMarkerClass: String
    ): ChaptersPlugin = {
      val __obj = js.Dynamic.literal(autoCreateChaptersFromTextTracks = autoCreateChaptersFromTextTracks.asInstanceOf[js.Any], autoCreateDefaultChapters = autoCreateDefaultChapters.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], defaultChapterCount = defaultChapterCount.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()), visualMarkerClass = visualMarkerClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChaptersPlugin]
    }
    
    extension [Self <: ChaptersPlugin](x: Self) {
      
      inline def setAutoCreateChaptersFromTextTracks(value: Boolean): Self = StObject.set(x, "autoCreateChaptersFromTextTracks", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateDefaultChapters(value: Boolean): Self = StObject.set(x, "autoCreateDefaultChapters", value.asInstanceOf[js.Any])
      
      inline def setDefaultChapterCount(value: Double): Self = StObject.set(x, "defaultChapterCount", value.asInstanceOf[js.Any])
      
      inline def setVisualMarkerClass(value: String): Self = StObject.set(x, "visualMarkerClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlPlugin
    extends StObject
       with PluginBase {
    
    def compactThresholdInInches(): Double
    
    def hide(): Unit
    
    def isCompact(): Boolean
    
    def orientation(): String
    
    def show(): Unit
  }
  object ControlPlugin {
    
    inline def apply(
      compactThresholdInInches: CallbackTo[Double],
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isCompact: CallbackTo[Boolean],
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      orientation: CallbackTo[String],
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): ControlPlugin = {
      val __obj = js.Dynamic.literal(compactThresholdInInches = compactThresholdInInches.toJsFn, currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isCompact = isCompact.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], orientation = orientation.toJsFn, show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[ControlPlugin]
    }
    
    extension [Self <: ControlPlugin](x: Self) {
      
      inline def setCompactThresholdInInches(value: CallbackTo[Double]): Self = StObject.set(x, "compactThresholdInInches", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsCompact(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCompact", value.toJsFn)
      
      inline def setOrientation(value: CallbackTo[String]): Self = StObject.set(x, "orientation", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait DisplayRequestPlugin
    extends StObject
       with PluginBase {
    
    var isRequestActive: Boolean
  }
  object DisplayRequestPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      isRequestActive: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      unload: Callback,
      update: MediaSource => Callback
    ): DisplayRequestPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isRequestActive = isRequestActive.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[DisplayRequestPlugin]
    }
    
    extension [Self <: DisplayRequestPlugin](x: Self) {
      
      inline def setIsRequestActive(value: Boolean): Self = StObject.set(x, "isRequestActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ErrorPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): ErrorPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[ErrorPlugin]
    }
    
    extension [Self <: ErrorPlugin](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait LoaderPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object LoaderPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      show: Callback,
      unload: Callback,
      update: MediaSource => Callback
    ): LoaderPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = hide.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = show.toJsFn, unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[LoaderPlugin]
    }
    
    extension [Self <: LoaderPlugin](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait PlayTimeTrackingPlugin
    extends StObject
       with PluginBase {
    
    var playTime: Double
    
    var playTimePercentage: Double
  }
  object PlayTimeTrackingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      playTime: Double,
      playTimePercentage: Double,
      unload: Callback,
      update: MediaSource => Callback
    ): PlayTimeTrackingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any], playTimePercentage = playTimePercentage.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[PlayTimeTrackingPlugin]
    }
    
    extension [Self <: PlayTimeTrackingPlugin](x: Self) {
      
      inline def setPlayTime(value: Double): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
      
      inline def setPlayTimePercentage(value: Double): Self = StObject.set(x, "playTimePercentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *
    **/
  trait PlaylistPlugin
    extends StObject
       with PluginBase {
    
    /**
      *
      **/
    var autoAdvance: Boolean
    
    def canGoToNextPlaylistItem(): Boolean
    
    def canGoToPreviousPlaylistItem(): Boolean
    
    /**
      *
      **/
    var currentPlaylistItem: PlaylistItem
    
    /**
      *
      **/
    var currentPlaylistItemIndex: Double
    
    def goToNextPlaylistItem(): Unit
    
    // Methods
    def goToPreviousPlaylistItem(): Unit
    
    /**
      *
      **/
    var playlist: js.Array[PlaylistItem]
    
    /**
      *
      **/
    var skipBackThreshold: Double
    
    /**
      *
      **/
    var startupPlaylistItemIndex: Double
  }
  object PlaylistPlugin {
    
    inline def apply(
      autoAdvance: Boolean,
      canGoToNextPlaylistItem: CallbackTo[Boolean],
      canGoToPreviousPlaylistItem: CallbackTo[Boolean],
      currentMediaSource: MediaSource,
      currentPlaylistItem: PlaylistItem,
      currentPlaylistItemIndex: Double,
      goToNextPlaylistItem: Callback,
      goToPreviousPlaylistItem: Callback,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      playlist: js.Array[PlaylistItem],
      skipBackThreshold: Double,
      startupPlaylistItemIndex: Double,
      unload: Callback,
      update: MediaSource => Callback
    ): PlaylistPlugin = {
      val __obj = js.Dynamic.literal(autoAdvance = autoAdvance.asInstanceOf[js.Any], canGoToNextPlaylistItem = canGoToNextPlaylistItem.toJsFn, canGoToPreviousPlaylistItem = canGoToPreviousPlaylistItem.toJsFn, currentMediaSource = currentMediaSource.asInstanceOf[js.Any], currentPlaylistItem = currentPlaylistItem.asInstanceOf[js.Any], currentPlaylistItemIndex = currentPlaylistItemIndex.asInstanceOf[js.Any], goToNextPlaylistItem = goToNextPlaylistItem.toJsFn, goToPreviousPlaylistItem = goToPreviousPlaylistItem.toJsFn, isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], skipBackThreshold = skipBackThreshold.asInstanceOf[js.Any], startupPlaylistItemIndex = startupPlaylistItemIndex.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[PlaylistPlugin]
    }
    
    extension [Self <: PlaylistPlugin](x: Self) {
      
      inline def setAutoAdvance(value: Boolean): Self = StObject.set(x, "autoAdvance", value.asInstanceOf[js.Any])
      
      inline def setCanGoToNextPlaylistItem(value: CallbackTo[Boolean]): Self = StObject.set(x, "canGoToNextPlaylistItem", value.toJsFn)
      
      inline def setCanGoToPreviousPlaylistItem(value: CallbackTo[Boolean]): Self = StObject.set(x, "canGoToPreviousPlaylistItem", value.toJsFn)
      
      inline def setCurrentPlaylistItem(value: PlaylistItem): Self = StObject.set(x, "currentPlaylistItem", value.asInstanceOf[js.Any])
      
      inline def setCurrentPlaylistItemIndex(value: Double): Self = StObject.set(x, "currentPlaylistItemIndex", value.asInstanceOf[js.Any])
      
      inline def setGoToNextPlaylistItem(value: Callback): Self = StObject.set(x, "goToNextPlaylistItem", value.toJsFn)
      
      inline def setGoToPreviousPlaylistItem(value: Callback): Self = StObject.set(x, "goToPreviousPlaylistItem", value.toJsFn)
      
      inline def setPlaylist(value: js.Array[PlaylistItem]): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistVarargs(value: PlaylistItem*): Self = StObject.set(x, "playlist", js.Array(value*))
      
      inline def setSkipBackThreshold(value: Double): Self = StObject.set(x, "skipBackThreshold", value.asInstanceOf[js.Any])
      
      inline def setStartupPlaylistItemIndex(value: Double): Self = StObject.set(x, "startupPlaylistItemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionTrackingPlugin
    extends StObject
       with PluginBase {
    
    var evaluateOnForwardOnly: Boolean
    
    var position: Double
    
    var positionPercentage: Double
  }
  object PositionTrackingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      evaluateOnForwardOnly: Boolean,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      position: Double,
      positionPercentage: Double,
      unload: Callback,
      update: MediaSource => Callback
    ): PositionTrackingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], evaluateOnForwardOnly = evaluateOnForwardOnly.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionPercentage = positionPercentage.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[PositionTrackingPlugin]
    }
    
    extension [Self <: PositionTrackingPlugin](x: Self) {
      
      inline def setEvaluateOnForwardOnly(value: Boolean): Self = StObject.set(x, "evaluateOnForwardOnly", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionPercentage(value: Double): Self = StObject.set(x, "positionPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait SystemTransportControlsPlugin
    extends StObject
       with PluginBase {
    
    var isNextTrackEnabled: Boolean
    
    var isPreviousTrackEnabled: Boolean
    
    var nextTrackExists: Boolean
    
    var previousTrackExists: Boolean
  }
  object SystemTransportControlsPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      isNextTrackEnabled: Boolean,
      isPreviousTrackEnabled: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      nextTrackExists: Boolean,
      previousTrackExists: Boolean,
      unload: Callback,
      update: MediaSource => Callback
    ): SystemTransportControlsPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isNextTrackEnabled = isNextTrackEnabled.asInstanceOf[js.Any], isPreviousTrackEnabled = isPreviousTrackEnabled.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], nextTrackExists = nextTrackExists.asInstanceOf[js.Any], previousTrackExists = previousTrackExists.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[SystemTransportControlsPlugin]
    }
    
    extension [Self <: SystemTransportControlsPlugin](x: Self) {
      
      inline def setIsNextTrackEnabled(value: Boolean): Self = StObject.set(x, "isNextTrackEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsPreviousTrackEnabled(value: Boolean): Self = StObject.set(x, "isPreviousTrackEnabled", value.asInstanceOf[js.Any])
      
      inline def setNextTrackExists(value: Boolean): Self = StObject.set(x, "nextTrackExists", value.asInstanceOf[js.Any])
      
      inline def setPreviousTrackExists(value: Boolean): Self = StObject.set(x, "previousTrackExists", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackingPluginBase
    extends StObject
       with PluginBase {
    
    var trackingEvents: js.Array[Any]
  }
  object TrackingPluginBase {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: Callback,
      mediaPlayer: MediaPlayer,
      trackingEvents: js.Array[Any],
      unload: Callback,
      update: MediaSource => Callback
    ): TrackingPluginBase = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
      __obj.asInstanceOf[TrackingPluginBase]
    }
    
    extension [Self <: TrackingPluginBase](x: Self) {
      
      inline def setTrackingEvents(value: js.Array[Any]): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
      
      inline def setTrackingEventsVarargs(value: Any*): Self = StObject.set(x, "trackingEvents", js.Array(value*))
    }
  }
}
