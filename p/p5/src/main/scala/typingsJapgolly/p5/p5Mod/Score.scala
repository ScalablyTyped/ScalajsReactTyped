package typingsJapgolly.p5.p5Mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
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
  @scala.inline
  def apply(
    loop: Callback,
    noLoop: Callback,
    pause: Callback,
    setBPM: (Double, Double) => Callback,
    start: Callback,
    stop: Callback
  ): Score = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loop")(loop.toJsFn)
    __obj.updateDynamic("noLoop")(noLoop.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("setBPM")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setBPM(t0, t1).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Score]
  }
}

