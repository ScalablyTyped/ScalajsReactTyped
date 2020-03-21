package typingsJapgolly.lucene.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def escape(str: String): String
  def unescape(str: String): String
}

object Parser {
  @scala.inline
  def apply(escape: String => CallbackTo[String], unescape: String => CallbackTo[String]): Parser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: java.lang.String) => escape(t0).runNow()))
    __obj.updateDynamic("unescape")(js.Any.fromFunction1((t0: java.lang.String) => unescape(t0).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

