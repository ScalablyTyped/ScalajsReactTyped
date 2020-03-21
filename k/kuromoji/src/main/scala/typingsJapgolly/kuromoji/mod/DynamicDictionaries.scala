package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDictionaries extends js.Object {
  var connection_costs: ConnectionCosts
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
  var unknown_dictionary: UnknownDictionary
  def loadTrie(
    base_buffer: scala.scalajs.js.typedarray.Int32Array,
    check_buffer: scala.scalajs.js.typedarray.Int32Array
  ): DynamicDictionaries
}

object DynamicDictionaries {
  @scala.inline
  def apply(
    connection_costs: ConnectionCosts,
    loadTrie: (scala.scalajs.js.typedarray.Int32Array, scala.scalajs.js.typedarray.Int32Array) => CallbackTo[DynamicDictionaries],
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): DynamicDictionaries = {
    val __obj = js.Dynamic.literal(connection_costs = connection_costs.asInstanceOf[js.Any], token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.updateDynamic("loadTrie")(js.Any.fromFunction2((t0: scala.scalajs.js.typedarray.Int32Array, t1: scala.scalajs.js.typedarray.Int32Array) => loadTrie(t0, t1).runNow()))
    __obj.asInstanceOf[DynamicDictionaries]
  }
}

