package typingsJapgolly.jupyterlabObservables.observablelistMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.List
import typingsJapgolly.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typingsJapgolly.phosphorAlgorithm.iterMod.IIterator
import typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableList_[T] extends IDisposable {
  /**
    * A signal emitted when the list has changed.
    */
  val changed: ISignal[this.type, IChangedArgs[T]]
  /**
    * The length of the list.
    *
    * #### Notes
    * This is a read-only property.
    */
  var length: Double
  /**
    * The type of this object.
    */
  val `type`: List
  /**
    * Remove all values from the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * All current iterators are invalidated.
    */
  def clear(): Unit
  /**
    * Get the value at the specified index.
    *
    * @param index - The positive integer index of interest.
    *
    * @returns The value at the specified index.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral or out of range.
    */
  def get(index: Double): js.UndefOr[T]
  /**
    * Insert a value into the list at a specific index.
    *
    * @param index - The index at which to insert the value.
    *
    * @param value - The value to set at the specified index.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Notes
    * The `index` will be clamped to the bounds of the list.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    */
  def insert(index: Double, value: T): Unit
  /**
    * Insert a set of items into the list at the specified index.
    *
    * @param index - The index at which to insert the values.
    *
    * @param values - The values to insert at the specified index.
    *
    * #### Complexity.
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Notes
    * The `index` will be clamped to the bounds of the list.
    *
    * #### Undefined Behavior.
    * An `index` which is non-integral.
    */
  def insertAll(index: Double, values: IterableOrArrayLike[T]): Unit
  /**
    * Create an iterator over the values in the list.
    *
    * @returns A new iterator starting at the front of the list.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    */
  def iter(): IIterator[T]
  /**
    * Move a value from one index to another.
    *
    * @parm fromIndex - The index of the element to move.
    *
    * @param toIndex - The index to move the element to.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * Iterators pointing at the lesser of the `fromIndex` and the `toIndex`
    * and beyond are invalidated.
    *
    * #### Undefined Behavior
    * A `fromIndex` or a `toIndex` which is non-integral.
    */
  def move(fromIndex: Double, toIndex: Double): Unit
  /**
    * Add a value to the back of the list.
    *
    * @param value - The value to add to the back of the list.
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    */
  def push(value: T): Double
  /**
    * Push a set of values to the back of the list.
    *
    * @param values - An iterable or array-like set of values to add.
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * No changes.
    */
  def pushAll(values: IterableOrArrayLike[T]): Double
  /**
    * Remove and return the value at a specific index.
    *
    * @param index - The index of the value of interest.
    *
    * @returns The value at the specified index, or `undefined` if the
    *   index is out of range.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * Iterators pointing at the removed value and beyond are invalidated.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    */
  def remove(index: Double): js.UndefOr[T]
  /**
    * Remove a range of items from the list.
    *
    * @param startIndex - The start index of the range to remove (inclusive).
    *
    * @param endIndex - The end index of the range to remove (exclusive).
    *
    * @returns The new length of the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * Iterators pointing to the first removed value and beyond are invalid.
    *
    * #### Undefined Behavior
    * A `startIndex` or `endIndex` which is non-integral.
    */
  def removeRange(startIndex: Double, endIndex: Double): Double
  /**
    * Remove the first occurrence of a value from the list.
    *
    * @param value - The value of interest.
    *
    * @returns The index of the removed value, or `-1` if the value
    *   is not contained in the list.
    *
    * #### Complexity
    * Linear.
    *
    * #### Iterator Validity
    * Iterators pointing at the removed value and beyond are invalidated.
    */
  def removeValue(value: T): Double
  /**
    * Set the value at the specified index.
    *
    * @param index - The positive integer index of interest.
    *
    * @param value - The value to set at the specified index.
    *
    * #### Complexity
    * Constant.
    *
    * #### Iterator Validity
    * No changes.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral or out of range.
    */
  def set(index: Double, value: T): Unit
}

object IObservableList_ {
  @scala.inline
  def apply[T](
    changed: ISignal[IObservableList_[T], IChangedArgs[T]],
    clear: Callback,
    dispose: Callback,
    get: Double => CallbackTo[js.UndefOr[T]],
    insert: (Double, T) => Callback,
    insertAll: (Double, IterableOrArrayLike[T]) => Callback,
    isDisposed: Boolean,
    iter: CallbackTo[IIterator[T]],
    length: Double,
    move: (Double, Double) => Callback,
    push: T => CallbackTo[Double],
    pushAll: IterableOrArrayLike[T] => CallbackTo[Double],
    remove: Double => CallbackTo[js.UndefOr[T]],
    removeRange: (Double, Double) => CallbackTo[Double],
    removeValue: T => CallbackTo[Double],
    set: (Double, T) => Callback,
    `type`: List
  ): IObservableList_[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: T) => insert(t0, t1).runNow()))
    __obj.updateDynamic("insertAll")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike[T]) => insertAll(t0, t1).runNow()))
    __obj.updateDynamic("iter")(iter.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => move(t0, t1).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: T) => push(t0).runNow()))
    __obj.updateDynamic("pushAll")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike[T]) => pushAll(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("removeRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => removeRange(t0, t1).runNow()))
    __obj.updateDynamic("removeValue")(js.Any.fromFunction1((t0: T) => removeValue(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableList_[T]]
  }
}

