package typingsJapgolly.chromecastCafSender

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Global object
////////////////////
trait Window extends js.Object {
  var cast: Typeofcast
  def __onGCastApiAvailable(available: Boolean): Unit
}

object Window {
  @scala.inline
  def apply(__onGCastApiAvailable: Boolean => Callback, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(cast = cast.asInstanceOf[js.Any])
    __obj.updateDynamic("__onGCastApiAvailable")(js.Any.fromFunction1((t0: scala.Boolean) => __onGCastApiAvailable(t0).runNow()))
    __obj.asInstanceOf[Window]
  }
}

