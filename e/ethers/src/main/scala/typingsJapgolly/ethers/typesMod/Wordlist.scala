package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wordlist extends js.Object {
  var locale: String
  def getWord(index: Double): String
  def getWordIndex(word: String): Double
  def join(words: js.Array[String]): String
  def split(mnemonic: String): js.Array[String]
}

object Wordlist {
  @scala.inline
  def apply(
    getWord: Double => CallbackTo[String],
    getWordIndex: String => CallbackTo[Double],
    join: js.Array[String] => CallbackTo[String],
    locale: String,
    split: String => CallbackTo[js.Array[String]]
  ): Wordlist = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("getWord")(js.Any.fromFunction1((t0: scala.Double) => getWord(t0).runNow()))
    __obj.updateDynamic("getWordIndex")(js.Any.fromFunction1((t0: java.lang.String) => getWordIndex(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => join(t0).runNow()))
    __obj.updateDynamic("split")(js.Any.fromFunction1((t0: java.lang.String) => split(t0).runNow()))
    __obj.asInstanceOf[Wordlist]
  }
}

