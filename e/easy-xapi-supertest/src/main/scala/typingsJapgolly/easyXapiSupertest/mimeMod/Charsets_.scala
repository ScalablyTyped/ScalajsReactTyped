package typingsJapgolly.easyXapiSupertest.mimeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charsets_ extends js.Object {
  def lookup(mime: String): String
}

object Charsets_ {
  @scala.inline
  def apply(lookup: String => CallbackTo[String]): Charsets_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.asInstanceOf[Charsets_]
  }
}

