package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioControlManager extends StObject {
  
  /**
    * Gets the current audio output mode.
    *
    * @returns AudioOutputMode The current audio output mode
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def getOutputMode(): AudioOutputMode
  
  /**
    * Gets the current volume level.
    *
    * @returns unsigned short The current volume (the volume range is 0 ~ 100)
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def getVolume(): Double
  
  /**
    * Gets the mute state.
    *
    * @returns boolean The current mute state
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def isMute(): Boolean
  
  /**
    * Plays the sound of a specific beep.
    *
    * @param type The beep type to play
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def playSound(`type`: AudioBeepType): Unit
  
  /**
    * Turns on or off the silent mode
    *
    * Note that turning on mute mode does not change volume level but
    * it simply disables any sound. Turning off the mute will enable sound
    * with the volume level. If setVolumeUp or setVolumeDown functions
    * are used, then mute is disabled.
    *
    * @param mute The mute state (true = turn on the silent mode, false = turn off the silent mode)
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    */
  def setMute(mute: Boolean): Unit
  
  /**
    * Changes the volume level.
    *
    * The value of _volume_ is allowed from 0 to 100. If an invalid value is passed, _InvalidValuesError_ will occur.
    *
    * @param volume The volume (the available volume range is 0 ~100)
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def setVolume(volume: Double): Unit
  
  /**
    * Registers a volume change callback for getting notified when TV volume has been changed.
    *
    * Note that this method overwrites the previously registered listener.
    * @param callback The method to invoke when the volume has been changed. It will not be triggered when the silent mode is changed.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input attribute is not compatible with the expected type for this attribute.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def setVolumeChangeListener(callback: VolumeChangeCallback): Unit
  
  /**
    * Decreases the volume by 1 level.
    *
    * If it is called when the volume level is 0, it will be
    * ignored because the minimum volume level is 0. If mute is enabled,
    * then execution of this functions will disable it.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def setVolumeDown(): Unit
  
  /**
    * Increases the volume by 1 level.
    * If it is called when the volume level is 100, it will be ignored
    * because the maximum volume level is 100. If mute is enabled,
    * then execution of this functions will disable it.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def setVolumeUp(): Unit
  
  /**
    * Unregisters the volume change callback for detecting the volume changes.
    *
    * Calling this function has no effect if listener is not set.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * This type of error is deprecated since Tizen 5.0.
    * @throw WebAPIException with error type UnknownError in an unspecified error case.
    *
    * @privilegeLevel 5.0 public
    * @privilegeName 5.0 http://tizen.org/privilege/tv.audio
    * @warning 5.0 http://tizen.org/privilege/tv.audio (public level) has been deprecated since 5.0.
    */
  def unsetVolumeChangeListener(): Unit
}
object AudioControlManager {
  
  inline def apply(
    getOutputMode: CallbackTo[AudioOutputMode],
    getVolume: CallbackTo[Double],
    isMute: CallbackTo[Boolean],
    playSound: AudioBeepType => Callback,
    setMute: Boolean => Callback,
    setVolume: Double => Callback,
    setVolumeChangeListener: VolumeChangeCallback => Callback,
    setVolumeDown: Callback,
    setVolumeUp: Callback,
    unsetVolumeChangeListener: Callback
  ): AudioControlManager = {
    val __obj = js.Dynamic.literal(getOutputMode = getOutputMode.toJsFn, getVolume = getVolume.toJsFn, isMute = isMute.toJsFn, playSound = js.Any.fromFunction1((t0: AudioBeepType) => playSound(t0).runNow()), setMute = js.Any.fromFunction1((t0: Boolean) => setMute(t0).runNow()), setVolume = js.Any.fromFunction1((t0: Double) => setVolume(t0).runNow()), setVolumeChangeListener = js.Any.fromFunction1((t0: VolumeChangeCallback) => setVolumeChangeListener(t0).runNow()), setVolumeDown = setVolumeDown.toJsFn, setVolumeUp = setVolumeUp.toJsFn, unsetVolumeChangeListener = unsetVolumeChangeListener.toJsFn)
    __obj.asInstanceOf[AudioControlManager]
  }
  
  extension [Self <: AudioControlManager](x: Self) {
    
    inline def setGetOutputMode(value: CallbackTo[AudioOutputMode]): Self = StObject.set(x, "getOutputMode", value.toJsFn)
    
    inline def setGetVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getVolume", value.toJsFn)
    
    inline def setIsMute(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMute", value.toJsFn)
    
    inline def setPlaySound(value: AudioBeepType => Callback): Self = StObject.set(x, "playSound", js.Any.fromFunction1((t0: AudioBeepType) => value(t0).runNow()))
    
    inline def setSetMute(value: Boolean => Callback): Self = StObject.set(x, "setMute", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVolume(value: Double => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetVolumeChangeListener(value: VolumeChangeCallback => Callback): Self = StObject.set(x, "setVolumeChangeListener", js.Any.fromFunction1((t0: VolumeChangeCallback) => value(t0).runNow()))
    
    inline def setSetVolumeDown(value: Callback): Self = StObject.set(x, "setVolumeDown", value.toJsFn)
    
    inline def setSetVolumeUp(value: Callback): Self = StObject.set(x, "setVolumeUp", value.toJsFn)
    
    inline def setUnsetVolumeChangeListener(value: Callback): Self = StObject.set(x, "unsetVolumeChangeListener", value.toJsFn)
  }
}
