package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiptrace extends js.Object {
  def hlog(message: String): Double
  def hlog_cid(correlationid: String, message: String): Double
  def sip_trace(): Double
  def sip_trace_dst(duri: String): Double
  def sip_trace_dst_cid(duri: String, cid: String): Double
}

object Typeofsiptrace {
  @scala.inline
  def apply(
    hlog: String => CallbackTo[Double],
    hlog_cid: (String, String) => CallbackTo[Double],
    sip_trace: CallbackTo[Double],
    sip_trace_dst: String => CallbackTo[Double],
    sip_trace_dst_cid: (String, String) => CallbackTo[Double]
  ): Typeofsiptrace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hlog")(js.Any.fromFunction1((t0: java.lang.String) => hlog(t0).runNow()))
    __obj.updateDynamic("hlog_cid")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => hlog_cid(t0, t1).runNow()))
    __obj.updateDynamic("sip_trace")(sip_trace.toJsFn)
    __obj.updateDynamic("sip_trace_dst")(js.Any.fromFunction1((t0: java.lang.String) => sip_trace_dst(t0).runNow()))
    __obj.updateDynamic("sip_trace_dst_cid")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sip_trace_dst_cid(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofsiptrace]
  }
}

