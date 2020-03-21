package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftcpops extends js.Object {
  def tcp_conid_alive(i_conid: Double): Double
  def tcp_conid_state(i_conid: Double): Double
  def tcp_enable_closed_event(): Double
  def tcp_enable_closed_event_cid(i_conid: Double): Double
  def tcp_keepalive_disable(): Double
  def tcp_keepalive_disable_cid(i_con: Double): Double
  def tcp_keepalive_enable(i_idle: Double, i_cnt: Double, i_intvl: Double): Double
  def tcp_keepalive_enable_cid(i_con: Double, i_idle: Double, i_cnt: Double, i_intvl: Double): Double
  def tcp_set_connection_lifetime(i_time: Double): Double
  def tcp_set_connection_lifetime_cid(i_conid: Double, i_time: Double): Double
}

object Typeoftcpops {
  @scala.inline
  def apply(
    tcp_conid_alive: Double => CallbackTo[Double],
    tcp_conid_state: Double => CallbackTo[Double],
    tcp_enable_closed_event: CallbackTo[Double],
    tcp_enable_closed_event_cid: Double => CallbackTo[Double],
    tcp_keepalive_disable: CallbackTo[Double],
    tcp_keepalive_disable_cid: Double => CallbackTo[Double],
    tcp_keepalive_enable: (Double, Double, Double) => CallbackTo[Double],
    tcp_keepalive_enable_cid: (Double, Double, Double, Double) => CallbackTo[Double],
    tcp_set_connection_lifetime: Double => CallbackTo[Double],
    tcp_set_connection_lifetime_cid: (Double, Double) => CallbackTo[Double]
  ): Typeoftcpops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tcp_conid_alive")(js.Any.fromFunction1((t0: scala.Double) => tcp_conid_alive(t0).runNow()))
    __obj.updateDynamic("tcp_conid_state")(js.Any.fromFunction1((t0: scala.Double) => tcp_conid_state(t0).runNow()))
    __obj.updateDynamic("tcp_enable_closed_event")(tcp_enable_closed_event.toJsFn)
    __obj.updateDynamic("tcp_enable_closed_event_cid")(js.Any.fromFunction1((t0: scala.Double) => tcp_enable_closed_event_cid(t0).runNow()))
    __obj.updateDynamic("tcp_keepalive_disable")(tcp_keepalive_disable.toJsFn)
    __obj.updateDynamic("tcp_keepalive_disable_cid")(js.Any.fromFunction1((t0: scala.Double) => tcp_keepalive_disable_cid(t0).runNow()))
    __obj.updateDynamic("tcp_keepalive_enable")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => tcp_keepalive_enable(t0, t1, t2).runNow()))
    __obj.updateDynamic("tcp_keepalive_enable_cid")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => tcp_keepalive_enable_cid(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("tcp_set_connection_lifetime")(js.Any.fromFunction1((t0: scala.Double) => tcp_set_connection_lifetime(t0).runNow()))
    __obj.updateDynamic("tcp_set_connection_lifetime_cid")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => tcp_set_connection_lifetime_cid(t0, t1).runNow()))
    __obj.asInstanceOf[Typeoftcpops]
  }
}

