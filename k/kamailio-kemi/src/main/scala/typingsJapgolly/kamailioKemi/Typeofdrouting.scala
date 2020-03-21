package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdrouting extends js.Object {
  def do_routing(grp_id: Double): Double
  def do_routing_furi(): Double
  def goes_to_gw(): Double
  def goes_to_gw_type(`type`: Double): Double
  def is_from_gw(): Double
  def is_from_gw_type(`type`: Double): Double
  def is_from_gw_type_flags(`type`: Double, flags: Double): Double
  def next_routing(): Double
  def use_next_gw(): Double
}

object Typeofdrouting {
  @scala.inline
  def apply(
    do_routing: Double => CallbackTo[Double],
    do_routing_furi: CallbackTo[Double],
    goes_to_gw: CallbackTo[Double],
    goes_to_gw_type: Double => CallbackTo[Double],
    is_from_gw: CallbackTo[Double],
    is_from_gw_type: Double => CallbackTo[Double],
    is_from_gw_type_flags: (Double, Double) => CallbackTo[Double],
    next_routing: CallbackTo[Double],
    use_next_gw: CallbackTo[Double]
  ): Typeofdrouting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("do_routing")(js.Any.fromFunction1((t0: scala.Double) => do_routing(t0).runNow()))
    __obj.updateDynamic("do_routing_furi")(do_routing_furi.toJsFn)
    __obj.updateDynamic("goes_to_gw")(goes_to_gw.toJsFn)
    __obj.updateDynamic("goes_to_gw_type")(js.Any.fromFunction1((t0: scala.Double) => goes_to_gw_type(t0).runNow()))
    __obj.updateDynamic("is_from_gw")(is_from_gw.toJsFn)
    __obj.updateDynamic("is_from_gw_type")(js.Any.fromFunction1((t0: scala.Double) => is_from_gw_type(t0).runNow()))
    __obj.updateDynamic("is_from_gw_type_flags")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => is_from_gw_type_flags(t0, t1).runNow()))
    __obj.updateDynamic("next_routing")(next_routing.toJsFn)
    __obj.updateDynamic("use_next_gw")(use_next_gw.toJsFn)
    __obj.asInstanceOf[Typeofdrouting]
  }
}

