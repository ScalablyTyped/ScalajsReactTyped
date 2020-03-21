package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  def allow_address(addr_group: Double, ips: String, port: Double): Double
  def allow_address_group(_addr: String, _port: Double): Double
  def allow_source_address(addr_group: Double): Double
  def allow_source_address_group(): Double
}

object Typeofpermissions {
  @scala.inline
  def apply(
    allow_address: (Double, String, Double) => CallbackTo[Double],
    allow_address_group: (String, Double) => CallbackTo[Double],
    allow_source_address: Double => CallbackTo[Double],
    allow_source_address_group: CallbackTo[Double]
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow_address")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => allow_address(t0, t1, t2).runNow()))
    __obj.updateDynamic("allow_address_group")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => allow_address_group(t0, t1).runNow()))
    __obj.updateDynamic("allow_source_address")(js.Any.fromFunction1((t0: scala.Double) => allow_source_address(t0).runNow()))
    __obj.updateDynamic("allow_source_address_group")(allow_source_address_group.toJsFn)
    __obj.asInstanceOf[Typeofpermissions]
  }
}

