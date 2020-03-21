package typingsJapgolly.jqueryUrlparam

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def urlParam(variable: String): String
}

object JQueryStatic {
  @scala.inline
  def apply(urlParam: String => CallbackTo[String]): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("urlParam")(js.Any.fromFunction1((t0: java.lang.String) => urlParam(t0).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

