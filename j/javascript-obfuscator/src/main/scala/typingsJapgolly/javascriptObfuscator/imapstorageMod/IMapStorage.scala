package typingsJapgolly.javascriptObfuscator.imapstorageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.iinitializableMod.IInitializable
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapStorage[K, V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {K} key
    * @returns {V}
    */
  def get(key: K): V
  /**
    * @param {V} value
    * @returns {K | null}
    */
  def getKeyOf(value: V): K | Null
  /**
    * @returns number
    */
  def getLength(): Double
  /**
    * @returns {Map<K, V>}
    */
  def getStorage(): Map[K, V]
  /**
    * @returns string
    */
  def getStorageId(): String
  /**
    * @param {K} key
    * @returns {boolean}
    */
  def has(key: K): Boolean
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit
  /**
    * @param {K} key
    * @param {V} value
    */
  def set(key: K, value: V): Unit
}

object IMapStorage {
  @scala.inline
  def apply[K, V](
    get: K => CallbackTo[V],
    getKeyOf: V => CallbackTo[K | Null],
    getLength: CallbackTo[Double],
    getStorage: CallbackTo[Map[K, V]],
    getStorageId: CallbackTo[String],
    has: K => CallbackTo[Boolean],
    initialize: js.Array[scala.Nothing] => Callback,
    mergeWith: (IMapStorage[K, V], Boolean) => Callback,
    set: (K, V) => Callback
  ): IMapStorage[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: K) => get(t0).runNow()))
    __obj.updateDynamic("getKeyOf")(js.Any.fromFunction1((t0: V) => getKeyOf(t0).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getStorage")(getStorage.toJsFn)
    __obj.updateDynamic("getStorageId")(getStorageId.toJsFn)
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: K) => has(t0).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Array[scala.Nothing]) => initialize(t0).runNow()))
    __obj.updateDynamic("mergeWith")(js.Any.fromFunction2((t0: typingsJapgolly.javascriptObfuscator.imapstorageMod.IMapStorage[K, V], t1: scala.Boolean) => mergeWith(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: K, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[IMapStorage[K, V]]
  }
}

