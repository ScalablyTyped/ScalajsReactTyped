package typingsJapgolly.formatUnicorn

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def formatUnicorn(replacements: js.Object): java.lang.String
}

object String {
  @scala.inline
  def apply(formatUnicorn: js.Object => CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatUnicorn")(js.Any.fromFunction1((t0: js.Object) => formatUnicorn(t0).runNow()))
    __obj.asInstanceOf[String]
  }
}

