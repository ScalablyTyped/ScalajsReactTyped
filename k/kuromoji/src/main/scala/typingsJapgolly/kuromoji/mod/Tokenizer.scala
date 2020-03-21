package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T]
  var token_info_dictionary: TokenInfoDictionary
  var unknown_dictionary: UnknownDictionary
  var viterbi_builder: ViterbiBuilder
  var viterbi_searcher: ViterbiSearcher
  def getLattice(text: String): ViterbiLattice
  def tokenize(text: String): js.Array[T]
}

object Tokenizer {
  @scala.inline
  def apply[T](
    formatter: Formatter[T],
    getLattice: String => CallbackTo[ViterbiLattice],
    token_info_dictionary: TokenInfoDictionary,
    tokenize: String => CallbackTo[js.Array[T]],
    unknown_dictionary: UnknownDictionary,
    viterbi_builder: ViterbiBuilder,
    viterbi_searcher: ViterbiSearcher
  ): Tokenizer[T] = {
    val __obj = js.Dynamic.literal(formatter = formatter.asInstanceOf[js.Any], token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any], viterbi_builder = viterbi_builder.asInstanceOf[js.Any], viterbi_searcher = viterbi_searcher.asInstanceOf[js.Any])
    __obj.updateDynamic("getLattice")(js.Any.fromFunction1((t0: java.lang.String) => getLattice(t0).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: java.lang.String) => tokenize(t0).runNow()))
    __obj.asInstanceOf[Tokenizer[T]]
  }
}

