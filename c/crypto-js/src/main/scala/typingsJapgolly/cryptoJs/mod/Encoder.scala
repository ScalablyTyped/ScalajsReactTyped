package typingsJapgolly.cryptoJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  def parse(encodedMessage: String): js.Any
  def stringify(words: js.Any): String
}

object Encoder {
  @scala.inline
  def apply(parse: String => CallbackTo[js.Any], stringify: js.Any => CallbackTo[String]): Encoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: js.Any) => stringify(t0).runNow()))
    __obj.asInstanceOf[Encoder]
  }
}

