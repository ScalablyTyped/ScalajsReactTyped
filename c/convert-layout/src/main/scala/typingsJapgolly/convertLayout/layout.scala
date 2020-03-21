package typingsJapgolly.convertLayout

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait layout extends js.Object {
  def fromEn(s: String): String
  def toEn(s: String): String
}

object layout {
  @scala.inline
  def apply(fromEn: String => CallbackTo[String], toEn: String => CallbackTo[String]): layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromEn")(js.Any.fromFunction1((t0: java.lang.String) => fromEn(t0).runNow()))
    __obj.updateDynamic("toEn")(js.Any.fromFunction1((t0: java.lang.String) => toEn(t0).runNow()))
    __obj.asInstanceOf[layout]
  }
}

