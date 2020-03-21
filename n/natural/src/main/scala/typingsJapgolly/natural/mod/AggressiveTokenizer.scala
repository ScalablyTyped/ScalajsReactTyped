package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggressiveTokenizer extends Tokenizer

object AggressiveTokenizer {
  @scala.inline
  def apply(tokenize: String => CallbackTo[js.Array[String]]): AggressiveTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: java.lang.String) => tokenize(t0).runNow()))
    __obj.asInstanceOf[AggressiveTokenizer]
  }
}

