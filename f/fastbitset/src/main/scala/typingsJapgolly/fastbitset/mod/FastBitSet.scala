package typingsJapgolly.fastbitset.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastbitset.fastbitsetNumbers.`0`
import typingsJapgolly.fastbitset.fastbitsetNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastBitSet extends js.Object {
  /** Add the value (Set the bit at `index` to `true`) */
  def add(index: Double): Unit
  /** Return an array with the set bit locations (values) */
  def array(): js.Array[Double]
  /**
    * Tries to add the value (Set the bit at `index` to `true`), returns `1` if the
    * value was added, returns `0` if the value was already present
    */
  def checkedAdd(index: Double): `1` | `0`
  /** Remove all values, reset memory usage */
  def clear(): Unit
  /**
    * Computes the difference between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def difference(otherbitmap: FastBitSet): FastBitSet
  /** Computes the size of the difference between this bitset and another one */
  def difference_size(otherbitmap: FastBitSet): Double
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified
    */
  def equals(otherbitmap: FastBitSet): Boolean
  /** If the value was not in the set, add it, otherwise remove it (flip bit at `index`) */
  def flip(index: Double): Unit
  /** Return an array with the set bit locations (values) */
  def forEach(fnc: js.Function1[/* index */ Double, Unit]): Unit
  /** fast function to compute the Hamming weight of a 32-bit unsigned integer */
  def hammingWeight(v: Double): Double
  /** fast function to compute the Hamming weight of four 32-bit unsigned integers */
  def hammingWeight4(v1: Double, v2: Double, v3: Double, v4: Double): Double
  /** Is the value contained in the set? Is the bit at `index` `true` or `false`? */
  def has(index: Double): Boolean
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified  (and returned by the function)
    */
  def intersection(otherbitmap: FastBitSet): FastBitSet
  /** Computes the size of the intersection between this bitset and another one */
  def intersection_size(otherbitmap: FastBitSet): Double
  /**
    * Check if this bitset intersects with another one,
    * no bitmap is modified
    */
  def intersects(otherbitmap: FastBitSet): Boolean
  /** Return `true` if no bit is set */
  def isEmpty(index: Double): Boolean
  /**
    * Computes the difference between this bitset and another one,
    * a new bitmap is generated
    */
  def new_difference(otherbitmap: FastBitSet): FastBitSet
  /**
    * Computes the intersection between this bitset and another one,
    * a new bitmap is generated
    */
  def new_intersection(otherbitmap: FastBitSet): FastBitSet
  def new_union(otherbitmap: FastBitSet): FastBitSet
  /** Set the bit at `index` to `false` */
  def remove(index: Double): Unit
  /** Resize the bitset so that we can write a value at `index` */
  def resize(index: Double): Unit
  /** How many values stored in the set? How many set bits? */
  def size(): Double
  /** Reduce the memory usage to a minimum */
  def trim(): Unit
  /**
    * Computes the union between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def union(otherbitmap: FastBitSet): FastBitSet
  /** Computes the size union between this bitset and another one */
  def union_size(otherbitmap: FastBitSet): Double
}

object FastBitSet {
  @scala.inline
  def apply(
    add: Double => Callback,
    array: CallbackTo[js.Array[Double]],
    checkedAdd: Double => CallbackTo[`1` | `0`],
    clear: Callback,
    difference: FastBitSet => CallbackTo[FastBitSet],
    difference_size: FastBitSet => CallbackTo[Double],
    equals: FastBitSet => CallbackTo[Boolean],
    flip: Double => Callback,
    forEach: js.Function1[/* index */ Double, Unit] => Callback,
    hammingWeight: Double => CallbackTo[Double],
    hammingWeight4: (Double, Double, Double, Double) => CallbackTo[Double],
    has: Double => CallbackTo[Boolean],
    intersection: FastBitSet => CallbackTo[FastBitSet],
    intersection_size: FastBitSet => CallbackTo[Double],
    intersects: FastBitSet => CallbackTo[Boolean],
    isEmpty: Double => CallbackTo[Boolean],
    new_difference: FastBitSet => CallbackTo[FastBitSet],
    new_intersection: FastBitSet => CallbackTo[FastBitSet],
    new_union: FastBitSet => CallbackTo[FastBitSet],
    remove: Double => Callback,
    resize: Double => Callback,
    size: CallbackTo[Double],
    trim: Callback,
    union: FastBitSet => CallbackTo[FastBitSet],
    union_size: FastBitSet => CallbackTo[Double]
  ): FastBitSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: scala.Double) => add(t0).runNow()))
    __obj.updateDynamic("array")(array.toJsFn)
    __obj.updateDynamic("checkedAdd")(js.Any.fromFunction1((t0: scala.Double) => checkedAdd(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("difference")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => difference(t0).runNow()))
    __obj.updateDynamic("difference_size")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => difference_size(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => equals(t0).runNow()))
    __obj.updateDynamic("flip")(js.Any.fromFunction1((t0: scala.Double) => flip(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[/* index */ scala.Double, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("hammingWeight")(js.Any.fromFunction1((t0: scala.Double) => hammingWeight(t0).runNow()))
    __obj.updateDynamic("hammingWeight4")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => hammingWeight4(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: scala.Double) => has(t0).runNow()))
    __obj.updateDynamic("intersection")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => intersection(t0).runNow()))
    __obj.updateDynamic("intersection_size")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => intersection_size(t0).runNow()))
    __obj.updateDynamic("intersects")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => intersects(t0).runNow()))
    __obj.updateDynamic("isEmpty")(js.Any.fromFunction1((t0: scala.Double) => isEmpty(t0).runNow()))
    __obj.updateDynamic("new_difference")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => new_difference(t0).runNow()))
    __obj.updateDynamic("new_intersection")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => new_intersection(t0).runNow()))
    __obj.updateDynamic("new_union")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => new_union(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: scala.Double) => resize(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("trim")(trim.toJsFn)
    __obj.updateDynamic("union")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => union(t0).runNow()))
    __obj.updateDynamic("union_size")(js.Any.fromFunction1((t0: typingsJapgolly.fastbitset.mod.FastBitSet) => union_size(t0).runNow()))
    __obj.asInstanceOf[FastBitSet]
  }
}

