package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofmiscRadius extends js.Object {
  def does_uri_exist(): Double
  def does_uri_exist_uval(suri: String): Double
  def does_uri_user_exist(): Double
  def does_uri_user_exist_uval(user: String): Double
  def is_user_in(user: String, group: String): Double
  def load_callee_avps(user: String): Double
  def load_caller_avps(user: String): Double
}

object TypeofmiscRadius {
  @scala.inline
  def apply(
    does_uri_exist: CallbackTo[Double],
    does_uri_exist_uval: String => CallbackTo[Double],
    does_uri_user_exist: CallbackTo[Double],
    does_uri_user_exist_uval: String => CallbackTo[Double],
    is_user_in: (String, String) => CallbackTo[Double],
    load_callee_avps: String => CallbackTo[Double],
    load_caller_avps: String => CallbackTo[Double]
  ): TypeofmiscRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("does_uri_exist")(does_uri_exist.toJsFn)
    __obj.updateDynamic("does_uri_exist_uval")(js.Any.fromFunction1((t0: java.lang.String) => does_uri_exist_uval(t0).runNow()))
    __obj.updateDynamic("does_uri_user_exist")(does_uri_user_exist.toJsFn)
    __obj.updateDynamic("does_uri_user_exist_uval")(js.Any.fromFunction1((t0: java.lang.String) => does_uri_user_exist_uval(t0).runNow()))
    __obj.updateDynamic("is_user_in")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_user_in(t0, t1).runNow()))
    __obj.updateDynamic("load_callee_avps")(js.Any.fromFunction1((t0: java.lang.String) => load_callee_avps(t0).runNow()))
    __obj.updateDynamic("load_caller_avps")(js.Any.fromFunction1((t0: java.lang.String) => load_caller_avps(t0).runNow()))
    __obj.asInstanceOf[TypeofmiscRadius]
  }
}

