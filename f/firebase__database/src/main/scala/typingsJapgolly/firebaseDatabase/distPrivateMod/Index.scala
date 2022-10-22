package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  def compare(a: NamedNode, b: NamedNode): Double
  
  /**
    * @returns A standalone comparison function for
    * this index
    */
  def getCompare(): Comparator[NamedNode]
  
  /**
    * Given a before and after value for a node, determine if the indexed value has changed. Even if they are different,
    * it's possible that the changes are isolated to parts of the snapshot that are not indexed.
    *
    *
    * @returns True if the portion of the snapshot being indexed changed between oldNode and newNode
    */
  def indexedValueChanged(oldNode: Node2, newNode: Node2): Boolean
  
  def isDefinedOn(node: Node2): Boolean
  
  def makePost(indexValue: Any, name: String): NamedNode
  
  /**
    * @returns a node wrapper that will sort greater than or equal to
    * any other node wrapper, using this index
    */
  def maxPost(): NamedNode
  
  /**
    * @returns a node wrapper that will sort equal to or less than
    * any other node wrapper, using this index
    */
  def minPost(): NamedNode
}
object Index {
  
  inline def apply(
    compare: (NamedNode, NamedNode) => Double,
    getCompare: CallbackTo[Comparator[NamedNode]],
    indexedValueChanged: (Node2, Node2) => Boolean,
    isDefinedOn: Node2 => Boolean,
    makePost: (Any, String) => NamedNode,
    maxPost: CallbackTo[NamedNode],
    minPost: CallbackTo[NamedNode]
  ): Index = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), getCompare = getCompare.toJsFn, indexedValueChanged = js.Any.fromFunction2(indexedValueChanged), isDefinedOn = js.Any.fromFunction1(isDefinedOn), makePost = js.Any.fromFunction2(makePost), maxPost = maxPost.toJsFn, minPost = minPost.toJsFn)
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setCompare(value: (NamedNode, NamedNode) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setGetCompare(value: CallbackTo[Comparator[NamedNode]]): Self = StObject.set(x, "getCompare", value.toJsFn)
    
    inline def setIndexedValueChanged(value: (Node2, Node2) => Boolean): Self = StObject.set(x, "indexedValueChanged", js.Any.fromFunction2(value))
    
    inline def setIsDefinedOn(value: Node2 => Boolean): Self = StObject.set(x, "isDefinedOn", js.Any.fromFunction1(value))
    
    inline def setMakePost(value: (Any, String) => NamedNode): Self = StObject.set(x, "makePost", js.Any.fromFunction2(value))
    
    inline def setMaxPost(value: CallbackTo[NamedNode]): Self = StObject.set(x, "maxPost", value.toJsFn)
    
    inline def setMinPost(value: CallbackTo[NamedNode]): Self = StObject.set(x, "minPost", value.toJsFn)
  }
}
