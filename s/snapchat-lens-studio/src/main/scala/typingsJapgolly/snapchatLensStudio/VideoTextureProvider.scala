package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a video texture resource. Can be accessed through Texture.control. Lens Studio v1.5.0+ */
trait VideoTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Returns the number of times the video has played consecutively. */
  def getCurrentPlayCount(): Double
  
  /** Returns the status of the video resource. */
  def getStatus(): VideoStatus
  
  /** Pauses the video playback. */
  def pause(): Unit
  
  /** Plays the video playCount times. If playCount is less than 0, it loops infinitely. */
  def play(playCount: Double): Unit
  
  /** Resumes the video playback. */
  def resume(): Unit
  
  /** Sets callback as the function invoked when the video resource stops playing. */
  def setOnFinish(callback: js.Function0[Unit]): Unit
  
  /** Sets callback as the function invoked when the video resource is ready to be played. */
  def setOnReady(onReadyCallback: js.Function0[Unit]): Unit
  
  /** Stops the video playback. */
  def stop(): Unit
  
  /** The audio volume of the video resource, normalized from 0 to 1. */
  var volume: Double
}
object VideoTextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getCurrentPlayCount: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getStatus: CallbackTo[VideoStatus],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean,
    pause: Callback,
    play: Double => Callback,
    resume: Callback,
    setOnFinish: js.Function0[Unit] => Callback,
    setOnReady: js.Function0[Unit] => Callback,
    stop: Callback,
    volume: Double
  ): VideoTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getCurrentPlayCount = getCurrentPlayCount.toJsFn, getHeight = getHeight.toJsFn, getStatus = getStatus.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType), pause = pause.toJsFn, play = js.Any.fromFunction1((t0: Double) => play(t0).runNow()), resume = resume.toJsFn, setOnFinish = js.Any.fromFunction1((t0: js.Function0[Unit]) => setOnFinish(t0).runNow()), setOnReady = js.Any.fromFunction1((t0: js.Function0[Unit]) => setOnReady(t0).runNow()), stop = stop.toJsFn, volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureProvider]
  }
  
  extension [Self <: VideoTextureProvider](x: Self) {
    
    inline def setGetCurrentPlayCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentPlayCount", value.toJsFn)
    
    inline def setGetStatus(value: CallbackTo[VideoStatus]): Self = StObject.set(x, "getStatus", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Double => Callback): Self = StObject.set(x, "play", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSetOnFinish(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setOnFinish", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setSetOnReady(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setOnReady", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
