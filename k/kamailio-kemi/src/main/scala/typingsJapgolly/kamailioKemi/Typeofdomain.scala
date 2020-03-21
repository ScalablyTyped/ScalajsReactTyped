package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdomain extends js.Object {
  def is_domain_local(sdomain: String): Double
  def is_from_local(): Double
  def is_uri_host_local(): Double
  def lookup_domain(_sdomain: String): Double
  def lookup_domain_prefix(_sdomain: String, _sprefix: String): Double
}

object Typeofdomain {
  @scala.inline
  def apply(
    is_domain_local: String => CallbackTo[Double],
    is_from_local: CallbackTo[Double],
    is_uri_host_local: CallbackTo[Double],
    lookup_domain: String => CallbackTo[Double],
    lookup_domain_prefix: (String, String) => CallbackTo[Double]
  ): Typeofdomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_domain_local")(js.Any.fromFunction1((t0: java.lang.String) => is_domain_local(t0).runNow()))
    __obj.updateDynamic("is_from_local")(is_from_local.toJsFn)
    __obj.updateDynamic("is_uri_host_local")(is_uri_host_local.toJsFn)
    __obj.updateDynamic("lookup_domain")(js.Any.fromFunction1((t0: java.lang.String) => lookup_domain(t0).runNow()))
    __obj.updateDynamic("lookup_domain_prefix")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup_domain_prefix(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofdomain]
  }
}

