package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofasync extends js.Object {
  def route(rn: String, s: Double): Double
  def task_route(rn: String): Double
}

object Typeofasync {
  @scala.inline
  def apply(route: (String, Double) => CallbackTo[Double], task_route: String => CallbackTo[Double]): Typeofasync = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("route")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => route(t0, t1).runNow()))
    __obj.updateDynamic("task_route")(js.Any.fromFunction1((t0: java.lang.String) => task_route(t0).runNow()))
    __obj.asInstanceOf[Typeofasync]
  }
}

