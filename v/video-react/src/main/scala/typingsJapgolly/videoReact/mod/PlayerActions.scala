package typingsJapgolly.videoReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerActions extends StObject {
  
  /**
    * Add a new text track to the video
    */
  def addTextTrack(): Unit
  
  /**
    * Check if your browser can play different types of videos
    */
  def canPlayType(): Unit
  
  /**
    * Jump forward x seconds
    */
  def forward(seconds: Double): Unit
  
  /**
    * Get the redux State.
    */
  def getState(): PlayerState
  
  /**
    * Change the video source and re-load the video
    */
  def load(): Unit
  
  /**
    * Pause the video.
    */
  def pause(): Unit
  
  /**
    * Play the video.
    */
  def play(): Unit
  
  /**
    * Jump back x seconds
    */
  def replay(seconds: Double): Unit
  
  /**
    * Seek video by time (seconds)
    */
  def seek(time: Double): Unit
  
  /**
    * Subscribe to the player state changes.
    */
  def subscribeToStateChange(listener: StateListener): Unit
  
  /**
    * Enter or exist full screen
    */
  def toggleFullscreen(): Unit
}
object PlayerActions {
  
  inline def apply(
    addTextTrack: Callback,
    canPlayType: Callback,
    forward: Double => Callback,
    getState: CallbackTo[PlayerState],
    load: Callback,
    pause: Callback,
    play: Callback,
    replay: Double => Callback,
    seek: Double => Callback,
    subscribeToStateChange: StateListener => Callback,
    toggleFullscreen: Callback
  ): PlayerActions = {
    val __obj = js.Dynamic.literal(addTextTrack = addTextTrack.toJsFn, canPlayType = canPlayType.toJsFn, forward = js.Any.fromFunction1((t0: Double) => forward(t0).runNow()), getState = getState.toJsFn, load = load.toJsFn, pause = pause.toJsFn, play = play.toJsFn, replay = js.Any.fromFunction1((t0: Double) => replay(t0).runNow()), seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), subscribeToStateChange = js.Any.fromFunction1((t0: StateListener) => subscribeToStateChange(t0).runNow()), toggleFullscreen = toggleFullscreen.toJsFn)
    __obj.asInstanceOf[PlayerActions]
  }
  
  extension [Self <: PlayerActions](x: Self) {
    
    inline def setAddTextTrack(value: Callback): Self = StObject.set(x, "addTextTrack", value.toJsFn)
    
    inline def setCanPlayType(value: Callback): Self = StObject.set(x, "canPlayType", value.toJsFn)
    
    inline def setForward(value: Double => Callback): Self = StObject.set(x, "forward", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetState(value: CallbackTo[PlayerState]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setReplay(value: Double => Callback): Self = StObject.set(x, "replay", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSubscribeToStateChange(value: StateListener => Callback): Self = StObject.set(x, "subscribeToStateChange", js.Any.fromFunction1((t0: StateListener) => value(t0).runNow()))
    
    inline def setToggleFullscreen(value: Callback): Self = StObject.set(x, "toggleFullscreen", value.toJsFn)
  }
}
