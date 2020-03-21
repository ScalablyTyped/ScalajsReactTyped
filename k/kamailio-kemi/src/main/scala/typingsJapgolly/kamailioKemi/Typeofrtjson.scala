package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtjson extends js.Object {
  def init_routes(rdoc: String): Double
  def next_route(): Double
  def push_routes(): Double
  def update_branch(): Double
}

object Typeofrtjson {
  @scala.inline
  def apply(
    init_routes: String => CallbackTo[Double],
    next_route: CallbackTo[Double],
    push_routes: CallbackTo[Double],
    update_branch: CallbackTo[Double]
  ): Typeofrtjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init_routes")(js.Any.fromFunction1((t0: java.lang.String) => init_routes(t0).runNow()))
    __obj.updateDynamic("next_route")(next_route.toJsFn)
    __obj.updateDynamic("push_routes")(push_routes.toJsFn)
    __obj.updateDynamic("update_branch")(update_branch.toJsFn)
    __obj.asInstanceOf[Typeofrtjson]
  }
}

