package typingsJapgolly.jupyterlabObservables.observablemapMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typingsJapgolly.jupyterlabObservables.modeldbMod.IObservable
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableMap_[T] extends IObservable {
  /**
    * A signal emitted when the map has changed.
    */
  val changed: ISignal[this.type, IChangedArgs[T]]
  /**
    * The number of key-value pairs in the map.
    */
  val size: Double
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableMap_ : Map
  /**
    * Set the ObservableMap to an empty map.
    */
  def clear(): Unit
  /**
    * Remove a key from the map
    *
    * @param key - the key to remove.
    *
    * @returns the value of the given key,
    *   or undefined if that does not exist.
    */
  def delete(key: String): js.UndefOr[T]
  /**
    * Get a value for a given key.
    *
    * @param key - the key.
    *
    * @returns the value for that key.
    */
  def get(key: String): js.UndefOr[T]
  /**
    * Check whether the map has a key.
    *
    * @param key - the key to check.
    *
    * @returns `true` if the map has the key, `false` otherwise.
    */
  def has(key: String): Boolean
  /**
    * Get a list of the keys in the map.
    *
    * @returns - a list of keys.
    */
  def keys(): js.Array[String]
  /**
    * Set a key-value pair in the map
    *
    * @param key - The key to set.
    *
    * @param value - The value for the key.
    *
    * @returns the old value for the key, or undefined
    *   if that did not exist.
    */
  def set(key: String, value: T): js.UndefOr[T]
  /**
    * Get a list of the values in the map.
    *
    * @returns - a list of values.
    */
  def values(): js.Array[T]
}

object IObservableMap_ {
  @scala.inline
  def apply[T](
    changed: ISignal[IObservableMap_[T], IChangedArgs[T]],
    clear: Callback,
    delete: String => CallbackTo[js.UndefOr[T]],
    dispose: Callback,
    get: String => CallbackTo[js.UndefOr[T]],
    has: String => CallbackTo[Boolean],
    isDisposed: Boolean,
    keys: CallbackTo[js.Array[String]],
    set: (String, T) => CallbackTo[js.UndefOr[T]],
    size: Double,
    `type`: Map,
    values: CallbackTo[js.Array[T]]
  ): IObservableMap_[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[IObservableMap_[T]]
  }
}

