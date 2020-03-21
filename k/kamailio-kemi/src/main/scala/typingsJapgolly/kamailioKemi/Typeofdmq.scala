package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdmq extends js.Object {
  def bcast_message(peer_str: String, body_str: String, ct_str: String): Double
  def handle_message(): Double
  def handle_message_rc(returnval: Double): Double
  def is_from_node(): Double
  def send_message(peer_str: String, to_str: String, body_str: String, ct_str: String): Double
  def t_replicate(): Double
  def t_replicate_mode(mode: Double): Double
}

object Typeofdmq {
  @scala.inline
  def apply(
    bcast_message: (String, String, String) => CallbackTo[Double],
    handle_message: CallbackTo[Double],
    handle_message_rc: Double => CallbackTo[Double],
    is_from_node: CallbackTo[Double],
    send_message: (String, String, String, String) => CallbackTo[Double],
    t_replicate: CallbackTo[Double],
    t_replicate_mode: Double => CallbackTo[Double]
  ): Typeofdmq = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bcast_message")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => bcast_message(t0, t1, t2).runNow()))
    __obj.updateDynamic("handle_message")(handle_message.toJsFn)
    __obj.updateDynamic("handle_message_rc")(js.Any.fromFunction1((t0: scala.Double) => handle_message_rc(t0).runNow()))
    __obj.updateDynamic("is_from_node")(is_from_node.toJsFn)
    __obj.updateDynamic("send_message")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => send_message(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("t_replicate")(t_replicate.toJsFn)
    __obj.updateDynamic("t_replicate_mode")(js.Any.fromFunction1((t0: scala.Double) => t_replicate_mode(t0).runNow()))
    __obj.asInstanceOf[Typeofdmq]
  }
}

