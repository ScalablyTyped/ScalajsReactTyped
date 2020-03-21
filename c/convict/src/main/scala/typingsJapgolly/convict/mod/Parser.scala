package typingsJapgolly.convict.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var extension: String | js.Array[String]
  def parse(content: String): js.Any
}

object Parser {
  @scala.inline
  def apply(extension: String | js.Array[String], parse: String => CallbackTo[js.Any]): Parser = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

