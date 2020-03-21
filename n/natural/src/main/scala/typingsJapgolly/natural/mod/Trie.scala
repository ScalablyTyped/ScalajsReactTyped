package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trie extends js.Object {
  def addString(text: String): Boolean
  def addStrings(strings: js.Array[String]): Unit
  def contains(token: String): Boolean
  def findMatchesOnPath(text: String): js.Array[String]
  def findPrefix(text: String): js.Array[String]
  def keysWithPrefix(text: String): js.Array[String]
}

object Trie {
  @scala.inline
  def apply(
    addString: String => CallbackTo[Boolean],
    addStrings: js.Array[String] => Callback,
    contains: String => CallbackTo[Boolean],
    findMatchesOnPath: String => CallbackTo[js.Array[String]],
    findPrefix: String => CallbackTo[js.Array[String]],
    keysWithPrefix: String => CallbackTo[js.Array[String]]
  ): Trie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addString")(js.Any.fromFunction1((t0: java.lang.String) => addString(t0).runNow()))
    __obj.updateDynamic("addStrings")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addStrings(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: java.lang.String) => contains(t0).runNow()))
    __obj.updateDynamic("findMatchesOnPath")(js.Any.fromFunction1((t0: java.lang.String) => findMatchesOnPath(t0).runNow()))
    __obj.updateDynamic("findPrefix")(js.Any.fromFunction1((t0: java.lang.String) => findPrefix(t0).runNow()))
    __obj.updateDynamic("keysWithPrefix")(js.Any.fromFunction1((t0: java.lang.String) => keysWithPrefix(t0).runNow()))
    __obj.asInstanceOf[Trie]
  }
}

