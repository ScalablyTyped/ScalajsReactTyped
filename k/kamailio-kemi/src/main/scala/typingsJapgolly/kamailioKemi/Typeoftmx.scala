package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftmx extends js.Object {
  def t_cancel_branches(mode: String): Double
  def t_cancel_callid(callid_s: String, cseq_s: String, fl: Double): Double
  def t_cancel_callid_reason(callid_s: String, cseq_s: String, fl: Double, rcode: Double): Double
  def t_continue(tindex: Double, tlabel: Double, cbname: String): Double
  def t_flush_flags(): Double
  def t_flush_xflags(): Double
  def t_is_branch_route(): Double
  def t_is_failure_route(): Double
  def t_is_reply_route(): Double
  def t_is_request_route(): Double
  def t_precheck_trans(): Double
  def t_reply_callid(callid_s: String, cseq_s: String, code: Double, status_s: String): Double
  def t_reuse_branch(): Double
  def t_suspend(): Double
}

object Typeoftmx {
  @scala.inline
  def apply(
    t_cancel_branches: String => CallbackTo[Double],
    t_cancel_callid: (String, String, Double) => CallbackTo[Double],
    t_cancel_callid_reason: (String, String, Double, Double) => CallbackTo[Double],
    t_continue: (Double, Double, String) => CallbackTo[Double],
    t_flush_flags: CallbackTo[Double],
    t_flush_xflags: CallbackTo[Double],
    t_is_branch_route: CallbackTo[Double],
    t_is_failure_route: CallbackTo[Double],
    t_is_reply_route: CallbackTo[Double],
    t_is_request_route: CallbackTo[Double],
    t_precheck_trans: CallbackTo[Double],
    t_reply_callid: (String, String, Double, String) => CallbackTo[Double],
    t_reuse_branch: CallbackTo[Double],
    t_suspend: CallbackTo[Double]
  ): Typeoftmx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("t_cancel_branches")(js.Any.fromFunction1((t0: java.lang.String) => t_cancel_branches(t0).runNow()))
    __obj.updateDynamic("t_cancel_callid")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => t_cancel_callid(t0, t1, t2).runNow()))
    __obj.updateDynamic("t_cancel_callid_reason")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double) => t_cancel_callid_reason(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("t_continue")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => t_continue(t0, t1, t2).runNow()))
    __obj.updateDynamic("t_flush_flags")(t_flush_flags.toJsFn)
    __obj.updateDynamic("t_flush_xflags")(t_flush_xflags.toJsFn)
    __obj.updateDynamic("t_is_branch_route")(t_is_branch_route.toJsFn)
    __obj.updateDynamic("t_is_failure_route")(t_is_failure_route.toJsFn)
    __obj.updateDynamic("t_is_reply_route")(t_is_reply_route.toJsFn)
    __obj.updateDynamic("t_is_request_route")(t_is_request_route.toJsFn)
    __obj.updateDynamic("t_precheck_trans")(t_precheck_trans.toJsFn)
    __obj.updateDynamic("t_reply_callid")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: java.lang.String) => t_reply_callid(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("t_reuse_branch")(t_reuse_branch.toJsFn)
    __obj.updateDynamic("t_suspend")(t_suspend.toJsFn)
    __obj.asInstanceOf[Typeoftmx]
  }
}

