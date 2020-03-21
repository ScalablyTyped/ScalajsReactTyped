package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcorex extends js.Object {
  def append_branch(): Double
  def append_branch_uri(uri: String): Double
  def append_branch_uri_q(uri: String, q: String): Double
  def has_ruri_user(): Double
  def has_user_agent(): Double
  def isxflagset(fval: Double): Double
  def resetxflag(fval: Double): Double
  def send_data(uri: String, data: String): Double
  def sendx(uri: String, sock: String, data: String): Double
  def set_recv_socket(ssock: String): Double
  def set_send_socket(ssock: String): Double
  def set_source_address(saddr: String): Double
  def setxflag(fval: Double): Double
  def via_add_srvid(fval: Double): Double
  def via_add_xavp_params(fval: Double): Double
  def via_use_xavp_fields(fval: Double): Double
}

object Typeofcorex {
  @scala.inline
  def apply(
    append_branch: CallbackTo[Double],
    append_branch_uri: String => CallbackTo[Double],
    append_branch_uri_q: (String, String) => CallbackTo[Double],
    has_ruri_user: CallbackTo[Double],
    has_user_agent: CallbackTo[Double],
    isxflagset: Double => CallbackTo[Double],
    resetxflag: Double => CallbackTo[Double],
    send_data: (String, String) => CallbackTo[Double],
    sendx: (String, String, String) => CallbackTo[Double],
    set_recv_socket: String => CallbackTo[Double],
    set_send_socket: String => CallbackTo[Double],
    set_source_address: String => CallbackTo[Double],
    setxflag: Double => CallbackTo[Double],
    via_add_srvid: Double => CallbackTo[Double],
    via_add_xavp_params: Double => CallbackTo[Double],
    via_use_xavp_fields: Double => CallbackTo[Double]
  ): Typeofcorex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append_branch")(append_branch.toJsFn)
    __obj.updateDynamic("append_branch_uri")(js.Any.fromFunction1((t0: java.lang.String) => append_branch_uri(t0).runNow()))
    __obj.updateDynamic("append_branch_uri_q")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => append_branch_uri_q(t0, t1).runNow()))
    __obj.updateDynamic("has_ruri_user")(has_ruri_user.toJsFn)
    __obj.updateDynamic("has_user_agent")(has_user_agent.toJsFn)
    __obj.updateDynamic("isxflagset")(js.Any.fromFunction1((t0: scala.Double) => isxflagset(t0).runNow()))
    __obj.updateDynamic("resetxflag")(js.Any.fromFunction1((t0: scala.Double) => resetxflag(t0).runNow()))
    __obj.updateDynamic("send_data")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => send_data(t0, t1).runNow()))
    __obj.updateDynamic("sendx")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sendx(t0, t1, t2).runNow()))
    __obj.updateDynamic("set_recv_socket")(js.Any.fromFunction1((t0: java.lang.String) => set_recv_socket(t0).runNow()))
    __obj.updateDynamic("set_send_socket")(js.Any.fromFunction1((t0: java.lang.String) => set_send_socket(t0).runNow()))
    __obj.updateDynamic("set_source_address")(js.Any.fromFunction1((t0: java.lang.String) => set_source_address(t0).runNow()))
    __obj.updateDynamic("setxflag")(js.Any.fromFunction1((t0: scala.Double) => setxflag(t0).runNow()))
    __obj.updateDynamic("via_add_srvid")(js.Any.fromFunction1((t0: scala.Double) => via_add_srvid(t0).runNow()))
    __obj.updateDynamic("via_add_xavp_params")(js.Any.fromFunction1((t0: scala.Double) => via_add_xavp_params(t0).runNow()))
    __obj.updateDynamic("via_use_xavp_fields")(js.Any.fromFunction1((t0: scala.Double) => via_use_xavp_fields(t0).runNow()))
    __obj.asInstanceOf[Typeofcorex]
  }
}

