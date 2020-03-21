package typingsJapgolly.typescriptCollections.setMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set[T] extends js.Object {
  /**
    * Dictionary key and value holds the elements in the set.
    * @type {Object}
    * @protected
    */
  var dictionary: typingsJapgolly.typescriptCollections.dictionaryMod.default[T, _]
  /**
    * Adds the specified element to this set if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this set did not already contain the specified element.
    */
  def add(element: T): Boolean
  /**
    * Removes all of the elements from this set.
    */
  def clear(): Unit
  /**
    * Returns true if this set contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this set contains the specified element,
    * false otherwise.
    */
  def contains(element: T): Boolean
  /**
    * Performs a difference between this and another set.
    * Removes from this set all the values that are present in the given set.
    * @param {collections.Set} otherSet other set.
    */
  def difference(otherSet: Set[T]): Unit
  /**
    * Executes the provided function once for each element
    * present in this set.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one arguments: the element. To break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit
  /**
    * Performs an intersecion between this and another set.
    * Removes all values that are not present this set and the given set.
    * @param {collections.Set} otherSet other set.
    */
  def intersection(otherSet: Set[T]): Unit
  /**
    * Returns true if this set contains no elements.
    * @return {boolean} true if this set contains no elements.
    */
  def isEmpty(): Boolean
  /**
    * Checks whether the given set contains all the elements in this set.
    * @param {collections.Set} otherSet other set.
    * @return {boolean} true if this set is a subset of the given set.
    */
  def isSubsetOf(otherSet: Set[T]): Boolean
  /**
    * Removes the specified element from this set if it is present.
    * @return {boolean} true if this set contained the specified element.
    */
  def remove(element: T): Boolean
  /**
    * Returns the number of elements in this set.
    * @return {number} the number of elements in this set.
    */
  def size(): Double
  /**
    * Returns an array containing all of the elements in this set in arbitrary order.
    * @return {Array} an array containing all of the elements in this set.
    */
  def toArray(): js.Array[T]
  /**
    * Performs a union between this and another set.
    * Adds all values from the given set to this set.
    * @param {collections.Set} otherSet other set.
    */
  def union(otherSet: Set[T]): Unit
}

object Set {
  @scala.inline
  def apply[T](
    add: T => CallbackTo[Boolean],
    clear: Callback,
    contains: T => CallbackTo[Boolean],
    dictionary: typingsJapgolly.typescriptCollections.dictionaryMod.default[T, _],
    difference: Set[T] => Callback,
    forEach: ILoopFunction[T] => Callback,
    intersection: Set[T] => Callback,
    isEmpty: CallbackTo[Boolean],
    isSubsetOf: Set[T] => CallbackTo[Boolean],
    remove: T => CallbackTo[Boolean],
    size: CallbackTo[Double],
    toArray: CallbackTo[js.Array[T]],
    union: Set[T] => Callback
  ): Set[T] = {
    val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: T) => add(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: T) => contains(t0).runNow()))
    __obj.updateDynamic("difference")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.setMod.Set[T]) => difference(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[T]) => forEach(t0).runNow()))
    __obj.updateDynamic("intersection")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.setMod.Set[T]) => intersection(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isSubsetOf")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.setMod.Set[T]) => isSubsetOf(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: T) => remove(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("union")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.setMod.Set[T]) => union(t0).runNow()))
    __obj.asInstanceOf[Set[T]]
  }
}

