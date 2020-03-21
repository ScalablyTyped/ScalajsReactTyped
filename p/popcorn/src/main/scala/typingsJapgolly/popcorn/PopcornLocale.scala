package typingsJapgolly.popcorn

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornLocale extends js.Object {
  def get(): String
  def set(langRegion: String): js.Any
}

object PopcornLocale {
  @scala.inline
  def apply(get: CallbackTo[String], set: String => CallbackTo[js.Any]): PopcornLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[PopcornLocale]
  }
}

