package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemmer extends js.Object {
  def attach(): Unit
  def stem(token: String): String
  def tokenizeAndStem(text: String): js.Array[String]
}

object Stemmer {
  @scala.inline
  def apply(
    attach: Callback,
    stem: String => CallbackTo[String],
    tokenizeAndStem: String => CallbackTo[js.Array[String]]
  ): Stemmer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach.toJsFn)
    __obj.updateDynamic("stem")(js.Any.fromFunction1((t0: java.lang.String) => stem(t0).runNow()))
    __obj.updateDynamic("tokenizeAndStem")(js.Any.fromFunction1((t0: java.lang.String) => tokenizeAndStem(t0).runNow()))
    __obj.asInstanceOf[Stemmer]
  }
}

