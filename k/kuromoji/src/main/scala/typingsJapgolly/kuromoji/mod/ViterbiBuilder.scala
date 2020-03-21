package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiBuilder extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
  var unknown_dictionary: UnknownDictionary
  def build(sentence_str: String): ViterbiLattice
}

object ViterbiBuilder {
  @scala.inline
  def apply(
    build: String => CallbackTo[ViterbiLattice],
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.updateDynamic("build")(js.Any.fromFunction1((t0: java.lang.String) => build(t0).runNow()))
    __obj.asInstanceOf[ViterbiBuilder]
  }
}

