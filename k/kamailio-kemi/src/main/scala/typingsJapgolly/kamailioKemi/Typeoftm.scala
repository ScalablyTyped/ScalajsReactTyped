package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftm extends js.Object {
  def t_any_replied(): Double
  def t_any_timeout(): Double
  def t_branch_replied(): Double
  def t_branch_timeout(): Double
  def t_check_status(sexp: String): Double
  def t_check_trans(): Double
  def t_drop_replies(mode: String): Double
  def t_drop_replies_all(): Double
  def t_grep_status(code: Double): Double
  def t_is_canceled(): Double
  def t_is_expired(): Double
  def t_is_retr_async_reply(): Double
  def t_is_set(target: String): Double
  def t_load_contacts(): Double
  def t_lookup_cancel(): Double
  def t_lookup_cancel_flags(flags: Double): Double
  def t_lookup_request(): Double
  def t_newtran(): Double
  def t_next_contact_flow(): Double
  def t_next_contacts(): Double
  def t_on_branch(rname: String): Double
  def t_on_branch_failure(rname: String): Double
  def t_on_failure(rname: String): Double
  def t_on_reply(rname: String): Double
  def t_relay(): Double
  def t_release(): Double
  def t_replicate(suri: String): Double
  def t_reply(code: Double, reason: String): Double
  def t_reset_fr(): Double
  def t_reset_max_lifetime(): Double
  def t_reset_retr(): Double
  def t_retransmit_reply(): Double
  def t_save_lumps(): Double
  def t_send_reply(code: Double, reason: String): Double
  def t_set_auto_inv_100(state: Double): Double
  def t_set_disable_6xx(state: Double): Double
  def t_set_disable_failover(state: Double): Double
  def t_set_disable_internal_reply(state: Double): Double
  def t_set_fr(fr_inv: Double, fr: Double): Double
  def t_set_fr_inv(fr_inv: Double): Double
  def t_set_max_lifetime(t1: Double, t2: Double): Double
  def t_set_no_e2e_cancel_reason(state: Double): Double
  def t_set_retr(t1: Double, t2: Double): Double
  def t_uac_send(method: String, ruri: String, nexthop: String, ssock: String, hdrs: String, body: String): Double
  def t_use_uac_headers(): Double
}

object Typeoftm {
  @scala.inline
  def apply(
    t_any_replied: CallbackTo[Double],
    t_any_timeout: CallbackTo[Double],
    t_branch_replied: CallbackTo[Double],
    t_branch_timeout: CallbackTo[Double],
    t_check_status: String => CallbackTo[Double],
    t_check_trans: CallbackTo[Double],
    t_drop_replies: String => CallbackTo[Double],
    t_drop_replies_all: CallbackTo[Double],
    t_grep_status: Double => CallbackTo[Double],
    t_is_canceled: CallbackTo[Double],
    t_is_expired: CallbackTo[Double],
    t_is_retr_async_reply: CallbackTo[Double],
    t_is_set: String => CallbackTo[Double],
    t_load_contacts: CallbackTo[Double],
    t_lookup_cancel: CallbackTo[Double],
    t_lookup_cancel_flags: Double => CallbackTo[Double],
    t_lookup_request: CallbackTo[Double],
    t_newtran: CallbackTo[Double],
    t_next_contact_flow: CallbackTo[Double],
    t_next_contacts: CallbackTo[Double],
    t_on_branch: String => CallbackTo[Double],
    t_on_branch_failure: String => CallbackTo[Double],
    t_on_failure: String => CallbackTo[Double],
    t_on_reply: String => CallbackTo[Double],
    t_relay: CallbackTo[Double],
    t_release: CallbackTo[Double],
    t_replicate: String => CallbackTo[Double],
    t_reply: (Double, String) => CallbackTo[Double],
    t_reset_fr: CallbackTo[Double],
    t_reset_max_lifetime: CallbackTo[Double],
    t_reset_retr: CallbackTo[Double],
    t_retransmit_reply: CallbackTo[Double],
    t_save_lumps: CallbackTo[Double],
    t_send_reply: (Double, String) => CallbackTo[Double],
    t_set_auto_inv_100: Double => CallbackTo[Double],
    t_set_disable_6xx: Double => CallbackTo[Double],
    t_set_disable_failover: Double => CallbackTo[Double],
    t_set_disable_internal_reply: Double => CallbackTo[Double],
    t_set_fr: (Double, Double) => CallbackTo[Double],
    t_set_fr_inv: Double => CallbackTo[Double],
    t_set_max_lifetime: (Double, Double) => CallbackTo[Double],
    t_set_no_e2e_cancel_reason: Double => CallbackTo[Double],
    t_set_retr: (Double, Double) => CallbackTo[Double],
    t_uac_send: (String, String, String, String, String, String) => CallbackTo[Double],
    t_use_uac_headers: CallbackTo[Double]
  ): Typeoftm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("t_any_replied")(t_any_replied.toJsFn)
    __obj.updateDynamic("t_any_timeout")(t_any_timeout.toJsFn)
    __obj.updateDynamic("t_branch_replied")(t_branch_replied.toJsFn)
    __obj.updateDynamic("t_branch_timeout")(t_branch_timeout.toJsFn)
    __obj.updateDynamic("t_check_status")(js.Any.fromFunction1((t0: java.lang.String) => t_check_status(t0).runNow()))
    __obj.updateDynamic("t_check_trans")(t_check_trans.toJsFn)
    __obj.updateDynamic("t_drop_replies")(js.Any.fromFunction1((t0: java.lang.String) => t_drop_replies(t0).runNow()))
    __obj.updateDynamic("t_drop_replies_all")(t_drop_replies_all.toJsFn)
    __obj.updateDynamic("t_grep_status")(js.Any.fromFunction1((t0: scala.Double) => t_grep_status(t0).runNow()))
    __obj.updateDynamic("t_is_canceled")(t_is_canceled.toJsFn)
    __obj.updateDynamic("t_is_expired")(t_is_expired.toJsFn)
    __obj.updateDynamic("t_is_retr_async_reply")(t_is_retr_async_reply.toJsFn)
    __obj.updateDynamic("t_is_set")(js.Any.fromFunction1((t0: java.lang.String) => t_is_set(t0).runNow()))
    __obj.updateDynamic("t_load_contacts")(t_load_contacts.toJsFn)
    __obj.updateDynamic("t_lookup_cancel")(t_lookup_cancel.toJsFn)
    __obj.updateDynamic("t_lookup_cancel_flags")(js.Any.fromFunction1((t0: scala.Double) => t_lookup_cancel_flags(t0).runNow()))
    __obj.updateDynamic("t_lookup_request")(t_lookup_request.toJsFn)
    __obj.updateDynamic("t_newtran")(t_newtran.toJsFn)
    __obj.updateDynamic("t_next_contact_flow")(t_next_contact_flow.toJsFn)
    __obj.updateDynamic("t_next_contacts")(t_next_contacts.toJsFn)
    __obj.updateDynamic("t_on_branch")(js.Any.fromFunction1((t0: java.lang.String) => t_on_branch(t0).runNow()))
    __obj.updateDynamic("t_on_branch_failure")(js.Any.fromFunction1((t0: java.lang.String) => t_on_branch_failure(t0).runNow()))
    __obj.updateDynamic("t_on_failure")(js.Any.fromFunction1((t0: java.lang.String) => t_on_failure(t0).runNow()))
    __obj.updateDynamic("t_on_reply")(js.Any.fromFunction1((t0: java.lang.String) => t_on_reply(t0).runNow()))
    __obj.updateDynamic("t_relay")(t_relay.toJsFn)
    __obj.updateDynamic("t_release")(t_release.toJsFn)
    __obj.updateDynamic("t_replicate")(js.Any.fromFunction1((t0: java.lang.String) => t_replicate(t0).runNow()))
    __obj.updateDynamic("t_reply")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => t_reply(t0, t1).runNow()))
    __obj.updateDynamic("t_reset_fr")(t_reset_fr.toJsFn)
    __obj.updateDynamic("t_reset_max_lifetime")(t_reset_max_lifetime.toJsFn)
    __obj.updateDynamic("t_reset_retr")(t_reset_retr.toJsFn)
    __obj.updateDynamic("t_retransmit_reply")(t_retransmit_reply.toJsFn)
    __obj.updateDynamic("t_save_lumps")(t_save_lumps.toJsFn)
    __obj.updateDynamic("t_send_reply")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => t_send_reply(t0, t1).runNow()))
    __obj.updateDynamic("t_set_auto_inv_100")(js.Any.fromFunction1((t0: scala.Double) => t_set_auto_inv_100(t0).runNow()))
    __obj.updateDynamic("t_set_disable_6xx")(js.Any.fromFunction1((t0: scala.Double) => t_set_disable_6xx(t0).runNow()))
    __obj.updateDynamic("t_set_disable_failover")(js.Any.fromFunction1((t0: scala.Double) => t_set_disable_failover(t0).runNow()))
    __obj.updateDynamic("t_set_disable_internal_reply")(js.Any.fromFunction1((t0: scala.Double) => t_set_disable_internal_reply(t0).runNow()))
    __obj.updateDynamic("t_set_fr")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => t_set_fr(t0, t1).runNow()))
    __obj.updateDynamic("t_set_fr_inv")(js.Any.fromFunction1((t0: scala.Double) => t_set_fr_inv(t0).runNow()))
    __obj.updateDynamic("t_set_max_lifetime")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => t_set_max_lifetime(t0, t1).runNow()))
    __obj.updateDynamic("t_set_no_e2e_cancel_reason")(js.Any.fromFunction1((t0: scala.Double) => t_set_no_e2e_cancel_reason(t0).runNow()))
    __obj.updateDynamic("t_set_retr")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => t_set_retr(t0, t1).runNow()))
    __obj.updateDynamic("t_uac_send")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String, t5: java.lang.String) => t_uac_send(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("t_use_uac_headers")(t_use_uac_headers.toJsFn)
    __obj.asInstanceOf[Typeoftm]
  }
}

