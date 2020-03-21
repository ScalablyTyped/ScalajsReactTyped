package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexicon extends js.Object {
  var defaultCategory: String
  def parseLexicon(data: String): Unit
  def tagWord(word: String): js.Array[String]
}

object Lexicon {
  @scala.inline
  def apply(
    defaultCategory: String,
    parseLexicon: String => Callback,
    tagWord: String => CallbackTo[js.Array[String]]
  ): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any])
    __obj.updateDynamic("parseLexicon")(js.Any.fromFunction1((t0: java.lang.String) => parseLexicon(t0).runNow()))
    __obj.updateDynamic("tagWord")(js.Any.fromFunction1((t0: java.lang.String) => tagWord(t0).runNow()))
    __obj.asInstanceOf[Lexicon]
  }
}

