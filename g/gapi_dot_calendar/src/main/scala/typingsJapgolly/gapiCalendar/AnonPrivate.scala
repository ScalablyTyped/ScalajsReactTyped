package typingsJapgolly.gapiCalendar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  def `private`(key: String): String
  def shared(key: String): String
}

object AnonPrivate {
  @scala.inline
  def apply(`private`: String => CallbackTo[String], shared: String => CallbackTo[String]): AnonPrivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("private")(js.Any.fromFunction1((t0: java.lang.String) => `private`(t0).runNow()))
    __obj.updateDynamic("shared")(js.Any.fromFunction1((t0: java.lang.String) => shared(t0).runNow()))
    __obj.asInstanceOf[AnonPrivate]
  }
}

