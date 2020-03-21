package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprefixRoute extends js.Object {
  def prefix_route(ruser: String): Double
  def prefix_route_uri(): Double
}

object TypeofprefixRoute {
  @scala.inline
  def apply(prefix_route: String => CallbackTo[Double], prefix_route_uri: CallbackTo[Double]): TypeofprefixRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefix_route")(js.Any.fromFunction1((t0: java.lang.String) => prefix_route(t0).runNow()))
    __obj.updateDynamic("prefix_route_uri")(prefix_route_uri.toJsFn)
    __obj.asInstanceOf[TypeofprefixRoute]
  }
}

