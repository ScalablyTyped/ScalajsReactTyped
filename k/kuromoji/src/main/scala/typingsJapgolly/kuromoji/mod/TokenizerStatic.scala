package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerStatic extends js.Object {
  def splitByPunctuation(input: String): js.Array[String]
}

object TokenizerStatic {
  @scala.inline
  def apply(splitByPunctuation: String => CallbackTo[js.Array[String]]): TokenizerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("splitByPunctuation")(js.Any.fromFunction1((t0: java.lang.String) => splitByPunctuation(t0).runNow()))
    __obj.asInstanceOf[TokenizerStatic]
  }
}

