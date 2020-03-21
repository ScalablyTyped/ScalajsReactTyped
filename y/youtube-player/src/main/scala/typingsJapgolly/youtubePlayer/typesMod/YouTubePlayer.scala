package typingsJapgolly.youtubePlayer.typesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLIFrameElement
import typingsJapgolly.youtubePlayer.AnonEndSeconds
import typingsJapgolly.youtubePlayer.AnonIndex
import typingsJapgolly.youtubePlayer.AnonMediaContentUrl
import typingsJapgolly.youtubePlayer.CustomEventanydatanumber
import typingsJapgolly.youtubePlayer.eventNamesMod.EventType
import typingsJapgolly.youtubePlayer.playerStatesMod.PlayerStates
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubePlayer extends js.Object {
  def addEventListener(event: String, listener: js.Function1[/* event */ CustomEvent, Unit]): Unit = js.native
  def cuePlaylist(playlist: String): Unit = js.native
  def cuePlaylist(playlist: String, index: Double): Unit = js.native
  def cuePlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
  def cuePlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def cuePlaylist(playlist: js.Array[String]): Unit = js.native
  def cuePlaylist(playlist: js.Array[String], index: Double): Unit = js.native
  def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
  def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def cuePlaylist(playlist: AnonIndex): Unit = js.native
  def cueVideoById(videoId: String): Unit = js.native
  def cueVideoById(videoId: String, startSeconds: Double): Unit = js.native
  def cueVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def cueVideoById(video: AnonEndSeconds): Unit = js.native
  def cueVideoByUrl(mediaContentUrl: String): Unit = js.native
  def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
  def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def cueVideoByUrl(video: AnonMediaContentUrl): Unit = js.native
  def destroy(): Unit = js.native
  def getAvailablePlaybackRates(): js.Array[Double] = js.native
  def getAvailableQualityLevels(): js.Array[String] = js.native
  def getCurrentTime(): Double = js.native
  def getDuration(): Double = js.native
  def getIframe(): HTMLIFrameElement = js.native
  def getOption(module: String, option: String): js.Any = js.native
  def getOptions(): js.Array[String] = js.native
  def getOptions(module: String): js.Object = js.native
  def getPlaybackQuality(): String = js.native
  def getPlaybackRate(): Double = js.native
  def getPlayerState(): PlayerStates = js.native
  def getPlaylist(): js.Array[String] = js.native
  def getPlaylistIndex(): Double = js.native
  def getVideoEmbedCode(): String = js.native
  def getVideoLoadedFraction(): Double = js.native
  def getVideoUrl(): String = js.native
  def getVolume(): Double = js.native
  def isMuted(): Boolean = js.native
  def loadPlaylist(playlist: String): Unit = js.native
  def loadPlaylist(playlist: String, index: Double): Unit = js.native
  def loadPlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
  def loadPlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def loadPlaylist(playlist: js.Array[String]): Unit = js.native
  def loadPlaylist(playlist: js.Array[String], index: Double): Unit = js.native
  def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
  def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def loadPlaylist(playlist: AnonIndex): Unit = js.native
  def loadVideoById(videoId: String): Unit = js.native
  def loadVideoById(videoId: String, startSeconds: Double): Unit = js.native
  def loadVideoById(videoId: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def loadVideoById(video: AnonEndSeconds): Unit = js.native
  def loadVideoByUrl(mediaContentUrl: String): Unit = js.native
  def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
  def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: String): Unit = js.native
  def loadVideoByUrl(video: AnonMediaContentUrl): Unit = js.native
  def mute(): Unit = js.native
  def nextVideo(): Unit = js.native
  def on(eventType: EventType, listener: js.Function1[/* event */ CustomEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_stateChange(eventType: stateChange, listener: js.Function1[/* event */ CustomEventanydatanumber, Unit]): Unit = js.native
  def pauseVideo(): Unit = js.native
  def playVideo(): Unit = js.native
  def playVideoAt(index: Double): Unit = js.native
  def previousVideo(): Unit = js.native
  def removeEventListener(event: String, listener: js.Function1[/* event */ CustomEvent, Unit]): Unit = js.native
  def seekTo(seconds: Double, allowSeekAhead: Boolean): Unit = js.native
  def setLoop(loopPlaylists: Boolean): Unit = js.native
  def setOption(module: String, option: String, value: js.Any): Unit = js.native
  def setOptions(): Unit = js.native
  def setPlaybackQuality(suggestedQuality: String): Unit = js.native
  def setPlaybackRate(suggestedRate: Double): Unit = js.native
  def setShuffle(shufflePlaylist: Boolean): Unit = js.native
  def setSize(width: Double, height: Double): js.Object = js.native
  def setVolume(volume: Double): Unit = js.native
  def stopVideo(): Unit = js.native
  def unMute(): Unit = js.native
}

