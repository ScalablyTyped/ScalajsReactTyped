package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options that can be accepted by `findRoute()` and friends.
  */
trait RouteOptions extends js.Object {
  def routeCallback(roomName: String, fromRoomName: String): js.Any
}

object RouteOptions {
  @scala.inline
  def apply(routeCallback: (String, String) => CallbackTo[js.Any]): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routeCallback")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => routeCallback(t0, t1).runNow()))
    __obj.asInstanceOf[RouteOptions]
  }
}

