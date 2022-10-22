package typingsJapgolly.youtubePlayer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.youtubePlayer.anon.Autoplay
import typingsJapgolly.youtubePlayer.anon.CustomEventanydatanumber
import typingsJapgolly.youtubePlayer.anon.EndSeconds
import typingsJapgolly.youtubePlayer.anon.Index
import typingsJapgolly.youtubePlayer.anon.Instantiable
import typingsJapgolly.youtubePlayer.anon.MediaContentUrl
import typingsJapgolly.youtubePlayer.anon.eventTypeinEventTypeevent
import typingsJapgolly.youtubePlayer.distConstantsPlayerStatesMod.PlayerStates
import typingsJapgolly.youtubePlayer.distEventNamesMod.EventType
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait EmitterType extends StObject {
    
    def trigger(eventName: String, event: js.Object): Unit
  }
  object EmitterType {
    
    inline def apply(trigger: (String, js.Object) => Callback): EmitterType = {
      val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2((t0: String, t1: js.Object) => (trigger(t0, t1)).runNow()))
      __obj.asInstanceOf[EmitterType]
    }
    
    extension [Self <: EmitterType](x: Self) {
      
      inline def setTrigger(value: (String, js.Object) => Callback): Self = StObject.set(x, "trigger", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    }
  }
  
  trait IframeApiType extends StObject {
    
    var Player: Instantiable
  }
  object IframeApiType {
    
    inline def apply(Player: Instantiable): IframeApiType = {
      val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
      __obj.asInstanceOf[IframeApiType]
    }
    
    extension [Self <: IframeApiType](x: Self) {
      
      inline def setPlayer(value: Instantiable): Self = StObject.set(x, "Player", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var events: js.UndefOr[eventTypeinEventTypeevent] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var playerVars: js.UndefOr[Autoplay] = js.undefined
    
    var videoId: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEvents(value: eventTypeinEventTypeevent): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPlayerVars(value: Autoplay): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      inline def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait YouTubePlayer extends StObject {
    
    def addEventListener(event: String, listener: js.Function1[/* event */ CustomEvent, Unit]): js.Promise[Unit] = js.native
    
    def cuePlaylist(playlist: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String]): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cuePlaylist(playlist: Index): js.Promise[Unit] = js.native
    
    def cueVideoById(videoId: String): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Double): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoById(video: EndSeconds): js.Promise[Unit] = js.native
    
    def cueVideoByUrl(mediaContentUrl: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def cueVideoByUrl(video: MediaContentUrl): js.Promise[Unit] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def getAvailablePlaybackRates(): js.Promise[js.Array[Double]] = js.native
    
    def getAvailableQualityLevels(): js.Promise[js.Array[String]] = js.native
    
    def getCurrentTime(): js.Promise[Double] = js.native
    
    def getDuration(): js.Promise[Double] = js.native
    
    def getIframe(): js.Promise[HTMLIFrameElement] = js.native
    
    def getOption(module: String, option: String): js.Promise[Any] = js.native
    
    def getOptions(): js.Promise[js.Array[String]] = js.native
    def getOptions(module: String): js.Promise[js.Object] = js.native
    
    def getPlaybackQuality(): js.Promise[String] = js.native
    
    def getPlaybackRate(): js.Promise[Double] = js.native
    
    def getPlayerState(): js.Promise[PlayerStates] = js.native
    
    def getPlaylist(): js.Promise[js.Array[String]] = js.native
    
    def getPlaylistIndex(): js.Promise[Double] = js.native
    
    def getVideoEmbedCode(): js.Promise[String] = js.native
    
    def getVideoLoadedFraction(): js.Promise[Double] = js.native
    
    def getVideoUrl(): js.Promise[String] = js.native
    
    def getVolume(): js.Promise[Double] = js.native
    
    def isMuted(): js.Promise[Boolean] = js.native
    
    def loadPlaylist(playlist: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: String, index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String]): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: js.Array[String], index: Unit, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadPlaylist(playlist: Index): js.Promise[Unit] = js.native
    
    def loadVideoById(videoId: String): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Double): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoById(videoId: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoById(video: EndSeconds): js.Promise[Unit] = js.native
    
    def loadVideoByUrl(mediaContentUrl: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(mediaContentUrl: String, startSeconds: Unit, suggestedQuality: String): js.Promise[Unit] = js.native
    def loadVideoByUrl(video: MediaContentUrl): js.Promise[Unit] = js.native
    
    def mute(): js.Promise[Unit] = js.native
    
    def nextVideo(): js.Promise[Unit] = js.native
    
    def on(eventType: EventType, listener: js.Function1[/* event */ CustomEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_stateChange(eventType: stateChange, listener: js.Function1[/* event */ CustomEventanydatanumber, Unit]): Unit = js.native
    
    def pauseVideo(): js.Promise[Unit] = js.native
    
    def playVideo(): js.Promise[Unit] = js.native
    
    def playVideoAt(index: Double): js.Promise[Unit] = js.native
    
    def previousVideo(): js.Promise[Unit] = js.native
    
    def removeEventListener(event: String, listener: js.Function1[/* event */ CustomEvent, Unit]): js.Promise[Unit] = js.native
    
    def seekTo(seconds: Double, allowSeekAhead: Boolean): js.Promise[Unit] = js.native
    
    def setLoop(loopPlaylists: Boolean): js.Promise[Unit] = js.native
    
    def setOption(module: String, option: String, value: Any): js.Promise[Unit] = js.native
    
    def setOptions(): js.Promise[Unit] = js.native
    
    def setPlaybackQuality(suggestedQuality: String): js.Promise[Unit] = js.native
    
    def setPlaybackRate(suggestedRate: Double): js.Promise[Unit] = js.native
    
    def setShuffle(shufflePlaylist: Boolean): js.Promise[Unit] = js.native
    
    def setSize(width: Double, height: Double): js.Promise[js.Object] = js.native
    
    def setVolume(volume: Double): js.Promise[Unit] = js.native
    
    def stopVideo(): js.Promise[Unit] = js.native
    
    def unMute(): js.Promise[Unit] = js.native
  }
}
