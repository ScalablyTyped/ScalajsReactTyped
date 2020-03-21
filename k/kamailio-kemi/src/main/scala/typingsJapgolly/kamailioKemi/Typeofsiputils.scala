package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiputils extends js.Object {
  def has_totag(): Double
  def is_alphanum(tval: String): Double
  def is_alphanumex(tval: String, eset: String): Double
  def is_first_hop(): Double
  def is_numeric(tval: String): Double
  def is_reply(): Double
  def is_request(): Double
  def is_tel_number(tval: String): Double
  def is_uri(suri: String): Double
  def is_user(suser: String): Double
  def uri_param(sparam: String): Double
  def uri_param_value(sparam: String, svalue: String): Double
}

object Typeofsiputils {
  @scala.inline
  def apply(
    has_totag: CallbackTo[Double],
    is_alphanum: String => CallbackTo[Double],
    is_alphanumex: (String, String) => CallbackTo[Double],
    is_first_hop: CallbackTo[Double],
    is_numeric: String => CallbackTo[Double],
    is_reply: CallbackTo[Double],
    is_request: CallbackTo[Double],
    is_tel_number: String => CallbackTo[Double],
    is_uri: String => CallbackTo[Double],
    is_user: String => CallbackTo[Double],
    uri_param: String => CallbackTo[Double],
    uri_param_value: (String, String) => CallbackTo[Double]
  ): Typeofsiputils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has_totag")(has_totag.toJsFn)
    __obj.updateDynamic("is_alphanum")(js.Any.fromFunction1((t0: java.lang.String) => is_alphanum(t0).runNow()))
    __obj.updateDynamic("is_alphanumex")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_alphanumex(t0, t1).runNow()))
    __obj.updateDynamic("is_first_hop")(is_first_hop.toJsFn)
    __obj.updateDynamic("is_numeric")(js.Any.fromFunction1((t0: java.lang.String) => is_numeric(t0).runNow()))
    __obj.updateDynamic("is_reply")(is_reply.toJsFn)
    __obj.updateDynamic("is_request")(is_request.toJsFn)
    __obj.updateDynamic("is_tel_number")(js.Any.fromFunction1((t0: java.lang.String) => is_tel_number(t0).runNow()))
    __obj.updateDynamic("is_uri")(js.Any.fromFunction1((t0: java.lang.String) => is_uri(t0).runNow()))
    __obj.updateDynamic("is_user")(js.Any.fromFunction1((t0: java.lang.String) => is_user(t0).runNow()))
    __obj.updateDynamic("uri_param")(js.Any.fromFunction1((t0: java.lang.String) => uri_param(t0).runNow()))
    __obj.updateDynamic("uri_param_value")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => uri_param_value(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofsiputils]
  }
}

