package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflcr extends js.Object {
  def defunct_gw(defunct_period: Double): Double
  def from_any_gw(): Double
  def from_any_gw_addr(addr_str: String, transport: Double): Double
  def from_gw(lcr_id: Double): Double
  def from_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double
  def inactivate_gw(): Double
  def load_gws(lcr_id: Double): Double
  def load_gws_furi(lcr_id: Double, ruri_user: String, from_uri: String): Double
  def load_gws_ruser(lcr_id: Double, ruri_user: String): Double
  def next_gw(): Double
  def to_any_gw(): Double
  def to_any_gw_addr(addr_str: String, transport: Double): Double
  def to_gw(lcr_id: Double): Double
  def to_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double
}

object Typeoflcr {
  @scala.inline
  def apply(
    defunct_gw: Double => CallbackTo[Double],
    from_any_gw: CallbackTo[Double],
    from_any_gw_addr: (String, Double) => CallbackTo[Double],
    from_gw: Double => CallbackTo[Double],
    from_gw_addr: (Double, String, Double) => CallbackTo[Double],
    inactivate_gw: CallbackTo[Double],
    load_gws: Double => CallbackTo[Double],
    load_gws_furi: (Double, String, String) => CallbackTo[Double],
    load_gws_ruser: (Double, String) => CallbackTo[Double],
    next_gw: CallbackTo[Double],
    to_any_gw: CallbackTo[Double],
    to_any_gw_addr: (String, Double) => CallbackTo[Double],
    to_gw: Double => CallbackTo[Double],
    to_gw_addr: (Double, String, Double) => CallbackTo[Double]
  ): Typeoflcr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defunct_gw")(js.Any.fromFunction1((t0: scala.Double) => defunct_gw(t0).runNow()))
    __obj.updateDynamic("from_any_gw")(from_any_gw.toJsFn)
    __obj.updateDynamic("from_any_gw_addr")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => from_any_gw_addr(t0, t1).runNow()))
    __obj.updateDynamic("from_gw")(js.Any.fromFunction1((t0: scala.Double) => from_gw(t0).runNow()))
    __obj.updateDynamic("from_gw_addr")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => from_gw_addr(t0, t1, t2).runNow()))
    __obj.updateDynamic("inactivate_gw")(inactivate_gw.toJsFn)
    __obj.updateDynamic("load_gws")(js.Any.fromFunction1((t0: scala.Double) => load_gws(t0).runNow()))
    __obj.updateDynamic("load_gws_furi")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => load_gws_furi(t0, t1, t2).runNow()))
    __obj.updateDynamic("load_gws_ruser")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => load_gws_ruser(t0, t1).runNow()))
    __obj.updateDynamic("next_gw")(next_gw.toJsFn)
    __obj.updateDynamic("to_any_gw")(to_any_gw.toJsFn)
    __obj.updateDynamic("to_any_gw_addr")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => to_any_gw_addr(t0, t1).runNow()))
    __obj.updateDynamic("to_gw")(js.Any.fromFunction1((t0: scala.Double) => to_gw(t0).runNow()))
    __obj.updateDynamic("to_gw_addr")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => to_gw_addr(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeoflcr]
  }
}

