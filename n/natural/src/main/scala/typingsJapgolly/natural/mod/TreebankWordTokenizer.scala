package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreebankWordTokenizer extends Tokenizer

object TreebankWordTokenizer {
  @scala.inline
  def apply(tokenize: String => CallbackTo[js.Array[String]]): TreebankWordTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: java.lang.String) => tokenize(t0).runNow()))
    __obj.asInstanceOf[TreebankWordTokenizer]
  }
}

