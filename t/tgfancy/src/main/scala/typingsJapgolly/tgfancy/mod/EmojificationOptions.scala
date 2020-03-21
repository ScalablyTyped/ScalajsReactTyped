package typingsJapgolly.tgfancy.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojificationOptions extends js.Object {
  def emojify(text: String): String
}

object EmojificationOptions {
  @scala.inline
  def apply(emojify: String => CallbackTo[String]): EmojificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emojify")(js.Any.fromFunction1((t0: java.lang.String) => emojify(t0).runNow()))
    __obj.asInstanceOf[EmojificationOptions]
  }
}

