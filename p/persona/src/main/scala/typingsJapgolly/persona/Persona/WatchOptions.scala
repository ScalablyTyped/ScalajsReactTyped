package typingsJapgolly.persona.Persona

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var loggedInUser: String
  var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
  def onlogin(s: String): Unit
  def onlogout(): Unit
}

object WatchOptions {
  @scala.inline
  def apply(
    loggedInUser: String,
    onlogin: String => Callback,
    onlogout: Callback,
    onready: js.UndefOr[Callback] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any])
    __obj.updateDynamic("onlogin")(js.Any.fromFunction1((t0: java.lang.String) => onlogin(t0).runNow()))
    __obj.updateDynamic("onlogout")(onlogout.toJsFn)
    onready.foreach(p => __obj.updateDynamic("onready")(p.toJsFn))
    __obj.asInstanceOf[WatchOptions]
  }
}

