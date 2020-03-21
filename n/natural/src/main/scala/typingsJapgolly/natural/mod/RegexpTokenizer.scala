package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexpTokenizer extends Tokenizer

object RegexpTokenizer {
  @scala.inline
  def apply(tokenize: String => CallbackTo[js.Array[String]]): RegexpTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: java.lang.String) => tokenize(t0).runNow()))
    __obj.asInstanceOf[RegexpTokenizer]
  }
}

