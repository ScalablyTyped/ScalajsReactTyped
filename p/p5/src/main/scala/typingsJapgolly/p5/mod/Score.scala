package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  /**
    *   Loop playback of the score.
    */
  def loop(): Unit
  
  /**
    *   Stop looping playback of the score. If it is
    *   currently playing, this will go into effect after
    *   the current round of playback completes.
    */
  def noLoop(): Unit
  
  /**
    *   Pause playback of the score.
    */
  def pause(): Unit
  
  /**
    *   Set the tempo for all parts in the score
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: Double, rampTime: Double): Unit
  
  /**
    *   Start playback of the score.
    */
  def start(): Unit
  
  /**
    *   Stop playback of the score.
    */
  def stop(): Unit
}
object Score {
  
  inline def apply(
    loop: Callback,
    noLoop: Callback,
    pause: Callback,
    setBPM: (Double, Double) => Callback,
    start: Callback,
    stop: Callback
  ): Score = {
    val __obj = js.Dynamic.literal(loop = loop.toJsFn, noLoop = noLoop.toJsFn, pause = pause.toJsFn, setBPM = js.Any.fromFunction2((t0: Double, t1: Double) => (setBPM(t0, t1)).runNow()), start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setLoop(value: Callback): Self = StObject.set(x, "loop", value.toJsFn)
    
    inline def setNoLoop(value: Callback): Self = StObject.set(x, "noLoop", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setSetBPM(value: (Double, Double) => Callback): Self = StObject.set(x, "setBPM", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
