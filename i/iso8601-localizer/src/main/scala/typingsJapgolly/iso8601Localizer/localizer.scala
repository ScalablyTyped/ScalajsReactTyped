package typingsJapgolly.iso8601Localizer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait localizer extends js.Object {
  def localize(): String
  def returnAs(as: String): localizer
  def to(offset: Double): localizer
}

object localizer {
  @scala.inline
  def apply(
    localize: CallbackTo[String],
    returnAs: String => CallbackTo[localizer],
    to: Double => CallbackTo[localizer]
  ): localizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localize")(localize.toJsFn)
    __obj.updateDynamic("returnAs")(js.Any.fromFunction1((t0: java.lang.String) => returnAs(t0).runNow()))
    __obj.updateDynamic("to")(js.Any.fromFunction1((t0: scala.Double) => to(t0).runNow()))
    __obj.asInstanceOf[localizer]
  }
}

