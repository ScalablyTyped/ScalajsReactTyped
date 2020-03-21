package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftextopsx extends js.Object {
  def append_hf_value(hexp: String, `val`: String): Double
  def assign_hf_value(hexp: String, `val`: String): Double
  def assign_hf_value2(hexp: String, `val`: String): Double
  def change_reply_status(code: Double, reason: String): Double
  def exclude_hf_value(hexp: String, `val`: String): Double
  def fnmatch(`val`: String, `match`: String): Double
  def fnmatch_ex(`val`: String, `match`: String, flags: String): Double
  def hf_value_exists(hexp: String, `val`: String): Double
  def include_hf_value(hexp: String, `val`: String): Double
  def insert_hf_value(hexp: String, `val`: String): Double
  def keep_hf(): Double
  def keep_hf_re(sre: String): Double
  def msg_apply_changes(): Double
  def msg_set_buffer(obuf: String): Double
  def remove_body(): Double
  def remove_hf_value(hexp: String): Double
  def remove_hf_value2(hexp: String, `val`: String): Double
}

object Typeoftextopsx {
  @scala.inline
  def apply(
    append_hf_value: (String, String) => CallbackTo[Double],
    assign_hf_value: (String, String) => CallbackTo[Double],
    assign_hf_value2: (String, String) => CallbackTo[Double],
    change_reply_status: (Double, String) => CallbackTo[Double],
    exclude_hf_value: (String, String) => CallbackTo[Double],
    fnmatch: (String, String) => CallbackTo[Double],
    fnmatch_ex: (String, String, String) => CallbackTo[Double],
    hf_value_exists: (String, String) => CallbackTo[Double],
    include_hf_value: (String, String) => CallbackTo[Double],
    insert_hf_value: (String, String) => CallbackTo[Double],
    keep_hf: CallbackTo[Double],
    keep_hf_re: String => CallbackTo[Double],
    msg_apply_changes: CallbackTo[Double],
    msg_set_buffer: String => CallbackTo[Double],
    remove_body: CallbackTo[Double],
    remove_hf_value: String => CallbackTo[Double],
    remove_hf_value2: (String, String) => CallbackTo[Double]
  ): Typeoftextopsx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append_hf_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => append_hf_value(t0, t1).runNow()))
    __obj.updateDynamic("assign_hf_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => assign_hf_value(t0, t1).runNow()))
    __obj.updateDynamic("assign_hf_value2")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => assign_hf_value2(t0, t1).runNow()))
    __obj.updateDynamic("change_reply_status")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => change_reply_status(t0, t1).runNow()))
    __obj.updateDynamic("exclude_hf_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => exclude_hf_value(t0, t1).runNow()))
    __obj.updateDynamic("fnmatch")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => fnmatch(t0, t1).runNow()))
    __obj.updateDynamic("fnmatch_ex")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => fnmatch_ex(t0, t1, t2).runNow()))
    __obj.updateDynamic("hf_value_exists")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => hf_value_exists(t0, t1).runNow()))
    __obj.updateDynamic("include_hf_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => include_hf_value(t0, t1).runNow()))
    __obj.updateDynamic("insert_hf_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => insert_hf_value(t0, t1).runNow()))
    __obj.updateDynamic("keep_hf")(keep_hf.toJsFn)
    __obj.updateDynamic("keep_hf_re")(js.Any.fromFunction1((t0: java.lang.String) => keep_hf_re(t0).runNow()))
    __obj.updateDynamic("msg_apply_changes")(msg_apply_changes.toJsFn)
    __obj.updateDynamic("msg_set_buffer")(js.Any.fromFunction1((t0: java.lang.String) => msg_set_buffer(t0).runNow()))
    __obj.updateDynamic("remove_body")(remove_body.toJsFn)
    __obj.updateDynamic("remove_hf_value")(js.Any.fromFunction1((t0: java.lang.String) => remove_hf_value(t0).runNow()))
    __obj.updateDynamic("remove_hf_value2")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove_hf_value2(t0, t1).runNow()))
    __obj.asInstanceOf[Typeoftextopsx]
  }
}

