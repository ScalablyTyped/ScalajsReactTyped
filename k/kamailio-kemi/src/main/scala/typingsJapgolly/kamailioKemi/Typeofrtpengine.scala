package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtpengine extends js.Object {
  def rtpengine_answer(flags: String): Double
  def rtpengine_answer0(): Double
  def rtpengine_delete(flags: String): Double
  def rtpengine_delete0(): Double
  def rtpengine_manage(flags: String): Double
  def rtpengine_manage0(): Double
  def rtpengine_offer(flags: String): Double
  def rtpengine_offer0(): Double
  def set_rtpengine_set(r1: Double): Double
  // This function is the sibling function to set_rtpengine_set().
  // The original module function is declared as set_rtpengine_set(setid[, setid2]).
  // In KEMI set_rtpengine_set() takes only the first parameter and set_rtpengine_set2() allows for the second optional parameter to be passed.
  // Please review the documentation for set_rtpengine_set() for more information.
  def set_rtpengine_set2(r1: Double, r2: Double): Double
  def start_recording(): Double
  def stop_recording(): Double
}

object Typeofrtpengine {
  @scala.inline
  def apply(
    rtpengine_answer: String => CallbackTo[Double],
    rtpengine_answer0: CallbackTo[Double],
    rtpengine_delete: String => CallbackTo[Double],
    rtpengine_delete0: CallbackTo[Double],
    rtpengine_manage: String => CallbackTo[Double],
    rtpengine_manage0: CallbackTo[Double],
    rtpengine_offer: String => CallbackTo[Double],
    rtpengine_offer0: CallbackTo[Double],
    set_rtpengine_set: Double => CallbackTo[Double],
    set_rtpengine_set2: (Double, Double) => CallbackTo[Double],
    start_recording: CallbackTo[Double],
    stop_recording: CallbackTo[Double]
  ): Typeofrtpengine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rtpengine_answer")(js.Any.fromFunction1((t0: java.lang.String) => rtpengine_answer(t0).runNow()))
    __obj.updateDynamic("rtpengine_answer0")(rtpengine_answer0.toJsFn)
    __obj.updateDynamic("rtpengine_delete")(js.Any.fromFunction1((t0: java.lang.String) => rtpengine_delete(t0).runNow()))
    __obj.updateDynamic("rtpengine_delete0")(rtpengine_delete0.toJsFn)
    __obj.updateDynamic("rtpengine_manage")(js.Any.fromFunction1((t0: java.lang.String) => rtpengine_manage(t0).runNow()))
    __obj.updateDynamic("rtpengine_manage0")(rtpengine_manage0.toJsFn)
    __obj.updateDynamic("rtpengine_offer")(js.Any.fromFunction1((t0: java.lang.String) => rtpengine_offer(t0).runNow()))
    __obj.updateDynamic("rtpengine_offer0")(rtpengine_offer0.toJsFn)
    __obj.updateDynamic("set_rtpengine_set")(js.Any.fromFunction1((t0: scala.Double) => set_rtpengine_set(t0).runNow()))
    __obj.updateDynamic("set_rtpengine_set2")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => set_rtpengine_set2(t0, t1).runNow()))
    __obj.updateDynamic("start_recording")(start_recording.toJsFn)
    __obj.updateDynamic("stop_recording")(stop_recording.toJsFn)
    __obj.asInstanceOf[Typeofrtpengine]
  }
}

