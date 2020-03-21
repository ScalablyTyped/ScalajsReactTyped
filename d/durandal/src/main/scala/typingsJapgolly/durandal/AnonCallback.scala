package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var routePattern: js.RegExp
  def callback(fragment: String): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: String => Callback, routePattern: js.RegExp): AnonCallback = {
    val __obj = js.Dynamic.literal(routePattern = routePattern.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: java.lang.String) => callback(t0).runNow()))
    __obj.asInstanceOf[AnonCallback]
  }
}

