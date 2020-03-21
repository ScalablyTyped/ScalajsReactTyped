package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuac extends js.Object {
  def uac_auth(): Double
  def uac_reg_disable(attr: String, `val`: String): Double
  def uac_reg_enable(attr: String, `val`: String): Double
  def uac_reg_lookup(userid: String, sdst: String): Double
  def uac_reg_refresh(l_uuid: String): Double
  def uac_reg_request_to(userid: String, imode: Double): Double
  def uac_reg_status(sruuid: String): Double
  def uac_replace_from(pdsp: String, puri: String): Double
  def uac_replace_from_uri(puri: String): Double
  def uac_replace_to(pdsp: String, puri: String): Double
  def uac_replace_to_uri(puri: String): Double
  def uac_req_send(): Double
  def uac_restore_from(): Double
  def uac_restore_to(): Double
}

object Typeofuac {
  @scala.inline
  def apply(
    uac_auth: CallbackTo[Double],
    uac_reg_disable: (String, String) => CallbackTo[Double],
    uac_reg_enable: (String, String) => CallbackTo[Double],
    uac_reg_lookup: (String, String) => CallbackTo[Double],
    uac_reg_refresh: String => CallbackTo[Double],
    uac_reg_request_to: (String, Double) => CallbackTo[Double],
    uac_reg_status: String => CallbackTo[Double],
    uac_replace_from: (String, String) => CallbackTo[Double],
    uac_replace_from_uri: String => CallbackTo[Double],
    uac_replace_to: (String, String) => CallbackTo[Double],
    uac_replace_to_uri: String => CallbackTo[Double],
    uac_req_send: CallbackTo[Double],
    uac_restore_from: CallbackTo[Double],
    uac_restore_to: CallbackTo[Double]
  ): Typeofuac = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uac_auth")(uac_auth.toJsFn)
    __obj.updateDynamic("uac_reg_disable")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uac_reg_disable(t0, t1).runNow()))
    __obj.updateDynamic("uac_reg_enable")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uac_reg_enable(t0, t1).runNow()))
    __obj.updateDynamic("uac_reg_lookup")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uac_reg_lookup(t0, t1).runNow()))
    __obj.updateDynamic("uac_reg_refresh")(js.Any.fromFunction1((t0: java.lang.String) => uac_reg_refresh(t0).runNow()))
    __obj.updateDynamic("uac_reg_request_to")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => uac_reg_request_to(t0, t1).runNow()))
    __obj.updateDynamic("uac_reg_status")(js.Any.fromFunction1((t0: java.lang.String) => uac_reg_status(t0).runNow()))
    __obj.updateDynamic("uac_replace_from")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uac_replace_from(t0, t1).runNow()))
    __obj.updateDynamic("uac_replace_from_uri")(js.Any.fromFunction1((t0: java.lang.String) => uac_replace_from_uri(t0).runNow()))
    __obj.updateDynamic("uac_replace_to")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uac_replace_to(t0, t1).runNow()))
    __obj.updateDynamic("uac_replace_to_uri")(js.Any.fromFunction1((t0: java.lang.String) => uac_replace_to_uri(t0).runNow()))
    __obj.updateDynamic("uac_req_send")(uac_req_send.toJsFn)
    __obj.updateDynamic("uac_restore_from")(uac_restore_from.toJsFn)
    __obj.updateDynamic("uac_restore_to")(uac_restore_to.toJsFn)
    __obj.asInstanceOf[Typeofuac]
  }
}

