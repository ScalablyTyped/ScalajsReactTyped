package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofipops extends js.Object {
  def compare_ips(_sval1: String, _sval2: String): Double
  def compare_pure_ips(_sval1: String, _sval2: String): Double
  def detailed_ip_type(_sval: String, _dpv: String): Double
  def detailed_ipv4_type(_sval: String, _dpv: String): Double
  def detailed_ipv6_type(_sval: String, _dpv: String): Double
  def dns_int_match_ip(vhn: String, vip: String): Double
  def dns_query(naptrname: String, pvid: String): Double
  def dns_sys_match_ip(vhn: String, vip: String): Double
  def ip_is_in_subnet(_sval1: String, _sval2: String): Double
  def ip_type(sval: String): Double
  def is_in_subnet(_sval1: String, _sval2: String): Double
  def is_ip(sval: String): Double
  def is_ip4(sval: String): Double
  def is_ip6(sval: String): Double
  def is_ip6_reference(sval: String): Double
  def is_ip_rfc1918(sval: String): Double
  def is_pure_ip(sval: String): Double
  def naptr_query(naptrname: String, pvid: String): Double
  def srv_query(naptrname: String, pvid: String): Double
}

object Typeofipops {
  @scala.inline
  def apply(
    compare_ips: (String, String) => CallbackTo[Double],
    compare_pure_ips: (String, String) => CallbackTo[Double],
    detailed_ip_type: (String, String) => CallbackTo[Double],
    detailed_ipv4_type: (String, String) => CallbackTo[Double],
    detailed_ipv6_type: (String, String) => CallbackTo[Double],
    dns_int_match_ip: (String, String) => CallbackTo[Double],
    dns_query: (String, String) => CallbackTo[Double],
    dns_sys_match_ip: (String, String) => CallbackTo[Double],
    ip_is_in_subnet: (String, String) => CallbackTo[Double],
    ip_type: String => CallbackTo[Double],
    is_in_subnet: (String, String) => CallbackTo[Double],
    is_ip: String => CallbackTo[Double],
    is_ip4: String => CallbackTo[Double],
    is_ip6: String => CallbackTo[Double],
    is_ip6_reference: String => CallbackTo[Double],
    is_ip_rfc1918: String => CallbackTo[Double],
    is_pure_ip: String => CallbackTo[Double],
    naptr_query: (String, String) => CallbackTo[Double],
    srv_query: (String, String) => CallbackTo[Double]
  ): Typeofipops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare_ips")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => compare_ips(t0, t1).runNow()))
    __obj.updateDynamic("compare_pure_ips")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => compare_pure_ips(t0, t1).runNow()))
    __obj.updateDynamic("detailed_ip_type")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => detailed_ip_type(t0, t1).runNow()))
    __obj.updateDynamic("detailed_ipv4_type")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => detailed_ipv4_type(t0, t1).runNow()))
    __obj.updateDynamic("detailed_ipv6_type")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => detailed_ipv6_type(t0, t1).runNow()))
    __obj.updateDynamic("dns_int_match_ip")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => dns_int_match_ip(t0, t1).runNow()))
    __obj.updateDynamic("dns_query")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => dns_query(t0, t1).runNow()))
    __obj.updateDynamic("dns_sys_match_ip")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => dns_sys_match_ip(t0, t1).runNow()))
    __obj.updateDynamic("ip_is_in_subnet")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ip_is_in_subnet(t0, t1).runNow()))
    __obj.updateDynamic("ip_type")(js.Any.fromFunction1((t0: java.lang.String) => ip_type(t0).runNow()))
    __obj.updateDynamic("is_in_subnet")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_in_subnet(t0, t1).runNow()))
    __obj.updateDynamic("is_ip")(js.Any.fromFunction1((t0: java.lang.String) => is_ip(t0).runNow()))
    __obj.updateDynamic("is_ip4")(js.Any.fromFunction1((t0: java.lang.String) => is_ip4(t0).runNow()))
    __obj.updateDynamic("is_ip6")(js.Any.fromFunction1((t0: java.lang.String) => is_ip6(t0).runNow()))
    __obj.updateDynamic("is_ip6_reference")(js.Any.fromFunction1((t0: java.lang.String) => is_ip6_reference(t0).runNow()))
    __obj.updateDynamic("is_ip_rfc1918")(js.Any.fromFunction1((t0: java.lang.String) => is_ip_rfc1918(t0).runNow()))
    __obj.updateDynamic("is_pure_ip")(js.Any.fromFunction1((t0: java.lang.String) => is_pure_ip(t0).runNow()))
    __obj.updateDynamic("naptr_query")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => naptr_query(t0, t1).runNow()))
    __obj.updateDynamic("srv_query")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => srv_query(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofipops]
  }
}

