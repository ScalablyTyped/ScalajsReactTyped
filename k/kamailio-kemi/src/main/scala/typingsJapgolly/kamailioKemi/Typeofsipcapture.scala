package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipcapture extends js.Object {
  def float2int(_val: String, _coof: String): Double
  def report_capture(_table: String): Double
  def report_capture_cid(_table: String, _cid: String): Double
  def report_capture_data(_table: String, _cid: String, _data: String): Double
  def sip_capture(): Double
  def sip_capture_forward(puri: String): Double
  def sip_capture_mode(_table: String, _cmdata: String): Double
  def sip_capture_table(_table: String): Double
}

object Typeofsipcapture {
  @scala.inline
  def apply(
    float2int: (String, String) => CallbackTo[Double],
    report_capture: String => CallbackTo[Double],
    report_capture_cid: (String, String) => CallbackTo[Double],
    report_capture_data: (String, String, String) => CallbackTo[Double],
    sip_capture: CallbackTo[Double],
    sip_capture_forward: String => CallbackTo[Double],
    sip_capture_mode: (String, String) => CallbackTo[Double],
    sip_capture_table: String => CallbackTo[Double]
  ): Typeofsipcapture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("float2int")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => float2int(t0, t1).runNow()))
    __obj.updateDynamic("report_capture")(js.Any.fromFunction1((t0: java.lang.String) => report_capture(t0).runNow()))
    __obj.updateDynamic("report_capture_cid")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => report_capture_cid(t0, t1).runNow()))
    __obj.updateDynamic("report_capture_data")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => report_capture_data(t0, t1, t2).runNow()))
    __obj.updateDynamic("sip_capture")(sip_capture.toJsFn)
    __obj.updateDynamic("sip_capture_forward")(js.Any.fromFunction1((t0: java.lang.String) => sip_capture_forward(t0).runNow()))
    __obj.updateDynamic("sip_capture_mode")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sip_capture_mode(t0, t1).runNow()))
    __obj.updateDynamic("sip_capture_table")(js.Any.fromFunction1((t0: java.lang.String) => sip_capture_table(t0).runNow()))
    __obj.asInstanceOf[Typeofsipcapture]
  }
}

