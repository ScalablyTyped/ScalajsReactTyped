package typingsJapgolly.bloomFilter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var BLOOM_UPDATE_ALL: Double
  var BLOOM_UPDATE_NONE: Double
  var BLOOM_UPDATE_P2PUBKEY_ONLY: Double
  var LN2: Double
  var LN2SQUARED: Double
  var MAX_BLOOM_FILTER_SIZE: Double
  var MAX_HASH_FUNCS: Double
  var MIN_HASH_FUNCS: Double
  def clear(): Unit
  def contains(data: Buffer): Boolean
  def hash(nHashNum: Double, vDataToHash: Buffer): Double
  def insert(data: Buffer): Unit
  def inspect(): String
  def toObject(): FilterOptions
}

object Filter {
  @scala.inline
  def apply(
    BLOOM_UPDATE_ALL: Double,
    BLOOM_UPDATE_NONE: Double,
    BLOOM_UPDATE_P2PUBKEY_ONLY: Double,
    LN2: Double,
    LN2SQUARED: Double,
    MAX_BLOOM_FILTER_SIZE: Double,
    MAX_HASH_FUNCS: Double,
    MIN_HASH_FUNCS: Double,
    clear: Callback,
    contains: Buffer => CallbackTo[Boolean],
    hash: (Double, Buffer) => CallbackTo[Double],
    insert: Buffer => Callback,
    inspect: CallbackTo[String],
    toObject: CallbackTo[FilterOptions]
  ): Filter = {
    val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL.asInstanceOf[js.Any], BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE.asInstanceOf[js.Any], BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LN2SQUARED = LN2SQUARED.asInstanceOf[js.Any], MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE.asInstanceOf[js.Any], MAX_HASH_FUNCS = MAX_HASH_FUNCS.asInstanceOf[js.Any], MIN_HASH_FUNCS = MIN_HASH_FUNCS.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => contains(t0).runNow()))
    __obj.updateDynamic("hash")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.node.Buffer) => hash(t0, t1).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => insert(t0).runNow()))
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("toObject")(toObject.toJsFn)
    __obj.asInstanceOf[Filter]
  }
}

