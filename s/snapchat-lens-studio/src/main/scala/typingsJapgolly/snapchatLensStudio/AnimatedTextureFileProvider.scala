package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls an animated texture resource. Can be accessed from Texture.control on an animated texture. See also: 2D Animation Guide. */
trait AnimatedTextureFileProvider
  extends StObject
     with TextureProvider {
  
  /** Returns the index of the frame that is currently playing. */
  def getCurrentPlayingFrame(): Double
  
  /** Returns how long the animation is in seconds. */
  def getDuration(): Double
  
  /** Returns the number of frames in the animation. */
  def getFramesCount(): Double
  
  /** Returns whether the animation was set to automatically play and loop. */
  var isAutoplay: Boolean
  
  /** Returns whether the animation is finished playing. */
  def isFinished(): Boolean
  
  /** Returns whether the animation is currently paused. */
  def isPaused(): Boolean
  
  /** If enabled, the animation will alternate between normal and reverse each time it loops. */
  var isPingPong: Boolean
  
  /** Returns whether the animation is currently playing. */
  def isPlaying(): Boolean
  
  /** Whether the animation plays in reverse. */
  var isReversed: Boolean
  
  /** Pauses the animation. */
  def pause(): Unit
  
  /** Pauses the animation at frame frameIndex. */
  def pauseAtFrame(frameIndex: Double): Unit
  
  /** Plays the animation loops times, starting with an offset of offset seconds. */
  def play(loops: Double, offset: Double): Unit
  
  /** Start playing the animation from frame frameIndex, loops times. */
  def playFromFrame(frameIndex: Double, loops: Double): Unit
  
  /** Resumes a paused animation from the frame that was last played. */
  def resume(): Unit
  
  /** Sets the callback function to be called whenever the animation stops playing. */
  def setOnFinish(eventCallback: js.Function1[/* animatedTexture */ this.type, Unit]): Unit
  
  /** Stops the animation. */
  def stop(): Unit
  
  /** The animation track used to control the frame animation. */
  var track: IntStepAnimationTrackKeyFramed
}
object AnimatedTextureFileProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getCurrentPlayingFrame: CallbackTo[Double],
    getDuration: CallbackTo[Double],
    getFramesCount: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isAutoplay: Boolean,
    isFinished: CallbackTo[Boolean],
    isOfType: String => Boolean,
    isPaused: CallbackTo[Boolean],
    isPingPong: Boolean,
    isPlaying: CallbackTo[Boolean],
    isReversed: Boolean,
    pause: Callback,
    pauseAtFrame: Double => Callback,
    play: (Double, Double) => Callback,
    playFromFrame: (Double, Double) => Callback,
    resume: Callback,
    setOnFinish: js.Function1[AnimatedTextureFileProvider, Unit] => Callback,
    stop: Callback,
    track: IntStepAnimationTrackKeyFramed
  ): AnimatedTextureFileProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getCurrentPlayingFrame = getCurrentPlayingFrame.toJsFn, getDuration = getDuration.toJsFn, getFramesCount = getFramesCount.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isAutoplay = isAutoplay.asInstanceOf[js.Any], isFinished = isFinished.toJsFn, isOfType = js.Any.fromFunction1(isOfType), isPaused = isPaused.toJsFn, isPingPong = isPingPong.asInstanceOf[js.Any], isPlaying = isPlaying.toJsFn, isReversed = isReversed.asInstanceOf[js.Any], pause = pause.toJsFn, pauseAtFrame = js.Any.fromFunction1((t0: Double) => pauseAtFrame(t0).runNow()), play = js.Any.fromFunction2((t0: Double, t1: Double) => (play(t0, t1)).runNow()), playFromFrame = js.Any.fromFunction2((t0: Double, t1: Double) => (playFromFrame(t0, t1)).runNow()), resume = resume.toJsFn, setOnFinish = js.Any.fromFunction1((t0: js.Function1[AnimatedTextureFileProvider, Unit]) => setOnFinish(t0).runNow()), stop = stop.toJsFn, track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedTextureFileProvider]
  }
  
  extension [Self <: AnimatedTextureFileProvider](x: Self) {
    
    inline def setGetCurrentPlayingFrame(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentPlayingFrame", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetFramesCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFramesCount", value.toJsFn)
    
    inline def setIsAutoplay(value: Boolean): Self = StObject.set(x, "isAutoplay", value.asInstanceOf[js.Any])
    
    inline def setIsFinished(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFinished", value.toJsFn)
    
    inline def setIsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPaused", value.toJsFn)
    
    inline def setIsPingPong(value: Boolean): Self = StObject.set(x, "isPingPong", value.asInstanceOf[js.Any])
    
    inline def setIsPlaying(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPlaying", value.toJsFn)
    
    inline def setIsReversed(value: Boolean): Self = StObject.set(x, "isReversed", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPauseAtFrame(value: Double => Callback): Self = StObject.set(x, "pauseAtFrame", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPlay(value: (Double, Double) => Callback): Self = StObject.set(x, "play", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPlayFromFrame(value: (Double, Double) => Callback): Self = StObject.set(x, "playFromFrame", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSetOnFinish(value: js.Function1[AnimatedTextureFileProvider, Unit] => Callback): Self = StObject.set(x, "setOnFinish", js.Any.fromFunction1((t0: js.Function1[AnimatedTextureFileProvider, Unit]) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setTrack(value: IntStepAnimationTrackKeyFramed): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
