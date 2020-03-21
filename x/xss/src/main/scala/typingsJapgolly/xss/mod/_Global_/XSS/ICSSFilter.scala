package typingsJapgolly.xss.mod._Global_.XSS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSSFilter extends js.Object {
  def process(value: String): String
}

object ICSSFilter {
  @scala.inline
  def apply(process: String => CallbackTo[String]): ICSSFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: java.lang.String) => process(t0).runNow()))
    __obj.asInstanceOf[ICSSFilter]
  }
}

