package typingsJapgolly.routeRecognizer.dslMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[Delegate] = js.undefined
  def add(routes: js.Array[Route]): Unit
}

object RouteRecognizer {
  @scala.inline
  def apply(add: js.Array[Route] => Callback, delegate: Delegate = null): RouteRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.routeRecognizer.dslMod.Route]) => add(t0).runNow()))
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecognizer]
  }
}

