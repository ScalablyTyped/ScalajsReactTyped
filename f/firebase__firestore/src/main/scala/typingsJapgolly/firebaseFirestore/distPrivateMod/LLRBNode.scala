package typingsJapgolly.firebaseFirestore.distPrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LLRBNode[K, V] extends StObject {
  
  /* protected */ def check(): Double
  
  def checkMaxDepth(): Boolean
  
  val color: Boolean
  
  /* private */ var colorFlip: Any
  
  def copy(
    key: K | Null,
    value: V | Null,
    color: Boolean | Null,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
  ): LLRBNode[K, V]
  
  /* private */ var fixUp: Any
  
  def inorderTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T
  
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V]
  
  def isEmpty(): Boolean
  
  def isRed(): Boolean
  
  var key: K
  
  val left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  def maxKey(): K | Null
  
  /* private */ var min: Any
  
  def minKey(): K | Null
  
  /* private */ var moveRedLeft: Any
  
  /* private */ var moveRedRight: Any
  
  def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  /* private */ var removeMin: Any
  
  def reverseTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T
  
  val right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  /* private */ var rotateLeft: Any
  
  /* private */ var rotateRight: Any
  
  val size: Double
  
  var value: V
}
object LLRBNode {
  
  inline def apply[K, V](
    check: CallbackTo[Double],
    checkMaxDepth: CallbackTo[Boolean],
    color: Boolean,
    colorFlip: Any,
    copy: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBNode[K, V],
    fixUp: Any,
    inorderTraversal: js.Function2[/* k */ K, /* v */ V, Any] => Any,
    insert: (K, V, Comparator[K]) => LLRBNode[K, V],
    isEmpty: CallbackTo[Boolean],
    isRed: CallbackTo[Boolean],
    key: K,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    maxKey: CallbackTo[K | Null],
    min: Any,
    minKey: CallbackTo[K | Null],
    moveRedLeft: Any,
    moveRedRight: Any,
    remove: (K, Comparator[K]) => (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    removeMin: Any,
    reverseTraversal: js.Function2[/* k */ K, /* v */ V, Any] => Any,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    rotateLeft: Any,
    rotateRight: Any,
    size: Double,
    value: V
  ): LLRBNode[K, V] = {
    val __obj = js.Dynamic.literal(check = check.toJsFn, checkMaxDepth = checkMaxDepth.toJsFn, color = color.asInstanceOf[js.Any], colorFlip = colorFlip.asInstanceOf[js.Any], copy = js.Any.fromFunction5(copy), fixUp = fixUp.asInstanceOf[js.Any], inorderTraversal = js.Any.fromFunction1(inorderTraversal), insert = js.Any.fromFunction3(insert), isEmpty = isEmpty.toJsFn, isRed = isRed.toJsFn, key = key.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxKey = maxKey.toJsFn, min = min.asInstanceOf[js.Any], minKey = minKey.toJsFn, moveRedLeft = moveRedLeft.asInstanceOf[js.Any], moveRedRight = moveRedRight.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), removeMin = removeMin.asInstanceOf[js.Any], reverseTraversal = js.Any.fromFunction1(reverseTraversal), right = right.asInstanceOf[js.Any], rotateLeft = rotateLeft.asInstanceOf[js.Any], rotateRight = rotateRight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LLRBNode[K, V]]
  }
  
  extension [Self <: LLRBNode[?, ?], K, V](x: Self & (LLRBNode[K, V])) {
    
    inline def setCheck(value: CallbackTo[Double]): Self = StObject.set(x, "check", value.toJsFn)
    
    inline def setCheckMaxDepth(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkMaxDepth", value.toJsFn)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFlip(value: Any): Self = StObject.set(x, "colorFlip", value.asInstanceOf[js.Any])
    
    inline def setCopy(
      value: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBNode[K, V]
    ): Self = StObject.set(x, "copy", js.Any.fromFunction5(value))
    
    inline def setFixUp(value: Any): Self = StObject.set(x, "fixUp", value.asInstanceOf[js.Any])
    
    inline def setInorderTraversal(value: js.Function2[/* k */ K, /* v */ V, Any] => Any): Self = StObject.set(x, "inorderTraversal", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (K, V, Comparator[K]) => LLRBNode[K, V]): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsRed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRed", value.toJsFn)
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMaxKey(value: CallbackTo[K | Null]): Self = StObject.set(x, "maxKey", value.toJsFn)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinKey(value: CallbackTo[K | Null]): Self = StObject.set(x, "minKey", value.toJsFn)
    
    inline def setMoveRedLeft(value: Any): Self = StObject.set(x, "moveRedLeft", value.asInstanceOf[js.Any])
    
    inline def setMoveRedRight(value: Any): Self = StObject.set(x, "moveRedRight", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: (K, Comparator[K]) => (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveMin(value: Any): Self = StObject.set(x, "removeMin", value.asInstanceOf[js.Any])
    
    inline def setReverseTraversal(value: js.Function2[/* k */ K, /* v */ V, Any] => Any): Self = StObject.set(x, "reverseTraversal", js.Any.fromFunction1(value))
    
    inline def setRight(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRotateLeft(value: Any): Self = StObject.set(x, "rotateLeft", value.asInstanceOf[js.Any])
    
    inline def setRotateRight(value: Any): Self = StObject.set(x, "rotateRight", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
