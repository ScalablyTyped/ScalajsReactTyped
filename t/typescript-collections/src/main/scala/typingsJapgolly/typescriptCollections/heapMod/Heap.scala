package typingsJapgolly.typescriptCollections.heapMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heap[T] extends js.Object {
  /**
    * Function used to compare elements.
    * @type {function(Object,Object):number}
    * @private
    */
  var compare: js.Any
  /**
    * Array used to store the elements of the heap.
    * @type {Array.<Object>}
    * @private
    */
  var data: js.Any
  /**
    * Adds the given element into the heap.
    * @param {*} element the element.
    * @return true if the element was added or fals if it is undefined.
    */
  def add(element: T): Boolean
  /**
    * Removes all of the elements from this heap.
    */
  def clear(): Unit
  /**
    * Returns true if this heap contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this Heap contains the specified element, false
    * otherwise.
    */
  def contains(element: T): Boolean
  /**
    * Executes the provided function once for each element present in this heap in
    * no particular order.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[T]): Unit
  /**
    * Checks if this heap is empty.
    * @return {boolean} true if and only if this heap contains no items; false
    * otherwise.
    */
  def isEmpty(): Boolean
  /**
    * Returns the index of the left child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the left child
    * for.
    * @return {number} The index of the left child.
    * @private
    */
  /* private */ def leftChildIndex(nodeIndex: js.Any): js.Any
  /**
    * Returns the index of the smaller child node (if it exists).
    * @param {number} leftChild left child index.
    * @param {number} rightChild right child index.
    * @return {number} the index with the minimum value or -1 if it doesn't
    * exists.
    * @private
    */
  /* private */ def minIndex(leftChild: js.Any, rightChild: js.Any): js.Any
  /**
    * Returns the index of the parent of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the parent for.
    * @return {number} The index of the parent.
    * @private
    */
  /* private */ def parentIndex(nodeIndex: js.Any): js.Any
  /**
    * Retrieves but does not remove the root element of this heap.
    * @return {*} The value at the root of the heap. Returns undefined if the
    * heap is empty.
    */
  def peek(): js.UndefOr[T]
  /**
    * Retrieves and removes the root element of this heap.
    * @return {*} The value removed from the root of the heap. Returns
    * undefined if the heap is empty.
    */
  def removeRoot(): js.UndefOr[T]
  /**
    * Returns the index of the right child of the node at the given index.
    * @param {number} nodeIndex The index of the node to get the right child
    * for.
    * @return {number} The index of the right child.
    * @private
    */
  /* private */ def rightChildIndex(nodeIndex: js.Any): js.Any
  /**
    * Moves the node at the given index down to its proper place in the heap.
    * @param {number} nodeIndex The index of the node to move down.
    * @private
    */
  /* private */ def siftDown(nodeIndex: js.Any): js.Any
  /**
    * Moves the node at the given index up to its proper place in the heap.
    * @param {number} index The index of the node to move up.
    * @private
    */
  /* private */ def siftUp(index: js.Any): js.Any
  /**
    * Returns the number of elements in this heap.
    * @return {number} the number of elements in this heap.
    */
  def size(): Double
}

object Heap {
  @scala.inline
  def apply[T](
    add: T => CallbackTo[Boolean],
    clear: Callback,
    compare: js.Any,
    contains: T => CallbackTo[Boolean],
    data: js.Any,
    forEach: ILoopFunction[T] => Callback,
    isEmpty: CallbackTo[Boolean],
    leftChildIndex: js.Any => CallbackTo[js.Any],
    minIndex: (js.Any, js.Any) => CallbackTo[js.Any],
    parentIndex: js.Any => CallbackTo[js.Any],
    peek: CallbackTo[js.UndefOr[T]],
    removeRoot: CallbackTo[js.UndefOr[T]],
    rightChildIndex: js.Any => CallbackTo[js.Any],
    siftDown: js.Any => CallbackTo[js.Any],
    siftUp: js.Any => CallbackTo[js.Any],
    size: CallbackTo[Double]
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: T) => add(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: T) => contains(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[T]) => forEach(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("leftChildIndex")(js.Any.fromFunction1((t0: js.Any) => leftChildIndex(t0).runNow()))
    __obj.updateDynamic("minIndex")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => minIndex(t0, t1).runNow()))
    __obj.updateDynamic("parentIndex")(js.Any.fromFunction1((t0: js.Any) => parentIndex(t0).runNow()))
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("removeRoot")(removeRoot.toJsFn)
    __obj.updateDynamic("rightChildIndex")(js.Any.fromFunction1((t0: js.Any) => rightChildIndex(t0).runNow()))
    __obj.updateDynamic("siftDown")(js.Any.fromFunction1((t0: js.Any) => siftDown(t0).runNow()))
    __obj.updateDynamic("siftUp")(js.Any.fromFunction1((t0: js.Any) => siftUp(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[Heap[T]]
  }
}

