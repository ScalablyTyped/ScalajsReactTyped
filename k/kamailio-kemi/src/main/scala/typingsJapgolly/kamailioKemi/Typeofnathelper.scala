package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnathelper extends js.Object {
  def add_contact_alias(): Double
  def add_contact_alias_addr(ip_str: String, port_str: String, proto_str: String): Double
  def add_rcv_param(upos: Double): Double
  def fix_nated_contact(): Double
  def fix_nated_register(): Double
  def fix_nated_sdp(level: Double): Double
  def fix_nated_sdp_ip(level: Double, ip: String): Double
  def handle_ruri_alias(): Double
  def is_rfc1918(address: String): Double
  def nat_uac_test(tests: Double): Double
  def set_contact_alias(): Double
}

object Typeofnathelper {
  @scala.inline
  def apply(
    add_contact_alias: CallbackTo[Double],
    add_contact_alias_addr: (String, String, String) => CallbackTo[Double],
    add_rcv_param: Double => CallbackTo[Double],
    fix_nated_contact: CallbackTo[Double],
    fix_nated_register: CallbackTo[Double],
    fix_nated_sdp: Double => CallbackTo[Double],
    fix_nated_sdp_ip: (Double, String) => CallbackTo[Double],
    handle_ruri_alias: CallbackTo[Double],
    is_rfc1918: String => CallbackTo[Double],
    nat_uac_test: Double => CallbackTo[Double],
    set_contact_alias: CallbackTo[Double]
  ): Typeofnathelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_contact_alias")(add_contact_alias.toJsFn)
    __obj.updateDynamic("add_contact_alias_addr")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => add_contact_alias_addr(t0, t1, t2).runNow()))
    __obj.updateDynamic("add_rcv_param")(js.Any.fromFunction1((t0: scala.Double) => add_rcv_param(t0).runNow()))
    __obj.updateDynamic("fix_nated_contact")(fix_nated_contact.toJsFn)
    __obj.updateDynamic("fix_nated_register")(fix_nated_register.toJsFn)
    __obj.updateDynamic("fix_nated_sdp")(js.Any.fromFunction1((t0: scala.Double) => fix_nated_sdp(t0).runNow()))
    __obj.updateDynamic("fix_nated_sdp_ip")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => fix_nated_sdp_ip(t0, t1).runNow()))
    __obj.updateDynamic("handle_ruri_alias")(handle_ruri_alias.toJsFn)
    __obj.updateDynamic("is_rfc1918")(js.Any.fromFunction1((t0: java.lang.String) => is_rfc1918(t0).runNow()))
    __obj.updateDynamic("nat_uac_test")(js.Any.fromFunction1((t0: scala.Double) => nat_uac_test(t0).runNow()))
    __obj.updateDynamic("set_contact_alias")(set_contact_alias.toJsFn)
    __obj.asInstanceOf[Typeofnathelper]
  }
}

