package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrr extends js.Object {
  def add_rr_param(sparam: String): Double
  def check_route_param(sre: String): Double
  def is_direction(dir: String): Double
  def loose_route(): Double
  def record_route(): Double
  def record_route_params(params: String): Double
  def remove_record_route(): Double
}

object Typeofrr {
  @scala.inline
  def apply(
    add_rr_param: String => CallbackTo[Double],
    check_route_param: String => CallbackTo[Double],
    is_direction: String => CallbackTo[Double],
    loose_route: CallbackTo[Double],
    record_route: CallbackTo[Double],
    record_route_params: String => CallbackTo[Double],
    remove_record_route: CallbackTo[Double]
  ): Typeofrr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_rr_param")(js.Any.fromFunction1((t0: java.lang.String) => add_rr_param(t0).runNow()))
    __obj.updateDynamic("check_route_param")(js.Any.fromFunction1((t0: java.lang.String) => check_route_param(t0).runNow()))
    __obj.updateDynamic("is_direction")(js.Any.fromFunction1((t0: java.lang.String) => is_direction(t0).runNow()))
    __obj.updateDynamic("loose_route")(loose_route.toJsFn)
    __obj.updateDynamic("record_route")(record_route.toJsFn)
    __obj.updateDynamic("record_route_params")(js.Any.fromFunction1((t0: java.lang.String) => record_route_params(t0).runNow()))
    __obj.updateDynamic("remove_record_route")(remove_record_route.toJsFn)
    __obj.asInstanceOf[Typeofrr]
  }
}

