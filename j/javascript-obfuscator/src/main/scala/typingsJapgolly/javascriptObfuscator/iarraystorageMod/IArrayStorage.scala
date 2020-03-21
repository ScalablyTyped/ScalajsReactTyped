package typingsJapgolly.javascriptObfuscator.iarraystorageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.iinitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayStorage[V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {number} key
    * @returns {V}
    */
  def get(key: Double): V
  /**
    * @param value
    * @returns number | null
    */
  def getKeyOf(value: V): Double | Null
  /**
    * @returns number
    */
  def getLength(): Double
  /**
    * @returns {V[]}
    */
  def getStorage(): js.Array[V]
  /**
    * @returns string
    */
  def getStorageId(): String
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit
  /**
    * @param {number} key
    * @param {V} value
    */
  def set(key: Double, value: V): Unit
}

object IArrayStorage {
  @scala.inline
  def apply[V](
    get: Double => CallbackTo[V],
    getKeyOf: V => CallbackTo[Double | Null],
    getLength: CallbackTo[Double],
    getStorage: CallbackTo[js.Array[V]],
    getStorageId: CallbackTo[String],
    initialize: js.Array[scala.Nothing] => Callback,
    mergeWith: (IArrayStorage[V], Boolean) => Callback,
    set: (Double, V) => Callback
  ): IArrayStorage[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getKeyOf")(js.Any.fromFunction1((t0: V) => getKeyOf(t0).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getStorage")(getStorage.toJsFn)
    __obj.updateDynamic("getStorageId")(getStorageId.toJsFn)
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Array[scala.Nothing]) => initialize(t0).runNow()))
    __obj.updateDynamic("mergeWith")(js.Any.fromFunction2((t0: typingsJapgolly.javascriptObfuscator.iarraystorageMod.IArrayStorage[V], t1: scala.Boolean) => mergeWith(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[IArrayStorage[V]]
  }
}

