package typingsJapgolly.typescriptCollections.bstreekvMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BSTreeKV[K, V /* <: K */] extends js.Object {
  var compare: js.Any
  var nElements: js.Any
  var root: js.Any
  /**
    * Adds the specified element to this tree if it is not already present.
    * @param {Object} element the element to insert.
    * @return {boolean} true if this tree did not already contain the specified element.
    */
  def add(element: V): Boolean
  /**
    * Removes all of the elements from this tree.
    */
  def clear(): Unit
  /**
    * Returns true if this tree contains the specified element.
    * @param {Object} element element to search for.
    * @return {boolean} true if this tree contains the specified element,
    * false otherwise.
    */
  def contains(element: K): Boolean
  /**
    * @private
    */
  /* private */ def createNode(element: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in inorder.
    * Equivalent to inorderTraversal.
    * @param {function(Object):*} callback function to execute, it is
    * invoked with one argument: the element value, to break the iteration you can
    * optionally return false.
    */
  def forEach(callback: ILoopFunction[V]): Unit
  /**
    * Returns the height of this tree.
    * @return {number} the height of this tree or -1 if is empty.
    */
  def height(): Double
  /**
    * @private
    */
  /* private */ def heightAux(node: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in
    * in-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def inorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /* private */ def insertNode(node: js.Any): js.Any
  /**
    * Returns true if this tree contains no elements.
    * @return {boolean} true if this tree contains no elements.
    */
  def isEmpty(): Boolean
  /**
    * Executes the provided function once for each element present in this tree in
    * level-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def levelTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def levelTraversalAux(node: js.Any, callback: js.Any): js.Any
  /**
    * Returns the maximum element of this tree.
    * @return {*} the maximum element of this tree or undefined if this tree is
    * is empty.
    */
  def maximum(): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def maximumAux(node: js.Any): js.Any
  /**
    * Returns the minimum element of this tree.
    * @return {*} the minimum element of this tree or undefined if this tree is
    * is empty.
    */
  def minimum(): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def minimumAux(node: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in post-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def postorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /**
    * Executes the provided function once for each element present in this tree in pre-order.
    * @param {function(Object):*} callback function to execute, it is invoked with one
    * argument: the element value, to break the iteration you can optionally return false.
    */
  def preorderTraversal(callback: ILoopFunction[V]): Unit
  /**
    * @private
    */
  /* private */ def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
  /**
    * Removes the specified element from this tree if it is present.
    * @return {boolean} true if this tree contained the specified element.
    */
  def remove(element: K): Boolean
  /**
    * @private
    */
  /* private */ def removeNode(node: js.Any): js.Any
  /**
    * Looks for the value with the provided search key.
    * @param {Object} element The key to look for
    * @return {Object} The value found or undefined if it was not found.
    */
  def search(element: K): js.UndefOr[V]
  /**
    * @private
    */
  /* private */ def searchNode(node: js.Any, element: js.Any): js.Any
  /**
    * Returns the number of elements in this tree.
    * @return {number} the number of elements in this tree.
    */
  def size(): Double
  /**
    * Returns an array containing all of the elements in this tree in in-order.
    * @return {Array} an array containing all of the elements in this tree in in-order.
    */
  def toArray(): js.Array[V]
  /**
    * @private
    */
  /* private */ def transplant(n1: js.Any, n2: js.Any): js.Any
}

object BSTreeKV {
  @scala.inline
  def apply[K, V /* <: K */](
    add: V => CallbackTo[Boolean],
    clear: Callback,
    compare: js.Any,
    contains: K => CallbackTo[Boolean],
    createNode: js.Any => CallbackTo[js.Any],
    forEach: ILoopFunction[V] => Callback,
    height: CallbackTo[Double],
    heightAux: js.Any => CallbackTo[js.Any],
    inorderTraversal: ILoopFunction[V] => Callback,
    inorderTraversalAux: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    insertNode: js.Any => CallbackTo[js.Any],
    isEmpty: CallbackTo[Boolean],
    levelTraversal: ILoopFunction[V] => Callback,
    levelTraversalAux: (js.Any, js.Any) => CallbackTo[js.Any],
    maximum: CallbackTo[js.UndefOr[V]],
    maximumAux: js.Any => CallbackTo[js.Any],
    minimum: CallbackTo[js.UndefOr[V]],
    minimumAux: js.Any => CallbackTo[js.Any],
    nElements: js.Any,
    postorderTraversal: ILoopFunction[V] => Callback,
    postorderTraversalAux: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    preorderTraversal: ILoopFunction[V] => Callback,
    preorderTraversalAux: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    remove: K => CallbackTo[Boolean],
    removeNode: js.Any => CallbackTo[js.Any],
    root: js.Any,
    search: K => CallbackTo[js.UndefOr[V]],
    searchNode: (js.Any, js.Any) => CallbackTo[js.Any],
    size: CallbackTo[Double],
    toArray: CallbackTo[js.Array[V]],
    transplant: (js.Any, js.Any) => CallbackTo[js.Any]
  ): BSTreeKV[K, V] = {
    val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any], nElements = nElements.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: V) => add(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: K) => contains(t0).runNow()))
    __obj.updateDynamic("createNode")(js.Any.fromFunction1((t0: js.Any) => createNode(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[V]) => forEach(t0).runNow()))
    __obj.updateDynamic("height")(height.toJsFn)
    __obj.updateDynamic("heightAux")(js.Any.fromFunction1((t0: js.Any) => heightAux(t0).runNow()))
    __obj.updateDynamic("inorderTraversal")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[V]) => inorderTraversal(t0).runNow()))
    __obj.updateDynamic("inorderTraversalAux")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => inorderTraversalAux(t0, t1, t2).runNow()))
    __obj.updateDynamic("insertNode")(js.Any.fromFunction1((t0: js.Any) => insertNode(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("levelTraversal")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[V]) => levelTraversal(t0).runNow()))
    __obj.updateDynamic("levelTraversalAux")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => levelTraversalAux(t0, t1).runNow()))
    __obj.updateDynamic("maximum")(maximum.toJsFn)
    __obj.updateDynamic("maximumAux")(js.Any.fromFunction1((t0: js.Any) => maximumAux(t0).runNow()))
    __obj.updateDynamic("minimum")(minimum.toJsFn)
    __obj.updateDynamic("minimumAux")(js.Any.fromFunction1((t0: js.Any) => minimumAux(t0).runNow()))
    __obj.updateDynamic("postorderTraversal")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[V]) => postorderTraversal(t0).runNow()))
    __obj.updateDynamic("postorderTraversalAux")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => postorderTraversalAux(t0, t1, t2).runNow()))
    __obj.updateDynamic("preorderTraversal")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptCollections.utilMod.ILoopFunction[V]) => preorderTraversal(t0).runNow()))
    __obj.updateDynamic("preorderTraversalAux")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => preorderTraversalAux(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: K) => remove(t0).runNow()))
    __obj.updateDynamic("removeNode")(js.Any.fromFunction1((t0: js.Any) => removeNode(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: K) => search(t0).runNow()))
    __obj.updateDynamic("searchNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => searchNode(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("transplant")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => transplant(t0, t1).runNow()))
    __obj.asInstanceOf[BSTreeKV[K, V]]
  }
}

