package typingsJapgolly.kramed.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedParser extends js.Object {
  def parse(source: js.Array[_]): String
}

object KramedParser {
  @scala.inline
  def apply(parse: js.Array[js.Any] => CallbackTo[String]): KramedParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Array[js.Any]) => parse(t0).runNow()))
    __obj.asInstanceOf[KramedParser]
  }
}

