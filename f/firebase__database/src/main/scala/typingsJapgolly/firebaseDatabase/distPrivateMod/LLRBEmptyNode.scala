package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an empty node (a leaf node in the Red-Black Tree).
  */
trait LLRBEmptyNode[K, V] extends StObject {
  
  def check_(): Double
  
  var color: Boolean
  
  /**
    * Returns a copy of the current node.
    *
    * @returns The node copy.
    */
  def copy(
    key: K | Null,
    value: V | Null,
    color: Boolean | Null,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
  ): LLRBEmptyNode[K, V]
  
  /**
    * @returns The total number of nodes in the tree.
    */
  def count(): Double
  
  /**
    * Traverses the tree in key order and calls the specified action function
    * for each node.
    *
    * @param action - Callback function to be called for each
    * node.  If it returns true, traversal is aborted.
    * @returns True if traversal was aborted.
    */
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Any]): Boolean
  
  /**
    * Returns a copy of the tree, with the specified key/value added.
    *
    * @param key - Key to be added.
    * @param value - Value to be added.
    * @param comparator - Comparator.
    * @returns New tree, with item added.
    */
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V]
  
  /**
    * @returns True if the tree is empty.
    */
  def isEmpty(): Boolean
  
  /**
    * @returns Whether this node is red.
    */
  def isRed_(): Boolean
  
  var key: K
  
  var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  def maxKey(): Null
  
  def minKey(): Null
  
  /**
    * Returns a copy of the tree, with the specified key removed.
    *
    * @param key - The key to remove.
    * @param comparator - Comparator.
    * @returns New tree, with item removed.
    */
  def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V]
  
  /**
    * Traverses the tree in reverse key order and calls the specified action function
    * for each node.
    *
    * @param action - Callback function to be called for each
    * node.  If it returns true, traversal is aborted.
    * @returns True if traversal was aborted.
    */
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean
  
  var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  var value: V
}
object LLRBEmptyNode {
  
  inline def apply[K, V](
    check_ : CallbackTo[Double],
    color: Boolean,
    copy: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBEmptyNode[K, V],
    count: CallbackTo[Double],
    inorderTraversal: js.Function2[/* k */ K, /* v */ V, Any] => Boolean,
    insert: (K, V, Comparator[K]) => LLRBNode[K, V],
    isEmpty: CallbackTo[Boolean],
    isRed_ : CallbackTo[Boolean],
    key: K,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    maxKey: CallbackTo[Null],
    minKey: CallbackTo[Null],
    remove: (K, Comparator[K]) => LLRBEmptyNode[K, V],
    reverseTraversal: js.Function2[/* k */ K, /* v */ V, Unit] => Boolean,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    value: V
  ): LLRBEmptyNode[K, V] = {
    val __obj = js.Dynamic.literal(check_ = check_.toJsFn, color = color.asInstanceOf[js.Any], copy = js.Any.fromFunction5(copy), count = count.toJsFn, inorderTraversal = js.Any.fromFunction1(inorderTraversal), insert = js.Any.fromFunction3(insert), isEmpty = isEmpty.toJsFn, isRed_ = isRed_.toJsFn, key = key.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxKey = maxKey.toJsFn, minKey = minKey.toJsFn, remove = js.Any.fromFunction2(remove), reverseTraversal = js.Any.fromFunction1(reverseTraversal), right = right.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LLRBEmptyNode[K, V]]
  }
  
  extension [Self <: LLRBEmptyNode[?, ?], K, V](x: Self & (LLRBEmptyNode[K, V])) {
    
    inline def setCheck_(value: CallbackTo[Double]): Self = StObject.set(x, "check_", value.toJsFn)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCopy(
      value: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBEmptyNode[K, V]
    ): Self = StObject.set(x, "copy", js.Any.fromFunction5(value))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setInorderTraversal(value: js.Function2[/* k */ K, /* v */ V, Any] => Boolean): Self = StObject.set(x, "inorderTraversal", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (K, V, Comparator[K]) => LLRBNode[K, V]): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsRed_(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRed_", value.toJsFn)
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMaxKey(value: CallbackTo[Null]): Self = StObject.set(x, "maxKey", value.toJsFn)
    
    inline def setMinKey(value: CallbackTo[Null]): Self = StObject.set(x, "minKey", value.toJsFn)
    
    inline def setRemove(value: (K, Comparator[K]) => LLRBEmptyNode[K, V]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setReverseTraversal(value: js.Function2[/* k */ K, /* v */ V, Unit] => Boolean): Self = StObject.set(x, "reverseTraversal", js.Any.fromFunction1(value))
    
    inline def setRight(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
