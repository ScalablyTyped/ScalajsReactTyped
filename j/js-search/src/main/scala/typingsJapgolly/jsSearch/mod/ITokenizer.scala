package typingsJapgolly.jsSearch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenizer extends js.Object {
  def tokenize(text: String): js.Array[String]
}

object ITokenizer {
  @scala.inline
  def apply(tokenize: String => CallbackTo[js.Array[String]]): ITokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: java.lang.String) => tokenize(t0).runNow()))
    __obj.asInstanceOf[ITokenizer]
  }
}

