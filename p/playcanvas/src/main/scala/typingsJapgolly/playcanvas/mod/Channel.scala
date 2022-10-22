package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../sound/sound.js').Sound} Sound */
/** @typedef {import('../sound/manager.js').SoundManager} SoundManager */
/**
  * A channel is created when the {@link SoundManager} begins playback of a {@link Sound}. Usually
  * created internally by {@link SoundManager#playSound} or {@link SoundManager#playSound3d}.
  * Developers usually won't have to create Channels manually.
  *
  * @ignore
  */
trait Channel extends StObject {
  
  def _createSource(): Unit
  
  var gain: GainNode
  
  def getDuration(): Any
  
  /**
    * Get the current looping state of the Channel.
    *
    * @returns {boolean} The loop property for the channel.
    */
  def getLoop(): Boolean
  
  /**
    * Get the current pitch of the Channel.
    *
    * @returns {number} The pitch of the channel.
    */
  def getPitch(): Double
  
  /**
    * Get the current value for the volume. Between 0 and 1.
    *
    * @returns {number} The volume of the channel.
    */
  def getVolume(): Double
  
  def isPlaying(): Boolean
  
  var loop: Boolean
  
  var manager: SoundManager
  
  /**
    * Handle the manager's 'resume' event.
    */
  def onManagerResume(): Unit
  
  /**
    * Handle the manager's 'suspend' event.
    */
  def onManagerSuspend(): Unit
  
  /**
    * Handle the manager's 'volumechange' event.
    */
  def onManagerVolumeChange(): Unit
  
  /**
    * Pause playback of sound. Call unpause() to resume playback from the same position.
    */
  def pause(): Unit
  
  var paused: Boolean
  
  var pitch: Double
  
  /**
    * Begin playback of sound.
    */
  def play(): Unit
  
  /**
    * Enable/disable the loop property to make the sound restart from the beginning when it
    * reaches the end.
    *
    * @param {boolean} loop - True to loop the sound, false otherwise.
    */
  def setLoop(loop: Boolean): Unit
  
  def setPitch(pitch: Any): Unit
  
  /**
    * Set the volume of playback between 0 and 1.
    *
    * @param {number} volume - The volume of the sound. Will be clamped between 0 and 1.
    */
  def setVolume(volume: Double): Unit
  
  var sound: Sound
  
  var source: org.scalajs.dom.Node
  
  var startOffset: Double
  
  var startTime: Double
  
  /**
    * Stop playback of sound. Calling play() again will restart playback from the beginning of the
    * sound.
    */
  def stop(): Unit
  
  var suspended: Boolean
  
  /**
    * Resume playback of the sound. Playback resumes at the point that the audio was paused.
    */
  def unpause(): Unit
  
  var volume: Double
}
object Channel {
  
  inline def apply(
    _createSource: Callback,
    gain: GainNode,
    getDuration: CallbackTo[Any],
    getLoop: CallbackTo[Boolean],
    getPitch: CallbackTo[Double],
    getVolume: CallbackTo[Double],
    isPlaying: CallbackTo[Boolean],
    loop: Boolean,
    manager: SoundManager,
    onManagerResume: Callback,
    onManagerSuspend: Callback,
    onManagerVolumeChange: Callback,
    pause: Callback,
    paused: Boolean,
    pitch: Double,
    play: Callback,
    setLoop: Boolean => Callback,
    setPitch: Any => Callback,
    setVolume: Double => Callback,
    sound: Sound,
    source: org.scalajs.dom.Node,
    startOffset: Double,
    startTime: Double,
    stop: Callback,
    suspended: Boolean,
    unpause: Callback,
    volume: Double
  ): Channel = {
    val __obj = js.Dynamic.literal(_createSource = _createSource.toJsFn, gain = gain.asInstanceOf[js.Any], getDuration = getDuration.toJsFn, getLoop = getLoop.toJsFn, getPitch = getPitch.toJsFn, getVolume = getVolume.toJsFn, isPlaying = isPlaying.toJsFn, loop = loop.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onManagerResume = onManagerResume.toJsFn, onManagerSuspend = onManagerSuspend.toJsFn, onManagerVolumeChange = onManagerVolumeChange.toJsFn, pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], play = play.toJsFn, setLoop = js.Any.fromFunction1((t0: Boolean) => setLoop(t0).runNow()), setPitch = js.Any.fromFunction1((t0: Any) => setPitch(t0).runNow()), setVolume = js.Any.fromFunction1((t0: Double) => setVolume(t0).runNow()), sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = stop.toJsFn, suspended = suspended.asInstanceOf[js.Any], unpause = unpause.toJsFn, volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setGain(value: GainNode): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGetDuration(value: CallbackTo[Any]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetLoop(value: CallbackTo[Boolean]): Self = StObject.set(x, "getLoop", value.toJsFn)
    
    inline def setGetPitch(value: CallbackTo[Double]): Self = StObject.set(x, "getPitch", value.toJsFn)
    
    inline def setGetVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getVolume", value.toJsFn)
    
    inline def setIsPlaying(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPlaying", value.toJsFn)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setManager(value: SoundManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setOnManagerResume(value: Callback): Self = StObject.set(x, "onManagerResume", value.toJsFn)
    
    inline def setOnManagerSuspend(value: Callback): Self = StObject.set(x, "onManagerSuspend", value.toJsFn)
    
    inline def setOnManagerVolumeChange(value: Callback): Self = StObject.set(x, "onManagerVolumeChange", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSetLoop(value: Boolean => Callback): Self = StObject.set(x, "setLoop", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetPitch(value: Any => Callback): Self = StObject.set(x, "setPitch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetVolume(value: Double => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSound(value: Sound): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSource(value: org.scalajs.dom.Node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setUnpause(value: Callback): Self = StObject.set(x, "unpause", value.toJsFn)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def set_createSource(value: Callback): Self = StObject.set(x, "_createSource", value.toJsFn)
  }
}
