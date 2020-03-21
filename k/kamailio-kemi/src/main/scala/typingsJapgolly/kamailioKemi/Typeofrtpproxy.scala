package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtpproxy extends js.Object {
  def rtpproxy_answer(flags: String): Double
  def rtpproxy_answer0(): Double
  def rtpproxy_answer_ip(flags: String, mip: String): Double
  def rtpproxy_destroy(flags: String): Double
  def rtpproxy_destroy0(): Double
  def rtpproxy_manage(flags: String): Double
  def rtpproxy_manage0(): Double
  def rtpproxy_manage_ip(flags: String, mip: String): Double
  def rtpproxy_offer(flags: String): Double
  def rtpproxy_offer0(): Double
  def rtpproxy_offer_ip(flags: String, mip: String): Double
  def rtpproxy_stop_stream2uac(): Double
  def rtpproxy_stop_stream2uas(): Double
  def rtpproxy_stream2uac(pname: String, count: Double): Double
  def rtpproxy_stream2uas(pname: String, count: Double): Double
  def set_rtpproxy_set(rset: Double): Double
  def start_recording(): Double
}

object Typeofrtpproxy {
  @scala.inline
  def apply(
    rtpproxy_answer: String => CallbackTo[Double],
    rtpproxy_answer0: CallbackTo[Double],
    rtpproxy_answer_ip: (String, String) => CallbackTo[Double],
    rtpproxy_destroy: String => CallbackTo[Double],
    rtpproxy_destroy0: CallbackTo[Double],
    rtpproxy_manage: String => CallbackTo[Double],
    rtpproxy_manage0: CallbackTo[Double],
    rtpproxy_manage_ip: (String, String) => CallbackTo[Double],
    rtpproxy_offer: String => CallbackTo[Double],
    rtpproxy_offer0: CallbackTo[Double],
    rtpproxy_offer_ip: (String, String) => CallbackTo[Double],
    rtpproxy_stop_stream2uac: CallbackTo[Double],
    rtpproxy_stop_stream2uas: CallbackTo[Double],
    rtpproxy_stream2uac: (String, Double) => CallbackTo[Double],
    rtpproxy_stream2uas: (String, Double) => CallbackTo[Double],
    set_rtpproxy_set: Double => CallbackTo[Double],
    start_recording: CallbackTo[Double]
  ): Typeofrtpproxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rtpproxy_answer")(js.Any.fromFunction1((t0: java.lang.String) => rtpproxy_answer(t0).runNow()))
    __obj.updateDynamic("rtpproxy_answer0")(rtpproxy_answer0.toJsFn)
    __obj.updateDynamic("rtpproxy_answer_ip")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => rtpproxy_answer_ip(t0, t1).runNow()))
    __obj.updateDynamic("rtpproxy_destroy")(js.Any.fromFunction1((t0: java.lang.String) => rtpproxy_destroy(t0).runNow()))
    __obj.updateDynamic("rtpproxy_destroy0")(rtpproxy_destroy0.toJsFn)
    __obj.updateDynamic("rtpproxy_manage")(js.Any.fromFunction1((t0: java.lang.String) => rtpproxy_manage(t0).runNow()))
    __obj.updateDynamic("rtpproxy_manage0")(rtpproxy_manage0.toJsFn)
    __obj.updateDynamic("rtpproxy_manage_ip")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => rtpproxy_manage_ip(t0, t1).runNow()))
    __obj.updateDynamic("rtpproxy_offer")(js.Any.fromFunction1((t0: java.lang.String) => rtpproxy_offer(t0).runNow()))
    __obj.updateDynamic("rtpproxy_offer0")(rtpproxy_offer0.toJsFn)
    __obj.updateDynamic("rtpproxy_offer_ip")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => rtpproxy_offer_ip(t0, t1).runNow()))
    __obj.updateDynamic("rtpproxy_stop_stream2uac")(rtpproxy_stop_stream2uac.toJsFn)
    __obj.updateDynamic("rtpproxy_stop_stream2uas")(rtpproxy_stop_stream2uas.toJsFn)
    __obj.updateDynamic("rtpproxy_stream2uac")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => rtpproxy_stream2uac(t0, t1).runNow()))
    __obj.updateDynamic("rtpproxy_stream2uas")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => rtpproxy_stream2uas(t0, t1).runNow()))
    __obj.updateDynamic("set_rtpproxy_set")(js.Any.fromFunction1((t0: scala.Double) => set_rtpproxy_set(t0).runNow()))
    __obj.updateDynamic("start_recording")(start_recording.toJsFn)
    __obj.asInstanceOf[Typeofrtpproxy]
  }
}

